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

public class TimeControl_setNodes_66758813834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114425;
     Object term114431;

    public TimeControl_setNodes_66758813834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114425 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114425, term114425.getClass(), "movePerTime", null);
        setField(term114425, term114425.getClass(), "timeControlType", null);
        setIntField(term114425, term114425.getClass(), "halfMoves", 0);
        setLongField(term114425, term114425.getClass(), "milliseconds", 0L);
        setLongField(term114425, term114425.getClass(), "increment", 0L);
        setIntField(term114425, term114425.getClass(), "depth", 0);
        setLongField(term114425, term114425.getClass(), "nodes", 0L);
        term114431 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term114431;
        callMethod(klass, "setNodes", argTypes, term114425, args);
    }

};


