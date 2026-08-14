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
import java.lang.Boolean;

public class ComponentBehavior_setPageStretch_4760955248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4178;
     Object term4207;

    public ComponentBehavior_setPageStretch_4760955248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4210 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term4209 = ((Class) term4210).getDeclaredField((String) "CENTER");
        ((Field) term4209).setAccessible(true);
        Object enum14 = ((Field) term4209).get((Object) null);
        Class<? extends Object> term4490 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term4489 = ((Class) term4490).getDeclaredField((String) "MIDDLE");
        ((Field) term4489).setAccessible(true);
        Object enum15 = ((Field) term4489).get((Object) null);
        term4178 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4202 = newInstance(Class.forName("java.awt.Insets"));
        setField(term4178, term4178.getClass(), "lineAlign", enum14);
        setField(term4178, term4178.getClass(), "pageAlign", enum15);
        setBooleanField(term4178, term4178.getClass(), "pageStretch", false);
        setBooleanField(term4178, term4178.getClass(), "lineStretch", true);
        setDoubleField(term4178, term4178.getClass(), "pageGrowFactor", 0.36923381893433327);
        setIntField(term4202, term4202.getClass(), "top", 0);
        setIntField(term4202, term4202.getClass(), "left", 0);
        setIntField(term4202, term4202.getClass(), "bottom", 0);
        setIntField(term4202, term4202.getClass(), "right", 0);
        setField(term4178, term4178.getClass(), "insets", term4202);
        term4207 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4207;
        callMethod(klass, "setPageStretch", argTypes, term4178, args);
    }

};


