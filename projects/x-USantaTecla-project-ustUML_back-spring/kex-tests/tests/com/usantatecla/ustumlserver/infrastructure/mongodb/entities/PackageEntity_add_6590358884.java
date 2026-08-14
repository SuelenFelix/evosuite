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

public class PackageEntity_add_6590358884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103255;

    public PackageEntity_add_6590358884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103256 = new ArrayList();
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ((ArrayList) term103256).add((Object)null);
        ArrayList term103284 = new ArrayList();
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        ((ArrayList) term103284).add((Object)null);
        term103255 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity"));
        setField(term103255, term103255.getClass(), "memberEntities", term103256);
        setField(term103255, term103255.getClass(), "id", "FIUbHJmAEj");
        setField(term103255, term103255.getClass(), "name", "mJrFDaDdyY");
        setField(term103255, term103255.getClass(), "relationEntities", term103284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.MemberEntity");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term103255, args);
    }

};


