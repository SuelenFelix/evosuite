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

public class TimeControl_getTimeControlType_20886046275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109229;

    public TimeControl_getTimeControlType_20886046275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term109230 = new ArrayList();
        Class<? extends Object> term109257 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term109256 = ((Class) term109257).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term109256).setAccessible(true);
        Object enum342 = ((Field) term109256).get((Object) null);
        term109229 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term109229, term109229.getClass(), "movePerTime", term109230);
        setField(term109229, term109229.getClass(), "timeControlType", enum342);
        setIntField(term109229, term109229.getClass(), "halfMoves", -751079123);
        setLongField(term109229, term109229.getClass(), "milliseconds", 1353683663053784647L);
        setLongField(term109229, term109229.getClass(), "increment", -1465819833800717311L);
        setIntField(term109229, term109229.getClass(), "depth", -110837188);
        setLongField(term109229, term109229.getClass(), "nodes", -8306611953768020559L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeControlType", argTypes, term109229, args);
    }

};


