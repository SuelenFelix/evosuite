package io.codeworth.panelmatic.impl;

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
import static io.codeworth.panelmatic.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DefaultComponentFactory_setComponentOrientation_13397081207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term640;
     Object term643;

    public DefaultComponentFactory_setComponentOrientation_13397081207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term640 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term641 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setIntField(term641, term641.getClass(), "orientation", 6);
        setField(term640, term640.getClass(), "componentOrientation", term641);
        term643 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setIntField(term643, term643.getClass(), "orientation", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.ComponentOrientation");
        Object[] args = new Object[1];
        args[0] = term643;
        callMethod(klass, "setComponentOrientation", argTypes, term640, args);
    }

};


