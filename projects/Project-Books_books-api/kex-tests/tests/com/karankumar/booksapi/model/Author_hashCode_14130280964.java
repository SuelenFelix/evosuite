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

public class Author_hashCode_14130280964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18157;

    public Author_hashCode_14130280964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18158 = new Long(868503089567085985L);
        HashMap term18173 = new HashMap();
        Set<Object> term18200 =  ((Map) term18173).keySet();
        HashSet term18172 = new HashSet((Collection<? extends Object>) term18200);
        term18157 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18157, term18157.getClass(), "id", term18158);
        setField(term18157, term18157.getClass(), "fullName", "QNjNTLlUaV");
        setField(term18157, term18157.getClass(), "books", term18172);
        setField(term18157, term18157.getClass(), "about", "hIYsRyOZxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18157, args);
    }

};


