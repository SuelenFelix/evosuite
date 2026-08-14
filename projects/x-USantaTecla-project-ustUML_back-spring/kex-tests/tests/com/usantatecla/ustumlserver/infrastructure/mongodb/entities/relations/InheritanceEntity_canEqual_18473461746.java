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

public class InheritanceEntity_canEqual_18473461746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2384;
     Object term2421;

    public InheritanceEntity_canEqual_18473461746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2384 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.InheritanceEntity"));
        setField(term2384, term2384.getClass(), "id", "qxSDVejjiY");
        setField(term2384, term2384.getClass(), "target", null);
        setField(term2384, term2384.getClass(), "role", "xBsXSDjXYK");
        setField(term2384, term2384.getClass(), "targetRoute", "sEnIVFtZuQ");
        term2421 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.relations.InheritanceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2421;
        callMethod(klass, "canEqual", argTypes, term2384, args);
    }

};


