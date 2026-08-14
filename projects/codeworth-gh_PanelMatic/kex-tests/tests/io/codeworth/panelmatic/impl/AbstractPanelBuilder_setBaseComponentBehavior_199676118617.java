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

public class AbstractPanelBuilder_setBaseComponentBehavior_199676118617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12185;

    public AbstractPanelBuilder_setBaseComponentBehavior_199676118617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12215 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term12214 = ((Class) term12215).getDeclaredField((String) "CENTER");
        ((Field) term12214).setAccessible(true);
        Object enum28 = ((Field) term12214).get((Object) null);
        Class<? extends Object> term12495 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term12494 = ((Class) term12495).getDeclaredField((String) "MIDDLE");
        ((Field) term12494).setAccessible(true);
        Object enum29 = ((Field) term12494).get((Object) null);
        term12185 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term12209 = newInstance(Class.forName("java.awt.Insets"));
        setField(term12185, term12185.getClass(), "lineAlign", enum28);
        setField(term12185, term12185.getClass(), "pageAlign", enum29);
        setBooleanField(term12185, term12185.getClass(), "pageStretch", true);
        setBooleanField(term12185, term12185.getClass(), "lineStretch", true);
        setDoubleField(term12185, term12185.getClass(), "pageGrowFactor", 0.4569171842750229);
        setIntField(term12209, term12209.getClass(), "top", 0);
        setIntField(term12209, term12209.getClass(), "left", 0);
        setIntField(term12209, term12209.getClass(), "bottom", 0);
        setIntField(term12209, term12209.getClass(), "right", 0);
        setField(term12185, term12185.getClass(), "insets", term12209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.AbstractPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term12185;
        callMethod(klass, "setBaseComponentBehavior", argTypes, null, args);
    }

};


