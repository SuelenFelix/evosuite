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

public class BaseMovieRequest_init_143791057510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3639;
     Object term3641;
     Object term3643;
     Object term3646;

    public BaseMovieRequest_init_143791057510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3639 = new Integer(1725571209);
        term3641 = new Integer(-522618178);
        term3643 = new LinkedList();
        term3646 = new LinkedList();
        ((LinkedList) term3646).add("ZzIujlwVsw");
        ((LinkedList) term3646).add("LWyEaeIyAo");
        ((LinkedList) term3646).add("");
        ((LinkedList) term3646).add((Object)null);
        ((LinkedList) term3646).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        Object[] args = new Object[6];
        args[0] = "VMeAzAHwZj";
        args[1] = "PznxWXsZME";
        args[2] = term3639;
        args[3] = term3641;
        args[4] = term3643;
        args[5] = term3646;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


