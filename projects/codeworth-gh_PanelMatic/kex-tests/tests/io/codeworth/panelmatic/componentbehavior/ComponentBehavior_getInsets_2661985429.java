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

public class ComponentBehavior_getInsets_2661985429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10125;

    public ComponentBehavior_getInsets_2661985429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10125 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        setField(term10125, term10125.getClass(), "lineAlign", null);
        setField(term10125, term10125.getClass(), "pageAlign", null);
        setBooleanField(term10125, term10125.getClass(), "pageStretch", false);
        setBooleanField(term10125, term10125.getClass(), "lineStretch", false);
        setDoubleField(term10125, term10125.getClass(), "pageGrowFactor", 0.0);
        setField(term10125, term10125.getClass(), "insets", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInsets", argTypes, term10125, args);
    }

};


