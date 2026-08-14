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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class Bitboard_getRookAttacks_128062593713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1265052;
     Object enum4829;

    public Bitboard_getRookAttacks_128062593713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1265052 = new Long(5047215164896153648L);
        Class<? extends Object> term1265061 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1265060 = ((Class) term1265061).getDeclaredField((String) "A6");
        ((Field) term1265060).setAccessible(true);
        enum4829 = ((Field) term1265060).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = term1265052;
        args[1] = enum4829;
        callMethod(klass, "getRookAttacks", argTypes, null, args);
    }

};


