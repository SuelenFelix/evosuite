package com.github.bhlangonijr.chesslib;

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
import static com.github.bhlangonijr.chesslib.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Board_findEnPassantTarget_3335307753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1481;
     Object enum1482;

    public Board_findEnPassantTarget_3335307753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term427871 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term427870 = ((Class) term427871).getDeclaredField((String) "E5");
        ((Field) term427870).setAccessible(true);
        enum1481 = ((Field) term427870).get((Object) null);
        Class<? extends Object> term428074 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term428073 = ((Class) term428074).getDeclaredField((String) "BLACK");
        ((Field) term428073).setAccessible(true);
        enum1482 = ((Field) term428073).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[2];
        args[0] = enum1481;
        args[1] = enum1482;
        callMethod(klass, "findEnPassantTarget", argTypes, null, args);
    }

};


