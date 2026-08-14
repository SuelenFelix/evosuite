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

public class Round_init_8194311970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30413;

    public Round_init_8194311970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30414 = new HashMap();
        Class<? extends Object> term30610 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term30609 = ((Class) term30610).getDeclaredField((String) "DOUBLE_ELIMINATION");
        ((Field) term30609).setAccessible(true);
        Object enum84 = ((Field) term30609).get((Object) null);
        ArrayList term30504 = new ArrayList();
        Class<? extends Object> term30931 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term30930 = ((Class) term30931).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term30930).setAccessible(true);
        Object enum85 = ((Field) term30930).get((Object) null);
        ArrayList term30531 = new ArrayList();
        Class<? extends Object> term31237 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term31236 = ((Class) term31237).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term31236).setAccessible(true);
        Object enum86 = ((Field) term31236).get((Object) null);
        HashMap term30556 = new HashMap();
        HashMap term30561 = new HashMap();
        ArrayList term30566 = new ArrayList();
        ArrayList term30570 = new ArrayList();
        Integer term30586 = new Integer(-1007160944);
        term30413 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term30503 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term30530 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term30555 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term30413, term30413.getClass(), "round", term30414);
        setField(term30413, term30413.getClass(), "id", "ZfdXfCCFDf");
        setField(term30413, term30413.getClass(), "name", "MwwjNtdOFT");
        setField(term30413, term30413.getClass(), "eventType", enum84);
        setField(term30413, term30413.getClass(), "startDate", "VYkqXKVlAJ");
        setField(term30413, term30413.getClass(), "endDate", "XkIoWJRNwN");
        setField(term30413, term30413.getClass(), "site", "aNWLJdrZMq");
        setLongField(term30413, term30413.getClass(), "timestamp", -8892586408602479513L);
        setIntField(term30413, term30413.getClass(), "rounds", 1386130016);
        setField(term30503, term30503.getClass(), "movePerTime", term30504);
        setField(term30503, term30503.getClass(), "timeControlType", enum85);
        setIntField(term30503, term30503.getClass(), "halfMoves", 1072005683);
        setLongField(term30503, term30503.getClass(), "milliseconds", 4616440478358528406L);
        setLongField(term30503, term30503.getClass(), "increment", 3427570961451840069L);
        setIntField(term30503, term30503.getClass(), "depth", 1861318859);
        setLongField(term30503, term30503.getClass(), "nodes", 4502292577098212311L);
        setField(term30413, term30413.getClass(), "timeControl", term30503);
        setField(term30530, term30530.getClass(), "movePerTime", term30531);
        setField(term30530, term30530.getClass(), "timeControlType", enum86);
        setIntField(term30530, term30530.getClass(), "halfMoves", 1474524152);
        setLongField(term30530, term30530.getClass(), "milliseconds", -3730936709704460408L);
        setLongField(term30530, term30530.getClass(), "increment", -8614778293741404325L);
        setIntField(term30530, term30530.getClass(), "depth", 568954359);
        setLongField(term30530, term30530.getClass(), "nodes", -5447369594017685765L);
        setField(term30413, term30413.getClass(), "timeControl2", term30530);
        setField(term30555, term30555.getClass(), "event", term30556);
        setField(term30555, term30555.getClass(), "player", term30561);
        setField(term30555, term30555.getClass(), "games", term30566);
        setField(term30555, term30555.getClass(), "listener", term30570);
        setField(term30555, term30555.getClass(), "fileName", "HHmNoYxIGj");
        setField(term30555, term30555.getClass(), "size", term30586);
        setBooleanField(term30555, term30555.getClass(), "lazyLoad", true);
        setField(term30413, term30413.getClass(), "pgnHolder", term30555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Round");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Object[] args = new Object[1];
        args[0] = term30413;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


