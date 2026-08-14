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

public class TimeControl_setNodes_66758813814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112451;
     Object term112475;

    public TimeControl_setNodes_66758813814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112452 = new ArrayList();
        Class<? extends Object> term112478 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term112477 = ((Class) term112478).getDeclaredField((String) "TIME_BONUS");
        ((Field) term112477).setAccessible(true);
        Object enum352 = ((Field) term112477).get((Object) null);
        term112451 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term112451, term112451.getClass(), "movePerTime", term112452);
        setField(term112451, term112451.getClass(), "timeControlType", enum352);
        setIntField(term112451, term112451.getClass(), "halfMoves", -1608123016);
        setLongField(term112451, term112451.getClass(), "milliseconds", -2828343143039517941L);
        setLongField(term112451, term112451.getClass(), "increment", 2809748481176687920L);
        setIntField(term112451, term112451.getClass(), "depth", -896473214);
        setLongField(term112451, term112451.getClass(), "nodes", 4012955251407483889L);
        term112475 = new Long(-4058686252500969842L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term112475;
        callMethod(klass, "setNodes", argTypes, term112451, args);
    }

};


