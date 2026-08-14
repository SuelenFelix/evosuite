package io.codeworth.panelmatic.componentbehavior;

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
import static io.codeworth.panelmatic.componentbehavior.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ComponentBehavior_setLineAlign_3808646002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;
     Object enum2;

    public ComponentBehavior_setLineAlign_3808646002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term672 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term671 = ((Class) term672).getDeclaredField((String) "CENTER");
        ((Field) term671).setAccessible(true);
        enum2 = ((Field) term671).get((Object) null);
        Class<? extends Object> term952 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term951 = ((Class) term952).getDeclaredField((String) "MIDDLE");
        ((Field) term951).setAccessible(true);
        Object enum3 = ((Field) term951).get((Object) null);
        term642 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term666 = newInstance(Class.forName("java.awt.Insets"));
        setField(term642, term642.getClass(), "lineAlign", enum2);
        setField(term642, term642.getClass(), "pageAlign", enum3);
        setBooleanField(term642, term642.getClass(), "pageStretch", false);
        setBooleanField(term642, term642.getClass(), "lineStretch", false);
        setDoubleField(term642, term642.getClass(), "pageGrowFactor", 0.3455959125047594);
        setIntField(term666, term666.getClass(), "top", 0);
        setIntField(term666, term666.getClass(), "left", 0);
        setIntField(term666, term666.getClass(), "bottom", 0);
        setIntField(term666, term666.getClass(), "right", 0);
        setField(term642, term642.getClass(), "insets", term666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.LineAlign");
        Object[] args = new Object[1];
        args[0] = enum2;
        callMethod(klass, "setLineAlign", argTypes, term642, args);
    }

};


