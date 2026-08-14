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
import java.lang.Boolean;

public class BehaviorBuilder_lineStretch_16397662263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12772;
     Object term12802;

    public BehaviorBuilder_lineStretch_16397662263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12805 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term12804 = ((Class) term12805).getDeclaredField((String) "CENTER");
        ((Field) term12804).setAccessible(true);
        Object enum43 = ((Field) term12804).get((Object) null);
        Class<? extends Object> term13085 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term13084 = ((Class) term13085).getDeclaredField((String) "MIDDLE");
        ((Field) term13084).setAccessible(true);
        Object enum44 = ((Field) term13084).get((Object) null);
        term12772 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term12773 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term12797 = newInstance(Class.forName("java.awt.Insets"));
        setField(term12773, term12773.getClass(), "lineAlign", enum43);
        setField(term12773, term12773.getClass(), "pageAlign", enum44);
        setBooleanField(term12773, term12773.getClass(), "pageStretch", false);
        setBooleanField(term12773, term12773.getClass(), "lineStretch", false);
        setDoubleField(term12773, term12773.getClass(), "pageGrowFactor", 0.0);
        setIntField(term12797, term12797.getClass(), "top", 0);
        setIntField(term12797, term12797.getClass(), "left", 0);
        setIntField(term12797, term12797.getClass(), "bottom", 0);
        setIntField(term12797, term12797.getClass(), "right", 0);
        setField(term12773, term12773.getClass(), "insets", term12797);
        setField(term12772, term12772.getClass(), "product", term12773);
        term12802 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12802;
        callMethod(klass, "lineStretch", argTypes, term12772, args);
    }

};


