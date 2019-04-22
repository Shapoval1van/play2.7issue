package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Copyright (C) 2013-2018, Cyber Force Group s.r.o.,
 *
 * Křemencova 186/7, Nove Město, 110 00 Praha evolutions, Czech Republic
 * mailto: info AT sdk dot finance
 * This file is part of the SDK.finance product. SDK.finance is the proprietary licensed software.
 * Unauthorised copying of this file, via any medium, modification and/or any type of its distribution
 * is strictly prohibited
 * Proprietary and confidential.
 */
@Table(name = "test")
@Entity
public class Test {

    @Id
    private String id;

    public Test(String id) {
        this.id = id;
    }
}
