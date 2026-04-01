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

public class VertexHeap_updateAtPos_42180138212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60152;
     Object term60172;

    public VertexHeap_updateAtPos_42180138212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60152 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60153 = (int[]) newIntArray(8);
        int[] term60162 = (int[]) newIntArray(8);
        setField(term60152, term60152.getClass(), "graph", null);
        setField(term60152, term60152.getClass(), "comparator", null);
        setIntElement(term60153, 0, -1851045959);
        setIntElement(term60153, 1, 2000289703);
        setIntElement(term60153, 2, -1629394268);
        setIntElement(term60153, 3, -1898311415);
        setIntElement(term60153, 4, -139938289);
        setIntElement(term60153, 5, 495686607);
        setIntElement(term60153, 6, -1842004522);
        setIntElement(term60153, 7, -2081738821);
        setField(term60152, term60152.getClass(), "keys", term60153);
        setIntElement(term60162, 0, -791069487);
        setIntElement(term60162, 1, 2040131935);
        setIntElement(term60162, 2, -1183833390);
        setIntElement(term60162, 3, -479335978);
        setIntElement(term60162, 4, 1628406480);
        setIntElement(term60162, 5, -282271093);
        setIntElement(term60162, 6, -1014876011);
        setIntElement(term60162, 7, -1030632367);
        setField(term60152, term60152.getClass(), "positions", term60162);
        setIntField(term60152, term60152.getClass(), "size", -566251622);
        term60172 = new Integer(-2094377383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60172;
        callMethod(klass, "updateAtPos", argTypes, term60152, args);
    }

};


