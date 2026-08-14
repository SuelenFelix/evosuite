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

public class Bitboard_getKnightAttacks_74094466116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4831;
     Object term1265486;

    public Bitboard_getKnightAttacks_74094466116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1265489 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1265488 = ((Class) term1265489).getDeclaredField((String) "A4");
        ((Field) term1265488).setAccessible(true);
        enum4831 = ((Field) term1265488).get((Object) null);
        term1265486 = new Long(-6503611645609982617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = enum4831;
        args[1] = term1265486;
        callMethod(klass, "getKnightAttacks", argTypes, null, args);
    }

};


