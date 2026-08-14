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

public class PackageEntity_hashCode_164920420212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103575;

    public PackageEntity_hashCode_164920420212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103576 = new ArrayList();
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ((ArrayList) term103576).add((Object)null);
        ArrayList term103604 = new ArrayList();
        ((ArrayList) term103604).add((Object)null);
        ((ArrayList) term103604).add((Object)null);
        ((ArrayList) term103604).add((Object)null);
        ((ArrayList) term103604).add((Object)null);
        term103575 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103575, term103575.getClass(), "memberEntities", term103576);
        setField(term103575, term103575.getClass(), "id", "ZEmNnaQFYB");
        setField(term103575, term103575.getClass(), "name", "FNxFpCZxLW");
        setField(term103575, term103575.getClass(), "relationEntities", term103604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term103575, args);
    }

};


