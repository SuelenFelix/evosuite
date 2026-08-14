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
import java.lang.Integer;

public class TimeControl_setHalfMoves_10093990208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110483;
     Object term110511;

    public TimeControl_setHalfMoves_10093990208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term110484 = new ArrayList();
        Class<? extends Object> term110514 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term110513 = ((Class) term110514).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term110513).setAccessible(true);
        Object enum346 = ((Field) term110513).get((Object) null);
        term110483 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term110483, term110483.getClass(), "movePerTime", term110484);
        setField(term110483, term110483.getClass(), "timeControlType", enum346);
        setIntField(term110483, term110483.getClass(), "halfMoves", -763576148);
        setLongField(term110483, term110483.getClass(), "milliseconds", -8303973304709662279L);
        setLongField(term110483, term110483.getClass(), "increment", 6853972830905120647L);
        setIntField(term110483, term110483.getClass(), "depth", 1568948514);
        setLongField(term110483, term110483.getClass(), "nodes", 1442167273909860961L);
        term110511 = new Integer(-1511130237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term110511;
        callMethod(klass, "setHalfMoves", argTypes, term110483, args);
    }

};


