package com.github.bhlangonijr.chesslib.move;

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
import static com.github.bhlangonijr.chesslib.move.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Move_init_15932312001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum790;
     Object enum791;
     Object enum792;

    public Move_init_15932312001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203072 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term203071 = ((Class) term203072).getDeclaredField((String) "C5");
        ((Field) term203071).setAccessible(true);
        enum790 = ((Field) term203071).get((Object) null);
        Class<? extends Object> term203275 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term203274 = ((Class) term203275).getDeclaredField((String) "H4");
        ((Field) term203274).setAccessible(true);
        enum791 = ((Field) term203274).get((Object) null);
        Class<? extends Object> term203478 = Class.forName((String) "com.github.bhlangonijr.chesslib.Piece");
        Field term203477 = ((Class) term203478).getDeclaredField((String) "BLACK_BISHOP");
        ((Field) term203477).setAccessible(true);
        enum792 = ((Field) term203477).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        Object[] args = new Object[3];
        args[0] = enum790;
        args[1] = enum791;
        args[2] = enum792;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


