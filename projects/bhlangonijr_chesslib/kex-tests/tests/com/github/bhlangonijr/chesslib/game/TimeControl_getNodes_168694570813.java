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

public class TimeControl_getNodes_168694570813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112126;

    public TimeControl_getNodes_168694570813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112127 = new ArrayList();
        Class<? extends Object> term112152 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term112151 = ((Class) term112152).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term112151).setAccessible(true);
        Object enum351 = ((Field) term112151).get((Object) null);
        term112126 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term112126, term112126.getClass(), "movePerTime", term112127);
        setField(term112126, term112126.getClass(), "timeControlType", enum351);
        setIntField(term112126, term112126.getClass(), "halfMoves", 296568835);
        setLongField(term112126, term112126.getClass(), "milliseconds", 7006402814669334483L);
        setLongField(term112126, term112126.getClass(), "increment", -4003544865306793676L);
        setIntField(term112126, term112126.getClass(), "depth", 1431951992);
        setLongField(term112126, term112126.getClass(), "nodes", -769824408235898287L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodes", argTypes, term112126, args);
    }

};


