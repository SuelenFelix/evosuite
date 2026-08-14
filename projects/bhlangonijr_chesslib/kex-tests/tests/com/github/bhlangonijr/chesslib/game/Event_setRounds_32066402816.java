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

public class Event_setRounds_32066402816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16953;
     Object term17110;

    public Event_setRounds_32066402816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16954 = new HashMap();
        Class<? extends Object> term17133 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term17132 = ((Class) term17133).getDeclaredField((String) "GAUNTLET");
        ((Field) term17132).setAccessible(true);
        Object enum45 = ((Field) term17132).get((Object) null);
        ArrayList term17034 = new ArrayList();
        Class<? extends Object> term17424 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term17423 = ((Class) term17424).getDeclaredField((String) "NODES");
        ((Field) term17423).setAccessible(true);
        Object enum46 = ((Field) term17423).get((Object) null);
        ArrayList term17053 = new ArrayList();
        Class<? extends Object> term17706 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term17705 = ((Class) term17706).getDeclaredField((String) "TIME_BONUS");
        ((Field) term17705).setAccessible(true);
        Object enum47 = ((Field) term17705).get((Object) null);
        HashMap term17077 = new HashMap();
        HashMap term17082 = new HashMap();
        ArrayList term17087 = new ArrayList();
        ArrayList term17091 = new ArrayList();
        Integer term17107 = new Integer(597278769);
        term16953 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term17033 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term17052 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term17076 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term16953, term16953.getClass(), "round", term16954);
        setField(term16953, term16953.getClass(), "id", "DfISiziTgG");
        setField(term16953, term16953.getClass(), "name", "XqgfKFvPSD");
        setField(term16953, term16953.getClass(), "eventType", enum45);
        setField(term16953, term16953.getClass(), "startDate", "JiVRgTZvKc");
        setField(term16953, term16953.getClass(), "endDate", "XPKmummaqg");
        setField(term16953, term16953.getClass(), "site", "BKLfkLiZTH");
        setLongField(term16953, term16953.getClass(), "timestamp", 2354625302846375590L);
        setIntField(term16953, term16953.getClass(), "rounds", 1551099402);
        setField(term17033, term17033.getClass(), "movePerTime", term17034);
        setField(term17033, term17033.getClass(), "timeControlType", enum46);
        setIntField(term17033, term17033.getClass(), "halfMoves", -2027534003);
        setLongField(term17033, term17033.getClass(), "milliseconds", 7276637106827860087L);
        setLongField(term17033, term17033.getClass(), "increment", -3936701866695933852L);
        setIntField(term17033, term17033.getClass(), "depth", 1063420942);
        setLongField(term17033, term17033.getClass(), "nodes", 1215116475929634177L);
        setField(term16953, term16953.getClass(), "timeControl", term17033);
        setField(term17052, term17052.getClass(), "movePerTime", term17053);
        setField(term17052, term17052.getClass(), "timeControlType", enum47);
        setIntField(term17052, term17052.getClass(), "halfMoves", 1375330971);
        setLongField(term17052, term17052.getClass(), "milliseconds", 1597484336218508869L);
        setLongField(term17052, term17052.getClass(), "increment", -685023850445639859L);
        setIntField(term17052, term17052.getClass(), "depth", -478195677);
        setLongField(term17052, term17052.getClass(), "nodes", -6950146046121430355L);
        setField(term16953, term16953.getClass(), "timeControl2", term17052);
        setField(term17076, term17076.getClass(), "event", term17077);
        setField(term17076, term17076.getClass(), "player", term17082);
        setField(term17076, term17076.getClass(), "games", term17087);
        setField(term17076, term17076.getClass(), "listener", term17091);
        setField(term17076, term17076.getClass(), "fileName", "SPpkrGcPRr");
        setField(term17076, term17076.getClass(), "size", term17107);
        setBooleanField(term17076, term17076.getClass(), "lazyLoad", false);
        setField(term16953, term16953.getClass(), "pgnHolder", term17076);
        term17110 = new Integer(972867650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17110;
        callMethod(klass, "setRounds", argTypes, term16953, args);
    }

};


