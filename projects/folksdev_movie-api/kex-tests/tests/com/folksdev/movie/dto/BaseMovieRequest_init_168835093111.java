package com.folksdev.movie.dto;

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
import static com.folksdev.movie.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class BaseMovieRequest_init_168835093111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3755;
     Object term3757;
     Object term3759;

    public BaseMovieRequest_init_168835093111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755 = new Integer(1134449235);
        term3757 = new Integer(-883034806);
        Class<? extends Object> term3807 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term3806 = ((Class) term3807).getDeclaredField((String) "FANTASY");
        ((Field) term3806).setAccessible(true);
        Object enum2 =  ((Field) term3806).get((Object) null);
        Class<? extends Object> term4010 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4009 = ((Class) term4010).getDeclaredField((String) "SCI_FI");
        ((Field) term4009).setAccessible(true);
        Object enum3 =  ((Field) term4009).get((Object) null);
        Class<? extends Object> term4210 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4209 = ((Class) term4210).getDeclaredField((String) "COMEDY");
        ((Field) term4209).setAccessible(true);
        Object enum4 =  ((Field) term4209).get((Object) null);
        term3759 = new LinkedList();
        ((LinkedList) term3759).add(enum2);
        ((LinkedList) term3759).add(enum3);
        ((LinkedList) term3759).add(enum4);
        ((LinkedList) term3759).add((Object)null);
        ((LinkedList) term3759).add((Object)null);
        ((LinkedList) term3759).add((Object)null);
        ((LinkedList) term3759).add((Object)null);
        ((LinkedList) term3759).add((Object)null);
        ((LinkedList) term3759).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = "GgZWSjxjyE";
        args[1] = "EeBVbzjcCI";
        args[2] = term3755;
        args[3] = term3757;
        args[4] = term3759;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


