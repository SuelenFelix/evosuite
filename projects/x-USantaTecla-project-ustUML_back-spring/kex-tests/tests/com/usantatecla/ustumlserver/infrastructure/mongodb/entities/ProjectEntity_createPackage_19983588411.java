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

public class ProjectEntity_createPackage_19983588411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111959;

    public ProjectEntity_createPackage_19983588411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111960 = new ArrayList();
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ((ArrayList) term111960).add((Object)null);
        ArrayList term111988 = new ArrayList();
        ((ArrayList) term111988).add((Object)null);
        term111959 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term111959, term111959.getClass(), "memberEntities", term111960);
        setField(term111959, term111959.getClass(), "id", "ltTwdndtbe");
        setField(term111959, term111959.getClass(), "name", "XaldiIeyMi");
        setField(term111959, term111959.getClass(), "relationEntities", term111988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPackage", argTypes, term111959, args);
    }

};


