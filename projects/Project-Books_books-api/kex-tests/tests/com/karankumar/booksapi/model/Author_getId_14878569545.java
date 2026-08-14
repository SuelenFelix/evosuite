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

public class Author_getId_14878569545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18211;

    public Author_getId_14878569545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18212 = new Long(-3277773415369003529L);
        HashMap term18227 = new HashMap();
        Set<Object> term18254 =  ((Map) term18227).keySet();
        HashSet term18226 = new HashSet((Collection<? extends Object>) term18254);
        term18211 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term18211, term18211.getClass(), "id", term18212);
        setField(term18211, term18211.getClass(), "fullName", "RjNoEywJbC");
        setField(term18211, term18211.getClass(), "books", term18226);
        setField(term18211, term18211.getClass(), "about", "RTTvrwwhou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.Author");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term18211, args);
    }

};


