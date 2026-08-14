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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Event_getEndDate_10510388159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9148;

    public Event_getEndDate_10510388159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9149 = new HashMap();
        Class<? extends Object> term9344 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term9343 = ((Class) term9344).getDeclaredField((String) "SINGLE_ELIMINATION");
        ((Field) term9343).setAccessible(true);
        Object enum24 = ((Field) term9343).get((Object) null);
        ArrayList term9239 = new ArrayList();
        Class<? extends Object> term9665 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term9664 = ((Class) term9665).getDeclaredField((String) "TIME_BONUS");
        ((Field) term9664).setAccessible(true);
        Object enum25 = ((Field) term9664).get((Object) null);
        ArrayList term9263 = new ArrayList();
        Class<? extends Object> term9962 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term9961 = ((Class) term9962).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term9961).setAccessible(true);
        Object enum26 = ((Field) term9961).get((Object) null);
        HashMap term9290 = new HashMap();
        HashMap term9295 = new HashMap();
        ArrayList term9300 = new ArrayList();
        ArrayList term9304 = new ArrayList();
        Integer term9320 = new Integer(1227103734);
        term9148 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term9238 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term9262 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term9289 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term9148, term9148.getClass(), "round", term9149);
        setField(term9148, term9148.getClass(), "id", "UiUYnPrcCi");
        setField(term9148, term9148.getClass(), "name", "UoYtihxVaS");
        setField(term9148, term9148.getClass(), "eventType", enum24);
        setField(term9148, term9148.getClass(), "startDate", "JDswTTCZHV");
        setField(term9148, term9148.getClass(), "endDate", "onpbIeEKoi");
        setField(term9148, term9148.getClass(), "site", "YRHGsAkhxb");
        setLongField(term9148, term9148.getClass(), "timestamp", -7738503207562305297L);
        setIntField(term9148, term9148.getClass(), "rounds", 1962444399);
        setField(term9238, term9238.getClass(), "movePerTime", term9239);
        setField(term9238, term9238.getClass(), "timeControlType", enum25);
        setIntField(term9238, term9238.getClass(), "halfMoves", 767834723);
        setLongField(term9238, term9238.getClass(), "milliseconds", 3825396310311739952L);
        setLongField(term9238, term9238.getClass(), "increment", -3838084482494604218L);
        setIntField(term9238, term9238.getClass(), "depth", -602026508);
        setLongField(term9238, term9238.getClass(), "nodes", 3892018155439224435L);
        setField(term9148, term9148.getClass(), "timeControl", term9238);
        setField(term9262, term9262.getClass(), "movePerTime", term9263);
        setField(term9262, term9262.getClass(), "timeControlType", enum26);
        setIntField(term9262, term9262.getClass(), "halfMoves", -157887805);
        setLongField(term9262, term9262.getClass(), "milliseconds", 5953383087795962419L);
        setLongField(term9262, term9262.getClass(), "increment", 7994303628307559416L);
        setIntField(term9262, term9262.getClass(), "depth", 1876565163);
        setLongField(term9262, term9262.getClass(), "nodes", 2443640364875054177L);
        setField(term9148, term9148.getClass(), "timeControl2", term9262);
        setField(term9289, term9289.getClass(), "event", term9290);
        setField(term9289, term9289.getClass(), "player", term9295);
        setField(term9289, term9289.getClass(), "games", term9300);
        setField(term9289, term9289.getClass(), "listener", term9304);
        setField(term9289, term9289.getClass(), "fileName", "ffYhPOzlUs");
        setField(term9289, term9289.getClass(), "size", term9320);
        setBooleanField(term9289, term9289.getClass(), "lazyLoad", false);
        setField(term9148, term9148.getClass(), "pgnHolder", term9289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndDate", argTypes, term9148, args);
    }

};


