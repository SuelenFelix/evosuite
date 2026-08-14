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

public class GameFactory_newRound_15157389812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114487;
     Object term114650;

    public GameFactory_newRound_15157389812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term114488 = new HashMap();
        Class<? extends Object> term114673 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term114672 = ((Class) term114673).getDeclaredField((String) "SWISS");
        ((Field) term114672).setAccessible(true);
        Object enum358 = ((Field) term114672).get((Object) null);
        ArrayList term114565 = new ArrayList();
        Class<? extends Object> term114955 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term114954 = ((Class) term114955).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term114954).setAccessible(true);
        Object enum359 = ((Field) term114954).get((Object) null);
        ArrayList term114593 = new ArrayList();
        Class<? extends Object> term115264 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term115263 = ((Class) term115264).getDeclaredField((String) "TIME_BONUS");
        ((Field) term115263).setAccessible(true);
        Object enum360 = ((Field) term115263).get((Object) null);
        HashMap term114617 = new HashMap();
        HashMap term114622 = new HashMap();
        ArrayList term114627 = new ArrayList();
        ArrayList term114631 = new ArrayList();
        Integer term114647 = new Integer(1072005683);
        term114487 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term114564 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term114592 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term114616 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term114487, term114487.getClass(), "round", term114488);
        setField(term114487, term114487.getClass(), "id", "uIgRFcwqLd");
        setField(term114487, term114487.getClass(), "name", "AvdsiEyCve");
        setField(term114487, term114487.getClass(), "eventType", enum358);
        setField(term114487, term114487.getClass(), "startDate", "XMArCaVAEc");
        setField(term114487, term114487.getClass(), "endDate", "URWnZtbrQH");
        setField(term114487, term114487.getClass(), "site", "hpTAdtnQku");
        setLongField(term114487, term114487.getClass(), "timestamp", 8010417010297313651L);
        setIntField(term114487, term114487.getClass(), "rounds", 808614267);
        setField(term114564, term114564.getClass(), "movePerTime", term114565);
        setField(term114564, term114564.getClass(), "timeControlType", enum359);
        setIntField(term114564, term114564.getClass(), "halfMoves", 1611734632);
        setLongField(term114564, term114564.getClass(), "milliseconds", 5845993504299821981L);
        setLongField(term114564, term114564.getClass(), "increment", -1528017371096319990L);
        setIntField(term114564, term114564.getClass(), "depth", 868908117);
        setLongField(term114564, term114564.getClass(), "nodes", -1526328443223793465L);
        setField(term114487, term114487.getClass(), "timeControl", term114564);
        setField(term114592, term114592.getClass(), "movePerTime", term114593);
        setField(term114592, term114592.getClass(), "timeControlType", enum360);
        setIntField(term114592, term114592.getClass(), "halfMoves", 1789351397);
        setLongField(term114592, term114592.getClass(), "milliseconds", -412186147449928821L);
        setLongField(term114592, term114592.getClass(), "increment", -1449569009562240465L);
        setIntField(term114592, term114592.getClass(), "depth", 2145528170);
        setLongField(term114592, term114592.getClass(), "nodes", 2287449183416662404L);
        setField(term114487, term114487.getClass(), "timeControl2", term114592);
        setField(term114616, term114616.getClass(), "event", term114617);
        setField(term114616, term114616.getClass(), "player", term114622);
        setField(term114616, term114616.getClass(), "games", term114627);
        setField(term114616, term114616.getClass(), "listener", term114631);
        setField(term114616, term114616.getClass(), "fileName", "GdMAXFBAtl");
        setField(term114616, term114616.getClass(), "size", term114647);
        setBooleanField(term114616, term114616.getClass(), "lazyLoad", true);
        setField(term114487, term114487.getClass(), "pgnHolder", term114616);
        term114650 = new Integer(-585773976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term114487;
        args[1] = term114650;
        callMethod(klass, "newRound", argTypes, null, args);
    }

};


