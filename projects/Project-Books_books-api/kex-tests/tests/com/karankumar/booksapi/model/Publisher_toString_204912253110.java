package com.karankumar.booksapi.model;

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
import static com.karankumar.booksapi.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Publisher_toString_204912253110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17407;

    public Publisher_toString_204912253110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17408 = new Long(860079646007397083L);
        HashMap term17423 = new HashMap();
        Set<Object> term17438 =  ((Map) term17423).keySet();
        HashSet term17422 = new HashSet((Collection<? extends Object>) term17438);
        term17407 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17407, term17407.getClass(), "id", term17408);
        setField(term17407, term17407.getClass(), "name", "SScVQYSvWH");
        setField(term17407, term17407.getClass(), "books", term17422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17407, args);
    }

};


