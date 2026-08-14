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

public class Event_getTimeControl2_127627963519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20244;

    public Event_getTimeControl2_127627963519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20245 = new HashMap();
        Class<? extends Object> term20429 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term20428 = ((Class) term20429).getDeclaredField((String) "ROUND_ROBIN");
        ((Field) term20428).setAccessible(true);
        Object enum54 = ((Field) term20428).get((Object) null);
        ArrayList term20328 = new ArrayList();
        Class<? extends Object> term20729 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term20728 = ((Class) term20729).getDeclaredField((String) "UNKNOW");
        ((Field) term20728).setAccessible(true);
        Object enum55 = ((Field) term20728).get((Object) null);
        ArrayList term20348 = new ArrayList();
        Class<? extends Object> term21014 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term21013 = ((Class) term21014).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term21013).setAccessible(true);
        Object enum56 = ((Field) term21013).get((Object) null);
        HashMap term20375 = new HashMap();
        HashMap term20380 = new HashMap();
        ArrayList term20385 = new ArrayList();
        ArrayList term20389 = new ArrayList();
        Integer term20405 = new Integer(1622346318);
        term20244 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term20327 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term20347 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term20374 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term20244, term20244.getClass(), "round", term20245);
        setField(term20244, term20244.getClass(), "id", "RYdKCNNMBR");
        setField(term20244, term20244.getClass(), "name", "yGtHPyvYiQ");
        setField(term20244, term20244.getClass(), "eventType", enum54);
        setField(term20244, term20244.getClass(), "startDate", "MvRIxilFMJ");
        setField(term20244, term20244.getClass(), "endDate", "iNwOJRBEjp");
        setField(term20244, term20244.getClass(), "site", "XylxrMBraH");
        setLongField(term20244, term20244.getClass(), "timestamp", -2255965562447970862L);
        setIntField(term20244, term20244.getClass(), "rounds", -344842608);
        setField(term20327, term20327.getClass(), "movePerTime", term20328);
        setField(term20327, term20327.getClass(), "timeControlType", enum55);
        setIntField(term20327, term20327.getClass(), "halfMoves", 941650513);
        setLongField(term20327, term20327.getClass(), "milliseconds", 148047808219672941L);
        setLongField(term20327, term20327.getClass(), "increment", 7489064039921396098L);
        setIntField(term20327, term20327.getClass(), "depth", 444029505);
        setLongField(term20327, term20327.getClass(), "nodes", 6843866297465638866L);
        setField(term20244, term20244.getClass(), "timeControl", term20327);
        setField(term20347, term20347.getClass(), "movePerTime", term20348);
        setField(term20347, term20347.getClass(), "timeControlType", enum56);
        setIntField(term20347, term20347.getClass(), "halfMoves", -1034506028);
        setLongField(term20347, term20347.getClass(), "milliseconds", -4023935540989049732L);
        setLongField(term20347, term20347.getClass(), "increment", 855932984568615096L);
        setIntField(term20347, term20347.getClass(), "depth", -1263114719);
        setLongField(term20347, term20347.getClass(), "nodes", -1616722610139554082L);
        setField(term20244, term20244.getClass(), "timeControl2", term20347);
        setField(term20374, term20374.getClass(), "event", term20375);
        setField(term20374, term20374.getClass(), "player", term20380);
        setField(term20374, term20374.getClass(), "games", term20385);
        setField(term20374, term20374.getClass(), "listener", term20389);
        setField(term20374, term20374.getClass(), "fileName", "pORebkoRdD");
        setField(term20374, term20374.getClass(), "size", term20405);
        setBooleanField(term20374, term20374.getClass(), "lazyLoad", false);
        setField(term20244, term20244.getClass(), "pgnHolder", term20374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeControl2", argTypes, term20244, args);
    }

};


