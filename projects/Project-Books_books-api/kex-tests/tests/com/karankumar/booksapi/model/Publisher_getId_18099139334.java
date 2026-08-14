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

public class Publisher_getId_18099139334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17184;

    public Publisher_getId_18099139334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17185 = new Long(4199886998224701110L);
        HashMap term17200 = new HashMap();
        Set<Object> term17215 =  ((Map) term17200).keySet();
        HashSet term17199 = new HashSet((Collection<? extends Object>) term17215);
        term17184 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17184, term17184.getClass(), "id", term17185);
        setField(term17184, term17184.getClass(), "name", "boSSpezHeU");
        setField(term17184, term17184.getClass(), "books", term17199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term17184, args);
    }

};


