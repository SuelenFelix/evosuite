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

public class PackageEntity_getMemberEntities_163570309413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103628;

    public PackageEntity_getMemberEntities_163570309413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103629 = new ArrayList();
        ((ArrayList) term103629).add((Object)null);
        ArrayList term103657 = new ArrayList();
        ((ArrayList) term103657).add((Object)null);
        ((ArrayList) term103657).add((Object)null);
        ((ArrayList) term103657).add((Object)null);
        ((ArrayList) term103657).add((Object)null);
        ((ArrayList) term103657).add((Object)null);
        term103628 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103628, term103628.getClass(), "memberEntities", term103629);
        setField(term103628, term103628.getClass(), "id", "sXMXSCUbRu");
        setField(term103628, term103628.getClass(), "name", "iualVLfDmL");
        setField(term103628, term103628.getClass(), "relationEntities", term103657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberEntities", argTypes, term103628, args);
    }

};


