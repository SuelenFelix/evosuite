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

public class BaseMovieRequest_init_14135556630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3157;
     Object term3159;
     Object term3161;
     Object term3164;

    public BaseMovieRequest_init_14135556630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3157 = new Integer(-1955890973);
        term3159 = new Integer(-2038273078);
        term3161 = new LinkedList();
        term3164 = new LinkedList();
        ((LinkedList) term3164).add("pORebkoRdD");
        ((LinkedList) term3164).add("mXGCWJDOqA");
        ((LinkedList) term3164).add("");
        ((LinkedList) term3164).add((Object)null);
        ((LinkedList) term3164).add((Object)null);
        ((LinkedList) term3164).add((Object)null);
        ((LinkedList) term3164).add((Object)null);
        ((LinkedList) term3164).add((Object)null);
        ((LinkedList) term3164).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
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
        args[0] = "iNwOJRBEjp";
        args[1] = "XylxrMBraH";
        args[2] = term3157;
        args[3] = term3159;
        args[4] = term3161;
        args[5] = term3164;
        args[6] = "mLUZFTfjle";
        args[7] = "xIeFjkHkOe";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


