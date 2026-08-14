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

public class AbstractPanelBuilder_addHeader_9574284782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum26;
     Object term11523;

    public AbstractPanelBuilder_addHeader_9574284782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11525 = Class.forName((String) "io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        Field term11524 = ((Class) term11525).getDeclaredField((String) "H5");
        ((Field) term11524).setAccessible(true);
        enum26 = ((Field) term11524).get((Object) null);
        term11523 = (Object[]) newArray("javax.swing.JComponent", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.PanelBuilder$HeaderLevel");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("javax.swing.JComponent"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = enum26;
        args[1] = "aJlieCFVtF";
        args[2] = term11523;
        callMethod(klass, "addHeader", argTypes, null, args);
    }

};


