package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SessionEntity_SessionEntityBuilder_memberEntities_6920602863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72060;
     Object term72089;

    public SessionEntity_SessionEntityBuilder_memberEntities_6920602863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72085 = new ArrayList();
        ((ArrayList) term72085).add((Object)null);
        ((ArrayList) term72085).add((Object)null);
        term72060 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder"));
        setField(term72060, term72060.getClass(), "id", "kjqlBVaviD");
        setField(term72060, term72060.getClass(), "sessionId", "iVRXRDCrcM");
        setField(term72060, term72060.getClass(), "memberEntities", term72085);
        term72089 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term72089;
        callMethod(klass, "memberEntities", argTypes, term72060, args);
    }

};


