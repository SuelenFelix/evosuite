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

public class SessionEntity_SessionEntityBuilder_toString_19376294105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72161;

    public SessionEntity_SessionEntityBuilder_toString_19376294105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72186 = new ArrayList();
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        ((ArrayList) term72186).add((Object)null);
        term72161 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder"));
        setField(term72161, term72161.getClass(), "id", "tYBgGQtkhi");
        setField(term72161, term72161.getClass(), "sessionId", "PhGPFLIMKH");
        setField(term72161, term72161.getClass(), "memberEntities", term72186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term72161, args);
    }

};


