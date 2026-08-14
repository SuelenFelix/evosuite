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

public class ComponentBehavior_getPageGrowFactor_4312120749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4769;

    public ComponentBehavior_getPageGrowFactor_4312120749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4799 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term4798 = ((Class) term4799).getDeclaredField((String) "CENTER");
        ((Field) term4798).setAccessible(true);
        Object enum16 = ((Field) term4798).get((Object) null);
        Class<? extends Object> term5079 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term5078 = ((Class) term5079).getDeclaredField((String) "MIDDLE");
        ((Field) term5078).setAccessible(true);
        Object enum17 = ((Field) term5078).get((Object) null);
        term4769 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4793 = newInstance(Class.forName("java.awt.Insets"));
        setField(term4769, term4769.getClass(), "lineAlign", enum16);
        setField(term4769, term4769.getClass(), "pageAlign", enum17);
        setBooleanField(term4769, term4769.getClass(), "pageStretch", false);
        setBooleanField(term4769, term4769.getClass(), "lineStretch", false);
        setDoubleField(term4769, term4769.getClass(), "pageGrowFactor", 0.6076495596892013);
        setIntField(term4793, term4793.getClass(), "top", 0);
        setIntField(term4793, term4793.getClass(), "left", 0);
        setIntField(term4793, term4793.getClass(), "bottom", 0);
        setIntField(term4793, term4793.getClass(), "right", 0);
        setField(term4769, term4769.getClass(), "insets", term4793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageGrowFactor", argTypes, term4769, args);
    }

};


