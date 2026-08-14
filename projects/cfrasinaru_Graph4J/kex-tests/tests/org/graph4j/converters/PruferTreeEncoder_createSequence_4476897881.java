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

public class PruferTreeEncoder_createSequence_4476897881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public PruferTreeEncoder_createSequence_4476897881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("org.graph4j.converters.PruferTreeEncoder"));
        int[] term49 = (int[]) newIntArray(6);
        int[] term56 = (int[]) newIntArray(2);
        boolean[] term59 = (boolean[]) newBooleanArray(6);
        setIntElement(term49, 0, 1622346318);
        setIntElement(term49, 1, 1048535127);
        setIntElement(term49, 2, -655067527);
        setIntElement(term49, 3, -6029667);
        setIntElement(term49, 4, -2068769794);
        setIntElement(term49, 5, -117576464);
        setField(term48, term48.getClass(), "vertices", term49);
        setIntElement(term56, 0, -1007160944);
        setIntElement(term56, 1, 1135664017);
        setField(term48, term48.getClass(), "degrees", term56);
        setBooleanElement(term59, 4, true);
        setBooleanElement(term59, 5, true);
        setField(term48, term48.getClass(), "visited", term59);
        setBooleanField(term48, term48.getClass(), "orderedVertices", true);
        setField(term48, term48.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeEncoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createSequence", argTypes, term48, args);
    }

};


