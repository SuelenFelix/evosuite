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
import java.lang.Double;

public class ComponentBehavior_setPageGrowFactor_206203773828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10119;
     Object term10123;

    public ComponentBehavior_setPageGrowFactor_206203773828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10119 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        setField(term10119, term10119.getClass(), "lineAlign", null);
        setField(term10119, term10119.getClass(), "pageAlign", null);
        setBooleanField(term10119, term10119.getClass(), "pageStretch", false);
        setBooleanField(term10119, term10119.getClass(), "lineStretch", false);
        setDoubleField(term10119, term10119.getClass(), "pageGrowFactor", 0.0);
        setField(term10119, term10119.getClass(), "insets", null);
        term10123 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term10123;
        callMethod(klass, "setPageGrowFactor", argTypes, term10119, args);
    }

};


