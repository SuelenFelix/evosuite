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

public class ComponentBehavior_hashCode_139280040314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7722;

    public ComponentBehavior_hashCode_139280040314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7752 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term7751 = ((Class) term7752).getDeclaredField((String) "CENTER");
        ((Field) term7751).setAccessible(true);
        Object enum26 = ((Field) term7751).get((Object) null);
        Class<? extends Object> term8032 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term8031 = ((Class) term8032).getDeclaredField((String) "MIDDLE");
        ((Field) term8031).setAccessible(true);
        Object enum27 = ((Field) term8031).get((Object) null);
        term7722 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term7746 = newInstance(Class.forName("java.awt.Insets"));
        setField(term7722, term7722.getClass(), "lineAlign", enum26);
        setField(term7722, term7722.getClass(), "pageAlign", enum27);
        setBooleanField(term7722, term7722.getClass(), "pageStretch", true);
        setBooleanField(term7722, term7722.getClass(), "lineStretch", true);
        setDoubleField(term7722, term7722.getClass(), "pageGrowFactor", 0.7031006357544823);
        setIntField(term7746, term7746.getClass(), "top", 0);
        setIntField(term7746, term7746.getClass(), "left", 0);
        setIntField(term7746, term7746.getClass(), "bottom", 0);
        setIntField(term7746, term7746.getClass(), "right", 0);
        setField(term7722, term7722.getClass(), "insets", term7746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7722, args);
    }

};


