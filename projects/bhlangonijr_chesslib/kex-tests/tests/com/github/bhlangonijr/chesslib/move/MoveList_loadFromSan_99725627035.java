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

public class MoveList_loadFromSan_99725627035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47273;

    public MoveList_loadFromSan_99725627035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47273 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47273, term47273.getClass(), "startFEN", null);
        setBooleanField(term47273, term47273.getClass(), "dirty", false);
        setField(term47273, term47273.getClass(), "sanArray", null);
        setField(term47273, term47273.getClass(), "fanArray", null);
        setIntField(term47273, term47273.getClass(), "parent", 0);
        setIntField(term47273, term47273.getClass(), "index", 0);
        setIntField(term47273, term47273.getClass(), "size", 0);
        setField(term47273, term47273.getClass(), "first", null);
        setField(term47273, term47273.getClass(), "last", null);
        setIntField(term47273, term47273.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadFromSan", argTypes, term47273, args);
    }

};


