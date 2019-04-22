package controllers;/*
 * Copyright (C) 2013-2018, Cyber Force Group s.r.o.,
 *
 * Křemencova 186/7, Nove Město, 110 00 Praha evolutions, Czech Republic
 * mailto: info AT sdk dot finance
 * This file is part of the SDK.finance product. SDK.finance is the proprietary licensed software.
 * Unauthorised copying of this file, via any medium, modification and/or any type of its distribution
 * is strictly prohibited
 * Proprietary and confidential.
 */

import akka.Done;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import play.db.jpa.JPAApi;

import javax.persistence.EntityManager;
import java.util.function.Consumer;

@Singleton
public class JPARepository {
    private JPAApi jpaApi;
    private DBExecutionContext executionContext;

    @Inject
    public JPARepository(JPAApi api, DBExecutionContext executionContext) {
        this.jpaApi = api;
        this.executionContext = executionContext;
    }

    public Done runTransaction(Consumer<EntityManager> fn) {
        return jpaApi.withTransaction(em -> {
            fn.accept(em);
            return Done.done();
        });
    }

}