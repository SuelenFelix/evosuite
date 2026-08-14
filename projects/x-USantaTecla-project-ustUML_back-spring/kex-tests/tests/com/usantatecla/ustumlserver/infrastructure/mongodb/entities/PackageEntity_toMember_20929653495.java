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

public class PackageEntity_toMember_20929653495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103308;

    public PackageEntity_toMember_20929653495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103309 = new ArrayList();
        ArrayList term103337 = new ArrayList();
        ((ArrayList) term103337).add((Object)null);
        ((ArrayList) term103337).add((Object)null);
        ((ArrayList) term103337).add((Object)null);
        ((ArrayList) term103337).add((Object)null);
        ((ArrayList) term103337).add((Object)null);
        term103308 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103308, term103308.getClass(), "memberEntities", term103309);
        setField(term103308, term103308.getClass(), "id", "HqyBQNuLnz");
        setField(term103308, term103308.getClass(), "name", "xWkZKbrvmX");
        setField(term103308, term103308.getClass(), "relationEntities", term103337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMember", argTypes, term103308, args);
    }

};


