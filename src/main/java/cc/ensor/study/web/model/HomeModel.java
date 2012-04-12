package cc.ensor.study.web.model;

import javax.validation.constraints.Size;

public class HomeModel {

    @Size(max = 10, min = 1, message = "{field.size}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
