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

public class MoveList_toFan_96802228223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47197;

    public MoveList_toFan_96802228223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47197 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.move.MoveList"));
        setField(term47197, term47197.getClass(), "startFEN", null);
        setBooleanField(term47197, term47197.getClass(), "dirty", false);
        setField(term47197, term47197.getClass(), "sanArray", null);
        setField(term47197, term47197.getClass(), "fanArray", null);
        setIntField(term47197, term47197.getClass(), "parent", 0);
        setIntField(term47197, term47197.getClass(), "index", 0);
        setIntField(term47197, term47197.getClass(), "size", 0);
        setField(term47197, term47197.getClass(), "first", null);
        setField(term47197, term47197.getClass(), "last", null);
        setIntField(term47197, term47197.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toFan", argTypes, term47197, args);
    }

};


