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

public class MoveList_add_210630449812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47125;
     Object term47131;

    public MoveList_add_210630449812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47125 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47125, term47125.getClass(), "startFEN", null);
        setBooleanField(term47125, term47125.getClass(), "dirty", false);
        setField(term47125, term47125.getClass(), "sanArray", null);
        setField(term47125, term47125.getClass(), "fanArray", null);
        setIntField(term47125, term47125.getClass(), "parent", 0);
        setIntField(term47125, term47125.getClass(), "index", 0);
        setIntField(term47125, term47125.getClass(), "size", 0);
        setField(term47125, term47125.getClass(), "first", null);
        setField(term47125, term47125.getClass(), "last", null);
        setIntField(term47125, term47125.getClass(), "modCount", 0);
        term47131 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[2];
        args[0] = term47131;
        args[1] = null;
        callMethod(klass, "add", argTypes, term47125, args);
    }

};


