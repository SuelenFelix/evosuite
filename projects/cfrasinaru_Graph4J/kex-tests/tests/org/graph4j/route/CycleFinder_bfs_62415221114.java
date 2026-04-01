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

public class CycleFinder_bfs_62415221114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4494;

    public CycleFinder_bfs_62415221114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4508 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term4507 = ((Class) term4508).getDeclaredField((String) "BFS");
        ((Field) term4507).setAccessible(true);
        Object enum17 = ((Field) term4507).get((Object) null);
        term4494 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term4494, term4494.getClass(), "target", -341287775);
        setIntField(term4494, term4494.getClass(), "parity", -1651110911);
        setBooleanField(term4494, term4494.getClass(), "shortest", false);
        setBooleanField(term4494, term4494.getClass(), "longer", false);
        setField(term4494, term4494.getClass(), "strategy", enum17);
        setField(term4494, term4494.getClass(), "graph", null);
        setBooleanField(term4494, term4494.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bfs", argTypes, term4494, args);
    }

};


