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

public class Author_getAbout_4384104018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18373;

    public Author_getAbout_4384104018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18374 = new Long(3108750145697087661L);
        HashMap term18389 = new HashMap();
        Set<Object> term18416 =  ((Map) term18389).keySet();
        HashSet term18388 = new HashSet((Collection<? extends Object>) term18416);
        term18373 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18373, term18373.getClass(), "id", term18374);
        setField(term18373, term18373.getClass(), "fullName", "fKhrQsJToZ");
        setField(term18373, term18373.getClass(), "books", term18388);
        setField(term18373, term18373.getClass(), "about", "wsysQLGFnl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAbout", argTypes, term18373, args);
    }

};


