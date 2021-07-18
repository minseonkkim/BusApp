package Dto;

import domain.busline.FavoriteBus;

public class FavoriteBusRequestDto {
    private Integer id;
    private String name;

    public FavoriteBusRequestDto(){}
    public FavoriteBusRequestDto(Builder builder){
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

        public FavoriteBusRequestDto build(){
            return new FavoriteBusRequestDto(this);
        }

    }

    public FavoriteBus toEntity(){
        return new FavoriteBus.Builder()
                .id(id)
                .name(name)
                .build();
    }
}