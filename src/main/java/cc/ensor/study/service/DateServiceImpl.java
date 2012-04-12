package cc.ensor.study.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service("dateService")
public class DateServiceImpl implements DateService {
    @Override
    public Date getNow() {
        return new Date();
    }
}
