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

public class MoveList_add_210998944413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47133;

    public MoveList_add_210998944413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47133 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47133, term47133.getClass(), "startFEN", null);
        setBooleanField(term47133, term47133.getClass(), "dirty", false);
        setField(term47133, term47133.getClass(), "sanArray", null);
        setField(term47133, term47133.getClass(), "fanArray", null);
        setIntField(term47133, term47133.getClass(), "parent", 0);
        setIntField(term47133, term47133.getClass(), "index", 0);
        setIntField(term47133, term47133.getClass(), "size", 0);
        setField(term47133, term47133.getClass(), "first", null);
        setField(term47133, term47133.getClass(), "last", null);
        setIntField(term47133, term47133.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term47133, args);
    }

};


