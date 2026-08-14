package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class GraphImpl_NeighborIteratorImpl_setEdgeData_3016556479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147459;
     Object term147464;
     Object term147466;

    public GraphImpl_NeighborIteratorImpl_setEdgeData_3016556479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147459 = newInstance(Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl"));
        setIntField(term147459, term147459.getClass(), "v", -895036223);
        setIntField(term147459, term147459.getClass(), "vi", 1934284462);
        setIntField(term147459, term147459.getClass(), "pos", 2070598543);
        setBooleanField(term147459, term147459.getClass(), "forward", true);
        setField(term147459, term147459.getClass(), "this$0", null);
        term147464 = new Integer(-1319781793);
        term147466 = new Double(0.7124102205414247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.GraphImpl$NeighborIteratorImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term147464;
        args[1] = term147466;
        callMethod(klass, "setEdgeData", argTypes, term147459, args);
    }

};


