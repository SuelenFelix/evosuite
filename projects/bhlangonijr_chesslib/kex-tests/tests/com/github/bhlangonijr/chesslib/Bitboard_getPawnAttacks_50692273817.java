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

public class Bitboard_getPawnAttacks_50692273817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4832;
     Object enum4833;

    public Bitboard_getPawnAttacks_50692273817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1265707 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1265706 = ((Class) term1265707).getDeclaredField((String) "BLACK");
        ((Field) term1265706).setAccessible(true);
        enum4832 = ((Field) term1265706).get((Object) null);
        Class<? extends Object> term1265909 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1265908 = ((Class) term1265909).getDeclaredField((String) "G7");
        ((Field) term1265908).setAccessible(true);
        enum4833 = ((Field) term1265908).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = enum4832;
        args[1] = enum4833;
        callMethod(klass, "getPawnAttacks", argTypes, null, args);
    }

};


