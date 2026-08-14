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

public class TimeControl_parseTC_88817107422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114347;

    public TimeControl_parseTC_88817107422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114347 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114347, term114347.getClass(), "movePerTime", null);
        setField(term114347, term114347.getClass(), "timeControlType", null);
        setIntField(term114347, term114347.getClass(), "halfMoves", 0);
        setLongField(term114347, term114347.getClass(), "milliseconds", 0L);
        setLongField(term114347, term114347.getClass(), "increment", 0L);
        setIntField(term114347, term114347.getClass(), "depth", 0);
        setLongField(term114347, term114347.getClass(), "nodes", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseTC", argTypes, term114347, args);
    }

};


