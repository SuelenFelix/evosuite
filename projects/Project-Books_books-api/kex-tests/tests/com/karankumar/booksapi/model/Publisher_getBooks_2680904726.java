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

public class Publisher_getBooks_2680904726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17248;

    public Publisher_getBooks_2680904726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17249 = new Long(-2338103433822116635L);
        HashMap term17264 = new HashMap();
        Set<Object> term17279 =  ((Map) term17264).keySet();
        HashSet term17263 = new HashSet((Collection<? extends Object>) term17279);
        term17248 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17248, term17248.getClass(), "id", term17249);
        setField(term17248, term17248.getClass(), "name", "gltJarNuUk");
        setField(term17248, term17248.getClass(), "books", term17263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBooks", argTypes, term17248, args);
    }

};


