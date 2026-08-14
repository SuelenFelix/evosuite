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

public class Publisher_getName_9173647925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17216;

    public Publisher_getName_9173647925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17217 = new Long(8540994973773607992L);
        HashMap term17232 = new HashMap();
        Set<Object> term17247 =  ((Map) term17232).keySet();
        HashSet term17231 = new HashSet((Collection<? extends Object>) term17247);
        term17216 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17216, term17216.getClass(), "id", term17217);
        setField(term17216, term17216.getClass(), "name", "OUeBWNTQDh");
        setField(term17216, term17216.getClass(), "books", term17231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17216, args);
    }

};


