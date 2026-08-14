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

public class DefaultComponentFactory_createHeaderLabel_200188139111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647;

    public DefaultComponentFactory_createHeaderLabel_200188139111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        setField(term647, term647.getClass(), "componentOrientation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("javax.swing.Icon");
        argTypes[2] = Class.forName("io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createHeaderLabel", argTypes, term647, args);
    }

};


