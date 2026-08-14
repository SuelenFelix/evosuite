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

public class MoveList_encodeToFan_75411351550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47359;

    public MoveList_encodeToFan_75411351550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47359 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47359, term47359.getClass(), "startFEN", null);
        setBooleanField(term47359, term47359.getClass(), "dirty", false);
        setField(term47359, term47359.getClass(), "sanArray", null);
        setField(term47359, term47359.getClass(), "fanArray", null);
        setIntField(term47359, term47359.getClass(), "parent", 0);
        setIntField(term47359, term47359.getClass(), "index", 0);
        setIntField(term47359, term47359.getClass(), "size", 0);
        setField(term47359, term47359.getClass(), "first", null);
        setField(term47359, term47359.getClass(), "last", null);
        setIntField(term47359, term47359.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "encodeToFan", argTypes, term47359, args);
    }

};


