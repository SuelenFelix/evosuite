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

public class Author_getFullName_6527181506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18265;

    public Author_getFullName_6527181506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18266 = new Long(1253549421411622358L);
        HashMap term18281 = new HashMap();
        Set<Object> term18308 =  ((Map) term18281).keySet();
        HashSet term18280 = new HashSet((Collection<? extends Object>) term18308);
        term18265 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18265, term18265.getClass(), "id", term18266);
        setField(term18265, term18265.getClass(), "fullName", "lRORwXipuk");
        setField(term18265, term18265.getClass(), "books", term18280);
        setField(term18265, term18265.getClass(), "about", "fVdTcjgHdw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullName", argTypes, term18265, args);
    }

};


