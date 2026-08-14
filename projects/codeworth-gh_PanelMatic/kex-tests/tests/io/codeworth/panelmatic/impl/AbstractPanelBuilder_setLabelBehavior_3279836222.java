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

public class AbstractPanelBuilder_setLabelBehavior_3279836222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13371;

    public AbstractPanelBuilder_setLabelBehavior_3279836222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13401 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term13400 = ((Class) term13401).getDeclaredField((String) "CENTER");
        ((Field) term13400).setAccessible(true);
        Object enum32 = ((Field) term13400).get((Object) null);
        Class<? extends Object> term13681 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term13680 = ((Class) term13681).getDeclaredField((String) "MIDDLE");
        ((Field) term13680).setAccessible(true);
        Object enum33 = ((Field) term13680).get((Object) null);
        term13371 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term13395 = newInstance(Class.forName("java.awt.Insets"));
        setField(term13371, term13371.getClass(), "lineAlign", enum32);
        setField(term13371, term13371.getClass(), "pageAlign", enum33);
        setBooleanField(term13371, term13371.getClass(), "pageStretch", false);
        setBooleanField(term13371, term13371.getClass(), "lineStretch", false);
        setDoubleField(term13371, term13371.getClass(), "pageGrowFactor", 0.43692187681405226);
        setIntField(term13395, term13395.getClass(), "top", 0);
        setIntField(term13395, term13395.getClass(), "left", 0);
        setIntField(term13395, term13395.getClass(), "bottom", 0);
        setIntField(term13395, term13395.getClass(), "right", 0);
        setField(term13371, term13371.getClass(), "insets", term13395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term13371;
        callMethod(klass, "setLabelBehavior", argTypes, null, args);
    }

};


