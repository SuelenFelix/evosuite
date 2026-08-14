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

public class DamerauLevenshteinAlgorithm_execute_2513486751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public DamerauLevenshteinAlgorithm_execute_2513486751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.apache.lucene.query.DamerauLevenshteinAlgorithm"));
        setIntField(term9, term9.getClass(), "deleteCost", -1922583790);
        setIntField(term9, term9.getClass(), "insertCost", -616727354);
        setIntField(term9, term9.getClass(), "replaceCost", -1955890973);
        setIntField(term9, term9.getClass(), "swapCost", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.lucene.query.DamerauLevenshteinAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        callMethod(klass, "execute", argTypes, term9, args);
    }

};


