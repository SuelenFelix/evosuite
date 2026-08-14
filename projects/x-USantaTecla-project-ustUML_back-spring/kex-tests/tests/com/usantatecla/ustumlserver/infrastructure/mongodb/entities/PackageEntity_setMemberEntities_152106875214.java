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
import java.util.LinkedList;

public class PackageEntity_setMemberEntities_152106875214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103681;
     Object term103714;

    public PackageEntity_setMemberEntities_152106875214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103682 = new ArrayList();
        ((ArrayList) term103682).add((Object)null);
        ArrayList term103710 = new ArrayList();
        ((ArrayList) term103710).add((Object)null);
        ((ArrayList) term103710).add((Object)null);
        ((ArrayList) term103710).add((Object)null);
        ((ArrayList) term103710).add((Object)null);
        term103681 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103681, term103681.getClass(), "memberEntities", term103682);
        setField(term103681, term103681.getClass(), "id", "bhEFtkUvDw");
        setField(term103681, term103681.getClass(), "name", "ZmbknwMIBa");
        setField(term103681, term103681.getClass(), "relationEntities", term103710);
        term103714 = new LinkedList();
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
        ((LinkedList) term103714).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term103714;
        callMethod(klass, "setMemberEntities", argTypes, term103681, args);
    }

};


