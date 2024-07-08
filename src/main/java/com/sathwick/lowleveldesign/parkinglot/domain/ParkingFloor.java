package com.sathwick.lowleveldesign.parkinglot.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ParkingFloor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long parkingFloorId;
    private String floorNumber;
    @OneToMany(mappedBy = "parking_floor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ParkingSlot> parkingSlots;
    @ManyToOne
    @JoinColumn(name = "parking_lot_id")
    private ParkingLot parkingLot;
}