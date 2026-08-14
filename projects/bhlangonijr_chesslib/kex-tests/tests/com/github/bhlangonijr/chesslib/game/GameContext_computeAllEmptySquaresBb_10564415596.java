package com.github.bhlangonijr.chesslib.game;

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
import static com.github.bhlangonijr.chesslib.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class GameContext_computeAllEmptySquaresBb_10564415596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum423;
     Object enum424;
     Object enum425;
     Object enum426;

    public GameContext_computeAllEmptySquaresBb_10564415596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130925 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term130924 = ((Class) term130925).getDeclaredField((String) "A5");
        ((Field) term130924).setAccessible(true);
        enum423 = ((Field) term130924).get((Object) null);
        Class<? extends Object> term131128 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term131127 = ((Class) term131128).getDeclaredField((String) "C6");
        ((Field) term131127).setAccessible(true);
        enum424 = ((Field) term131127).get((Object) null);
        Class<? extends Object> term131331 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term131330 = ((Class) term131331).getDeclaredField((String) "E6");
        ((Field) term131330).setAccessible(true);
        enum425 = ((Field) term131330).get((Object) null);
        Class<? extends Object> term131534 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term131533 = ((Class) term131534).getDeclaredField((String) "B2");
        ((Field) term131533).setAccessible(true);
        enum426 = ((Field) term131533).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = enum423;
        args[1] = enum424;
        args[2] = enum425;
        args[3] = enum426;
        callMethod(klass, "computeAllEmptySquaresBb", argTypes, null, args);
    }

};


