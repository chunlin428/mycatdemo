package com.net.boot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Accessors(chain = true)
@Entity
public class Adminusers {

    private long id;

    private String name;

    private Date indate;

    private long userid;
}
