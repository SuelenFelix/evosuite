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

public class Piece_make_20397444984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1055;
     Object enum1056;

    public Piece_make_20397444984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term302820 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term302819 = ((Class) term302820).getDeclaredField((String) "WHITE");
        ((Field) term302819).setAccessible(true);
        enum1055 = ((Field) term302819).get((Object) null);
        Class<? extends Object> term303022 = Class.forName((String) "com.github.bhlangonijr.chesslib.PieceType");
        Field term303021 = ((Class) term303022).getDeclaredField((String) "KING");
        ((Field) term303021).setAccessible(true);
        enum1056 = ((Field) term303021).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.PieceType");
        Object[] args = new Object[2];
        args[0] = enum1055;
        args[1] = enum1056;
        callMethod(klass, "make", argTypes, null, args);
    }

};


