package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AvailableBook_init_8871493530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1003;
     Object term1007;
     Object term1020;
     Object term1033;
     Object term1046;

    public AvailableBook_init_8871493530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1003 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1004 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1004, term1004.getClass(), "mostSigBits", 5262507301787091109L);
        setLongField(term1004, term1004.getClass(), "leastSigBits", -6823727938421990489L);
        setField(term1003, term1003.getClass(), "value", term1004);
        term1007 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        setField(term1007, term1007.getClass(), "name", "aKnKipADSo");
        term1020 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        setField(term1020, term1020.getClass(), "title", "wSQxaModmm");
        term1033 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        setField(term1033, term1033.getClass(), "value", "UlajhuVLaP");
        term1046 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1046, term1046.getClass(), "value", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.bslota.optimisticapi.holding.domain.BookId");
        argTypes[1] = Class.forName("com.bslota.optimisticapi.holding.domain.Author");
        argTypes[2] = Class.forName("com.bslota.optimisticapi.holding.domain.Title");
        argTypes[3] = Class.forName("com.bslota.optimisticapi.holding.domain.ISBN");
        argTypes[4] = Class.forName("com.bslota.optimisticapi.holding.aggregate.Version");
        Object[] args = new Object[5];
        args[0] = term1003;
        args[1] = term1007;
        args[2] = term1020;
        args[3] = term1033;
        args[4] = term1046;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


