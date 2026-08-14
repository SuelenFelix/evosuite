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

public class Publisher_setBooks_9747587349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17368;
     Object term17389;

    public Publisher_setBooks_9747587349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17369 = new Long(3580984732036213717L);
        HashMap term17384 = new HashMap();
        Set<Object> term17405 =  ((Map) term17384).keySet();
        HashSet term17383 = new HashSet((Collection<? extends Object>) term17405);
        term17368 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17368, term17368.getClass(), "id", term17369);
        setField(term17368, term17368.getClass(), "name", "zjZYTddemL");
        setField(term17368, term17368.getClass(), "books", term17383);
        HashMap term17390 = new HashMap();
        Set<Object> term17406 =  ((Map) term17390).keySet();
        term17389 = new HashSet((Collection<? extends Object>) term17406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term17389;
        callMethod(klass, "setBooks", argTypes, term17368, args);
    }

};


