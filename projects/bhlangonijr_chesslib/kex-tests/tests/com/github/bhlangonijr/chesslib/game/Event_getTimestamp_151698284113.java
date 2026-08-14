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

public class Event_getTimestamp_151698284113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13628;

    public Event_getTimestamp_151698284113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13629 = new HashMap();
        Class<? extends Object> term13821 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term13820 = ((Class) term13821).getDeclaredField((String) "DOUBLE_ELIMINATION");
        ((Field) term13820).setAccessible(true);
        Object enum36 = ((Field) term13820).get((Object) null);
        ArrayList term13719 = new ArrayList();
        Class<? extends Object> term14142 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term14141 = ((Class) term14142).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term14141).setAccessible(true);
        Object enum37 = ((Field) term14141).get((Object) null);
        ArrayList term13747 = new ArrayList();
        Class<? extends Object> term14451 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term14450 = ((Class) term14451).getDeclaredField((String) "UNKNOW");
        ((Field) term14450).setAccessible(true);
        Object enum38 = ((Field) term14450).get((Object) null);
        HashMap term13767 = new HashMap();
        HashMap term13772 = new HashMap();
        ArrayList term13777 = new ArrayList();
        ArrayList term13781 = new ArrayList();
        Integer term13797 = new Integer(1134449235);
        term13628 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term13718 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term13746 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term13766 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term13628, term13628.getClass(), "round", term13629);
        setField(term13628, term13628.getClass(), "id", "vQVyKLdtaz");
        setField(term13628, term13628.getClass(), "name", "OWKQODBLzb");
        setField(term13628, term13628.getClass(), "eventType", enum36);
        setField(term13628, term13628.getClass(), "startDate", "wGmYcqUkgE");
        setField(term13628, term13628.getClass(), "endDate", "idgaQsnJpQ");
        setField(term13628, term13628.getClass(), "site", "VgZnGoIFwQ");
        setLongField(term13628, term13628.getClass(), "timestamp", -8652538484981166496L);
        setIntField(term13628, term13628.getClass(), "rounds", 1596070772);
        setField(term13718, term13718.getClass(), "movePerTime", term13719);
        setField(term13718, term13718.getClass(), "timeControlType", enum37);
        setIntField(term13718, term13718.getClass(), "halfMoves", 97029295);
        setLongField(term13718, term13718.getClass(), "milliseconds", 2701184207686293431L);
        setLongField(term13718, term13718.getClass(), "increment", 4474998035090263139L);
        setIntField(term13718, term13718.getClass(), "depth", -1371869594);
        setLongField(term13718, term13718.getClass(), "nodes", 2848819812340321742L);
        setField(term13628, term13628.getClass(), "timeControl", term13718);
        setField(term13746, term13746.getClass(), "movePerTime", term13747);
        setField(term13746, term13746.getClass(), "timeControlType", enum38);
        setIntField(term13746, term13746.getClass(), "halfMoves", -2095575670);
        setLongField(term13746, term13746.getClass(), "milliseconds", -8876856890348836498L);
        setLongField(term13746, term13746.getClass(), "increment", 846579494941632714L);
        setIntField(term13746, term13746.getClass(), "depth", 1225272962);
        setLongField(term13746, term13746.getClass(), "nodes", 6689117472719450333L);
        setField(term13628, term13628.getClass(), "timeControl2", term13746);
        setField(term13766, term13766.getClass(), "event", term13767);
        setField(term13766, term13766.getClass(), "player", term13772);
        setField(term13766, term13766.getClass(), "games", term13777);
        setField(term13766, term13766.getClass(), "listener", term13781);
        setField(term13766, term13766.getClass(), "fileName", "jUbSRrkrYZ");
        setField(term13766, term13766.getClass(), "size", term13797);
        setBooleanField(term13766, term13766.getClass(), "lazyLoad", false);
        setField(term13628, term13628.getClass(), "pgnHolder", term13766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term13628, args);
    }

};


