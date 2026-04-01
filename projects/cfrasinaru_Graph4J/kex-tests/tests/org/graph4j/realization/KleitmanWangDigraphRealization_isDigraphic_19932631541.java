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

public class KleitmanWangDigraphRealization_isDigraphic_19932631541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187;

    public KleitmanWangDigraphRealization_isDigraphic_19932631541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term193 = new Boolean(false);
        term187 = newInstance(Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization"));
        int[] term188 = (int[]) newIntArray(2);
        int[] term191 = (int[]) newIntArray(1);
        setIntElement(term188, 0, 1063420942);
        setIntElement(term188, 1, 1375330971);
        setField(term187, term187.getClass(), "indegrees", term188);
        setIntElement(term191, 0, -478195677);
        setField(term187, term187.getClass(), "outdegrees", term191);
        setField(term187, term187.getClass(), "digraphic", term193);
        setField(term187, term187.getClass(), "digraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.KleitmanWangDigraphRealization");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDigraphic", argTypes, term187, args);
    }

};


