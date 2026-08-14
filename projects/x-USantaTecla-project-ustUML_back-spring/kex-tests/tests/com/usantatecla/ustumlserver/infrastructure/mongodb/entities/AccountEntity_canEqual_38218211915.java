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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class AccountEntity_canEqual_38218211915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68171;
     Object term68272;

    public AccountEntity_canEqual_38218211915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68294 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term68293 = ((Class) term68294).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term68293).setAccessible(true);
        Object enum173 = ((Field) term68293).get((Object) null);
        ArrayList term68216 = new ArrayList();
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ((ArrayList) term68216).add((Object)null);
        ArrayList term68221 = new ArrayList();
        ((ArrayList) term68221).add((Object)null);
        ((ArrayList) term68221).add((Object)null);
        ((ArrayList) term68221).add((Object)null);
        ((ArrayList) term68221).add((Object)null);
        Object term68215 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term68215, term68215.getClass(), "memberEntities", term68216);
        setField(term68215, term68215.getClass(), "id", "");
        setField(term68215, term68215.getClass(), "name", "");
        setField(term68215, term68215.getClass(), "relationEntities", term68221);
        ArrayList term68225 = new ArrayList();
        ((ArrayList) term68225).add((Object)null);
        ((ArrayList) term68225).add((Object)null);
        ((ArrayList) term68225).add((Object)null);
        ((ArrayList) term68225).add((Object)null);
        ((ArrayList) term68225).add((Object)null);
        ArrayList term68230 = new ArrayList();
        ((ArrayList) term68230).add((Object)null);
        ((ArrayList) term68230).add((Object)null);
        ((ArrayList) term68230).add((Object)null);
        ((ArrayList) term68230).add((Object)null);
        Object term68224 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term68224, term68224.getClass(), "memberEntities", term68225);
        setField(term68224, term68224.getClass(), "id", "");
        setField(term68224, term68224.getClass(), "name", "");
        setField(term68224, term68224.getClass(), "relationEntities", term68230);
        ArrayList term68234 = new ArrayList();
        ArrayList term68239 = new ArrayList();
        ((ArrayList) term68239).add((Object)null);
        ((ArrayList) term68239).add((Object)null);
        ((ArrayList) term68239).add((Object)null);
        ((ArrayList) term68239).add((Object)null);
        ((ArrayList) term68239).add((Object)null);
        ((ArrayList) term68239).add((Object)null);
        Object term68233 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term68233, term68233.getClass(), "memberEntities", term68234);
        setField(term68233, term68233.getClass(), "id", "");
        setField(term68233, term68233.getClass(), "name", "");
        setField(term68233, term68233.getClass(), "relationEntities", term68239);
        ArrayList term68213 = new ArrayList();
        ((ArrayList) term68213).add(term68215);
        ((ArrayList) term68213).add(term68224);
        ((ArrayList) term68213).add(term68233);
        ArrayList term68268 = new ArrayList();
        ((ArrayList) term68268).add((Object)null);
        ((ArrayList) term68268).add((Object)null);
        ((ArrayList) term68268).add((Object)null);
        ((ArrayList) term68268).add((Object)null);
        term68171 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term68171, term68171.getClass(), "email", "UlxGFzEifL");
        setField(term68171, term68171.getClass(), "password", "HilHTbDKDF");
        setField(term68171, term68171.getClass(), "role", enum173);
        setField(term68171, term68171.getClass(), "projectEntities", term68213);
        setField(term68171, term68171.getClass(), "id", "WAljagiCzu");
        setField(term68171, term68171.getClass(), "name", "XKMXfDZajw");
        setField(term68171, term68171.getClass(), "relationEntities", term68268);
        term68272 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68272;
        callMethod(klass, "canEqual", argTypes, term68171, args);
    }

};


