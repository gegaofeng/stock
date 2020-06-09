package org.javaboy.vhr.model;

import java.io.Serializable;

public class Stock implements Serializable {
    private Integer no;

    private String code;

    private String name;

    private Byte ndustry;

    private static final long serialVersionUID = 1L;

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getNdustry() {
        return ndustry;
    }

    public void setNdustry(Byte ndustry) {
        this.ndustry = ndustry;
    }
}