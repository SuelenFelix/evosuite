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

public class DefaultComponentFactory_getHeader_16543424152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object enum0;
     Object term47;

    public DefaultComponentFactory_getHeader_16543424152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term27 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setIntField(term27, term27.getClass(), "orientation", 6);
        setField(term26, term26.getClass(), "componentOrientation", term27);
        Class<? extends Object> term85 = Class.forName((String) "io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Field term84 = ((Class) term85).getDeclaredField((String) "H2");
        ((Field) term84).setAccessible(true);
        enum0 = ((Field) term84).get((Object) null);
        term47 = (Object[]) newArray("javax.swing.JComponent", 5);
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
        args[0] = enum0;
        args[1] = null;
        args[2] = "sjlJAEtRrb";
        args[3] = term47;
        callMethod(klass, "getHeader", argTypes, term26, args);
    }

};


