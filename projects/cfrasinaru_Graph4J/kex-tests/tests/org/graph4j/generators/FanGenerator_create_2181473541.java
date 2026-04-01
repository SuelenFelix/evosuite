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

public class FanGenerator_create_2181473541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2183;

    public FanGenerator_create_2181473541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2183 = newInstance(Class.forName("org.graph4j.generators.FanGenerator"));
        int[] term2186 = (int[]) newIntArray(3);
        setIntField(term2183, term2183.getClass(), "emptyGraphNumVertices", 633765954);
        setIntField(term2183, term2183.getClass(), "pathGraphNumVertices", 269110087);
        setField(term2183, term2183.getClass(), "emptyGraph", null);
        setField(term2183, term2183.getClass(), "pathGraph", null);
        setIntElement(term2186, 0, 1545119095);
        setIntElement(term2186, 1, 1671229683);
        setIntElement(term2186, 2, 34167717);
        setField(term2183, term2183.getClass(), "vertices", term2186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.FanGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "create", argTypes, term2183, args);
    }

};


