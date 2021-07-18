package domain.busstop;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class FavoriteStopTest {
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
        Integer id = 124567;
        FavoriteStop favoriteStop = new FavoriteStop.Builder()
                .id(id)
                .name("전남대후문정류")
                .build();

        //등록
        em.persist(favoriteStop);

        //전체 조회
        List<FavoriteStop> favoriteStopList = em.createQuery("select b from FavoriteStop b", FavoriteStop.class).getResultList();
        for(FavoriteStop bs : favoriteStopList){
            System.out.println(bs.getId());
            System.out.println(bs.getName());

        }

        //id로 삭제
        FavoriteStop foundBusLine =em.find(FavoriteStop.class, id);
        em.remove(foundBusLine);
    }
}