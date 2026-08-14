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

public class GameContext_computeKingPassSquares_5527915775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum421;
     Object enum422;

    public GameContext_computeKingPassSquares_5527915775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130495 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term130494 = ((Class) term130495).getDeclaredField((String) "D7");
        ((Field) term130494).setAccessible(true);
        enum421 = ((Field) term130494).get((Object) null);
        Class<? extends Object> term130698 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term130697 = ((Class) term130698).getDeclaredField((String) "D3");
        ((Field) term130697).setAccessible(true);
        enum422 = ((Field) term130697).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = enum421;
        args[1] = enum422;
        callMethod(klass, "computeKingPassSquares", argTypes, null, args);
    }

};


