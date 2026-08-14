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

public class ComponentBehavior_setLineStretch_20364206314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1820;
     Object term1849;

    public ComponentBehavior_setLineStretch_20364206314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1852 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term1851 = ((Class) term1852).getDeclaredField((String) "CENTER");
        ((Field) term1851).setAccessible(true);
        Object enum6 = ((Field) term1851).get((Object) null);
        Class<? extends Object> term2132 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term2131 = ((Class) term2132).getDeclaredField((String) "MIDDLE");
        ((Field) term2131).setAccessible(true);
        Object enum7 = ((Field) term2131).get((Object) null);
        term1820 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1844 = newInstance(Class.forName("java.awt.Insets"));
        setField(term1820, term1820.getClass(), "lineAlign", enum6);
        setField(term1820, term1820.getClass(), "pageAlign", enum7);
        setBooleanField(term1820, term1820.getClass(), "pageStretch", true);
        setBooleanField(term1820, term1820.getClass(), "lineStretch", true);
        setDoubleField(term1820, term1820.getClass(), "pageGrowFactor", 0.544608645520025);
        setIntField(term1844, term1844.getClass(), "top", 0);
        setIntField(term1844, term1844.getClass(), "left", 0);
        setIntField(term1844, term1844.getClass(), "bottom", 0);
        setIntField(term1844, term1844.getClass(), "right", 0);
        setField(term1820, term1820.getClass(), "insets", term1844);
        term1849 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1849;
        callMethod(klass, "setLineStretch", argTypes, term1820, args);
    }

};


