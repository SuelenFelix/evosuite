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

public class Bitboard_getKingAttacks_31645635320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4839;
     Object term1267170;

    public Bitboard_getKingAttacks_31645635320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1267173 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1267172 = ((Class) term1267173).getDeclaredField((String) "D5");
        ((Field) term1267172).setAccessible(true);
        enum4839 = ((Field) term1267172).get((Object) null);
        term1267170 = new Long(-1978508496784157882L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = enum4839;
        args[1] = term1267170;
        callMethod(klass, "getKingAttacks", argTypes, null, args);
    }

};


