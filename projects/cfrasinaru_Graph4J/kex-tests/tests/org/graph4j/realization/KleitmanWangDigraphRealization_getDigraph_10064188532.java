package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class KleitmanWangDigraphRealization_getDigraph_10064188532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public KleitmanWangDigraphRealization_getDigraph_10064188532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term213 = new Boolean(true);
        term198 = newInstance(Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization"));
        int[] term199 = (int[]) newIntArray(9);
        int[] term209 = (int[]) newIntArray(3);
        setIntElement(term199, 0, 972867650);
        setIntElement(term199, 1, 1655935355);
        setIntElement(term199, 2, -481533957);
        setIntElement(term199, 3, 1240914516);
        setIntElement(term199, 4, -1465035361);
        setIntElement(term199, 5, 1090617576);
        setIntElement(term199, 6, -1547384488);
        setIntElement(term199, 7, 1442160736);
        setIntElement(term199, 8, 1114000454);
        setField(term198, term198.getClass(), "indegrees", term199);
        setIntElement(term209, 0, -556405712);
        setIntElement(term209, 1, -1772434990);
        setIntElement(term209, 2, -1845499264);
        setField(term198, term198.getClass(), "outdegrees", term209);
        setField(term198, term198.getClass(), "digraphic", term213);
        setField(term198, term198.getClass(), "digraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDigraph", argTypes, term198, args);
    }

};


