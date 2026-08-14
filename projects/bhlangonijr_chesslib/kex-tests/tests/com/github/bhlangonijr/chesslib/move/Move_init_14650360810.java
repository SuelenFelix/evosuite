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

public class Move_init_14650360810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum788;
     Object enum789;

    public Move_init_14650360810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202609 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term202608 = ((Class) term202609).getDeclaredField((String) "D7");
        ((Field) term202608).setAccessible(true);
        enum788 = ((Field) term202608).get((Object) null);
        Class<? extends Object> term202812 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term202811 = ((Class) term202812).getDeclaredField((String) "H4");
        ((Field) term202811).setAccessible(true);
        enum789 = ((Field) term202811).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = enum788;
        args[1] = enum789;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


