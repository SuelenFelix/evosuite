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

public class AccountEntity_setPassword_54671757011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66312;

    public AccountEntity_setPassword_54671757011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66455 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term66454 = ((Class) term66455).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term66454).setAccessible(true);
        Object enum169 = ((Field) term66454).get((Object) null);
        ArrayList term66357 = new ArrayList();
        ((ArrayList) term66357).add((Object)null);
        ((ArrayList) term66357).add((Object)null);
        ArrayList term66362 = new ArrayList();
        ((ArrayList) term66362).add((Object)null);
        ((ArrayList) term66362).add((Object)null);
        ((ArrayList) term66362).add((Object)null);
        ((ArrayList) term66362).add((Object)null);
        ((ArrayList) term66362).add((Object)null);
        Object term66356 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66356, term66356.getClass(), "memberEntities", term66357);
        setField(term66356, term66356.getClass(), "id", "");
        setField(term66356, term66356.getClass(), "name", "");
        setField(term66356, term66356.getClass(), "relationEntities", term66362);
        ArrayList term66366 = new ArrayList();
        ((ArrayList) term66366).add((Object)null);
        ((ArrayList) term66366).add((Object)null);
        ((ArrayList) term66366).add((Object)null);
        ((ArrayList) term66366).add((Object)null);
        ((ArrayList) term66366).add((Object)null);
        ArrayList term66371 = new ArrayList();
        ((ArrayList) term66371).add((Object)null);
        ((ArrayList) term66371).add((Object)null);
        ((ArrayList) term66371).add((Object)null);
        ((ArrayList) term66371).add((Object)null);
        Object term66365 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66365, term66365.getClass(), "memberEntities", term66366);
        setField(term66365, term66365.getClass(), "id", "");
        setField(term66365, term66365.getClass(), "name", "");
        setField(term66365, term66365.getClass(), "relationEntities", term66371);
        ArrayList term66375 = new ArrayList();
        ((ArrayList) term66375).add((Object)null);
        ((ArrayList) term66375).add((Object)null);
        ((ArrayList) term66375).add((Object)null);
        ((ArrayList) term66375).add((Object)null);
        ArrayList term66380 = new ArrayList();
        ((ArrayList) term66380).add((Object)null);
        ((ArrayList) term66380).add((Object)null);
        ((ArrayList) term66380).add((Object)null);
        ((ArrayList) term66380).add((Object)null);
        ((ArrayList) term66380).add((Object)null);
        ((ArrayList) term66380).add((Object)null);
        Object term66374 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66374, term66374.getClass(), "memberEntities", term66375);
        setField(term66374, term66374.getClass(), "id", "");
        setField(term66374, term66374.getClass(), "name", "");
        setField(term66374, term66374.getClass(), "relationEntities", term66380);
        ArrayList term66384 = new ArrayList();
        ArrayList term66389 = new ArrayList();
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        ((ArrayList) term66389).add((Object)null);
        Object term66383 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term66383, term66383.getClass(), "memberEntities", term66384);
        setField(term66383, term66383.getClass(), "id", "");
        setField(term66383, term66383.getClass(), "name", "");
        setField(term66383, term66383.getClass(), "relationEntities", term66389);
        ArrayList term66354 = new ArrayList();
        ((ArrayList) term66354).add(term66356);
        ((ArrayList) term66354).add(term66365);
        ((ArrayList) term66354).add(term66374);
        ((ArrayList) term66354).add(term66383);
        ArrayList term66418 = new ArrayList();
        ((ArrayList) term66418).add((Object)null);
        ((ArrayList) term66418).add((Object)null);
        term66312 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term66312, term66312.getClass(), "email", "hkWmAkXSOW");
        setField(term66312, term66312.getClass(), "password", "DwQmZEKeOp");
        setField(term66312, term66312.getClass(), "role", enum169);
        setField(term66312, term66312.getClass(), "projectEntities", term66354);
        setField(term66312, term66312.getClass(), "id", "GWWfkXOYLP");
        setField(term66312, term66312.getClass(), "name", "qvykDllgpT");
        setField(term66312, term66312.getClass(), "relationEntities", term66418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hzdUbcLZhZ";
        callMethod(klass, "setPassword", argTypes, term66312, args);
    }

};


