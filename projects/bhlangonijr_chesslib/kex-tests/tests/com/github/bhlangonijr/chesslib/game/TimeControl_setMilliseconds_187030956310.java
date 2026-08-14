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

public class TimeControl_setMilliseconds_187030956310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111159;
     Object term111186;

    public TimeControl_setMilliseconds_187030956310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term111160 = new ArrayList();
        Class<? extends Object> term111189 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term111188 = ((Class) term111189).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term111188).setAccessible(true);
        Object enum348 = ((Field) term111188).get((Object) null);
        term111159 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term111159, term111159.getClass(), "movePerTime", term111160);
        setField(term111159, term111159.getClass(), "timeControlType", enum348);
        setIntField(term111159, term111159.getClass(), "halfMoves", 1499735894);
        setLongField(term111159, term111159.getClass(), "milliseconds", -8993073054427011802L);
        setLongField(term111159, term111159.getClass(), "increment", 2287785643837657068L);
        setIntField(term111159, term111159.getClass(), "depth", 716486048);
        setLongField(term111159, term111159.getClass(), "nodes", -7283193381993602128L);
        term111186 = new Long(6351887424140565471L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term111186;
        callMethod(klass, "setMilliseconds", argTypes, term111159, args);
    }

};


