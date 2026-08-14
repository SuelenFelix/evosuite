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

public class VertexIndexArray_indexOf_4643954155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100299;
     Object term100306;

    public VertexIndexArray_indexOf_4643954155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100299 = newInstance(Class.forName("org.graph4j.VertexIndexArray"));
        int[] term100300 = (int[]) newIntArray(5);
        setIntElement(term100300, 0, -276924794);
        setIntElement(term100300, 1, 59212444);
        setIntElement(term100300, 2, -1268575411);
        setIntElement(term100300, 3, 1668826386);
        setIntElement(term100300, 4, 1361977398);
        setField(term100299, term100299.getClass(), "index", term100300);
        term100306 = new Integer(188661554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.VertexIndexArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100306;
        callMethod(klass, "indexOf", argTypes, term100299, args);
    }

};


