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

public class Event_getRounds_23571145415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15868;

    public Event_getRounds_23571145415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15869 = new HashMap();
        Class<? extends Object> term16053 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term16052 = ((Class) term16053).getDeclaredField((String) "ROUND_ROBIN");
        ((Field) term16052).setAccessible(true);
        Object enum42 = ((Field) term16052).get((Object) null);
        ArrayList term15952 = new ArrayList();
        Class<? extends Object> term16353 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term16352 = ((Class) term16353).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term16352).setAccessible(true);
        Object enum43 = ((Field) term16352).get((Object) null);
        ArrayList term15980 = new ArrayList();
        Class<? extends Object> term16662 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term16661 = ((Class) term16662).getDeclaredField((String) "NODES");
        ((Field) term16661).setAccessible(true);
        Object enum44 = ((Field) term16661).get((Object) null);
        HashMap term15999 = new HashMap();
        HashMap term16004 = new HashMap();
        ArrayList term16009 = new ArrayList();
        ArrayList term16013 = new ArrayList();
        Integer term16029 = new Integer(1585847225);
        term15868 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term15951 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term15979 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term15998 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term15868, term15868.getClass(), "round", term15869);
        setField(term15868, term15868.getClass(), "id", "jSpAteRute");
        setField(term15868, term15868.getClass(), "name", "swZVeJAxjt");
        setField(term15868, term15868.getClass(), "eventType", enum42);
        setField(term15868, term15868.getClass(), "startDate", "xOcJIiQQDu");
        setField(term15868, term15868.getClass(), "endDate", "GVizqqzXpy");
        setField(term15868, term15868.getClass(), "site", "JqXGgAhZPl");
        setLongField(term15868, term15868.getClass(), "timestamp", 4949335493504695457L);
        setIntField(term15868, term15868.getClass(), "rounds", 287287233);
        setField(term15951, term15951.getClass(), "movePerTime", term15952);
        setField(term15951, term15951.getClass(), "timeControlType", enum43);
        setIntField(term15951, term15951.getClass(), "halfMoves", 962840079);
        setLongField(term15951, term15951.getClass(), "milliseconds", -5216789073301458893L);
        setLongField(term15951, term15951.getClass(), "increment", -1832940336320585644L);
        setIntField(term15951, term15951.getClass(), "depth", 1540719661);
        setLongField(term15951, term15951.getClass(), "nodes", -8033714905181142681L);
        setField(term15868, term15868.getClass(), "timeControl", term15951);
        setField(term15979, term15979.getClass(), "movePerTime", term15980);
        setField(term15979, term15979.getClass(), "timeControlType", enum44);
        setIntField(term15979, term15979.getClass(), "halfMoves", 1265463001);
        setLongField(term15979, term15979.getClass(), "milliseconds", -9040825890007374809L);
        setLongField(term15979, term15979.getClass(), "increment", 1368340889161782793L);
        setIntField(term15979, term15979.getClass(), "depth", 335112684);
        setLongField(term15979, term15979.getClass(), "nodes", -5786861555969446503L);
        setField(term15868, term15868.getClass(), "timeControl2", term15979);
        setField(term15998, term15998.getClass(), "event", term15999);
        setField(term15998, term15998.getClass(), "player", term16004);
        setField(term15998, term15998.getClass(), "games", term16009);
        setField(term15998, term15998.getClass(), "listener", term16013);
        setField(term15998, term15998.getClass(), "fileName", "jiKYgYHqIS");
        setField(term15998, term15998.getClass(), "size", term16029);
        setBooleanField(term15998, term15998.getClass(), "lazyLoad", false);
        setField(term15868, term15868.getClass(), "pgnHolder", term15998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRounds", argTypes, term15868, args);
    }

};


