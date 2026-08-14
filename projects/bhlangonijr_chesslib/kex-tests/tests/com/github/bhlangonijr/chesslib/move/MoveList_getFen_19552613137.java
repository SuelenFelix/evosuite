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

public class MoveList_getFen_19552613137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47285;
     Object term47291;

    public MoveList_getFen_19552613137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47285 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47285, term47285.getClass(), "startFEN", null);
        setBooleanField(term47285, term47285.getClass(), "dirty", false);
        setField(term47285, term47285.getClass(), "sanArray", null);
        setField(term47285, term47285.getClass(), "fanArray", null);
        setIntField(term47285, term47285.getClass(), "parent", 0);
        setIntField(term47285, term47285.getClass(), "index", 0);
        setIntField(term47285, term47285.getClass(), "size", 0);
        setField(term47285, term47285.getClass(), "first", null);
        setField(term47285, term47285.getClass(), "last", null);
        setIntField(term47285, term47285.getClass(), "modCount", 0);
        term47291 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term47291;
        callMethod(klass, "getFen", argTypes, term47285, args);
    }

};


