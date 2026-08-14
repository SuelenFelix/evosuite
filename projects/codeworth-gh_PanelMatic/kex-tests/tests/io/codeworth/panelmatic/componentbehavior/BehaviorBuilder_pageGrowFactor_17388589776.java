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
import java.lang.Double;

public class BehaviorBuilder_pageGrowFactor_17388589776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14828;
     Object term14858;

    public BehaviorBuilder_pageGrowFactor_17388589776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14861 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term14860 = ((Class) term14861).getDeclaredField((String) "CENTER");
        ((Field) term14860).setAccessible(true);
        Object enum50 = ((Field) term14860).get((Object) null);
        Class<? extends Object> term15141 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term15140 = ((Class) term15141).getDeclaredField((String) "MIDDLE");
        ((Field) term15140).setAccessible(true);
        Object enum51 = ((Field) term15140).get((Object) null);
        term14828 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term14829 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term14853 = newInstance(Class.forName("java.awt.Insets"));
        setField(term14829, term14829.getClass(), "lineAlign", enum50);
        setField(term14829, term14829.getClass(), "pageAlign", enum51);
        setBooleanField(term14829, term14829.getClass(), "pageStretch", false);
        setBooleanField(term14829, term14829.getClass(), "lineStretch", false);
        setDoubleField(term14829, term14829.getClass(), "pageGrowFactor", 0.0);
        setIntField(term14853, term14853.getClass(), "top", 0);
        setIntField(term14853, term14853.getClass(), "left", 0);
        setIntField(term14853, term14853.getClass(), "bottom", 0);
        setIntField(term14853, term14853.getClass(), "right", 0);
        setField(term14829, term14829.getClass(), "insets", term14853);
        setField(term14828, term14828.getClass(), "product", term14829);
        term14858 = new Double(0.6436713023569729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term14858;
        callMethod(klass, "pageGrowFactor", argTypes, term14828, args);
    }

};


