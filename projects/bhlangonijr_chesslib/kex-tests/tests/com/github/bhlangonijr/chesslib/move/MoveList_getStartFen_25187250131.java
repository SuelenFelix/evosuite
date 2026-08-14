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

public class MoveList_getStartFen_25187250131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47245;

    public MoveList_getStartFen_25187250131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47245 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47245, term47245.getClass(), "startFEN", null);
        setBooleanField(term47245, term47245.getClass(), "dirty", false);
        setField(term47245, term47245.getClass(), "sanArray", null);
        setField(term47245, term47245.getClass(), "fanArray", null);
        setIntField(term47245, term47245.getClass(), "parent", 0);
        setIntField(term47245, term47245.getClass(), "index", 0);
        setIntField(term47245, term47245.getClass(), "size", 0);
        setField(term47245, term47245.getClass(), "first", null);
        setField(term47245, term47245.getClass(), "last", null);
        setIntField(term47245, term47245.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartFen", argTypes, term47245, args);
    }

};


