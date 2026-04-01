package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class VertexHeap_remove_210947679810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60096;
     Object term60115;

    public VertexHeap_remove_210947679810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60096 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60097 = (int[]) newIntArray(9);
        int[] term60107 = (int[]) newIntArray(6);
        setField(term60096, term60096.getClass(), "graph", null);
        setField(term60096, term60096.getClass(), "comparator", null);
        setIntElement(term60097, 0, -137499193);
        setIntElement(term60097, 1, 1206373587);
        setIntElement(term60097, 2, 613409117);
        setIntElement(term60097, 3, 449106222);
        setIntElement(term60097, 4, -2010754765);
        setIntElement(term60097, 5, -368905928);
        setIntElement(term60097, 6, -324230177);
        setIntElement(term60097, 7, 1907785292);
        setIntElement(term60097, 8, 719178137);
        setField(term60096, term60096.getClass(), "keys", term60097);
        setIntElement(term60107, 0, 1019714790);
        setIntElement(term60107, 1, -939662649);
        setIntElement(term60107, 2, 104511876);
        setIntElement(term60107, 3, 1301097770);
        setIntElement(term60107, 4, -844791112);
        setIntElement(term60107, 5, -1096097856);
        setField(term60096, term60096.getClass(), "positions", term60107);
        setIntField(term60096, term60096.getClass(), "size", 402256223);
        term60115 = new Integer(1448377823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60115;
        callMethod(klass, "remove", argTypes, term60096, args);
    }

};


