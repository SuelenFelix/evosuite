package io.codeworth.panelmatic.impl.gridbagpanelbuilder;

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
import static io.codeworth.panelmatic.impl.gridbagpanelbuilder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GbPanelBuilderFactory_setComponentOrientation_19856929243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8067;
     Object term8070;

    public GbPanelBuilderFactory_setComponentOrientation_19856929243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8067 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilderFactory"));
        Object term8068 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setField(term8067, term8067.getClass(), "l10n", null);
        setIntField(term8068, term8068.getClass(), "orientation", 7);
        setField(term8067, term8067.getClass(), "orientation", term8068);
        term8070 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setIntField(term8070, term8070.getClass(), "orientation", 1386130016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilderFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.ComponentOrientation");
        Object[] args = new Object[1];
        args[0] = term8070;
        callMethod(klass, "setComponentOrientation", argTypes, term8067, args);
    }

};


