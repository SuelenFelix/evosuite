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

public class ComponentBehavior_getPageAlign_2556687305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2411;

    public ComponentBehavior_getPageAlign_2556687305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2441 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term2440 = ((Class) term2441).getDeclaredField((String) "CENTER");
        ((Field) term2440).setAccessible(true);
        Object enum8 = ((Field) term2440).get((Object) null);
        Class<? extends Object> term2721 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term2720 = ((Class) term2721).getDeclaredField((String) "MIDDLE");
        ((Field) term2720).setAccessible(true);
        Object enum9 = ((Field) term2720).get((Object) null);
        term2411 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term2435 = newInstance(Class.forName("java.awt.Insets"));
        setField(term2411, term2411.getClass(), "lineAlign", enum8);
        setField(term2411, term2411.getClass(), "pageAlign", enum9);
        setBooleanField(term2411, term2411.getClass(), "pageStretch", true);
        setBooleanField(term2411, term2411.getClass(), "lineStretch", false);
        setDoubleField(term2411, term2411.getClass(), "pageGrowFactor", 0.28570734989730284);
        setIntField(term2435, term2435.getClass(), "top", 0);
        setIntField(term2435, term2435.getClass(), "left", 0);
        setIntField(term2435, term2435.getClass(), "bottom", 0);
        setIntField(term2435, term2435.getClass(), "right", 0);
        setField(term2411, term2411.getClass(), "insets", term2435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPageAlign", argTypes, term2411, args);
    }

};


