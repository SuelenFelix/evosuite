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

public class MoveList_createMoveListFrom_3176993669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47103;
     Object term47109;

    public MoveList_createMoveListFrom_3176993669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47103 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47103, term47103.getClass(), "startFEN", null);
        setBooleanField(term47103, term47103.getClass(), "dirty", false);
        setField(term47103, term47103.getClass(), "sanArray", null);
        setField(term47103, term47103.getClass(), "fanArray", null);
        setIntField(term47103, term47103.getClass(), "parent", 0);
        setIntField(term47103, term47103.getClass(), "index", 0);
        setIntField(term47103, term47103.getClass(), "size", 0);
        setField(term47103, term47103.getClass(), "first", null);
        setField(term47103, term47103.getClass(), "last", null);
        setIntField(term47103, term47103.getClass(), "modCount", 0);
        term47109 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term47109;
        callMethod(klass, "createMoveListFrom", argTypes, term47103, args);
    }

};


