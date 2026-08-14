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

public class VertexHeap_siftDown_26298816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term706;

    public VertexHeap_siftDown_26298816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term694 = (int[]) newIntArray(7);
        int[] term702 = (int[]) newIntArray(2);
        setField(term693, term693.getClass(), "graph", null);
        setField(term693, term693.getClass(), "comparator", null);
        setIntElement(term694, 0, 282916351);
        setIntElement(term694, 1, 880977281);
        setIntElement(term694, 2, 371943306);
        setIntElement(term694, 3, 982388293);
        setIntElement(term694, 4, -159494544);
        setIntElement(term694, 5, -75206835);
        setIntElement(term694, 6, -1618206977);
        setField(term693, term693.getClass(), "keys", term694);
        setIntElement(term702, 0, -1747406163);
        setIntElement(term702, 1, 388157121);
        setField(term693, term693.getClass(), "positions", term702);
        setIntField(term693, term693.getClass(), "size", 1684998508);
        term706 = new Integer(-1476644457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term706;
        callMethod(klass, "siftDown", argTypes, term693, args);
    }

};


