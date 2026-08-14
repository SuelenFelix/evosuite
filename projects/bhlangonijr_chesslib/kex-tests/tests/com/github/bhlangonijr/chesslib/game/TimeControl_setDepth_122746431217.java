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
import java.lang.Integer;

public class TimeControl_setDepth_122746431217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113400;
     Object term113428;

    public TimeControl_setDepth_122746431217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113401 = new ArrayList();
        Class<? extends Object> term113431 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term113430 = ((Class) term113431).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term113430).setAccessible(true);
        Object enum355 = ((Field) term113430).get((Object) null);
        term113400 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term113400, term113400.getClass(), "movePerTime", term113401);
        setField(term113400, term113400.getClass(), "timeControlType", enum355);
        setIntField(term113400, term113400.getClass(), "halfMoves", -1281083262);
        setLongField(term113400, term113400.getClass(), "milliseconds", 1278107327214302894L);
        setLongField(term113400, term113400.getClass(), "increment", 3104349415269466587L);
        setIntField(term113400, term113400.getClass(), "depth", 1059930704);
        setLongField(term113400, term113400.getClass(), "nodes", -7423063312741500355L);
        term113428 = new Integer(-1967153290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term113428;
        callMethod(klass, "setDepth", argTypes, term113400, args);
    }

};


