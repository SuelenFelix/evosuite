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

public class TimeControl_getIncrement_101927835811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111494;

    public TimeControl_getIncrement_101927835811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111495 = new ArrayList();
        Class<? extends Object> term111515 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term111514 = ((Class) term111515).getDeclaredField((String) "UNKNOW");
        ((Field) term111514).setAccessible(true);
        Object enum349 = ((Field) term111514).get((Object) null);
        term111494 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term111494, term111494.getClass(), "movePerTime", term111495);
        setField(term111494, term111494.getClass(), "timeControlType", enum349);
        setIntField(term111494, term111494.getClass(), "halfMoves", -466708718);
        setLongField(term111494, term111494.getClass(), "milliseconds", 6273670659288205855L);
        setLongField(term111494, term111494.getClass(), "increment", -4776514981294468834L);
        setIntField(term111494, term111494.getClass(), "depth", 1038029515);
        setLongField(term111494, term111494.getClass(), "nodes", -7273680182770718108L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIncrement", argTypes, term111494, args);
    }

};


