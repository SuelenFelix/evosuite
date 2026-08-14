package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class GithubOwnerResponse_setNodeId_10573734356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4154;

    public GithubOwnerResponse_setNodeId_10573734356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4167 = new Integer(1962444399);
        Boolean term4349 = new Boolean(true);
        term4154 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse"));
        setField(term4154, term4154.getClass(), "login", "ekxGuOYIwi");
        setField(term4154, term4154.getClass(), "id", term4167);
        setField(term4154, term4154.getClass(), "nodeId", "RbVQXSpxXy");
        setField(term4154, term4154.getClass(), "avatarUrl", "YpJbIgJWWv");
        setField(term4154, term4154.getClass(), "gravatarId", "JppkknKVOw");
        setField(term4154, term4154.getClass(), "url", "iljANwuEjk");
        setField(term4154, term4154.getClass(), "htmlUrl", "kNqaJKIATy");
        setField(term4154, term4154.getClass(), "followersUrl", "vKQukfbJUd");
        setField(term4154, term4154.getClass(), "followingUrl", "lFRJFUMVbx");
        setField(term4154, term4154.getClass(), "gistsUrl", "sZdUNdggUW");
        setField(term4154, term4154.getClass(), "starredUrl", "OqbwYQfvAe");
        setField(term4154, term4154.getClass(), "subscriptionsUrl", "tRxZafjqIx");
        setField(term4154, term4154.getClass(), "organizationsUrl", "DhjNLmRMCu");
        setField(term4154, term4154.getClass(), "reposUrl", "PgPzMSEjjX");
        setField(term4154, term4154.getClass(), "eventsUrl", "wzsPSPcRdj");
        setField(term4154, term4154.getClass(), "receivedEventsUrl", "kGMQdqJYyB");
        setField(term4154, term4154.getClass(), "type", "XJJNClzHRf");
        setField(term4154, term4154.getClass(), "siteAdmin", term4349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubOwnerResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HDaezxQfQR";
        callMethod(klass, "setNodeId", argTypes, term4154, args);
    }

};


