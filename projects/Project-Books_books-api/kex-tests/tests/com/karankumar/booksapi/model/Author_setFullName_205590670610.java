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

public class Author_setFullName_205590670610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18483;

    public Author_setFullName_205590670610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18484 = new Long(-7456852906235966771L);
        HashMap term18499 = new HashMap();
        Set<Object> term18538 =  ((Map) term18499).keySet();
        HashSet term18498 = new HashSet((Collection<? extends Object>) term18538);
        term18483 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18483, term18483.getClass(), "id", term18484);
        setField(term18483, term18483.getClass(), "fullName", "bwlLFAfNWx");
        setField(term18483, term18483.getClass(), "books", term18498);
        setField(term18483, term18483.getClass(), "about", "JWodNQzjjV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAgxWjhxNf";
        callMethod(klass, "setFullName", argTypes, term18483, args);
    }

};


