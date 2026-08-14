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

public class Event_setEndDate_23955779110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10277;

    public Event_setEndDate_23955779110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10278 = new HashMap();
        Class<? extends Object> term10472 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term10471 = ((Class) term10472).getDeclaredField((String) "SWISS");
        ((Field) term10471).setAccessible(true);
        Object enum27 = ((Field) term10471).get((Object) null);
        ArrayList term10355 = new ArrayList();
        Class<? extends Object> term10754 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term10753 = ((Class) term10754).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term10753).setAccessible(true);
        Object enum28 = ((Field) term10753).get((Object) null);
        ArrayList term10382 = new ArrayList();
        Class<? extends Object> term11060 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term11059 = ((Class) term11060).getDeclaredField((String) "TIME_BONUS");
        ((Field) term11059).setAccessible(true);
        Object enum29 = ((Field) term11059).get((Object) null);
        HashMap term10406 = new HashMap();
        HashMap term10411 = new HashMap();
        ArrayList term10416 = new ArrayList();
        ArrayList term10420 = new ArrayList();
        Integer term10436 = new Integer(-1339778481);
        term10277 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term10354 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term10381 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term10405 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term10277, term10277.getClass(), "round", term10278);
        setField(term10277, term10277.getClass(), "id", "MLqYREekMl");
        setField(term10277, term10277.getClass(), "name", "ytSBIKXogI");
        setField(term10277, term10277.getClass(), "eventType", enum27);
        setField(term10277, term10277.getClass(), "startDate", "nHXjMycHlU");
        setField(term10277, term10277.getClass(), "endDate", "ieCtQFdkii");
        setField(term10277, term10277.getClass(), "site", "dEnhdmILtU");
        setLongField(term10277, term10277.getClass(), "timestamp", -1610676979013636850L);
        setIntField(term10277, term10277.getClass(), "rounds", -817164822);
        setField(term10354, term10354.getClass(), "movePerTime", term10355);
        setField(term10354, term10354.getClass(), "timeControlType", enum28);
        setIntField(term10354, term10354.getClass(), "halfMoves", -1016503459);
        setLongField(term10354, term10354.getClass(), "milliseconds", 2062173786000223358L);
        setLongField(term10354, term10354.getClass(), "increment", -8658027316505137504L);
        setIntField(term10354, term10354.getClass(), "depth", -1968847291);
        setLongField(term10354, term10354.getClass(), "nodes", 414749984815662075L);
        setField(term10277, term10277.getClass(), "timeControl", term10354);
        setField(term10381, term10381.getClass(), "movePerTime", term10382);
        setField(term10381, term10381.getClass(), "timeControlType", enum29);
        setIntField(term10381, term10381.getClass(), "halfMoves", 579005622);
        setLongField(term10381, term10381.getClass(), "milliseconds", 463622836963501975L);
        setLongField(term10381, term10381.getClass(), "increment", 305759998609888272L);
        setIntField(term10381, term10381.getClass(), "depth", -14890619);
        setLongField(term10381, term10381.getClass(), "nodes", -8654565919063661957L);
        setField(term10277, term10277.getClass(), "timeControl2", term10381);
        setField(term10405, term10405.getClass(), "event", term10406);
        setField(term10405, term10405.getClass(), "player", term10411);
        setField(term10405, term10405.getClass(), "games", term10416);
        setField(term10405, term10405.getClass(), "listener", term10420);
        setField(term10405, term10405.getClass(), "fileName", "hoicvmsovO");
        setField(term10405, term10405.getClass(), "size", term10436);
        setBooleanField(term10405, term10405.getClass(), "lazyLoad", true);
        setField(term10277, term10277.getClass(), "pgnHolder", term10405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "setEndDate", argTypes, term10277, args);
    }

};


