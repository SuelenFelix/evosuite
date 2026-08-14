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

public class PackageEntity_getMembers_6489175723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103202;

    public PackageEntity_getMembers_6489175723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103203 = new ArrayList();
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ((ArrayList) term103203).add((Object)null);
        ArrayList term103231 = new ArrayList();
        ((ArrayList) term103231).add((Object)null);
        term103202 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103202, term103202.getClass(), "memberEntities", term103203);
        setField(term103202, term103202.getClass(), "id", "TELyWFMBJv");
        setField(term103202, term103202.getClass(), "name", "bIqbgRdzpB");
        setField(term103202, term103202.getClass(), "relationEntities", term103231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembers", argTypes, term103202, args);
    }

};


