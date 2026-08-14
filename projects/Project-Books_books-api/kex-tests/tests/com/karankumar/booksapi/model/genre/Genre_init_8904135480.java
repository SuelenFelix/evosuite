package com.karankumar.booksapi.model.genre;

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
import static com.karankumar.booksapi.model.genre.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Genre_init_8904135480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum6;

    public Genre_init_8904135480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2603 = Class.forName((String) "com.karankumar.booksapi.model.genre.GenreName");
        Field term2602 = ((Class) term2603).getDeclaredField((String) "SCIENCE");
        ((Field) term2602).setAccessible(true);
        enum6 = ((Field) term2602).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.genre.Genre");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.karankumar.booksapi.model.genre.GenreName");
        Object[] args = new Object[1];
        args[0] = enum6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


