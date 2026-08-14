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

public class MoveList_encodeToSan_76611928849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47353;

    public MoveList_encodeToSan_76611928849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47353 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47353, term47353.getClass(), "startFEN", null);
        setBooleanField(term47353, term47353.getClass(), "dirty", false);
        setField(term47353, term47353.getClass(), "sanArray", null);
        setField(term47353, term47353.getClass(), "fanArray", null);
        setIntField(term47353, term47353.getClass(), "parent", 0);
        setIntField(term47353, term47353.getClass(), "index", 0);
        setIntField(term47353, term47353.getClass(), "size", 0);
        setField(term47353, term47353.getClass(), "first", null);
        setField(term47353, term47353.getClass(), "last", null);
        setIntField(term47353, term47353.getClass(), "modCount", 0);
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
        callMethod(klass, "encodeToSan", argTypes, term47353, args);
    }

};


