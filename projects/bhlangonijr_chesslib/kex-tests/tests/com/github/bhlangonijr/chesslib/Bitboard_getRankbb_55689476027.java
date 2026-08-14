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

public class Bitboard_getRankbb_55689476027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4842;

    public Bitboard_getRankbb_55689476027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1267811 = Class.forName((String) "com.github.bhlangonijr.chesslib.Rank");
        Field term1267810 = ((Class) term1267811).getDeclaredField((String) "RANK_3");
        ((Field) term1267810).setAccessible(true);
        enum4842 = ((Field) term1267810).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Rank");
        Object[] args = new Object[1];
        args[0] = enum4842;
        callMethod(klass, "getRankbb", argTypes, null, args);
    }

};


