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

public class TimeControl_setTimeControlType_2680741836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109562;
     Object enum344;

    public TimeControl_setTimeControlType_2680741836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term109563 = new ArrayList();
        Class<? extends Object> term109592 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term109591 = ((Class) term109592).getDeclaredField((String) "UNKNOW");
        ((Field) term109591).setAccessible(true);
        Object enum343 = ((Field) term109591).get((Object) null);
        term109562 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term109562, term109562.getClass(), "movePerTime", term109563);
        setField(term109562, term109562.getClass(), "timeControlType", enum343);
        setIntField(term109562, term109562.getClass(), "halfMoves", -271094506);
        setLongField(term109562, term109562.getClass(), "milliseconds", -8692119547314358088L);
        setLongField(term109562, term109562.getClass(), "increment", -2083524977884307536L);
        setIntField(term109562, term109562.getClass(), "depth", 455632030);
        setLongField(term109562, term109562.getClass(), "nodes", -2691996476200751382L);
        Class<? extends Object> term109877 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term109876 = ((Class) term109877).getDeclaredField((String) "NODES");
        ((Field) term109876).setAccessible(true);
        enum344 = ((Field) term109876).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControlType");
        Object[] args = new Object[1];
        args[0] = enum344;
        callMethod(klass, "setTimeControlType", argTypes, term109562, args);
    }

};


