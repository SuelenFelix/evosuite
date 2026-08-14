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

public class TimeControl_getMovePerTime_118063137415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112774;

    public TimeControl_getMovePerTime_118063137415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112775 = new ArrayList();
        Class<? extends Object> term112795 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term112794 = ((Class) term112795).getDeclaredField((String) "UNKNOW");
        ((Field) term112794).setAccessible(true);
        Object enum353 = ((Field) term112794).get((Object) null);
        term112774 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term112774, term112774.getClass(), "movePerTime", term112775);
        setField(term112774, term112774.getClass(), "timeControlType", enum353);
        setIntField(term112774, term112774.getClass(), "halfMoves", 401203924);
        setLongField(term112774, term112774.getClass(), "milliseconds", 6077991958696417121L);
        setLongField(term112774, term112774.getClass(), "increment", -5004803270846838598L);
        setIntField(term112774, term112774.getClass(), "depth", -1212399479);
        setLongField(term112774, term112774.getClass(), "nodes", -8211859616692114655L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovePerTime", argTypes, term112774, args);
    }

};


