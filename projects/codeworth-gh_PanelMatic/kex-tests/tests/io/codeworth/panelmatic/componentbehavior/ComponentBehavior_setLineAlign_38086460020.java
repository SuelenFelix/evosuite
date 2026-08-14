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

public class ComponentBehavior_setLineAlign_38086460020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10083;

    public ComponentBehavior_setLineAlign_38086460020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10083 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        setField(term10083, term10083.getClass(), "lineAlign", null);
        setField(term10083, term10083.getClass(), "pageAlign", null);
        setBooleanField(term10083, term10083.getClass(), "pageStretch", false);
        setBooleanField(term10083, term10083.getClass(), "lineStretch", false);
        setDoubleField(term10083, term10083.getClass(), "pageGrowFactor", 0.0);
        setField(term10083, term10083.getClass(), "insets", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.LineAlign");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLineAlign", argTypes, term10083, args);
    }

};


