package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CompleteBipartiteGenerator_createGraph_7969122842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688;

    public CompleteBipartiteGenerator_createGraph_7969122842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688 = newInstance(Class.forName("org.graph4j.generators.CompleteBipartiteGenerator"));
        int[] term693 = (int[]) newIntArray(6);
        setIntField(term688, term688.getClass(), "first1", -165587447);
        setIntField(term688, term688.getClass(), "last1", -1347358701);
        setIntField(term688, term688.getClass(), "first2", 806595993);
        setIntField(term688, term688.getClass(), "last2", 548228925);
        setIntElement(term693, 0, -749861210);
        setIntElement(term693, 1, 1694224101);
        setIntElement(term693, 2, 937859191);
        setIntElement(term693, 3, -916584829);
        setIntElement(term693, 4, -2131181468);
        setIntElement(term693, 5, 282916351);
        setField(term688, term688.getClass(), "vertices", term693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.CompleteBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term688, args);
    }

};


