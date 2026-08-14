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
import java.util.LinkedList;
import java.util.ArrayList;

public class AccountEntity_init_164772476519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum176;
     Object term69563;

    public AccountEntity_init_164772476519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69668 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term69667 = ((Class) term69668).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term69667).setAccessible(true);
        enum176 = ((Field) term69667).get((Object) null);
        ArrayList term69567 = new ArrayList();
        ((ArrayList) term69567).add((Object)null);
        ArrayList term69595 = new ArrayList();
        ((ArrayList) term69595).add((Object)null);
        ((ArrayList) term69595).add((Object)null);
        ((ArrayList) term69595).add((Object)null);
        ((ArrayList) term69595).add((Object)null);
        ((ArrayList) term69595).add((Object)null);
        ((ArrayList) term69595).add((Object)null);
        Object term69566 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term69566, term69566.getClass(), "memberEntities", term69567);
        setField(term69566, term69566.getClass(), "id", "PEUfeJaZTk");
        setField(term69566, term69566.getClass(), "name", "AIvyeIdskz");
        setField(term69566, term69566.getClass(), "relationEntities", term69595);
        ArrayList term69601 = new ArrayList();
        ((ArrayList) term69601).add((Object)null);
        ((ArrayList) term69601).add((Object)null);
        ArrayList term69606 = new ArrayList();
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        ((ArrayList) term69606).add((Object)null);
        Object term69600 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term69600, term69600.getClass(), "memberEntities", term69601);
        setField(term69600, term69600.getClass(), "id", "");
        setField(term69600, term69600.getClass(), "name", "");
        setField(term69600, term69600.getClass(), "relationEntities", term69606);
        Object term69610 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term69610, term69610.getClass(), "memberEntities", null);
        setField(term69610, term69610.getClass(), "id", null);
        setField(term69610, term69610.getClass(), "name", null);
        setField(term69610, term69610.getClass(), "relationEntities", null);
        term69563 = new LinkedList();
        ((LinkedList) term69563).add(term69566);
        ((LinkedList) term69563).add(term69600);
        ((LinkedList) term69563).add(term69610);
        ((LinkedList) term69563).add((Object)null);
        ((LinkedList) term69563).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.AccountEntity");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.usantatecla.ustumlserver.domain.model.Role");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = "YMmtjELJuB";
        args[1] = "FzyIShiOmb";
        args[2] = enum176;
        args[3] = term69563;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


