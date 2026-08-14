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

public class GameContext_init_7885982621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum369;
     Object enum370;

    public GameContext_init_7885982621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117811 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.GameMode");
        Field term117810 = ((Class) term117811).getDeclaredField((String) "HUMAN_VS_MACHINE");
        ((Field) term117810).setAccessible(true);
        enum369 = ((Field) term117810).get((Object) null);
        Class<? extends Object> term118091 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.VariationType");
        Field term118090 = ((Class) term118091).getDeclaredField((String) "CHESS960");
        ((Field) term118090).setAccessible(true);
        enum370 = ((Field) term118090).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.GameMode");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.game.VariationType");
        Object[] args = new Object[2];
        args[0] = enum369;
        args[1] = enum370;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


