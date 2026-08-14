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

public class Event_setId_4774513072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;

    public Event_setId_4774513072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1310 = new HashMap();
        Class<? extends Object> term1515 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term1514 = ((Class) term1515).getDeclaredField((String) "ROUND_ROBIN_CAROUSEL");
        ((Field) term1514).setAccessible(true);
        Object enum3 = ((Field) term1514).get((Object) null);
        ArrayList term1402 = new ArrayList();
        Class<? extends Object> term1842 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term1841 = ((Class) term1842).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term1841).setAccessible(true);
        Object enum4 = ((Field) term1841).get((Object) null);
        ArrayList term1430 = new ArrayList();
        Class<? extends Object> term2151 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term2150 = ((Class) term2151).getDeclaredField((String) "NODES");
        ((Field) term2150).setAccessible(true);
        Object enum5 = ((Field) term2150).get((Object) null);
        HashMap term1449 = new HashMap();
        HashMap term1454 = new HashMap();
        ArrayList term1459 = new ArrayList();
        ArrayList term1463 = new ArrayList();
        Integer term1479 = new Integer(1162663216);
        term1309 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term1401 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term1429 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term1448 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term1309, term1309.getClass(), "round", term1310);
        setField(term1309, term1309.getClass(), "id", "SzjVpOQTyS");
        setField(term1309, term1309.getClass(), "name", "MjGYSRKTNF");
        setField(term1309, term1309.getClass(), "eventType", enum3);
        setField(term1309, term1309.getClass(), "startDate", "hRNSzYYIrc");
        setField(term1309, term1309.getClass(), "endDate", "RMFIsYGgne");
        setField(term1309, term1309.getClass(), "site", "NRdvgJlhkX");
        setLongField(term1309, term1309.getClass(), "timestamp", 6811161968424632369L);
        setIntField(term1309, term1309.getClass(), "rounds", -616727354);
        setField(term1401, term1401.getClass(), "movePerTime", term1402);
        setField(term1401, term1401.getClass(), "timeControlType", enum4);
        setIntField(term1401, term1401.getClass(), "halfMoves", -1955890973);
        setLongField(term1401, term1401.getClass(), "milliseconds", -7237588299778557629L);
        setLongField(term1401, term1401.getClass(), "increment", 6967924379644551255L);
        setIntField(term1401, term1401.getClass(), "depth", -2038273078);
        setLongField(term1401, term1401.getClass(), "nodes", -2813493605142626659L);
        setField(term1309, term1309.getClass(), "timeControl", term1401);
        setField(term1429, term1429.getClass(), "movePerTime", term1430);
        setField(term1429, term1429.getClass(), "timeControlType", enum5);
        setIntField(term1429, term1429.getClass(), "halfMoves", 1227103734);
        setLongField(term1429, term1429.getClass(), "milliseconds", -8885298608300233488L);
        setLongField(term1429, term1429.getClass(), "increment", -4325723315152823407L);
        setIntField(term1429, term1429.getClass(), "depth", -1339778481);
        setLongField(term1429, term1429.getClass(), "nodes", 2535595959091595249L);
        setField(term1309, term1309.getClass(), "timeControl2", term1429);
        setField(term1448, term1448.getClass(), "event", term1449);
        setField(term1448, term1448.getClass(), "player", term1454);
        setField(term1448, term1448.getClass(), "games", term1459);
        setField(term1448, term1448.getClass(), "listener", term1463);
        setField(term1448, term1448.getClass(), "fileName", "uuaPigETmJ");
        setField(term1448, term1448.getClass(), "size", term1479);
        setBooleanField(term1448, term1448.getClass(), "lazyLoad", false);
        setField(term1309, term1309.getClass(), "pgnHolder", term1448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "setId", argTypes, term1309, args);
    }

};


