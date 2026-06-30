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

public class CreateMovieRequest_init_16210136950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;
     Object term1020;
     Object term1022;
     Object term1054;

    public CreateMovieRequest_init_16210136950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1018 = new Integer(568599855);
        term1020 = new Integer(1162663216);
        Class<? extends Object> term1261 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term1260 = ((Class) term1261).getDeclaredField((String) "SCI_FI");
        ((Field) term1260).setAccessible(true);
        Object enum0 =  ((Field) term1260).get((Object) null);
        Class<? extends Object> term1461 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term1460 = ((Class) term1461).getDeclaredField((String) "SCI_FI");
        ((Field) term1460).setAccessible(true);
        Object enum1 =  ((Field) term1460).get((Object) null);
        term1022 = new LinkedList();
        ((LinkedList) term1022).add(enum0);
        ((LinkedList) term1022).add(enum1);
        ((LinkedList) term1022).add(enum0);
        ((LinkedList) term1022).add((Object)null);
        ((LinkedList) term1022).add((Object)null);
        term1054 = new LinkedList();
        ((LinkedList) term1054).add("GzFkzHGYFt");
        ((LinkedList) term1054).add("tShwQLRGNe");
        ((LinkedList) term1054).add("");
        ((LinkedList) term1054).add((Object)null);
        ((LinkedList) term1054).add((Object)null);
        ((LinkedList) term1054).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.CreateMovieRequest");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.lang.Integer");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        Object[] args = new Object[9];
        args[0] = "gGSMzuGICf";
        args[1] = "hxCBltsObl";
        args[2] = "BndsHwAFMv";
        args[3] = term1018;
        args[4] = term1020;
        args[5] = term1022;
        args[6] = term1054;
        args[7] = "UiUYnPrcCi";
        args[8] = "UoYtihxVaS";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


