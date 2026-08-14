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

public class BehaviorBuilder_start_17550983371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11314;

    public BehaviorBuilder_start_17550983371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11345 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term11344 = ((Class) term11345).getDeclaredField((String) "CENTER");
        ((Field) term11344).setAccessible(true);
        Object enum38 = ((Field) term11344).get((Object) null);
        Class<? extends Object> term11625 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term11624 = ((Class) term11625).getDeclaredField((String) "MIDDLE");
        ((Field) term11624).setAccessible(true);
        Object enum39 = ((Field) term11624).get((Object) null);
        term11314 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term11315 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term11339 = newInstance(Class.forName("java.awt.Insets"));
        setField(term11315, term11315.getClass(), "lineAlign", enum38);
        setField(term11315, term11315.getClass(), "pageAlign", enum39);
        setBooleanField(term11315, term11315.getClass(), "pageStretch", false);
        setBooleanField(term11315, term11315.getClass(), "lineStretch", false);
        setDoubleField(term11315, term11315.getClass(), "pageGrowFactor", 0.0);
        setIntField(term11339, term11339.getClass(), "top", 0);
        setIntField(term11339, term11339.getClass(), "left", 0);
        setIntField(term11339, term11339.getClass(), "bottom", 0);
        setIntField(term11339, term11339.getClass(), "right", 0);
        setField(term11315, term11315.getClass(), "insets", term11339);
        setField(term11314, term11314.getClass(), "product", term11315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term11314, args);
    }

};


