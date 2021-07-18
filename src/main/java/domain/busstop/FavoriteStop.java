package domain.busstop;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FAVORITESTOP")
public class FavoriteStop {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    public FavoriteStop() {}

    private FavoriteStop(Builder builder){
        id = builder.id;
        name = builder.name;

    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    public static class Builder{
        private Integer id;
        private String name;

        public Builder(){}

        public Builder id(Integer val){
            id = val;
            return this;
        }

        public Builder name(String val){
            name =val;
            return this;
        }

        public FavoriteStop build(){
            return new FavoriteStop(this);
        }

    }
}