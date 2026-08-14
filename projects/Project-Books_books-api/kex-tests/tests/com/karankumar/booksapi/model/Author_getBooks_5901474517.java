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

public class Author_getBooks_5901474517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18319;

    public Author_getBooks_5901474517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18320 = new Long(3666226122807672448L);
        HashMap term18335 = new HashMap();
        Set<Object> term18362 =  ((Map) term18335).keySet();
        HashSet term18334 = new HashSet((Collection<? extends Object>) term18362);
        term18319 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18319, term18319.getClass(), "id", term18320);
        setField(term18319, term18319.getClass(), "fullName", "wwAwLLcLPp");
        setField(term18319, term18319.getClass(), "books", term18334);
        setField(term18319, term18319.getClass(), "about", "nHpMKOmlpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term18319, args);
    }

};


