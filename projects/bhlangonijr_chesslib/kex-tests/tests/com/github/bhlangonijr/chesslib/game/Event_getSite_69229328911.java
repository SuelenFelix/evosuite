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

public class Event_getSite_69229328911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11376;

    public Event_getSite_69229328911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11377 = new HashMap();
        Class<? extends Object> term11559 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term11558 = ((Class) term11559).getDeclaredField((String) "ANALYSES");
        ((Field) term11558).setAccessible(true);
        Object enum30 = ((Field) term11558).get((Object) null);
        ArrayList term11457 = new ArrayList();
        Class<? extends Object> term11850 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term11849 = ((Class) term11850).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term11849).setAccessible(true);
        Object enum31 = ((Field) term11849).get((Object) null);
        ArrayList term11485 = new ArrayList();
        Class<? extends Object> term12159 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term12158 = ((Class) term12159).getDeclaredField((String) "UNKNOW");
        ((Field) term12158).setAccessible(true);
        Object enum32 = ((Field) term12158).get((Object) null);
        HashMap term11505 = new HashMap();
        HashMap term11510 = new HashMap();
        ArrayList term11515 = new ArrayList();
        ArrayList term11519 = new ArrayList();
        Integer term11535 = new Integer(1725571209);
        term11376 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term11456 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term11484 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term11504 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term11376, term11376.getClass(), "round", term11377);
        setField(term11376, term11376.getClass(), "id", "fhkbdRViHi");
        setField(term11376, term11376.getClass(), "name", "uWHnvSvaPl");
        setField(term11376, term11376.getClass(), "eventType", enum30);
        setField(term11376, term11376.getClass(), "startDate", "kBdSllIBVz");
        setField(term11376, term11376.getClass(), "endDate", "TJmVBGfTML");
        setField(term11376, term11376.getClass(), "site", "tPlsykYBqO");
        setLongField(term11376, term11376.getClass(), "timestamp", -5248475803419977214L);
        setIntField(term11376, term11376.getClass(), "rounds", 1632125673);
        setField(term11456, term11456.getClass(), "movePerTime", term11457);
        setField(term11456, term11456.getClass(), "timeControlType", enum31);
        setIntField(term11456, term11456.getClass(), "halfMoves", 454281060);
        setLongField(term11456, term11456.getClass(), "milliseconds", -6723783499250797216L);
        setLongField(term11456, term11456.getClass(), "increment", 41775768178052008L);
        setIntField(term11456, term11456.getClass(), "depth", -1786399638);
        setLongField(term11456, term11456.getClass(), "nodes", 6682528376118987775L);
        setField(term11376, term11376.getClass(), "timeControl", term11456);
        setField(term11484, term11484.getClass(), "movePerTime", term11485);
        setField(term11484, term11484.getClass(), "timeControlType", enum32);
        setIntField(term11484, term11484.getClass(), "halfMoves", 2055867847);
        setLongField(term11484, term11484.getClass(), "milliseconds", 682356318767179819L);
        setLongField(term11484, term11484.getClass(), "increment", -7291743527973326814L);
        setIntField(term11484, term11484.getClass(), "depth", -1048298087);
        setLongField(term11484, term11484.getClass(), "nodes", -5963439350418910964L);
        setField(term11376, term11376.getClass(), "timeControl2", term11484);
        setField(term11504, term11504.getClass(), "event", term11505);
        setField(term11504, term11504.getClass(), "player", term11510);
        setField(term11504, term11504.getClass(), "games", term11515);
        setField(term11504, term11504.getClass(), "listener", term11519);
        setField(term11504, term11504.getClass(), "fileName", "bLPjGVBhlX");
        setField(term11504, term11504.getClass(), "size", term11535);
        setBooleanField(term11504, term11504.getClass(), "lazyLoad", false);
        setField(term11376, term11376.getClass(), "pgnHolder", term11504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSite", argTypes, term11376, args);
    }

};


