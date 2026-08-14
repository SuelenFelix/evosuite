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
import java.lang.Integer;

public class MoveList_addAll_28997780715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47145;
     Object term47151;

    public MoveList_addAll_28997780715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47145 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47145, term47145.getClass(), "startFEN", null);
        setBooleanField(term47145, term47145.getClass(), "dirty", false);
        setField(term47145, term47145.getClass(), "sanArray", null);
        setField(term47145, term47145.getClass(), "fanArray", null);
        setIntField(term47145, term47145.getClass(), "parent", 0);
        setIntField(term47145, term47145.getClass(), "index", 0);
        setIntField(term47145, term47145.getClass(), "size", 0);
        setField(term47145, term47145.getClass(), "first", null);
        setField(term47145, term47145.getClass(), "last", null);
        setIntField(term47145, term47145.getClass(), "modCount", 0);
        term47151 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Collection");
        Object[] args = new Object[2];
        args[0] = term47151;
        args[1] = null;
        callMethod(klass, "addAll", argTypes, term47145, args);
    }

};


