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

public class MoveList_addCheckFlag_213497275952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47371;

    public MoveList_addCheckFlag_213497275952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47371 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47371, term47371.getClass(), "startFEN", null);
        setBooleanField(term47371, term47371.getClass(), "dirty", false);
        setField(term47371, term47371.getClass(), "sanArray", null);
        setField(term47371, term47371.getClass(), "fanArray", null);
        setIntField(term47371, term47371.getClass(), "parent", 0);
        setIntField(term47371, term47371.getClass(), "index", 0);
        setIntField(term47371, term47371.getClass(), "size", 0);
        setField(term47371, term47371.getClass(), "first", null);
        setField(term47371, term47371.getClass(), "last", null);
        setIntField(term47371, term47371.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addCheckFlag", argTypes, term47371, args);
    }

};


