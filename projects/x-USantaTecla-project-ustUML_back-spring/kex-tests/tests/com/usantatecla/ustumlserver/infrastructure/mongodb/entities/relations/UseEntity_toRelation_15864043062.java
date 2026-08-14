package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UseEntity_toRelation_15864043062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term749;

    public UseEntity_toRelation_15864043062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term749 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.UseEntity"));
        setField(term749, term749.getClass(), "id", "SbAoxhfrkn");
        setField(term749, term749.getClass(), "target", null);
        setField(term749, term749.getClass(), "role", "kuTXqwMtDB");
        setField(term749, term749.getClass(), "targetRoute", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.UseEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toRelation", argTypes, term749, args);
    }

};


