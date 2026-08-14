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

public class Event_setSite_188279743912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12453;

    public Event_setSite_188279743912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12454 = new HashMap();
        Class<? extends Object> term12667 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term12666 = ((Class) term12667).getDeclaredField((String) "ROUND_ROBIN_CAROUSEL");
        ((Field) term12666).setAccessible(true);
        Object enum33 = ((Field) term12666).get((Object) null);
        ArrayList term12546 = new ArrayList();
        Class<? extends Object> term12994 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term12993 = ((Class) term12994).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term12993).setAccessible(true);
        Object enum34 = ((Field) term12993).get((Object) null);
        ArrayList term12573 = new ArrayList();
        Class<? extends Object> term13300 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term13299 = ((Class) term13300).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term13299).setAccessible(true);
        Object enum35 = ((Field) term13299).get((Object) null);
        HashMap term12601 = new HashMap();
        HashMap term12606 = new HashMap();
        ArrayList term12611 = new ArrayList();
        ArrayList term12615 = new ArrayList();
        Integer term12631 = new Integer(-522618178);
        term12453 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term12545 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term12572 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term12600 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term12453, term12453.getClass(), "round", term12454);
        setField(term12453, term12453.getClass(), "id", "whBvTVIIlC");
        setField(term12453, term12453.getClass(), "name", "IgRJUzaCwW");
        setField(term12453, term12453.getClass(), "eventType", enum33);
        setField(term12453, term12453.getClass(), "startDate", "JUmudUmaaV");
        setField(term12453, term12453.getClass(), "endDate", "KoyGrUJeJW");
        setField(term12453, term12453.getClass(), "site", "HqBOwkVqjD");
        setLongField(term12453, term12453.getClass(), "timestamp", 9013624480170062917L);
        setIntField(term12453, term12453.getClass(), "rounds", 292681826);
        setField(term12545, term12545.getClass(), "movePerTime", term12546);
        setField(term12545, term12545.getClass(), "timeControlType", enum34);
        setIntField(term12545, term12545.getClass(), "halfMoves", 458147407);
        setLongField(term12545, term12545.getClass(), "milliseconds", 7862575738391801707L);
        setLongField(term12545, term12545.getClass(), "increment", 50358265865610362L);
        setIntField(term12545, term12545.getClass(), "depth", -184153539);
        setLongField(term12545, term12545.getClass(), "nodes", 5510783420697225605L);
        setField(term12453, term12453.getClass(), "timeControl", term12545);
        setField(term12572, term12572.getClass(), "movePerTime", term12573);
        setField(term12572, term12572.getClass(), "timeControlType", enum35);
        setIntField(term12572, term12572.getClass(), "halfMoves", 493620644);
        setLongField(term12572, term12572.getClass(), "milliseconds", 6005241913654469005L);
        setLongField(term12572, term12572.getClass(), "increment", -1983291584002806658L);
        setIntField(term12572, term12572.getClass(), "depth", 1328271830);
        setLongField(term12572, term12572.getClass(), "nodes", 5946780097489996391L);
        setField(term12453, term12453.getClass(), "timeControl2", term12572);
        setField(term12600, term12600.getClass(), "event", term12601);
        setField(term12600, term12600.getClass(), "player", term12606);
        setField(term12600, term12600.getClass(), "games", term12611);
        setField(term12600, term12600.getClass(), "listener", term12615);
        setField(term12600, term12600.getClass(), "fileName", "MAcUBcBckh");
        setField(term12600, term12600.getClass(), "size", term12631);
        setBooleanField(term12600, term12600.getClass(), "lazyLoad", true);
        setField(term12453, term12453.getClass(), "pgnHolder", term12600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "setSite", argTypes, term12453, args);
    }

};


