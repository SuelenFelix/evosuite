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

public class ComponentBehavior_equals_94411372813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7132;
     Object term7161;

    public ComponentBehavior_equals_94411372813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7163 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term7162 = ((Class) term7163).getDeclaredField((String) "CENTER");
        ((Field) term7162).setAccessible(true);
        Object enum24 = ((Field) term7162).get((Object) null);
        Class<? extends Object> term7443 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term7442 = ((Class) term7443).getDeclaredField((String) "MIDDLE");
        ((Field) term7442).setAccessible(true);
        Object enum25 = ((Field) term7442).get((Object) null);
        term7132 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term7156 = newInstance(Class.forName("java.awt.Insets"));
        setField(term7132, term7132.getClass(), "lineAlign", enum24);
        setField(term7132, term7132.getClass(), "pageAlign", enum25);
        setBooleanField(term7132, term7132.getClass(), "pageStretch", false);
        setBooleanField(term7132, term7132.getClass(), "lineStretch", false);
        setDoubleField(term7132, term7132.getClass(), "pageGrowFactor", 0.1374549299694151);
        setIntField(term7156, term7156.getClass(), "top", 0);
        setIntField(term7156, term7156.getClass(), "left", 0);
        setIntField(term7156, term7156.getClass(), "bottom", 0);
        setIntField(term7156, term7156.getClass(), "right", 0);
        setField(term7132, term7132.getClass(), "insets", term7156);
        term7161 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7161;
        callMethod(klass, "equals", argTypes, term7132, args);
    }

};


