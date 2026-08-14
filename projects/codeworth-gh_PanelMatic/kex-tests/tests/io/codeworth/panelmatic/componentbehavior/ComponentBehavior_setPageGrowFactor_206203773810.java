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
import java.lang.Double;

public class ComponentBehavior_setPageGrowFactor_206203773810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5358;
     Object term5387;

    public ComponentBehavior_setPageGrowFactor_206203773810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5390 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term5389 = ((Class) term5390).getDeclaredField((String) "CENTER");
        ((Field) term5389).setAccessible(true);
        Object enum18 = ((Field) term5389).get((Object) null);
        Class<? extends Object> term5670 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term5669 = ((Class) term5670).getDeclaredField((String) "MIDDLE");
        ((Field) term5669).setAccessible(true);
        Object enum19 = ((Field) term5669).get((Object) null);
        term5358 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term5382 = newInstance(Class.forName("java.awt.Insets"));
        setField(term5358, term5358.getClass(), "lineAlign", enum18);
        setField(term5358, term5358.getClass(), "pageAlign", enum19);
        setBooleanField(term5358, term5358.getClass(), "pageStretch", true);
        setBooleanField(term5358, term5358.getClass(), "lineStretch", true);
        setDoubleField(term5358, term5358.getClass(), "pageGrowFactor", 0.37773193782763337);
        setIntField(term5382, term5382.getClass(), "top", 0);
        setIntField(term5382, term5382.getClass(), "left", 0);
        setIntField(term5382, term5382.getClass(), "bottom", 0);
        setIntField(term5382, term5382.getClass(), "right", 0);
        setField(term5358, term5358.getClass(), "insets", term5382);
        term5387 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5387;
        callMethod(klass, "setPageGrowFactor", argTypes, term5358, args);
    }

};


