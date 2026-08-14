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

public class Bitboard_sq2A1_3308959114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum4825;

    public Bitboard_sq2A1_3308959114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1264207 = Class.forName((String) "com.github.bhlangonijr.chesslib.Square");
        Field term1264206 = ((Class) term1264207).getDeclaredField((String) "F6");
        ((Field) term1264206).setAccessible(true);
        enum4825 = ((Field) term1264206).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[1];
        args[0] = enum4825;
        callMethod(klass, "sq2A1", argTypes, null, args);
    }

};


