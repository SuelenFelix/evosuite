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
import java.lang.Long;

public class MoveGenerator_generateRookMoves_86903712326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202580;
     Object term202581;

    public MoveGenerator_generateRookMoves_86903712326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202580 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator"));
        term202581 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term202581;
        callMethod(klass, "generateRookMoves", argTypes, term202580, args);
    }

};


