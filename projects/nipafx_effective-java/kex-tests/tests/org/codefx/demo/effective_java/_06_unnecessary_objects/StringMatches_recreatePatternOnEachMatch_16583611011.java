package org.codefx.demo.effective_java._06_unnecessary_objects;

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
import static org.codefx.demo.effective_java._06_unnecessary_objects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StringMatches_recreatePatternOnEachMatch_16583611011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public StringMatches_recreatePatternOnEachMatch_16583611011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.StringMatches"));
        setField(term335, term335.getClass(), "numeral", "I");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.StringMatches");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recreatePatternOnEachMatch", argTypes, term335, args);
    }

};


