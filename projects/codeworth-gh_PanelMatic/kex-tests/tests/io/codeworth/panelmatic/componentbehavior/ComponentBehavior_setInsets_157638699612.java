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

public class ComponentBehavior_setInsets_157638699612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6538;
     Object term6567;

    public ComponentBehavior_setInsets_157638699612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6573 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term6572 = ((Class) term6573).getDeclaredField((String) "CENTER");
        ((Field) term6572).setAccessible(true);
        Object enum22 = ((Field) term6572).get((Object) null);
        Class<? extends Object> term6853 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term6852 = ((Class) term6853).getDeclaredField((String) "MIDDLE");
        ((Field) term6852).setAccessible(true);
        Object enum23 = ((Field) term6852).get((Object) null);
        term6538 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term6562 = newInstance(Class.forName("java.awt.Insets"));
        setField(term6538, term6538.getClass(), "lineAlign", enum22);
        setField(term6538, term6538.getClass(), "pageAlign", enum23);
        setBooleanField(term6538, term6538.getClass(), "pageStretch", true);
        setBooleanField(term6538, term6538.getClass(), "lineStretch", false);
        setDoubleField(term6538, term6538.getClass(), "pageGrowFactor", 0.7655020693602768);
        setIntField(term6562, term6562.getClass(), "top", 0);
        setIntField(term6562, term6562.getClass(), "left", 0);
        setIntField(term6562, term6562.getClass(), "bottom", 0);
        setIntField(term6562, term6562.getClass(), "right", 0);
        setField(term6538, term6538.getClass(), "insets", term6562);
        term6567 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term6567, term6567.getClass(), "top", 568599855);
        setIntField(term6567, term6567.getClass(), "left", 1162663216);
        setIntField(term6567, term6567.getClass(), "bottom", 1484323161);
        setIntField(term6567, term6567.getClass(), "right", 391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Insets");
        Object[] args = new Object[1];
        args[0] = term6567;
        callMethod(klass, "setInsets", argTypes, term6538, args);
    }

};


