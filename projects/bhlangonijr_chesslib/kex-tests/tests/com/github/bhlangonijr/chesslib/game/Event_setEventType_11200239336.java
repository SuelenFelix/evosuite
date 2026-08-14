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

public class Event_setEventType_11200239336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5474;
     Object enum17;

    public Event_setEventType_11200239336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5475 = new HashMap();
        Class<? extends Object> term5686 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term5685 = ((Class) term5686).getDeclaredField((String) "DOUBLE_ELIMINATION");
        ((Field) term5685).setAccessible(true);
        Object enum14 = ((Field) term5685).get((Object) null);
        ArrayList term5565 = new ArrayList();
        Class<? extends Object> term6007 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term6006 = ((Class) term6007).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term6006).setAccessible(true);
        Object enum15 = ((Field) term6006).get((Object) null);
        ArrayList term5593 = new ArrayList();
        Class<? extends Object> term6316 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term6315 = ((Class) term6316).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term6315).setAccessible(true);
        Object enum16 = ((Field) term6315).get((Object) null);
        HashMap term5620 = new HashMap();
        HashMap term5625 = new HashMap();
        ArrayList term5630 = new ArrayList();
        ArrayList term5634 = new ArrayList();
        Integer term5650 = new Integer(-616727354);
        term5474 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term5564 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term5592 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term5619 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term5474, term5474.getClass(), "round", term5475);
        setField(term5474, term5474.getClass(), "id", "AijpHYOFuy");
        setField(term5474, term5474.getClass(), "name", "SbAoxhfrkn");
        setField(term5474, term5474.getClass(), "eventType", enum14);
        setField(term5474, term5474.getClass(), "startDate", "kuTXqwMtDB");
        setField(term5474, term5474.getClass(), "endDate", "Ghbwtircqb");
        setField(term5474, term5474.getClass(), "site", "xrwlQZdwCp");
        setLongField(term5474, term5474.getClass(), "timestamp", 1233889271256172047L);
        setIntField(term5474, term5474.getClass(), "rounds", 1135664017);
        setField(term5564, term5564.getClass(), "movePerTime", term5565);
        setField(term5564, term5564.getClass(), "timeControlType", enum15);
        setIntField(term5564, term5564.getClass(), "halfMoves", 590364439);
        setLongField(term5564, term5564.getClass(), "milliseconds", 6617340557564669657L);
        setLongField(term5564, term5564.getClass(), "increment", 1439298019805881866L);
        setIntField(term5564, term5564.getClass(), "depth", 865208305);
        setLongField(term5564, term5564.getClass(), "nodes", -8708192233349544946L);
        setField(term5474, term5474.getClass(), "timeControl", term5564);
        setField(term5592, term5592.getClass(), "movePerTime", term5593);
        setField(term5592, term5592.getClass(), "timeControlType", enum16);
        setIntField(term5592, term5592.getClass(), "halfMoves", -1275173084);
        setLongField(term5592, term5592.getClass(), "milliseconds", 5907001541142728739L);
        setLongField(term5592, term5592.getClass(), "increment", 4178434741742309755L);
        setIntField(term5592, term5592.getClass(), "depth", -244121226);
        setLongField(term5592, term5592.getClass(), "nodes", -2068172595987555756L);
        setField(term5474, term5474.getClass(), "timeControl2", term5592);
        setField(term5619, term5619.getClass(), "event", term5620);
        setField(term5619, term5619.getClass(), "player", term5625);
        setField(term5619, term5619.getClass(), "games", term5630);
        setField(term5619, term5619.getClass(), "listener", term5634);
        setField(term5619, term5619.getClass(), "fileName", "IDCWpPLRkE");
        setField(term5619, term5619.getClass(), "size", term5650);
        setBooleanField(term5619, term5619.getClass(), "lazyLoad", true);
        setField(term5474, term5474.getClass(), "pgnHolder", term5619);
        Class<? extends Object> term6632 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term6631 = ((Class) term6632).getDeclaredField((String) "GAUNTLET");
        ((Field) term6631).setAccessible(true);
        enum17 = ((Field) term6631).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.EventType");
        Object[] args = new Object[1];
        args[0] = enum17;
        callMethod(klass, "setEventType", argTypes, term5474, args);
    }

};


