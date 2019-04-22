package controllers;

import model.Test;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.UUID;

public class Application extends Controller {
    private final JPARepository jpaRepository;

    @Inject
    public Application(JPARepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    public Result index() {
        jpaRepository.runTransaction(em ->  em.persist(new Test(UUID.randomUUID().toString())));
        return ok();
    }

}
