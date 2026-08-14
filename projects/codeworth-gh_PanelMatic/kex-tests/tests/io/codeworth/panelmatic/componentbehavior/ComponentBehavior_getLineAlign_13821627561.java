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

public class ComponentBehavior_getLineAlign_13821627561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ComponentBehavior_getLineAlign_13821627561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term56 = ((Class) term57).getDeclaredField((String) "CENTER");
        ((Field) term56).setAccessible(true);
        Object enum0 = ((Field) term56).get((Object) null);
        Class<? extends Object> term363 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term362 = ((Class) term363).getDeclaredField((String) "MIDDLE");
        ((Field) term362).setAccessible(true);
        Object enum1 = ((Field) term362).get((Object) null);
        term1 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term25 = newInstance(Class.forName("java.awt.Insets"));
        setField(term1, term1.getClass(), "lineAlign", enum0);
        setField(term1, term1.getClass(), "pageAlign", enum1);
        setBooleanField(term1, term1.getClass(), "pageStretch", false);
        setBooleanField(term1, term1.getClass(), "lineStretch", false);
        setDoubleField(term1, term1.getClass(), "pageGrowFactor", 0.13238746331190498);
        setIntField(term25, term25.getClass(), "top", 0);
        setIntField(term25, term25.getClass(), "left", 0);
        setIntField(term25, term25.getClass(), "bottom", 0);
        setIntField(term25, term25.getClass(), "right", 0);
        setField(term1, term1.getClass(), "insets", term25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLineAlign", argTypes, term1, args);
    }

};


