package org.example;

import java.time.LocalDateTime;

public class Appointment {
    private int appointmentId;
    private boolean isCanceled;

    public Integer getID(){
        return appointmentId;
    }

    public boolean isCanceled(){
        return isCanceled;
    }
public void setIsCanceled(boolean isCanceled){
        this.isCanceled = isCanceled;
}

    public Appointment(int appointmentId, Installer installer, Product product, LocalDateTime scheduledTime) {
        this.appointmentId = appointmentId;
        this.isCanceled = false;
    }










}
