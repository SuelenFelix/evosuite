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

public class PackageEntity_toPackage_20345890931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103096;

    public PackageEntity_toPackage_20345890931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103097 = new ArrayList();
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ((ArrayList) term103097).add((Object)null);
        ArrayList term103125 = new ArrayList();
        ((ArrayList) term103125).add((Object)null);
        ((ArrayList) term103125).add((Object)null);
        ((ArrayList) term103125).add((Object)null);
        ((ArrayList) term103125).add((Object)null);
        ((ArrayList) term103125).add((Object)null);
        term103096 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103096, term103096.getClass(), "memberEntities", term103097);
        setField(term103096, term103096.getClass(), "id", "JhszTkUWCg");
        setField(term103096, term103096.getClass(), "name", "gfNPCeiULY");
        setField(term103096, term103096.getClass(), "relationEntities", term103125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPackage", argTypes, term103096, args);
    }

};


