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

public class InterfaceParser_copy_7593802306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17378;

    public InterfaceParser_copy_7593802306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17378 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.InterfaceParser"));
        setField(term17378, term17378.getClass(), "modifiers", null);
        setField(term17378, term17378.getClass(), "attributes", null);
        setField(term17378, term17378.getClass(), "methods", null);
        setField(term17378, term17378.getClass(), "account", null);
        setField(term17378, term17378.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.parsers.classDiagram.InterfaceParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "copy", argTypes, term17378, args);
    }

};


