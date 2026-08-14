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

public class TimeControl_setTimeControlType_26807418326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114371;

    public TimeControl_setTimeControlType_26807418326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114371 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114371, term114371.getClass(), "movePerTime", null);
        setField(term114371, term114371.getClass(), "timeControlType", null);
        setIntField(term114371, term114371.getClass(), "halfMoves", 0);
        setLongField(term114371, term114371.getClass(), "milliseconds", 0L);
        setLongField(term114371, term114371.getClass(), "increment", 0L);
        setIntField(term114371, term114371.getClass(), "depth", 0);
        setLongField(term114371, term114371.getClass(), "nodes", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControlType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTimeControlType", argTypes, term114371, args);
    }

};


