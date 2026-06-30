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

public class BaseMovieRequest_init_18398026689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3501;
     Object term3503;
     Object term3505;
     Object term3508;

    public BaseMovieRequest_init_18398026689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3501 = new Integer(1227103734);
        term3503 = new Integer(-1339778481);
        term3505 = new LinkedList();
        term3508 = new LinkedList();
        ((LinkedList) term3508).add("AKNapTAfmD");
        ((LinkedList) term3508).add("xJgPlLxpgC");
        ((LinkedList) term3508).add("");
        ((LinkedList) term3508).add((Object)null);
        ((LinkedList) term3508).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.Integer");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = "SdCKLMIYnX";
        args[1] = "OJJtVNPyKZ";
        args[2] = term3501;
        args[3] = term3503;
        args[4] = term3505;
        args[5] = term3508;
        args[6] = "wfaXBpWAUH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


