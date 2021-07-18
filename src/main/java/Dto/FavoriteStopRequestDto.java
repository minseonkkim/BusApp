package Dto;

import domain.busstop.FavoriteStop;

public class FavoriteStopRequestDto {
    private Integer id;
    private String name;

    public FavoriteStopRequestDto(){}
    public FavoriteStopRequestDto(Builder builder){
        id = builder.id;
        name = builder.name;
    }

    public Integer getId() {
        return id;
    }

    public static class Builder{
        private Integer id;
        private String name;

        public Builder id(Integer val){
            id = val;
            return this;
        }

        public Builder name(String val){
            name = val;
            return this;
        }

        public FavoriteStopRequestDto build(){
            return new FavoriteStopRequestDto(this);
        }

    }

    public FavoriteStop toEntity(){
        return new FavoriteStop.Builder()
                .id(id)
                .name(name)
                .build();
    }
}
