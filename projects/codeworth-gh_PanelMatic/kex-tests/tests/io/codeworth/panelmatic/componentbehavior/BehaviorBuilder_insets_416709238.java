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
import java.lang.Integer;

public class BehaviorBuilder_insets_416709238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16015;
     Object term16045;
     Object term16047;
     Object term16049;
     Object term16051;

    public BehaviorBuilder_insets_416709238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16054 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term16053 = ((Class) term16054).getDeclaredField((String) "CENTER");
        ((Field) term16053).setAccessible(true);
        Object enum54 = ((Field) term16053).get((Object) null);
        Class<? extends Object> term16334 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term16333 = ((Class) term16334).getDeclaredField((String) "MIDDLE");
        ((Field) term16333).setAccessible(true);
        Object enum55 = ((Field) term16333).get((Object) null);
        term16015 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term16016 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term16040 = newInstance(Class.forName("java.awt.Insets"));
        setField(term16016, term16016.getClass(), "lineAlign", enum54);
        setField(term16016, term16016.getClass(), "pageAlign", enum55);
        setBooleanField(term16016, term16016.getClass(), "pageStretch", false);
        setBooleanField(term16016, term16016.getClass(), "lineStretch", false);
        setDoubleField(term16016, term16016.getClass(), "pageGrowFactor", 0.0);
        setIntField(term16040, term16040.getClass(), "top", 0);
        setIntField(term16040, term16040.getClass(), "left", 0);
        setIntField(term16040, term16040.getClass(), "bottom", 0);
        setIntField(term16040, term16040.getClass(), "right", 0);
        setField(term16016, term16016.getClass(), "insets", term16040);
        setField(term16015, term16015.getClass(), "product", term16016);
        term16045 = new Integer(1227103734);
        term16047 = new Integer(-1339778481);
        term16049 = new Integer(1725571209);
        term16051 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term16045;
        args[1] = term16047;
        args[2] = term16049;
        args[3] = term16051;
        callMethod(klass, "insets", argTypes, term16015, args);
    }

};


