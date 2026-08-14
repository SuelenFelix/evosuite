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

public class Board_findEnPassant_10050395784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1483;
     Object enum1484;

    public Board_findEnPassant_10050395784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term428291 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term428290 = ((Class) term428291).getDeclaredField((String) "A4");
        ((Field) term428290).setAccessible(true);
        enum1483 = ((Field) term428290).get((Object) null);
        Class<? extends Object> term428494 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term428493 = ((Class) term428494).getDeclaredField((String) "WHITE");
        ((Field) term428493).setAccessible(true);
        enum1484 = ((Field) term428493).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[2];
        args[0] = enum1483;
        args[1] = enum1484;
        callMethod(klass, "findEnPassant", argTypes, null, args);
    }

};


