package service;

import Dto.FavoriteBusRequestDto;
import Dto.FavoriteStopRequestDto;
import domain.busline.FavoriteBus;
import domain.busstop.FavoriteStop;

import javax.persistence.*;
import java.util.List;

public class FavoritesService {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2jpa");
    private EntityManager em = emf.createEntityManager();
    private EntityTransaction tx = em.getTransaction();

    public FavoritesService(){}

    // 버스노선 즐겨찾기 목록에 추가.
    public void save(FavoriteBusRequestDto requestDto) {
        try {
            tx.begin();
            em.persist(requestDto.toEntity());
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }

    }
    // 버스정류장 즐겨찾기 목록에 추가.
    public void save(FavoriteStopRequestDto requestDto) {
        try {
            tx.begin();
            em.persist(requestDto.toEntity());
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
    }

    // 검색
    public boolean find(FavoriteBusRequestDto requestDto){
        FavoriteBus foundFavoriteBus;
        try {
            foundFavoriteBus = em.find(FavoriteBus.class, requestDto.getId());
        } catch (Exception e) {
            return false;
        }
        return foundFavoriteBus != null;
    }

    public boolean find(FavoriteStopRequestDto requestDto){
        FavoriteStop foundFavoriteStop;
        try {
            foundFavoriteStop = em.find(FavoriteStop.class, requestDto.getId());
        } catch (Exception e) {
            return false;
        }
        return foundFavoriteStop != null;
    }


    // id로 버스노선 즐겨찾기 목록에서 제거.
    public void delById(FavoriteBusRequestDto requestDto) {
        try {
            tx.begin();
            FavoriteBus foundFavoriteBus = em.find(FavoriteBus.class, requestDto.getId());
            em.remove(foundFavoriteBus);
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        }
    }
    // id로 버스정류장 즐겨찾기 목록에서 제거.
    public void delById(FavoriteStopRequestDto requestDto) {
        try {
            tx.begin();
            FavoriteStop foundFavoriteStop = em.find(FavoriteStop.class, requestDto.getId());
            em.remove(foundFavoriteStop);
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        }
    }

    //버스 노선 즐겨찾기 목록 반환.
    public List<FavoriteBus> findAllLines() {
        em = emf.createEntityManager();
        tx = em.getTransaction();
        try {
            tx.begin();
            List<FavoriteBus> favoriteBusList = em.createQuery("SELECT bl FROM FavoriteBus bl", FavoriteBus.class).getResultList();
            tx.commit();
            return favoriteBusList;

        } catch (Exception e) {
            tx.rollback();
        }
        return null;
    }

    //버스 정류장 즐겨찾기 목록환 반환.
    public List<FavoriteStop> findAllStops() {
        em = emf.createEntityManager();
        tx = em.getTransaction();

        try {
            tx.begin();
            List<FavoriteStop> favoriteStopList = em.createQuery("SELECT bs FROM FavoriteStop bs", FavoriteStop.class).getResultList();
            tx.commit();
            return favoriteStopList;

        } catch (Exception e) {
            tx.rollback();
        }
        return null;
    }

    //모든 즐겨찾기 정류장 삭제.
    public void deleteAllStop(){
        try {
            tx.begin();
            Query query = em.createQuery("delete from FavoriteStop");
            query.executeUpdate();
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        }
    }

    //모든 즐겨찾기 버스노선 삭제.
    public void deleteAllLine(){
        try {
            tx.begin();
            Query query = em.createQuery("delete from FavoriteBus");
            query.executeUpdate();
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        }
    }
}
