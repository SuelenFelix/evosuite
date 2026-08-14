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
import java.lang.Object;

public class EdgeArray_grow_125581811119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1992;

    public EdgeArray_grow_125581811119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1992 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1993 = (Object[]) newArray("[I", 6);
        int[] term1994 = (int[]) newIntArray(4);
        int[] term1999 = (int[]) newIntArray(1);
        int[] term2001 = (int[]) newIntArray(2);
        int[] term2004 = (int[]) newIntArray(5);
        int[] term2010 = (int[]) newIntArray(2);
        int[] term2013 = (int[]) newIntArray(3);
        setField(term1992, term1992.getClass(), "graph", null);
        setIntElement(term1994, 0, -146564963);
        setIntElement(term1994, 1, -83178716);
        setIntElement(term1994, 2, -1292704466);
        setIntElement(term1994, 3, 1991858584);
        setElement(term1993, 0, term1994);
        setIntElement(term1999, 0, -1300947782);
        setElement(term1993, 1, term1999);
        setIntElement(term2001, 0, 188512644);
        setIntElement(term2001, 1, 1851127634);
        setElement(term1993, 2, term2001);
        setIntElement(term2004, 0, 783730213);
        setIntElement(term2004, 1, 1815951606);
        setIntElement(term2004, 2, 1105016932);
        setIntElement(term2004, 3, -365784998);
        setIntElement(term2004, 4, -1893236300);
        setElement(term1993, 3, term2004);
        setIntElement(term2010, 0, -1858909368);
        setIntElement(term2010, 1, -280113263);
        setElement(term1993, 4, term2010);
        setIntElement(term2013, 0, 529625347);
        setIntElement(term2013, 1, 1409095253);
        setIntElement(term2013, 2, 315179039);
        setElement(term1993, 5, term2013);
        setField(term1992, term1992.getClass(), "edges", term1993);
        setIntField(term1992, term1992.getClass(), "numEdges", -1835923897);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "grow", argTypes, term1992, args);
    }

};


