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

public class DefaultComponentFactory_getHeader_165434241510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public DefaultComponentFactory_getHeader_165434241510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        setField(term646, term646.getClass(), "componentOrientation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        argTypes[1] = Class.forName("javax.swing.Icon");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("javax.swing.JComponent"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getHeader", argTypes, term646, args);
    }

};


