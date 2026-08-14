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

public class MoveGenerator_addPromotions_135642759921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202571;

    public MoveGenerator_addPromotions_135642759921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202571 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "addPromotions", argTypes, term202571, args);
    }

};


