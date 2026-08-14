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

public class Author_toString_192378778613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18696;

    public Author_toString_192378778613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18697 = new Long(-2187638136407967948L);
        HashMap term18712 = new HashMap();
        Set<Object> term18739 =  ((Map) term18712).keySet();
        HashSet term18711 = new HashSet((Collection<? extends Object>) term18739);
        term18696 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18696, term18696.getClass(), "id", term18697);
        setField(term18696, term18696.getClass(), "fullName", "VoghngXfsK");
        setField(term18696, term18696.getClass(), "books", term18711);
        setField(term18696, term18696.getClass(), "about", "GbahCBMvct");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18696, args);
    }

};


