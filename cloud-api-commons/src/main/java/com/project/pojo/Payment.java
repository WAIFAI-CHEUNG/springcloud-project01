package com.project.pojo;

/**
 * description:
 * date: 2022-02-08 17:23
 * author: waifaicheung
 * version: 1.0 <br>
 */
public class Payment {

    private Long id;
    private String serial;

    public Payment() {
    }

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
