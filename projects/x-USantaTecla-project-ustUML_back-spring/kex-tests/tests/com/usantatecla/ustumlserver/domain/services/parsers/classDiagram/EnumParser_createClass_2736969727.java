package com.usantatecla.ustumlserver.domain.services.parsers.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EnumParser_createClass_2736969727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7065;

    public EnumParser_createClass_2736969727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7065 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.EnumParser"));
        setField(term7065, term7065.getClass(), "objects", null);
        setField(term7065, term7065.getClass(), "modifiers", null);
        setField(term7065, term7065.getClass(), "attributes", null);
        setField(term7065, term7065.getClass(), "methods", null);
        setField(term7065, term7065.getClass(), "account", null);
        setField(term7065, term7065.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.EnumParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createClass", argTypes, term7065, args);
    }

};


