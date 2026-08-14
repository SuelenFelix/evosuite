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

public class MoveList_decodeSan_137280566136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47279;

    public MoveList_decodeSan_137280566136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47279 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47279, term47279.getClass(), "startFEN", null);
        setBooleanField(term47279, term47279.getClass(), "dirty", false);
        setField(term47279, term47279.getClass(), "sanArray", null);
        setField(term47279, term47279.getClass(), "fanArray", null);
        setIntField(term47279, term47279.getClass(), "parent", 0);
        setIntField(term47279, term47279.getClass(), "index", 0);
        setIntField(term47279, term47279.getClass(), "size", 0);
        setField(term47279, term47279.getClass(), "first", null);
        setField(term47279, term47279.getClass(), "last", null);
        setIntField(term47279, term47279.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Board");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "decodeSan", argTypes, term47279, args);
    }

};


