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
import java.lang.Boolean;

public class MoveList_addSanMove_51561502234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47263;
     Object term47269;
     Object term47271;

    public MoveList_addSanMove_51561502234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47263 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47263, term47263.getClass(), "startFEN", null);
        setBooleanField(term47263, term47263.getClass(), "dirty", false);
        setField(term47263, term47263.getClass(), "sanArray", null);
        setField(term47263, term47263.getClass(), "fanArray", null);
        setIntField(term47263, term47263.getClass(), "parent", 0);
        setIntField(term47263, term47263.getClass(), "index", 0);
        setIntField(term47263, term47263.getClass(), "size", 0);
        setField(term47263, term47263.getClass(), "first", null);
        setField(term47263, term47263.getClass(), "last", null);
        setIntField(term47263, term47263.getClass(), "modCount", 0);
        term47269 = new Boolean(false);
        term47271 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term47269;
        args[2] = term47271;
        callMethod(klass, "addSanMove", argTypes, term47263, args);
    }

};


