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

public class Event_getTimeControl_37370519917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18012;

    public Event_getTimeControl_37370519917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18013 = new HashMap();
        Class<? extends Object> term18208 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term18207 = ((Class) term18208).getDeclaredField((String) "SINGLE_ELIMINATION");
        ((Field) term18207).setAccessible(true);
        Object enum48 = ((Field) term18207).get((Object) null);
        ArrayList term18103 = new ArrayList();
        Class<? extends Object> term18529 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term18528 = ((Class) term18529).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term18528).setAccessible(true);
        Object enum49 = ((Field) term18528).get((Object) null);
        ArrayList term18130 = new ArrayList();
        Class<? extends Object> term18835 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term18834 = ((Class) term18835).getDeclaredField((String) "TIME_BONUS");
        ((Field) term18834).setAccessible(true);
        Object enum50 = ((Field) term18834).get((Object) null);
        HashMap term18154 = new HashMap();
        HashMap term18159 = new HashMap();
        ArrayList term18164 = new ArrayList();
        ArrayList term18168 = new ArrayList();
        Integer term18184 = new Integer(-1685132342);
        term18012 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term18102 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term18129 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term18153 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term18012, term18012.getClass(), "round", term18013);
        setField(term18012, term18012.getClass(), "id", "sEccwbJKYE");
        setField(term18012, term18012.getClass(), "name", "AWRooQKkdW");
        setField(term18012, term18012.getClass(), "eventType", enum48);
        setField(term18012, term18012.getClass(), "startDate", "vjxIhXHxGR");
        setField(term18012, term18012.getClass(), "endDate", "QXzGXbEXMu");
        setField(term18012, term18012.getClass(), "site", "qxSDVejjiY");
        setLongField(term18012, term18012.getClass(), "timestamp", 1667122142089513324L);
        setIntField(term18012, term18012.getClass(), "rounds", 1655935355);
        setField(term18102, term18102.getClass(), "movePerTime", term18103);
        setField(term18102, term18102.getClass(), "timeControlType", enum49);
        setIntField(term18102, term18102.getClass(), "halfMoves", -481533957);
        setLongField(term18102, term18102.getClass(), "milliseconds", -6342139649364011743L);
        setLongField(term18102, term18102.getClass(), "increment", -4924950707540628022L);
        setIntField(term18102, term18102.getClass(), "depth", 1240914516);
        setLongField(term18102, term18102.getClass(), "nodes", -4393710401270724527L);
        setField(term18012, term18012.getClass(), "timeControl", term18102);
        setField(term18129, term18129.getClass(), "movePerTime", term18130);
        setField(term18129, term18129.getClass(), "timeControlType", enum50);
        setIntField(term18129, term18129.getClass(), "halfMoves", -1465035361);
        setLongField(term18129, term18129.getClass(), "milliseconds", -4822736661741380518L);
        setLongField(term18129, term18129.getClass(), "increment", -5386201758403679145L);
        setIntField(term18129, term18129.getClass(), "depth", 1090617576);
        setLongField(term18129, term18129.getClass(), "nodes", -7268507582722666254L);
        setField(term18012, term18012.getClass(), "timeControl2", term18129);
        setField(term18153, term18153.getClass(), "event", term18154);
        setField(term18153, term18153.getClass(), "player", term18159);
        setField(term18153, term18153.getClass(), "games", term18164);
        setField(term18153, term18153.getClass(), "listener", term18168);
        setField(term18153, term18153.getClass(), "fileName", "xBsXSDjXYK");
        setField(term18153, term18153.getClass(), "size", term18184);
        setBooleanField(term18153, term18153.getClass(), "lazyLoad", true);
        setField(term18012, term18012.getClass(), "pgnHolder", term18153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeControl", argTypes, term18012, args);
    }

};


