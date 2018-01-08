package com.zxy.sample.entry;

import java.io.Serializable;

public abstract class BaseEntry implements Serializable{

    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
