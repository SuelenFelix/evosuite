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

public class ComponentBehavior_isLineStretch_14394861833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;

    public ComponentBehavior_isLineStretch_14394861833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1261 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term1260 = ((Class) term1261).getDeclaredField((String) "CENTER");
        ((Field) term1260).setAccessible(true);
        Object enum4 = ((Field) term1260).get((Object) null);
        Class<? extends Object> term1541 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term1540 = ((Class) term1541).getDeclaredField((String) "MIDDLE");
        ((Field) term1540).setAccessible(true);
        Object enum5 = ((Field) term1540).get((Object) null);
        term1231 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1255 = newInstance(Class.forName("java.awt.Insets"));
        setField(term1231, term1231.getClass(), "lineAlign", enum4);
        setField(term1231, term1231.getClass(), "pageAlign", enum5);
        setBooleanField(term1231, term1231.getClass(), "pageStretch", true);
        setBooleanField(term1231, term1231.getClass(), "lineStretch", true);
        setDoubleField(term1231, term1231.getClass(), "pageGrowFactor", 0.5523635872663106);
        setIntField(term1255, term1255.getClass(), "top", 0);
        setIntField(term1255, term1255.getClass(), "left", 0);
        setIntField(term1255, term1255.getClass(), "bottom", 0);
        setIntField(term1255, term1255.getClass(), "right", 0);
        setField(term1231, term1231.getClass(), "insets", term1255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLineStretch", argTypes, term1231, args);
    }

};


