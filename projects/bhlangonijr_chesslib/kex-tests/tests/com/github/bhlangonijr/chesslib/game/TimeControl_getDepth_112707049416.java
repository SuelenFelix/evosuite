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

public class TimeControl_getDepth_112707049416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113079;

    public TimeControl_getDepth_112707049416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113080 = new ArrayList();
        Class<? extends Object> term113104 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term113103 = ((Class) term113104).getDeclaredField((String) "TIME_BONUS");
        ((Field) term113103).setAccessible(true);
        Object enum354 = ((Field) term113103).get((Object) null);
        term113079 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term113079, term113079.getClass(), "movePerTime", term113080);
        setField(term113079, term113079.getClass(), "timeControlType", enum354);
        setIntField(term113079, term113079.getClass(), "halfMoves", 2107679041);
        setLongField(term113079, term113079.getClass(), "milliseconds", 7487838449539103993L);
        setLongField(term113079, term113079.getClass(), "increment", 7010148136855890340L);
        setIntField(term113079, term113079.getClass(), "depth", 2040965507);
        setLongField(term113079, term113079.getClass(), "nodes", -6771377873268167033L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepth", argTypes, term113079, args);
    }

};


