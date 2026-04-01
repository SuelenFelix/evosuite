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
import java.lang.Object;

public class UpdateMovieRequest_init_8147250330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2197;
     Object term2199;
     Object term2201;
     Object term2204;

    public UpdateMovieRequest_init_8147250330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2197 = new Integer(-1922583790);
        term2199 = new Integer(-616727354);
        term2201 = new LinkedList();
        term2204 = new LinkedList();
        ((LinkedList) term2204).add("HqBOwkVqjD");
        ((LinkedList) term2204).add("MAcUBcBckh");
        ((LinkedList) term2204).add("");
        ((LinkedList) term2204).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.UpdateMovieRequest");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = "JUmudUmaaV";
        args[1] = "KoyGrUJeJW";
        args[2] = term2197;
        args[3] = term2199;
        args[4] = term2201;
        args[5] = term2204;
        args[6] = "OWKQODBLzb";
        args[7] = "wGmYcqUkgE";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


