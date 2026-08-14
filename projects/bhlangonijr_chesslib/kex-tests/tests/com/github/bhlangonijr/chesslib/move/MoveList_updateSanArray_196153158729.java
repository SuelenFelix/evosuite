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

public class MoveList_updateSanArray_196153158729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47233;

    public MoveList_updateSanArray_196153158729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47233 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47233, term47233.getClass(), "startFEN", null);
        setBooleanField(term47233, term47233.getClass(), "dirty", false);
        setField(term47233, term47233.getClass(), "sanArray", null);
        setField(term47233, term47233.getClass(), "fanArray", null);
        setIntField(term47233, term47233.getClass(), "parent", 0);
        setIntField(term47233, term47233.getClass(), "index", 0);
        setIntField(term47233, term47233.getClass(), "size", 0);
        setField(term47233, term47233.getClass(), "first", null);
        setField(term47233, term47233.getClass(), "last", null);
        setIntField(term47233, term47233.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateSanArray", argTypes, term47233, args);
    }

};


