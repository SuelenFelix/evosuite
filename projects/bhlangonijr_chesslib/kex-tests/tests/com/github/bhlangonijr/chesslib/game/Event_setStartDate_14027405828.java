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

public class Event_setStartDate_14027405828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7981;

    public Event_setStartDate_14027405828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7982 = new HashMap();
        Class<? extends Object> term8193 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term8192 = ((Class) term8193).getDeclaredField((String) "ROUND_ROBIN_CAROUSEL");
        ((Field) term8192).setAccessible(true);
        Object enum21 = ((Field) term8192).get((Object) null);
        ArrayList term8074 = new ArrayList();
        Class<? extends Object> term8520 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term8519 = ((Class) term8520).getDeclaredField((String) "FIXED_DEPTH");
        ((Field) term8519).setAccessible(true);
        Object enum22 = ((Field) term8519).get((Object) null);
        ArrayList term8099 = new ArrayList();
        Class<? extends Object> term8820 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term8819 = ((Class) term8820).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term8819).setAccessible(true);
        Object enum23 = ((Field) term8819).get((Object) null);
        HashMap term8127 = new HashMap();
        HashMap term8132 = new HashMap();
        ArrayList term8137 = new ArrayList();
        ArrayList term8141 = new ArrayList();
        Integer term8157 = new Integer(-2038273078);
        term7981 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term8073 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term8098 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term8126 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term7981, term7981.getClass(), "round", term7982);
        setField(term7981, term7981.getClass(), "id", "BndsHwAFMv");
        setField(term7981, term7981.getClass(), "name", "GzFkzHGYFt");
        setField(term7981, term7981.getClass(), "eventType", enum21);
        setField(term7981, term7981.getClass(), "startDate", "tShwQLRGNe");
        setField(term7981, term7981.getClass(), "endDate", "LvtrsXUliU");
        setField(term7981, term7981.getClass(), "site", "xLbjWUgOIL");
        setLongField(term7981, term7981.getClass(), "timestamp", -3842548265506930260L);
        setIntField(term7981, term7981.getClass(), "rounds", -1087774327);
        setField(term8073, term8073.getClass(), "movePerTime", term8074);
        setField(term8073, term8073.getClass(), "timeControlType", enum22);
        setIntField(term8073, term8073.getClass(), "halfMoves", -1530420153);
        setLongField(term8073, term8073.getClass(), "milliseconds", -5788180182343976541L);
        setLongField(term8073, term8073.getClass(), "increment", 2936323121573284007L);
        setIntField(term8073, term8073.getClass(), "depth", -469968304);
        setLongField(term8073, term8073.getClass(), "nodes", -1154553077993834885L);
        setField(term7981, term7981.getClass(), "timeControl", term8073);
        setField(term8098, term8098.getClass(), "movePerTime", term8099);
        setField(term8098, term8098.getClass(), "timeControlType", enum23);
        setIntField(term8098, term8098.getClass(), "halfMoves", -1145578966);
        setLongField(term8098, term8098.getClass(), "milliseconds", -2850532706972744550L);
        setLongField(term8098, term8098.getClass(), "increment", -2644215923136513282L);
        setIntField(term8098, term8098.getClass(), "depth", 679763016);
        setLongField(term8098, term8098.getClass(), "nodes", -1468719814009985452L);
        setField(term7981, term7981.getClass(), "timeControl2", term8098);
        setField(term8126, term8126.getClass(), "event", term8127);
        setField(term8126, term8126.getClass(), "player", term8132);
        setField(term8126, term8126.getClass(), "games", term8137);
        setField(term8126, term8126.getClass(), "listener", term8141);
        setField(term8126, term8126.getClass(), "fileName", "jDtqGUpnZN");
        setField(term8126, term8126.getClass(), "size", term8157);
        setBooleanField(term8126, term8126.getClass(), "lazyLoad", true);
        setField(term7981, term7981.getClass(), "pgnHolder", term8126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setStartDate", argTypes, term7981, args);
    }

};


