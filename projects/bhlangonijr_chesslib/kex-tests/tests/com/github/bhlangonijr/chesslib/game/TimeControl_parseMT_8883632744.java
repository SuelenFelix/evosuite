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

public class TimeControl_parseMT_8883632744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108886;

    public TimeControl_parseMT_8883632744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term108887 = new ArrayList();
        Class<? extends Object> term108924 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term108923 = ((Class) term108924).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term108923).setAccessible(true);
        Object enum341 = ((Field) term108923).get((Object) null);
        term108886 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term108886, term108886.getClass(), "movePerTime", term108887);
        setField(term108886, term108886.getClass(), "timeControlType", enum341);
        setIntField(term108886, term108886.getClass(), "halfMoves", 1053773809);
        setLongField(term108886, term108886.getClass(), "milliseconds", -1571034605670661708L);
        setLongField(term108886, term108886.getClass(), "increment", -7983954942068142191L);
        setIntField(term108886, term108886.getClass(), "depth", 924127883);
        setLongField(term108886, term108886.getClass(), "nodes", 2274723545906746965L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[2];
        args[0] = "esbhDGQDgF";
        args[1] = term108886;
        callMethod(klass, "parseMT", argTypes, null, args);
    }

};


