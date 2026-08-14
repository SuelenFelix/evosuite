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

public class PackageEntity_createPackage_14173678027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103414;

    public PackageEntity_createPackage_14173678027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103415 = new ArrayList();
        ((ArrayList) term103415).add((Object)null);
        ((ArrayList) term103415).add((Object)null);
        ((ArrayList) term103415).add((Object)null);
        ((ArrayList) term103415).add((Object)null);
        ((ArrayList) term103415).add((Object)null);
        ArrayList term103443 = new ArrayList();
        ((ArrayList) term103443).add((Object)null);
        ((ArrayList) term103443).add((Object)null);
        ((ArrayList) term103443).add((Object)null);
        ((ArrayList) term103443).add((Object)null);
        ((ArrayList) term103443).add((Object)null);
        ((ArrayList) term103443).add((Object)null);
        term103414 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103414, term103414.getClass(), "memberEntities", term103415);
        setField(term103414, term103414.getClass(), "id", "pkfsHvqODq");
        setField(term103414, term103414.getClass(), "name", "OoRBUdwown");
        setField(term103414, term103414.getClass(), "relationEntities", term103443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPackage", argTypes, term103414, args);
    }

};


