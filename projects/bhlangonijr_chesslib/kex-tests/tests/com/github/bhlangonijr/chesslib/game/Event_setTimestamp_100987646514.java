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
import java.lang.Long;

public class Event_setTimestamp_100987646514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14745;
     Object term14918;

    public Event_setTimestamp_100987646514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14746 = new HashMap();
        Class<? extends Object> term14941 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term14940 = ((Class) term14941).getDeclaredField((String) "ROUND_ROBIN_CAROUSEL");
        ((Field) term14940).setAccessible(true);
        Object enum39 = ((Field) term14940).get((Object) null);
        ArrayList term14838 = new ArrayList();
        Class<? extends Object> term15268 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term15267 = ((Class) term15268).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term15267).setAccessible(true);
        Object enum40 = ((Field) term15267).get((Object) null);
        ArrayList term14865 = new ArrayList();
        Class<? extends Object> term15574 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term15573 = ((Class) term15574).getDeclaredField((String) "UNKNOW");
        ((Field) term15573).setAccessible(true);
        Object enum41 = ((Field) term15573).get((Object) null);
        HashMap term14885 = new HashMap();
        HashMap term14890 = new HashMap();
        ArrayList term14895 = new ArrayList();
        ArrayList term14899 = new ArrayList();
        Integer term14915 = new Integer(-883034806);
        term14745 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term14837 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term14864 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term14884 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term14745, term14745.getClass(), "round", term14746);
        setField(term14745, term14745.getClass(), "id", "bWWfajKbEX");
        setField(term14745, term14745.getClass(), "name", "cAPeiZHKGJ");
        setField(term14745, term14745.getClass(), "eventType", enum39);
        setField(term14745, term14745.getClass(), "startDate", "LvJFtLBaxj");
        setField(term14745, term14745.getClass(), "endDate", "PHvxnGHptP");
        setField(term14745, term14745.getClass(), "site", "TimdotUuNC");
        setLongField(term14745, term14745.getClass(), "timestamp", 5836128569274066678L);
        setIntField(term14745, term14745.getClass(), "rounds", 1324040357);
        setField(term14837, term14837.getClass(), "movePerTime", term14838);
        setField(term14837, term14837.getClass(), "timeControlType", enum40);
        setIntField(term14837, term14837.getClass(), "halfMoves", -1588772968);
        setLongField(term14837, term14837.getClass(), "milliseconds", -2177368829816872572L);
        setLongField(term14837, term14837.getClass(), "increment", -8463029266761149071L);
        setIntField(term14837, term14837.getClass(), "depth", -93135961);
        setLongField(term14837, term14837.getClass(), "nodes", 3133860696238261492L);
        setField(term14745, term14745.getClass(), "timeControl", term14837);
        setField(term14864, term14864.getClass(), "movePerTime", term14865);
        setField(term14864, term14864.getClass(), "timeControlType", enum41);
        setIntField(term14864, term14864.getClass(), "halfMoves", -112921587);
        setLongField(term14864, term14864.getClass(), "milliseconds", 7247160664318067468L);
        setLongField(term14864, term14864.getClass(), "increment", 2135754395358000892L);
        setIntField(term14864, term14864.getClass(), "depth", 933028652);
        setLongField(term14864, term14864.getClass(), "nodes", -8085190702504231560L);
        setField(term14745, term14745.getClass(), "timeControl2", term14864);
        setField(term14884, term14884.getClass(), "event", term14885);
        setField(term14884, term14884.getClass(), "player", term14890);
        setField(term14884, term14884.getClass(), "games", term14895);
        setField(term14884, term14884.getClass(), "listener", term14899);
        setField(term14884, term14884.getClass(), "fileName", "PkWMRdJcBb");
        setField(term14884, term14884.getClass(), "size", term14915);
        setBooleanField(term14884, term14884.getClass(), "lazyLoad", true);
        setField(term14745, term14745.getClass(), "pgnHolder", term14884);
        term14918 = new Long(1672578078364590450L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14918;
        callMethod(klass, "setTimestamp", argTypes, term14745, args);
    }

};


