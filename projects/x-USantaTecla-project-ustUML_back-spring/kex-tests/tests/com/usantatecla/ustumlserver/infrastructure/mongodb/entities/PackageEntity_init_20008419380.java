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

public class PackageEntity_init_20008419380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103043;

    public PackageEntity_init_20008419380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103044 = new ArrayList();
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ((ArrayList) term103044).add((Object)null);
        ArrayList term103072 = new ArrayList();
        ((ArrayList) term103072).add((Object)null);
        ((ArrayList) term103072).add((Object)null);
        ((ArrayList) term103072).add((Object)null);
        ((ArrayList) term103072).add((Object)null);
        ((ArrayList) term103072).add((Object)null);
        term103043 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term103043, term103043.getClass(), "members", term103044);
        setField(term103043, term103043.getClass(), "id", "mVHDjrsMAV");
        setField(term103043, term103043.getClass(), "name", "rjWnqcjYuU");
        setField(term103043, term103043.getClass(), "relations", term103072);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.PackageEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term103043;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


