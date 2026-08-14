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

public class Publisher_setId_20550116057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17280;
     Object term17301;

    public Publisher_setId_20550116057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17281 = new Long(-1885698929232124806L);
        HashMap term17296 = new HashMap();
        Set<Object> term17313 =  ((Map) term17296).keySet();
        HashSet term17295 = new HashSet((Collection<? extends Object>) term17313);
        term17280 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17280, term17280.getClass(), "id", term17281);
        setField(term17280, term17280.getClass(), "name", "ZwZIDwYcSW");
        setField(term17280, term17280.getClass(), "books", term17295);
        term17301 = new Long(5731563613239387113L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term17301;
        callMethod(klass, "setId", argTypes, term17280, args);
    }

};


