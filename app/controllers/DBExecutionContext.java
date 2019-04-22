package controllers;

import akka.actor.ActorSystem;
import play.libs.concurrent.CustomExecutionContext;

import javax.inject.Inject;

/**
 * @author Victor Teslenko
 */
public class DBExecutionContext extends CustomExecutionContext {
    @Inject
    public DBExecutionContext(ActorSystem actorSystem) {
        super(actorSystem, "dispatchers.db");
    }
}
