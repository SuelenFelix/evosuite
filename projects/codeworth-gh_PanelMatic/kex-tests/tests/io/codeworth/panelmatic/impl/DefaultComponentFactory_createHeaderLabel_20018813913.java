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
import java.lang.String;

public class DefaultComponentFactory_createHeaderLabel_20018813913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object enum1;

    public DefaultComponentFactory_createHeaderLabel_20018813913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term348 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setIntField(term348, term348.getClass(), "orientation", 6);
        setField(term347, term347.getClass(), "componentOrientation", term348);
        Class<? extends Object> term379 = Class.forName((String) "io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Field term378 = ((Class) term379).getDeclaredField((String) "H3");
        ((Field) term378).setAccessible(true);
        enum1 = ((Field) term378).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("javax.swing.Icon");
        argTypes[2] = Class.forName("io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Object[] args = new Object[3];
        args[0] = "MuLcgQHgqz";
        args[1] = null;
        args[2] = enum1;
        callMethod(klass, "createHeaderLabel", argTypes, term347, args);
    }

};


