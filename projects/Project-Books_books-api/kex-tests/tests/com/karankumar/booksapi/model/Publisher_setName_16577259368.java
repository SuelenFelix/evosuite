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

public class Publisher_setName_16577259368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17314;

    public Publisher_setName_16577259368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17315 = new Long(3381333711768010594L);
        HashMap term17330 = new HashMap();
        Set<Object> term17357 =  ((Map) term17330).keySet();
        HashSet term17329 = new HashSet((Collection<? extends Object>) term17357);
        term17314 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17314, term17314.getClass(), "id", term17315);
        setField(term17314, term17314.getClass(), "name", "sOdkipUKRu");
        setField(term17314, term17314.getClass(), "books", term17329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oKwCDqywym";
        callMethod(klass, "setName", argTypes, term17314, args);
    }

};


