package org.graph4j.eulerian;

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
import static org.graph4j.eulerian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HierholzerEulerianTrail_hasEulerianTrail_250174075 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public HierholzerEulerianTrail_hasEulerianTrail_250174075() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.graph4j.eulerian.HierholzerEulerianTrail"));
        setIntField(term13, term13.getClass(), "first", 0);
        setIntField(term13, term13.getClass(), "last", 0);
        setField(term13, term13.getClass(), "graph", null);
        setBooleanField(term13, term13.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.eulerian.HierholzerEulerianTrail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasEulerianTrail", argTypes, term13, args);
    }

};


