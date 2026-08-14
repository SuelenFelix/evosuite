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
import java.lang.Object;
import java.lang.String;

public class BehaviorBuilder_pageAlign_13942977894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13364;
     Object enum47;

    public BehaviorBuilder_pageAlign_13942977894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13403 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term13402 = ((Class) term13403).getDeclaredField((String) "CENTER");
        ((Field) term13402).setAccessible(true);
        Object enum45 = ((Field) term13402).get((Object) null);
        Class<? extends Object> term13683 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term13682 = ((Class) term13683).getDeclaredField((String) "MIDDLE");
        ((Field) term13682).setAccessible(true);
        Object enum46 = ((Field) term13682).get((Object) null);
        term13364 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term13365 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term13389 = newInstance(Class.forName("java.awt.Insets"));
        setField(term13365, term13365.getClass(), "lineAlign", enum45);
        setField(term13365, term13365.getClass(), "pageAlign", enum46);
        setBooleanField(term13365, term13365.getClass(), "pageStretch", false);
        setBooleanField(term13365, term13365.getClass(), "lineStretch", false);
        setDoubleField(term13365, term13365.getClass(), "pageGrowFactor", 0.0);
        setIntField(term13389, term13389.getClass(), "top", 0);
        setIntField(term13389, term13389.getClass(), "left", 0);
        setIntField(term13389, term13389.getClass(), "bottom", 0);
        setIntField(term13389, term13389.getClass(), "right", 0);
        setField(term13365, term13365.getClass(), "insets", term13389);
        setField(term13364, term13364.getClass(), "product", term13365);
        Class<? extends Object> term13963 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term13962 = ((Class) term13963).getDeclaredField((String) "FEET");
        ((Field) term13962).setAccessible(true);
        enum47 = ((Field) term13962).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.PageAlign");
        Object[] args = new Object[1];
        args[0] = enum47;
        callMethod(klass, "pageAlign", argTypes, term13364, args);
    }

};


