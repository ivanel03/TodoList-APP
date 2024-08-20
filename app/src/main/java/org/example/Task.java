package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Task implements INotification {
    private String name;
    private String description;
    private LocalDate limitDate;
    private int notificationDate; //para saber cuantos dias antes quieres recibir la notificacion

    public Task(String name, String description, LocalDate limitDate, int notificationDate) {
        this.name = name;
        this.description = description;
        this.limitDate = limitDate;
        this.notificationDate = notificationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }
    public String toString() {
        return "Task [name=" + name + ", description=" + description + ", limitDate=" + limitDate + "]";
    }
    public String sendNotification(){
        return this.toString();
    }
    public boolean checkLimitDate(){ // comprueba con la fecha de hoy y resta los dias para compararlo con notificationDate
        LocalDate today = LocalDate.now();
        Period period = Period.between(limitDate, today);
        int days = period.getDays();
        return days == notificationDate;
    }
}
