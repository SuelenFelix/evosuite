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

public class TimeControl_getMilliseconds_14881331279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110822;

    public TimeControl_getMilliseconds_14881331279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term110823 = new ArrayList();
        Class<? extends Object> term110851 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term110850 = ((Class) term110851).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term110850).setAccessible(true);
        Object enum347 = ((Field) term110850).get((Object) null);
        term110822 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term110822, term110822.getClass(), "movePerTime", term110823);
        setField(term110822, term110822.getClass(), "timeControlType", enum347);
        setIntField(term110822, term110822.getClass(), "halfMoves", 452088587);
        setLongField(term110822, term110822.getClass(), "milliseconds", 6895382576300001141L);
        setLongField(term110822, term110822.getClass(), "increment", 9062006526792682783L);
        setIntField(term110822, term110822.getClass(), "depth", -1630069454);
        setLongField(term110822, term110822.getClass(), "nodes", -7400951017937830861L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMilliseconds", argTypes, term110822, args);
    }

};


