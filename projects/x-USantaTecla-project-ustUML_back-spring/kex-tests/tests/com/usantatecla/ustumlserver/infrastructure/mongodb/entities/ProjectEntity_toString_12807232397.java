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

public class ProjectEntity_toString_12807232397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112173;

    public ProjectEntity_toString_12807232397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112174 = new ArrayList();
        ((ArrayList) term112174).add((Object)null);
        ((ArrayList) term112174).add((Object)null);
        ArrayList term112202 = new ArrayList();
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        ((ArrayList) term112202).add((Object)null);
        term112173 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term112173, term112173.getClass(), "memberEntities", term112174);
        setField(term112173, term112173.getClass(), "id", "jySnpYEVPv");
        setField(term112173, term112173.getClass(), "name", "VdHqujFzSo");
        setField(term112173, term112173.getClass(), "relationEntities", term112202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term112173, args);
    }

};


