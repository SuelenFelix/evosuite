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

public class AbstractPanelBuilder_setHeaderBehavior_121971839721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12782;

    public AbstractPanelBuilder_setHeaderBehavior_121971839721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12812 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term12811 = ((Class) term12812).getDeclaredField((String) "CENTER");
        ((Field) term12811).setAccessible(true);
        Object enum30 = ((Field) term12811).get((Object) null);
        Class<? extends Object> term13092 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term13091 = ((Class) term13092).getDeclaredField((String) "MIDDLE");
        ((Field) term13091).setAccessible(true);
        Object enum31 = ((Field) term13091).get((Object) null);
        term12782 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term12806 = newInstance(Class.forName("java.awt.Insets"));
        setField(term12782, term12782.getClass(), "lineAlign", enum30);
        setField(term12782, term12782.getClass(), "pageAlign", enum31);
        setBooleanField(term12782, term12782.getClass(), "pageStretch", true);
        setBooleanField(term12782, term12782.getClass(), "lineStretch", true);
        setDoubleField(term12782, term12782.getClass(), "pageGrowFactor", 0.8598297828918529);
        setIntField(term12806, term12806.getClass(), "top", 0);
        setIntField(term12806, term12806.getClass(), "left", 0);
        setIntField(term12806, term12806.getClass(), "bottom", 0);
        setIntField(term12806, term12806.getClass(), "right", 0);
        setField(term12782, term12782.getClass(), "insets", term12806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term12782;
        callMethod(klass, "setHeaderBehavior", argTypes, null, args);
    }

};


