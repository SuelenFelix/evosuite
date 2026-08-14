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

public class TimeControl_toString_177256252619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114040;

    public TimeControl_toString_177256252619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term114041 = new ArrayList();
        Class<? extends Object> term114060 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term114059 = ((Class) term114060).getDeclaredField((String) "NODES");
        ((Field) term114059).setAccessible(true);
        Object enum357 = ((Field) term114059).get((Object) null);
        term114040 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term114040, term114040.getClass(), "movePerTime", term114041);
        setField(term114040, term114040.getClass(), "timeControlType", enum357);
        setIntField(term114040, term114040.getClass(), "halfMoves", 405295896);
        setLongField(term114040, term114040.getClass(), "milliseconds", 3643973882575578879L);
        setLongField(term114040, term114040.getClass(), "increment", -1750555031444556464L);
        setIntField(term114040, term114040.getClass(), "depth", -814977075);
        setLongField(term114040, term114040.getClass(), "nodes", -3231440836116263235L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term114040, args);
    }

};


