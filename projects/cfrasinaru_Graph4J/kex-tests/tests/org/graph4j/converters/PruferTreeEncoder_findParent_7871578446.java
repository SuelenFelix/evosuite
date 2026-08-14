package org.graph4j.converters;

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
import static org.graph4j.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PruferTreeEncoder_findParent_7871578446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149;
     Object term151;

    public PruferTreeEncoder_findParent_7871578446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149 = newInstance(Class.forName("org.graph4j.converters.PruferTreeEncoder"));
        setField(term149, term149.getClass(), "vertices", null);
        setField(term149, term149.getClass(), "degrees", null);
        setField(term149, term149.getClass(), "visited", null);
        setBooleanField(term149, term149.getClass(), "orderedVertices", false);
        setField(term149, term149.getClass(), "graph", null);
        term151 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeEncoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term151;
        callMethod(klass, "findParent", argTypes, term149, args);
    }

};


