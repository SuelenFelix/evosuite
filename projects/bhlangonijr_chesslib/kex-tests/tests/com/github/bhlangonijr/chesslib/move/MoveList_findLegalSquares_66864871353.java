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

public class MoveList_findLegalSquares_66864871353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47377;
     Object term47383;

    public MoveList_findLegalSquares_66864871353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47377 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47377, term47377.getClass(), "startFEN", null);
        setBooleanField(term47377, term47377.getClass(), "dirty", false);
        setField(term47377, term47377.getClass(), "sanArray", null);
        setField(term47377, term47377.getClass(), "fanArray", null);
        setIntField(term47377, term47377.getClass(), "parent", 0);
        setIntField(term47377, term47377.getClass(), "index", 0);
        setIntField(term47377, term47377.getClass(), "size", 0);
        setField(term47377, term47377.getClass(), "first", null);
        setField(term47377, term47377.getClass(), "last", null);
        setIntField(term47377, term47377.getClass(), "modCount", 0);
        term47383 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Piece");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term47383;
        callMethod(klass, "findLegalSquares", argTypes, term47377, args);
    }

};


