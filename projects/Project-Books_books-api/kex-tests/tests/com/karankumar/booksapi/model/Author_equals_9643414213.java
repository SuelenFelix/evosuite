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

public class Author_equals_9643414213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18102;
     Object term18135;

    public Author_equals_9643414213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18103 = new Long(-7406618974062419277L);
        HashMap term18118 = new HashMap();
        Set<Object> term18146 =  ((Map) term18118).keySet();
        HashSet term18117 = new HashSet((Collection<? extends Object>) term18146);
        term18102 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18102, term18102.getClass(), "id", term18103);
        setField(term18102, term18102.getClass(), "fullName", "IApvtmfhnq");
        setField(term18102, term18102.getClass(), "books", term18117);
        setField(term18102, term18102.getClass(), "about", "VSaNnhMpRc");
        term18135 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18135;
        callMethod(klass, "equals", argTypes, term18102, args);
    }

};


