package co.edu.unisabana.parcial.repository.sql.entity;

import co.edu.unisabana.parcial.service.model.Checkin;
import co.edu.unisabana.parcial.service.model.Checkout;

public interface CheckpointInteface {

    static Checkpoint fromCheckin(Checkin checkin){
        return new Checkpoint();
    }


    static Checkpoint fromCheckout(Checkout Checkout){
        return new Checkpoint();
    }

    Checkin toCheckin();
}
