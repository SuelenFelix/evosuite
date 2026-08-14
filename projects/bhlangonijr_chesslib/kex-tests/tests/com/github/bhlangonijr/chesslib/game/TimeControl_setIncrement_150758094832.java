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
import java.lang.Long;

public class TimeControl_setIncrement_150758094832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114411;
     Object term114417;

    public TimeControl_setIncrement_150758094832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114411 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114411, term114411.getClass(), "movePerTime", null);
        setField(term114411, term114411.getClass(), "timeControlType", null);
        setIntField(term114411, term114411.getClass(), "halfMoves", 0);
        setLongField(term114411, term114411.getClass(), "milliseconds", 0L);
        setLongField(term114411, term114411.getClass(), "increment", 0L);
        setIntField(term114411, term114411.getClass(), "depth", 0);
        setLongField(term114411, term114411.getClass(), "nodes", 0L);
        term114417 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term114417;
        callMethod(klass, "setIncrement", argTypes, term114411, args);
    }

};


