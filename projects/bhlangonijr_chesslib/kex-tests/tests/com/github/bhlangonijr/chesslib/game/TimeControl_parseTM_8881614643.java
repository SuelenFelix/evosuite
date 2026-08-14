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

public class TimeControl_parseTM_8881614643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108563;

    public TimeControl_parseTM_8881614643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term108564 = new ArrayList();
        Class<? extends Object> term108593 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term108592 = ((Class) term108593).getDeclaredField((String) "NODES");
        ((Field) term108592).setAccessible(true);
        Object enum340 = ((Field) term108592).get((Object) null);
        term108563 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term108563, term108563.getClass(), "movePerTime", term108564);
        setField(term108563, term108563.getClass(), "timeControlType", enum340);
        setIntField(term108563, term108563.getClass(), "halfMoves", -511077684);
        setLongField(term108563, term108563.getClass(), "milliseconds", -5587528177305224828L);
        setLongField(term108563, term108563.getClass(), "increment", 7950532649535587877L);
        setIntField(term108563, term108563.getClass(), "depth", -711507760);
        setLongField(term108563, term108563.getClass(), "nodes", 7799452759993694308L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[2];
        args[0] = "mvkMYcgAod";
        args[1] = term108563;
        callMethod(klass, "parseTM", argTypes, null, args);
    }

};


