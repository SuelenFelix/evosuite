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

public class AccountEntity_getProjectEntities_3130499629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65393;

    public AccountEntity_getProjectEntities_3130499629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65524 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term65523 = ((Class) term65524).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term65523).setAccessible(true);
        Object enum167 = ((Field) term65523).get((Object) null);
        ArrayList term65438 = new ArrayList();
        ((ArrayList) term65438).add((Object)null);
        ArrayList term65443 = new ArrayList();
        ((ArrayList) term65443).add((Object)null);
        ((ArrayList) term65443).add((Object)null);
        ((ArrayList) term65443).add((Object)null);
        ((ArrayList) term65443).add((Object)null);
        Object term65437 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65437, term65437.getClass(), "memberEntities", term65438);
        setField(term65437, term65437.getClass(), "id", "");
        setField(term65437, term65437.getClass(), "name", "");
        setField(term65437, term65437.getClass(), "relationEntities", term65443);
        ArrayList term65447 = new ArrayList();
        ArrayList term65452 = new ArrayList();
        ((ArrayList) term65452).add((Object)null);
        ((ArrayList) term65452).add((Object)null);
        ((ArrayList) term65452).add((Object)null);
        ((ArrayList) term65452).add((Object)null);
        ((ArrayList) term65452).add((Object)null);
        Object term65446 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65446, term65446.getClass(), "memberEntities", term65447);
        setField(term65446, term65446.getClass(), "id", "");
        setField(term65446, term65446.getClass(), "name", "");
        setField(term65446, term65446.getClass(), "relationEntities", term65452);
        ArrayList term65456 = new ArrayList();
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ((ArrayList) term65456).add((Object)null);
        ArrayList term65461 = new ArrayList();
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        ((ArrayList) term65461).add((Object)null);
        Object term65455 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65455, term65455.getClass(), "memberEntities", term65456);
        setField(term65455, term65455.getClass(), "id", "");
        setField(term65455, term65455.getClass(), "name", "");
        setField(term65455, term65455.getClass(), "relationEntities", term65461);
        ArrayList term65465 = new ArrayList();
        ((ArrayList) term65465).add((Object)null);
        ((ArrayList) term65465).add((Object)null);
        ((ArrayList) term65465).add((Object)null);
        ArrayList term65470 = new ArrayList();
        ((ArrayList) term65470).add((Object)null);
        ((ArrayList) term65470).add((Object)null);
        ((ArrayList) term65470).add((Object)null);
        ((ArrayList) term65470).add((Object)null);
        Object term65464 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term65464, term65464.getClass(), "memberEntities", term65465);
        setField(term65464, term65464.getClass(), "id", "");
        setField(term65464, term65464.getClass(), "name", "");
        setField(term65464, term65464.getClass(), "relationEntities", term65470);
        ArrayList term65435 = new ArrayList();
        ((ArrayList) term65435).add(term65437);
        ((ArrayList) term65435).add(term65446);
        ((ArrayList) term65435).add(term65455);
        ((ArrayList) term65435).add(term65464);
        ArrayList term65499 = new ArrayList();
        ((ArrayList) term65499).add((Object)null);
        ((ArrayList) term65499).add((Object)null);
        ((ArrayList) term65499).add((Object)null);
        term65393 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity"));
        setField(term65393, term65393.getClass(), "email", "lnJvDbbuwo");
        setField(term65393, term65393.getClass(), "password", "KExnWkKGvF");
        setField(term65393, term65393.getClass(), "role", enum167);
        setField(term65393, term65393.getClass(), "projectEntities", term65435);
        setField(term65393, term65393.getClass(), "id", "WRIQkTdeMl");
        setField(term65393, term65393.getClass(), "name", "rLSEheWsHd");
        setField(term65393, term65393.getClass(), "relationEntities", term65499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectEntities", argTypes, term65393, args);
    }

};


