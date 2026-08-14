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

public class ComponentBehavior_isPageStretch_3429649587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589;

    public ComponentBehavior_isPageStretch_3429649587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3619 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term3618 = ((Class) term3619).getDeclaredField((String) "CENTER");
        ((Field) term3618).setAccessible(true);
        Object enum12 = ((Field) term3618).get((Object) null);
        Class<? extends Object> term3899 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term3898 = ((Class) term3899).getDeclaredField((String) "MIDDLE");
        ((Field) term3898).setAccessible(true);
        Object enum13 = ((Field) term3898).get((Object) null);
        term3589 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term3613 = newInstance(Class.forName("java.awt.Insets"));
        setField(term3589, term3589.getClass(), "lineAlign", enum12);
        setField(term3589, term3589.getClass(), "pageAlign", enum13);
        setBooleanField(term3589, term3589.getClass(), "pageStretch", true);
        setBooleanField(term3589, term3589.getClass(), "lineStretch", false);
        setDoubleField(term3589, term3589.getClass(), "pageGrowFactor", 0.2641345529914265);
        setIntField(term3613, term3613.getClass(), "top", 0);
        setIntField(term3613, term3613.getClass(), "left", 0);
        setIntField(term3613, term3613.getClass(), "bottom", 0);
        setIntField(term3613, term3613.getClass(), "right", 0);
        setField(term3589, term3589.getClass(), "insets", term3613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPageStretch", argTypes, term3589, args);
    }

};


