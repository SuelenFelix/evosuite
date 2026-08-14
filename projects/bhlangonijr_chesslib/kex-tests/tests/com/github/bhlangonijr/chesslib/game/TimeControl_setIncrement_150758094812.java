package com.github.bhlangonijr.chesslib.game;

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
import static com.github.bhlangonijr.chesslib.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public class TimeControl_setIncrement_150758094812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111799;
     Object term111824;

    public TimeControl_setIncrement_150758094812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111800 = new ArrayList();
        Class<? extends Object> term111827 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term111826 = ((Class) term111827).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term111826).setAccessible(true);
        Object enum350 = ((Field) term111826).get((Object) null);
        term111799 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term111799, term111799.getClass(), "movePerTime", term111800);
        setField(term111799, term111799.getClass(), "timeControlType", enum350);
        setIntField(term111799, term111799.getClass(), "halfMoves", 1137154606);
        setLongField(term111799, term111799.getClass(), "milliseconds", -421166328269063791L);
        setLongField(term111799, term111799.getClass(), "increment", 4811527754205378980L);
        setIntField(term111799, term111799.getClass(), "depth", -100681578);
        setLongField(term111799, term111799.getClass(), "nodes", 9174730812791817537L);
        term111824 = new Long(8024477479047145752L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term111824;
        callMethod(klass, "setIncrement", argTypes, term111799, args);
    }

};


