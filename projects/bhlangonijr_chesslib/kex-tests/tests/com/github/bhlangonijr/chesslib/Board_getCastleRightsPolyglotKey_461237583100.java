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

public class Board_getCastleRightsPolyglotKey_461237583100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4814;
     Object enum4815;

    public Board_getCastleRightsPolyglotKey_461237583100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1256104 = Class.forName((String) "com.github.bhlangonijr.chesslib.CastleRight");
        Field term1256103 = ((Class) term1256104).getDeclaredField((String) "QUEEN_SIDE");
        ((Field) term1256103).setAccessible(true);
        enum4814 = ((Field) term1256103).get((Object) null);
        Class<? extends Object> term1256356 = Class.forName((String) "com.github.bhlangonijr.chesslib.Side");
        Field term1256355 = ((Class) term1256356).getDeclaredField((String) "WHITE");
        ((Field) term1256355).setAccessible(true);
        enum4815 = ((Field) term1256355).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.CastleRight");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[2];
        args[0] = enum4814;
        args[1] = enum4815;
        callMethod(klass, "getCastleRightsPolyglotKey", argTypes, null, args);
    }

};


