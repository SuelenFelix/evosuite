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

public class Author_setId_19178987129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18427;
     Object term18460;

    public Author_setId_19178987129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18428 = new Long(3752337209837437327L);
        HashMap term18443 = new HashMap();
        Set<Object> term18472 =  ((Map) term18443).keySet();
        HashSet term18442 = new HashSet((Collection<? extends Object>) term18472);
        term18427 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18427, term18427.getClass(), "id", term18428);
        setField(term18427, term18427.getClass(), "fullName", "ckQLZGFjMX");
        setField(term18427, term18427.getClass(), "books", term18442);
        setField(term18427, term18427.getClass(), "about", "qphdrqUtNx");
        term18460 = new Long(1860789353508856614L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term18460;
        callMethod(klass, "setId", argTypes, term18427, args);
    }

};


