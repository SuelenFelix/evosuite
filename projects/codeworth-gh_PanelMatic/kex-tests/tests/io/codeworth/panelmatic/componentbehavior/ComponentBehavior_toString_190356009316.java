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

public class ComponentBehavior_toString_190356009316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8900;

    public ComponentBehavior_toString_190356009316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8930 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term8929 = ((Class) term8930).getDeclaredField((String) "CENTER");
        ((Field) term8929).setAccessible(true);
        Object enum30 = ((Field) term8929).get((Object) null);
        Class<? extends Object> term9210 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term9209 = ((Class) term9210).getDeclaredField((String) "MIDDLE");
        ((Field) term9209).setAccessible(true);
        Object enum31 = ((Field) term9209).get((Object) null);
        term8900 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term8924 = newInstance(Class.forName("java.awt.Insets"));
        setField(term8900, term8900.getClass(), "lineAlign", enum30);
        setField(term8900, term8900.getClass(), "pageAlign", enum31);
        setBooleanField(term8900, term8900.getClass(), "pageStretch", true);
        setBooleanField(term8900, term8900.getClass(), "lineStretch", true);
        setDoubleField(term8900, term8900.getClass(), "pageGrowFactor", 0.9828442029246764);
        setIntField(term8924, term8924.getClass(), "top", 0);
        setIntField(term8924, term8924.getClass(), "left", 0);
        setIntField(term8924, term8924.getClass(), "bottom", 0);
        setIntField(term8924, term8924.getClass(), "right", 0);
        setField(term8900, term8900.getClass(), "insets", term8924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8900, args);
    }

};


