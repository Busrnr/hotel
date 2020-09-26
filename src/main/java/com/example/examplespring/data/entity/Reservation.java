package com.example.examplespring.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table (name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long reservation_id;
    @Column(name ="ROOM_ID")
    private long room_id;
    @Column(name ="GUEST_ID")
    private long guest_id;
    @Column (name ="RES_DATE")
    private Date res_date;

    public long getReservation_id() {
        return this.reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }
   
    public long getRoom_id() {
        return this.room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getGuest_id() {
        return this.guest_id;
    }

    public void setGuest_id(long guest_id) {
        this.guest_id = guest_id;
    }
    
    public Date getRes_date() {
        return res_date;
    }

    public void setRes_date(Date res_date) {
        this.res_date = res_date;
    }

    

    
}
