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

public class Piece_init_1853668522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1053;
     Object enum1054;

    public Piece_init_1853668522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term302332 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term302331 = ((Class) term302332).getDeclaredField((String) "WHITE");
        ((Field) term302331).setAccessible(true);
        enum1053 = ((Field) term302331).get((Object) null);
        Class<? extends Object> term302534 = Class.forName((String) "com.github.bhlangonijr.chesslib.PieceType");
        Field term302533 = ((Class) term302534).getDeclaredField((String) "NONE");
        ((Field) term302533).setAccessible(true);
        enum1054 = ((Field) term302533).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.PieceType");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = enum1053;
        args[1] = enum1054;
        args[2] = "qphdrqUtNx";
        args[3] = "bwlLFAfNWx";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


