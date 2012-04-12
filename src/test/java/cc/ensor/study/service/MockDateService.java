package cc.ensor.study.service;

import java.util.Date;

public class MockDateService implements DateService {

    private Date date;

    @Override
    public Date getNow() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}