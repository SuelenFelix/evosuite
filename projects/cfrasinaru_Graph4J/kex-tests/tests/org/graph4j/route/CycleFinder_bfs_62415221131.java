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

public class CycleFinder_bfs_62415221131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5350;

    public CycleFinder_bfs_62415221131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5350 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term5350, term5350.getClass(), "target", 0);
        setIntField(term5350, term5350.getClass(), "parity", 0);
        setBooleanField(term5350, term5350.getClass(), "shortest", false);
        setBooleanField(term5350, term5350.getClass(), "longer", false);
        setField(term5350, term5350.getClass(), "strategy", null);
        setField(term5350, term5350.getClass(), "graph", null);
        setBooleanField(term5350, term5350.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "bfs", argTypes, term5350, args);
    }

};


