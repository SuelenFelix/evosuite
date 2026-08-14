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
import java.lang.Long;

public class Bitboard_getPawnMoves_163641765519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4837;
     Object enum4838;
     Object term1266757;

    public Bitboard_getPawnMoves_163641765519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1266760 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1266759 = ((Class) term1266760).getDeclaredField((String) "BLACK");
        ((Field) term1266759).setAccessible(true);
        enum4837 = ((Field) term1266759).get((Object) null);
        Class<? extends Object> term1266962 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1266961 = ((Class) term1266962).getDeclaredField((String) "B7");
        ((Field) term1266961).setAccessible(true);
        enum4838 = ((Field) term1266961).get((Object) null);
        term1266757 = new Long(-6792339614909987294L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = enum4837;
        args[1] = enum4838;
        args[2] = term1266757;
        callMethod(klass, "getPawnMoves", argTypes, null, args);
    }

};


