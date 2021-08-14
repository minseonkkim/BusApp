package service;

import Dto.FavoriteBusRequestDto;
import Dto.FavoriteStopRequestDto;
import domain.busline.FavoriteBus;
import domain.busstop.FavoriteStop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FavoritesServiceTest {
    public FavoritesService favoritesService= new FavoritesService();

    @After
    @Before
    public void cleanup(){
        favoritesService.deleteAllLine();
        favoritesService.deleteAllStop();
    }

    @Test
    public void save(){
        Integer id = 1;
        String name = "광주역";

        // BusStop Test
        FavoriteStopRequestDto favoriteStopRequestDto = new FavoriteStopRequestDto.Builder()
                .id(id)
                .name("광주역")
                .build();

        favoritesService.save(favoriteStopRequestDto);

        List<FavoriteStop> favoriteStopList = favoritesService.findAllStops();
        assertThat(favoriteStopList.get(0).getId()).isEqualTo(id);
        assertThat(favoriteStopList.get(0).getName()).isEqualTo(name);


        // BusLine Test
        FavoriteBusRequestDto favoriteBusRequestDto = new FavoriteBusRequestDto.Builder()
                .id(id)
                .name("광주역")
                .build();

        favoritesService.save(favoriteBusRequestDto);

        List<FavoriteBus> favoriteBusList = favoritesService.findAllLines();
        assertThat(favoriteBusList.get(0).getId()).isEqualTo(id);
        assertThat(favoriteBusList.get(0).getName()).isEqualTo(name);

    }

    @Test
    public void deleteById(){
        Integer id = 1;
        String name = "광주역";

        //BusStop test
        FavoriteStopRequestDto favoriteStopRequestDto = new FavoriteStopRequestDto.Builder()
                .id(id)
                .name("광주역")
                .build();

        favoritesService.save(favoriteStopRequestDto);

        List<FavoriteStop> favoriteStopsList = favoritesService.findAllStops();
        assertThat(favoriteStopsList.size()).isEqualTo(1);

        FavoriteStopRequestDto busStopDelRequestDto =new FavoriteStopRequestDto.Builder()
                .id(id)
                .build();

        favoritesService.delById(busStopDelRequestDto);

        List<FavoriteStop> favoriteStopsList2 = favoritesService.findAllStops();
        assertThat(favoriteStopsList2.size()).isEqualTo(0);

        //BusLine Test
        FavoriteBusRequestDto favoriteBusRequestDto = new FavoriteBusRequestDto.Builder()
                .id(id)
                .name("광주역")
                .build();

        favoritesService.save(favoriteBusRequestDto);

        List<FavoriteBus> favoriteBusList = favoritesService.findAllLines();
        assertThat(favoriteStopsList.size()).isEqualTo(1);

        FavoriteBusRequestDto busLineDelRequestDto =new FavoriteBusRequestDto.Builder()
                .id(id)
                .build();

        favoritesService.delById(busLineDelRequestDto);

        List<FavoriteBus> busStopList2 = favoritesService.findAllLines();
        assertThat(busStopList2.size()).isEqualTo(0);


    }

    @Test
    public void findAll(){
        //BusStop Test
        favoritesService.save(new FavoriteStopRequestDto.Builder()
                .id(1)
                .name("전남대")
                .build()
        );
        favoritesService.save(new FavoriteStopRequestDto.Builder()
                .id(2)
                .name("전남대후문")
                .build()
        );

        List<FavoriteStop> favoriteStopList =favoritesService.findAllStops();
        assertThat(favoriteStopList.size()).isEqualTo(2);
        assertThat(favoriteStopList.get(0).getId()).isEqualTo(1);
        assertThat(favoriteStopList.get(0).getName()).isEqualTo("전남대");
        assertThat(favoriteStopList.get(1).getId()).isEqualTo(2);
        assertThat(favoriteStopList.get(1).getName()).isEqualTo("전남대후문");

        //BusLine Test
        favoritesService.save(new FavoriteBusRequestDto.Builder()
                .id(1)
                .name("일곡18")
                .build()
        );
        favoritesService.save(new FavoriteBusRequestDto.Builder()
                .id(2)
                .name("진월07")
                .build()
        );

        List<FavoriteBus> favoriteBusList =favoritesService.findAllLines();
        assertThat(favoriteBusList.size()).isEqualTo(2);
        assertThat(favoriteBusList.get(0).getId()).isEqualTo(1);
        assertThat(favoriteBusList.get(0).getName()).isEqualTo("일곡18");
        assertThat(favoriteBusList.get(1).getId()).isEqualTo(2);
        assertThat(favoriteBusList.get(1).getName()).isEqualTo("진월07");


    }
}
