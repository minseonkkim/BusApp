package Parse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class BusLocationMap {

    private Parse.BusLineMap busLineMap;
    //    private StopListSet stopList;
    private GetApiData getApiData;
    private int id;
    private String lineName;
    private int curStopId;
    private int busCount;
    private String busNumber;
    //    private String curStopName;
    private String isLowBus;

    private HashMap<Integer, Parse.BusLocation> busLocationMap = new HashMap<>();
    Parse.BusLocation busLocation;



    public BusLocationMap(int id) throws IOException, ParseException {
        this.id = id;
        this.busLineMap = new Parse.BusLineMap(id);
//        this.stopList = new StopListSet();
        this.getApiData = new GetApiData("BUS_LOCATION", id);
        this.lineName = busLineMap.getLineName();
        setData();
    }


    private void setData() throws IOException, ParseException {
        JSONObject data= getApiData.getData();
        JSONObject bus;
        busCount = Integer.parseInt(data.get("ROW_COUNT").toString());

        JSONArray busArray = (JSONArray) data.get("BUSLOCATION_LIST");

        for(int i=0; i<busCount; i++){

            bus = (JSONObject)busArray.get(i);
            curStopId = Integer.parseInt(bus.get("CURR_STOP_ID").toString());
            busNumber = bus.get("CARNO").toString();
//            curStopName = (getCurStopName(bus.get("CURR_STOP_ID").toString()));
            isLowBus =(isLowBus(Objects.requireNonNullElse(bus.get("LOW_BUS"),"0").toString()));
            busLocation = new Parse.BusLocation(busNumber, isLowBus);
            busLocationMap.put(curStopId, busLocation);
        }

    }
    private String isLowBus(String flag){
        if(flag.equals("0"))
            return "일반";
        else
            return "저상";
    }
    //    private String getCurStopName(String curStopId){
//        return stopList.getStop(curStopId);
//    }
    public Parse.BusLocation getBusLocation(int stopId){
        if(busLocationMap.containsKey(stopId))
            return busLocationMap.get(stopId);
        else
            return new Parse.BusLocation("","");

    }

    public int getBusCount(){
        return busCount;
    }
    public String getLineName(){
        return lineName;
    }






}