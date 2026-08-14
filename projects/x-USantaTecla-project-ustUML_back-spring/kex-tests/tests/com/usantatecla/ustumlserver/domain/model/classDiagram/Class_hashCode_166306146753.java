package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Class_hashCode_166306146753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37494;

    public Class_hashCode_166306146753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37494 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term37494, term37494.getClass(), "modifiers", null);
        setField(term37494, term37494.getClass(), "attributes", null);
        setField(term37494, term37494.getClass(), "methods", null);
        setField(term37494, term37494.getClass(), "id", null);
        setField(term37494, term37494.getClass(), "name", null);
        setField(term37494, term37494.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term37494, args);
    }

};


