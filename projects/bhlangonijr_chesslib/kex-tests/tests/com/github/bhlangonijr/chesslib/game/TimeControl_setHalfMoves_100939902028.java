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
import java.lang.Integer;

public class TimeControl_setHalfMoves_100939902028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114383;
     Object term114389;

    public TimeControl_setHalfMoves_100939902028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114383 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114383, term114383.getClass(), "movePerTime", null);
        setField(term114383, term114383.getClass(), "timeControlType", null);
        setIntField(term114383, term114383.getClass(), "halfMoves", 0);
        setLongField(term114383, term114383.getClass(), "milliseconds", 0L);
        setLongField(term114383, term114383.getClass(), "increment", 0L);
        setIntField(term114383, term114383.getClass(), "depth", 0);
        setLongField(term114383, term114383.getClass(), "nodes", 0L);
        term114389 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term114389;
        callMethod(klass, "setHalfMoves", argTypes, term114383, args);
    }

};


