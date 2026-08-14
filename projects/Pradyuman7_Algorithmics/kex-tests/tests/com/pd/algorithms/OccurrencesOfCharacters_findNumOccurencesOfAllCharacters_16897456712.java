package com.pd.algorithms;

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
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;

public class OccurrencesOfCharacters_findNumOccurencesOfAllCharacters_16897456712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;

    public OccurrencesOfCharacters_findNumOccurencesOfAllCharacters_16897456712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term620 = new HashMap();
        term619 = newInstance(Class.forName("com.pd.algorithms.OccurrencesOfCharacters"));
        setField(term619, term619.getClass(), "hm", term620);
        setField(term619, term619.getClass(), "s", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.OccurrencesOfCharacters");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findNumOccurencesOfAllCharacters", argTypes, term619, args);
    }

};


