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

public class CompositionEntity_init_16463632440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1365;

    public CompositionEntity_init_16463632440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1365 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Composition"));
        setField(term1365, term1365.getClass(), "id", "ieCtQFdkii");
        setField(term1365, term1365.getClass(), "target", null);
        setField(term1365, term1365.getClass(), "role", "dEnhdmILtU");
        setField(term1365, term1365.getClass(), "targetRoute", "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.CompositionEntity");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.relations.Composition");
        argTypes[1] = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.MemberEntity");
        Object[] args = new Object[2];
        args[0] = term1365;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


