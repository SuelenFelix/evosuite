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

public class Event_getName_5415508293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2452;

    public Event_getName_5415508293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2453 = new HashMap();
        Class<? extends Object> term2650 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term2649 = ((Class) term2650).getDeclaredField((String) "ROUND_ROBIN_CAROUSEL");
        ((Field) term2649).setAccessible(true);
        Object enum6 = ((Field) term2649).get((Object) null);
        ArrayList term2545 = new ArrayList();
        Class<? extends Object> term2977 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term2976 = ((Class) term2977).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term2976).setAccessible(true);
        Object enum7 = ((Field) term2976).get((Object) null);
        ArrayList term2572 = new ArrayList();
        Class<? extends Object> term3283 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term3282 = ((Class) term3283).getDeclaredField((String) "TIME_BONUS");
        ((Field) term3282).setAccessible(true);
        Object enum8 = ((Field) term3282).get((Object) null);
        HashMap term2596 = new HashMap();
        HashMap term2601 = new HashMap();
        ArrayList term2606 = new ArrayList();
        ArrayList term2610 = new ArrayList();
        Integer term2626 = new Integer(1484323161);
        term2452 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term2544 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term2571 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term2595 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term2452, term2452.getClass(), "round", term2453);
        setField(term2452, term2452.getClass(), "id", "LQFpaHEwXR");
        setField(term2452, term2452.getClass(), "name", "oVcInYnLWB");
        setField(term2452, term2452.getClass(), "eventType", enum6);
        setField(term2452, term2452.getClass(), "startDate", "aJlieCFVtF");
        setField(term2452, term2452.getClass(), "endDate", "ZiaGIbnzTs");
        setField(term2452, term2452.getClass(), "site", "tbcdzjIfER");
        setLongField(term2452, term2452.getClass(), "timestamp", -5476826692763582090L);
        setIntField(term2452, term2452.getClass(), "rounds", 1725571209);
        setField(term2544, term2544.getClass(), "movePerTime", term2545);
        setField(term2544, term2544.getClass(), "timeControlType", enum7);
        setIntField(term2544, term2544.getClass(), "halfMoves", -522618178);
        setLongField(term2544, term2544.getClass(), "milliseconds", -872011222785455006L);
        setLongField(term2544, term2544.getClass(), "increment", -316468845751588286L);
        setIntField(term2544, term2544.getClass(), "depth", 1134449235);
        setLongField(term2544, term2544.getClass(), "nodes", 5127676408959197577L);
        setField(term2452, term2452.getClass(), "timeControl", term2544);
        setField(term2571, term2571.getClass(), "movePerTime", term2572);
        setField(term2571, term2571.getClass(), "timeControlType", enum8);
        setIntField(term2571, term2571.getClass(), "halfMoves", -883034806);
        setLongField(term2571, term2571.getClass(), "milliseconds", -6573104506744284592L);
        setLongField(term2571, term2571.getClass(), "increment", -4920224193275732920L);
        setIntField(term2571, term2571.getClass(), "depth", 1585847225);
        setLongField(term2571, term2571.getClass(), "nodes", 8428634514691209827L);
        setField(term2452, term2452.getClass(), "timeControl2", term2571);
        setField(term2595, term2595.getClass(), "event", term2596);
        setField(term2595, term2595.getClass(), "player", term2601);
        setField(term2595, term2595.getClass(), "games", term2606);
        setField(term2595, term2595.getClass(), "listener", term2610);
        setField(term2595, term2595.getClass(), "fileName", "HyxfbSQYBe");
        setField(term2595, term2595.getClass(), "size", term2626);
        setBooleanField(term2595, term2595.getClass(), "lazyLoad", false);
        setField(term2452, term2452.getClass(), "pgnHolder", term2595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2452, args);
    }

};


