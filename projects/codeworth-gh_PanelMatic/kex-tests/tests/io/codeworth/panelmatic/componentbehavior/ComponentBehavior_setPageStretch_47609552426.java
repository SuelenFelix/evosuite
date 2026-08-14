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
import java.lang.Boolean;

public class ComponentBehavior_setPageStretch_47609552426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10109;
     Object term10113;

    public ComponentBehavior_setPageStretch_47609552426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10109 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        setField(term10109, term10109.getClass(), "lineAlign", null);
        setField(term10109, term10109.getClass(), "pageAlign", null);
        setBooleanField(term10109, term10109.getClass(), "pageStretch", false);
        setBooleanField(term10109, term10109.getClass(), "lineStretch", false);
        setDoubleField(term10109, term10109.getClass(), "pageGrowFactor", 0.0);
        setField(term10109, term10109.getClass(), "insets", null);
        term10113 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10113;
        callMethod(klass, "setPageStretch", argTypes, term10109, args);
    }

};


