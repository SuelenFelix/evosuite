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

public class Board_getPiecePolyglotKey_1417915968103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4818;
     Object enum4819;

    public Board_getPiecePolyglotKey_1417915968103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1257031 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term1257030 = ((Class) term1257031).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term1257030).setAccessible(true);
        enum4818 = ((Field) term1257030).get((Object) null);
        Class<? extends Object> term1257259 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1257258 = ((Class) term1257259).getDeclaredField((String) "C7");
        ((Field) term1257258).setAccessible(true);
        enum4819 = ((Field) term1257258).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = enum4818;
        args[1] = enum4819;
        callMethod(klass, "getPiecePolyglotKey", argTypes, null, args);
    }

};


