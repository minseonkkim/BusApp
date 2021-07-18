package domain.busline;

import javax.persistence.*;
import java.util.List;

public class FavoriteBusTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2jpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx =em.getTransaction();

        try{
            tx.begin();
            logic(em);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();

    }
    private static void logic(EntityManager em){
        Integer id = 1234;
        FavoriteBus favoriteBus = new FavoriteBus.Builder()
                .id(id)
                .name("전남대1")
                .build();

        Integer id2 = 4567;
        FavoriteBus favoriteBus2 = new FavoriteBus.Builder()
                .id(id2)
                .name("전남대2")
                .build();

        //등록
        em.persist(favoriteBus);
        em.persist(favoriteBus2);

//        //전체 조회
        List<FavoriteBus> favoriteBusList = em.createQuery("select b from FavoriteBus b", FavoriteBus.class).getResultList();
        System.out.println(favoriteBusList);
        for(FavoriteBus bl : favoriteBusList){
            System.out.println(bl.getId());
            System.out.println(bl.getName());
        }

        //id로 삭제
        FavoriteBus foundBusStop =em.find(FavoriteBus.class, id);
        em.remove(foundBusStop);
    }
}