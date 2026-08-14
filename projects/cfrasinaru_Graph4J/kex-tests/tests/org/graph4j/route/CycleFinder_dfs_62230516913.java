package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CycleFinder_dfs_62230516913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4270;

    public CycleFinder_dfs_62230516913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4284 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term4283 = ((Class) term4284).getDeclaredField((String) "BFS");
        ((Field) term4283).setAccessible(true);
        Object enum16 = ((Field) term4283).get((Object) null);
        term4270 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term4270, term4270.getClass(), "target", 315179039);
        setIntField(term4270, term4270.getClass(), "parity", -1835923897);
        setBooleanField(term4270, term4270.getClass(), "shortest", false);
        setBooleanField(term4270, term4270.getClass(), "longer", true);
        setField(term4270, term4270.getClass(), "strategy", enum16);
        setField(term4270, term4270.getClass(), "graph", null);
        setBooleanField(term4270, term4270.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dfs", argTypes, term4270, args);
    }

};


