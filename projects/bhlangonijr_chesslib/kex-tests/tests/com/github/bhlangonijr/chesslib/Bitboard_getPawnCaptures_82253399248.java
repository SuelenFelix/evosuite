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
import java.lang.Long;

public class Bitboard_getPawnCaptures_82253399248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1268280;
     Object term1268281;

    public Bitboard_getPawnCaptures_82253399248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1268280 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.Bitboard"));
        term1268281 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.Bitboard");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term1268281;
        args[3] = null;
        callMethod(klass, "getPawnCaptures", argTypes, term1268280, args);
    }

};


