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

public class TimeControl_getHalfMoves_7587099307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110158;

    public TimeControl_getHalfMoves_7587099307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term110159 = new ArrayList();
        Class<? extends Object> term110184 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term110183 = ((Class) term110184).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term110183).setAccessible(true);
        Object enum345 = ((Field) term110183).get((Object) null);
        term110158 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term110158, term110158.getClass(), "movePerTime", term110159);
        setField(term110158, term110158.getClass(), "timeControlType", enum345);
        setIntField(term110158, term110158.getClass(), "halfMoves", -1632929393);
        setLongField(term110158, term110158.getClass(), "milliseconds", -3806202176947356197L);
        setLongField(term110158, term110158.getClass(), "increment", -5534222035915952617L);
        setIntField(term110158, term110158.getClass(), "depth", -431440129);
        setLongField(term110158, term110158.getClass(), "nodes", 8073378116544724166L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfMoves", argTypes, term110158, args);
    }

};


