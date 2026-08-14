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

public class Event_getEventType_20811103275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4696;

    public Event_getEventType_20811103275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4697 = new HashMap();
        Class<? extends Object> term4868 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term4867 = ((Class) term4868).getDeclaredField((String) "GAUNTLET");
        ((Field) term4867).setAccessible(true);
        Object enum12 = ((Field) term4867).get((Object) null);
        ArrayList term4777 = new ArrayList();
        Class<? extends Object> term5159 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term5158 = ((Class) term5159).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term5158).setAccessible(true);
        Object enum13 = ((Field) term5158).get((Object) null);
        ArrayList term4804 = new ArrayList();
        HashMap term4814 = new HashMap();
        HashMap term4819 = new HashMap();
        ArrayList term4824 = new ArrayList();
        ArrayList term4828 = new ArrayList();
        Integer term4844 = new Integer(-1922583790);
        term4696 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term4776 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term4803 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term4813 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term4696, term4696.getClass(), "round", term4697);
        setField(term4696, term4696.getClass(), "id", "flxyYxBRtu");
        setField(term4696, term4696.getClass(), "name", "OclPbYPkcH");
        setField(term4696, term4696.getClass(), "eventType", enum12);
        setField(term4696, term4696.getClass(), "startDate", "IoAlmYsBwc");
        setField(term4696, term4696.getClass(), "endDate", "TEParAifyi");
        setField(term4696, term4696.getClass(), "site", "OWDIEULEFu");
        setLongField(term4696, term4696.getClass(), "timestamp", 1967728129628047933L);
        setIntField(term4696, term4696.getClass(), "rounds", -655067527);
        setField(term4776, term4776.getClass(), "movePerTime", term4777);
        setField(term4776, term4776.getClass(), "timeControlType", enum13);
        setIntField(term4776, term4776.getClass(), "halfMoves", -6029667);
        setLongField(term4776, term4776.getClass(), "milliseconds", 2120084523938730454L);
        setLongField(term4776, term4776.getClass(), "increment", 6855071767938501807L);
        setIntField(term4776, term4776.getClass(), "depth", -2068769794);
        setLongField(term4776, term4776.getClass(), "nodes", -5892135042702373494L);
        setField(term4696, term4696.getClass(), "timeControl", term4776);
        setField(term4803, term4803.getClass(), "movePerTime", term4804);
        setField(term4803, term4803.getClass(), "timeControlType", enum13);
        setIntField(term4803, term4803.getClass(), "halfMoves", -117576464);
        setLongField(term4803, term4803.getClass(), "milliseconds", 5262507301787091109L);
        setLongField(term4803, term4803.getClass(), "increment", -6823727938421990489L);
        setIntField(term4803, term4803.getClass(), "depth", -1007160944);
        setLongField(term4803, term4803.getClass(), "nodes", -484994522244390100L);
        setField(term4696, term4696.getClass(), "timeControl2", term4803);
        setField(term4813, term4813.getClass(), "event", term4814);
        setField(term4813, term4813.getClass(), "player", term4819);
        setField(term4813, term4813.getClass(), "games", term4824);
        setField(term4813, term4813.getClass(), "listener", term4828);
        setField(term4813, term4813.getClass(), "fileName", "dWRymuLBtr");
        setField(term4813, term4813.getClass(), "size", term4844);
        setBooleanField(term4813, term4813.getClass(), "lazyLoad", true);
        setField(term4696, term4696.getClass(), "pgnHolder", term4813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventType", argTypes, term4696, args);
    }

};


