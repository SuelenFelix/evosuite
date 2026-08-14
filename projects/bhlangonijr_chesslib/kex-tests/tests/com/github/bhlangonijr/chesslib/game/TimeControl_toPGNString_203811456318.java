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

public class TimeControl_toPGNString_203811456318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113739;

    public TimeControl_toPGNString_203811456318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113740 = new ArrayList();
        Class<? extends Object> term113759 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term113758 = ((Class) term113759).getDeclaredField((String) "NODES");
        ((Field) term113758).setAccessible(true);
        Object enum356 = ((Field) term113758).get((Object) null);
        term113739 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term113739, term113739.getClass(), "movePerTime", term113740);
        setField(term113739, term113739.getClass(), "timeControlType", enum356);
        setIntField(term113739, term113739.getClass(), "halfMoves", -1397251956);
        setLongField(term113739, term113739.getClass(), "milliseconds", -8992404862613425105L);
        setLongField(term113739, term113739.getClass(), "increment", 3103198349031409063L);
        setIntField(term113739, term113739.getClass(), "depth", -796934571);
        setLongField(term113739, term113739.getClass(), "nodes", 753095050088595263L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPGNString", argTypes, term113739, args);
    }

};


