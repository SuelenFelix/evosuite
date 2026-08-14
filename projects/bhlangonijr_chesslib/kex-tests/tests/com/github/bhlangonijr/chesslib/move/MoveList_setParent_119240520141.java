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

public class MoveList_setParent_119240520141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47315;
     Object term47321;

    public MoveList_setParent_119240520141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47315 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47315, term47315.getClass(), "startFEN", null);
        setBooleanField(term47315, term47315.getClass(), "dirty", false);
        setField(term47315, term47315.getClass(), "sanArray", null);
        setField(term47315, term47315.getClass(), "fanArray", null);
        setIntField(term47315, term47315.getClass(), "parent", 0);
        setIntField(term47315, term47315.getClass(), "index", 0);
        setIntField(term47315, term47315.getClass(), "size", 0);
        setField(term47315, term47315.getClass(), "first", null);
        setField(term47315, term47315.getClass(), "last", null);
        setIntField(term47315, term47315.getClass(), "modCount", 0);
        term47321 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47321;
        callMethod(klass, "setParent", argTypes, term47315, args);
    }

};


