package org.apache.lucene.query;

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
import static org.apache.lucene.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DamerauLevenshteinAlgorithm_execute_2513486753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public DamerauLevenshteinAlgorithm_execute_2513486753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.apache.lucene.query.DamerauLevenshteinAlgorithm"));
        setIntField(term66, term66.getClass(), "deleteCost", 0);
        setIntField(term66, term66.getClass(), "insertCost", 0);
        setIntField(term66, term66.getClass(), "replaceCost", 0);
        setIntField(term66, term66.getClass(), "swapCost", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.lucene.query.DamerauLevenshteinAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "execute", argTypes, term66, args);
    }

};


