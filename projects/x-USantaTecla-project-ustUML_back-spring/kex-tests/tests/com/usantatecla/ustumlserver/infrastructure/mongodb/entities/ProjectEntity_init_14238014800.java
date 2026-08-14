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

public class ProjectEntity_init_14238014800 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111906;

    public ProjectEntity_init_14238014800() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111907 = new ArrayList();
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ((ArrayList) term111907).add((Object)null);
        ArrayList term111935 = new ArrayList();
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        ((ArrayList) term111935).add((Object)null);
        term111906 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term111906, term111906.getClass(), "members", term111907);
        setField(term111906, term111906.getClass(), "id", "uHcUlIseio");
        setField(term111906, term111906.getClass(), "name", "bsmWXOcLZJ");
        setField(term111906, term111906.getClass(), "relations", term111935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Object[] args = new Object[1];
        args[0] = term111906;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


