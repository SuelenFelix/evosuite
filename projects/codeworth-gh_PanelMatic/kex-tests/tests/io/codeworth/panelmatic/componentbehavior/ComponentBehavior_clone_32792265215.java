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

public class ComponentBehavior_clone_32792265215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8311;

    public ComponentBehavior_clone_32792265215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8341 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term8340 = ((Class) term8341).getDeclaredField((String) "CENTER");
        ((Field) term8340).setAccessible(true);
        Object enum28 = ((Field) term8340).get((Object) null);
        Class<? extends Object> term8621 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term8620 = ((Class) term8621).getDeclaredField((String) "MIDDLE");
        ((Field) term8620).setAccessible(true);
        Object enum29 = ((Field) term8620).get((Object) null);
        term8311 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term8335 = newInstance(Class.forName("java.awt.Insets"));
        setField(term8311, term8311.getClass(), "lineAlign", enum28);
        setField(term8311, term8311.getClass(), "pageAlign", enum29);
        setBooleanField(term8311, term8311.getClass(), "pageStretch", true);
        setBooleanField(term8311, term8311.getClass(), "lineStretch", true);
        setDoubleField(term8311, term8311.getClass(), "pageGrowFactor", 0.9527281779865117);
        setIntField(term8335, term8335.getClass(), "top", 0);
        setIntField(term8335, term8335.getClass(), "left", 0);
        setIntField(term8335, term8335.getClass(), "bottom", 0);
        setIntField(term8335, term8335.getClass(), "right", 0);
        setField(term8311, term8311.getClass(), "insets", term8335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term8311, args);
    }

};


