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

public class ComponentBehavior_getInsets_2661985411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5949;

    public ComponentBehavior_getInsets_2661985411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5979 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term5978 = ((Class) term5979).getDeclaredField((String) "CENTER");
        ((Field) term5978).setAccessible(true);
        Object enum20 = ((Field) term5978).get((Object) null);
        Class<? extends Object> term6259 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term6258 = ((Class) term6259).getDeclaredField((String) "MIDDLE");
        ((Field) term6258).setAccessible(true);
        Object enum21 = ((Field) term6258).get((Object) null);
        term5949 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term5973 = newInstance(Class.forName("java.awt.Insets"));
        setField(term5949, term5949.getClass(), "lineAlign", enum20);
        setField(term5949, term5949.getClass(), "pageAlign", enum21);
        setBooleanField(term5949, term5949.getClass(), "pageStretch", true);
        setBooleanField(term5949, term5949.getClass(), "lineStretch", true);
        setDoubleField(term5949, term5949.getClass(), "pageGrowFactor", 0.5183269973490326);
        setIntField(term5973, term5973.getClass(), "top", 0);
        setIntField(term5973, term5973.getClass(), "left", 0);
        setIntField(term5973, term5973.getClass(), "bottom", 0);
        setIntField(term5973, term5973.getClass(), "right", 0);
        setField(term5949, term5949.getClass(), "insets", term5973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInsets", argTypes, term5949, args);
    }

};


