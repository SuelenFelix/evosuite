package com.karankumar.booksapi.service;

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
import static com.karankumar.booksapi.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AuthorService_deleteAuthor_9403066663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;

    public AuthorService_deleteAuthor_9403066663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1101 = new Long(7411271909051562686L);
        HashMap term1116 = new HashMap();
        Set<Object> term1143 =  ((Map) term1116).keySet();
        HashSet term1115 = new HashSet((Collection<? extends Object>) term1143);
        term1100 = newInstance(Class.forName("com.karankumar.booksapi.model.Author"));
        setField(term1100, term1100.getClass(), "id", term1101);
        setField(term1100, term1100.getClass(), "fullName", "jJCZpVmanW");
        setField(term1100, term1100.getClass(), "books", term1115);
        setField(term1100, term1100.getClass(), "about", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.service.AuthorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.Author");
        Object[] args = new Object[1];
        args[0] = term1100;
        callMethod(klass, "deleteAuthor", argTypes, null, args);
    }

};


