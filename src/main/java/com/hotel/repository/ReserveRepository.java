package com.hotel.repository;

import com.hotel.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReserveRepository extends JpaRepository<Reserve, Integer> {

    @Query("select r from Reserve r")
    List<Reserve> getAll();

    @Query("select r from Reserve r where r.client.id = ?1")
    List<Reserve> getReserveByClient(int clientId);
}
