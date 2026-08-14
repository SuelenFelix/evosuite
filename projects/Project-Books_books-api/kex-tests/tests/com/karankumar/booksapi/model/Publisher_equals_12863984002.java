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

public class Publisher_equals_12863984002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17119;
     Object term17140;

    public Publisher_equals_12863984002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17120 = new Long(8863790908271299748L);
        HashMap term17135 = new HashMap();
        Set<Object> term17151 =  ((Map) term17135).keySet();
        HashSet term17134 = new HashSet((Collection<? extends Object>) term17151);
        term17119 = newInstance(Class.forName("com.karankumar.booksapi.model.Publisher"));
        setField(term17119, term17119.getClass(), "id", term17120);
        setField(term17119, term17119.getClass(), "name", "WXcZEtUKlI");
        setField(term17119, term17119.getClass(), "books", term17134);
        term17140 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Publisher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17140;
        callMethod(klass, "equals", argTypes, term17119, args);
    }

};


