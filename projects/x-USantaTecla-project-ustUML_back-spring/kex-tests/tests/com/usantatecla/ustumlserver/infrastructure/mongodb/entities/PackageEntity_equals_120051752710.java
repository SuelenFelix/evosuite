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

public class PackageEntity_equals_120051752710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103467;
     Object term103500;

    public PackageEntity_equals_120051752710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103468 = new ArrayList();
        ((ArrayList) term103468).add((Object)null);
        ((ArrayList) term103468).add((Object)null);
        ((ArrayList) term103468).add((Object)null);
        ArrayList term103496 = new ArrayList();
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        ((ArrayList) term103496).add((Object)null);
        term103467 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103467, term103467.getClass(), "memberEntities", term103468);
        setField(term103467, term103467.getClass(), "id", "lSidZunNtu");
        setField(term103467, term103467.getClass(), "name", "TLUhUnoanK");
        setField(term103467, term103467.getClass(), "relationEntities", term103496);
        term103500 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103500;
        callMethod(klass, "equals", argTypes, term103467, args);
    }

};


