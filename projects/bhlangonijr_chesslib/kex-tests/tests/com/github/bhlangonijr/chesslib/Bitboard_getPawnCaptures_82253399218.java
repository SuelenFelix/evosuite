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

public class Bitboard_getPawnCaptures_82253399218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4834;
     Object enum4835;
     Object term1266126;
     Object enum4836;

    public Bitboard_getPawnCaptures_82253399218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1266135 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1266134 = ((Class) term1266135).getDeclaredField((String) "BLACK");
        ((Field) term1266134).setAccessible(true);
        enum4834 = ((Field) term1266134).get((Object) null);
        Class<? extends Object> term1266337 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1266336 = ((Class) term1266337).getDeclaredField((String) "D8");
        ((Field) term1266336).setAccessible(true);
        enum4835 = ((Field) term1266336).get((Object) null);
        term1266126 = new Long(-7574091101944828886L);
        Class<? extends Object> term1266540 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1266539 = ((Class) term1266540).getDeclaredField((String) "E7");
        ((Field) term1266539).setAccessible(true);
        enum4836 = ((Field) term1266539).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = enum4834;
        args[1] = enum4835;
        args[2] = term1266126;
        args[3] = enum4836;
        callMethod(klass, "getPawnCaptures", argTypes, null, args);
    }

};


