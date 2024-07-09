package com.sathwick.lowleveldesign.parkinglot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathwick.lowleveldesign.parkinglot.domain.ParkingGate;

@Repository
public interface ParkingGateRepository extends JpaRepository<ParkingGate, Long> {

}
