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

public class TimeControl_getTimeControlType_208860462725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114365;

    public TimeControl_getTimeControlType_208860462725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114365 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114365, term114365.getClass(), "movePerTime", null);
        setField(term114365, term114365.getClass(), "timeControlType", null);
        setIntField(term114365, term114365.getClass(), "halfMoves", 0);
        setLongField(term114365, term114365.getClass(), "milliseconds", 0L);
        setLongField(term114365, term114365.getClass(), "increment", 0L);
        setIntField(term114365, term114365.getClass(), "depth", 0);
        setLongField(term114365, term114365.getClass(), "nodes", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeControlType", argTypes, term114365, args);
    }

};


