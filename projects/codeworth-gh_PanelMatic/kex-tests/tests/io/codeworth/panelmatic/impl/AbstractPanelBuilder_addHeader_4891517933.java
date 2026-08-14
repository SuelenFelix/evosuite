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
import java.lang.String;
import java.lang.Object;

public class AbstractPanelBuilder_addHeader_4891517933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum27;
     Object term11805;

    public AbstractPanelBuilder_addHeader_4891517933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11807 = Class.forName((String) "io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Field term11806 = ((Class) term11807).getDeclaredField((String) "H6");
        ((Field) term11806).setAccessible(true);
        enum27 = ((Field) term11806).get((Object) null);
        term11805 = (Object[]) newArray("javax.swing.JComponent", 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        argTypes[1] = Class.forName("javax.swing.Icon");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("javax.swing.JComponent"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = enum27;
        args[1] = null;
        args[2] = "ZiaGIbnzTs";
        args[3] = term11805;
        callMethod(klass, "addHeader", argTypes, null, args);
    }

};


