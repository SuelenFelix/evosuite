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

public class Event_setTimeControl_79304243518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19141;
     Object term19307;

    public Event_setTimeControl_79304243518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19142 = new HashMap();
        Class<? extends Object> term19338 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term19337 = ((Class) term19338).getDeclaredField((String) "SWISS");
        ((Field) term19337).setAccessible(true);
        Object enum51 = ((Field) term19337).get((Object) null);
        ArrayList term19219 = new ArrayList();
        Class<? extends Object> term19620 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term19619 = ((Class) term19620).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term19619).setAccessible(true);
        Object enum52 = ((Field) term19619).get((Object) null);
        ArrayList term19246 = new ArrayList();
        Class<? extends Object> term19926 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term19925 = ((Class) term19926).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term19925).setAccessible(true);
        Object enum53 = ((Field) term19925).get((Object) null);
        HashMap term19274 = new HashMap();
        HashMap term19279 = new HashMap();
        ArrayList term19284 = new ArrayList();
        ArrayList term19288 = new ArrayList();
        Integer term19304 = new Integer(-1456670397);
        term19141 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term19218 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term19245 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term19273 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term19141, term19141.getClass(), "round", term19142);
        setField(term19141, term19141.getClass(), "id", "sEnIVFtZuQ");
        setField(term19141, term19141.getClass(), "name", "ZVecLZMLHF");
        setField(term19141, term19141.getClass(), "eventType", enum51);
        setField(term19141, term19141.getClass(), "startDate", "fztQhjqwdP");
        setField(term19141, term19141.getClass(), "endDate", "eVpkWxjuki");
        setField(term19141, term19141.getClass(), "site", "SJiQaLvSKv");
        setLongField(term19141, term19141.getClass(), "timestamp", 5671808784468963649L);
        setIntField(term19141, term19141.getClass(), "rounds", -1547384488);
        setField(term19218, term19218.getClass(), "movePerTime", term19219);
        setField(term19218, term19218.getClass(), "timeControlType", enum52);
        setIntField(term19218, term19218.getClass(), "halfMoves", 1442160736);
        setLongField(term19218, term19218.getClass(), "milliseconds", 2297097306706899827L);
        setLongField(term19218, term19218.getClass(), "increment", -900457279156388404L);
        setIntField(term19218, term19218.getClass(), "depth", 1114000454);
        setLongField(term19218, term19218.getClass(), "nodes", 1084801489398441516L);
        setField(term19141, term19141.getClass(), "timeControl", term19218);
        setField(term19245, term19245.getClass(), "movePerTime", term19246);
        setField(term19245, term19245.getClass(), "timeControlType", enum53);
        setIntField(term19245, term19245.getClass(), "halfMoves", -556405712);
        setLongField(term19245, term19245.getClass(), "milliseconds", 6273754186658578034L);
        setLongField(term19245, term19245.getClass(), "increment", 3620247240684476031L);
        setIntField(term19245, term19245.getClass(), "depth", -1772434990);
        setLongField(term19245, term19245.getClass(), "nodes", 8313800941204938919L);
        setField(term19141, term19141.getClass(), "timeControl2", term19245);
        setField(term19273, term19273.getClass(), "event", term19274);
        setField(term19273, term19273.getClass(), "player", term19279);
        setField(term19273, term19273.getClass(), "games", term19284);
        setField(term19273, term19273.getClass(), "listener", term19288);
        setField(term19273, term19273.getClass(), "fileName", "OEXDRUKcFl");
        setField(term19273, term19273.getClass(), "size", term19304);
        setBooleanField(term19273, term19273.getClass(), "lazyLoad", true);
        setField(term19141, term19141.getClass(), "pgnHolder", term19273);
        ArrayList term19308 = new ArrayList();
        term19307 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term19307, term19307.getClass(), "movePerTime", term19308);
        setField(term19307, term19307.getClass(), "timeControlType", enum52);
        setIntField(term19307, term19307.getClass(), "halfMoves", -1845499264);
        setLongField(term19307, term19307.getClass(), "milliseconds", -1214968196781083707L);
        setLongField(term19307, term19307.getClass(), "increment", -1804015692891701666L);
        setIntField(term19307, term19307.getClass(), "depth", -505439934);
        setLongField(term19307, term19307.getClass(), "nodes", -6432617521836576658L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[1];
        args[0] = term19307;
        callMethod(klass, "setTimeControl", argTypes, term19141, args);
    }

};


