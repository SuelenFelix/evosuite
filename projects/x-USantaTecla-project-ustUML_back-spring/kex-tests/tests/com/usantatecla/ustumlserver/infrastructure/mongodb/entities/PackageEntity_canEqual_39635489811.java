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

public class PackageEntity_canEqual_39635489811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103521;
     Object term103554;

    public PackageEntity_canEqual_39635489811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103522 = new ArrayList();
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ((ArrayList) term103522).add((Object)null);
        ArrayList term103550 = new ArrayList();
        ((ArrayList) term103550).add((Object)null);
        term103521 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103521, term103521.getClass(), "memberEntities", term103522);
        setField(term103521, term103521.getClass(), "id", "JXyQTIyIrU");
        setField(term103521, term103521.getClass(), "name", "uplmRQRGWr");
        setField(term103521, term103521.getClass(), "relationEntities", term103550);
        term103554 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103554;
        callMethod(klass, "canEqual", argTypes, term103521, args);
    }

};


