package com.bslota.optimisticapi.holding.query;

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
import static com.bslota.optimisticapi.holding.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FindingBook_by_14303022341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;
     Object term1094;

    public FindingBook_by_14303022341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1093 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.FindingBook"));
        setField(term1093, term1093.getClass(), "bookRepository", null);
        term1094 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1095 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1095, term1095.getClass(), "mostSigBits", 2442117782898005296L);
        setLongField(term1095, term1095.getClass(), "leastSigBits", 6375119433582206027L);
        setField(term1094, term1094.getClass(), "value", term1095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.FindingBook");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        Object[] args = new Object[1];
        args[0] = term1094;
        callMethod(klass, "by", argTypes, term1093, args);
    }

};


