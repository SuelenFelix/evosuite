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

public class Event_setTimeControl2_155173726120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21329;
     Object term21497;

    public Event_setTimeControl2_155173726120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21330 = new HashMap();
        Class<? extends Object> term21537 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term21536 = ((Class) term21537).getDeclaredField((String) "DOUBLE_ELIMINATION");
        ((Field) term21536).setAccessible(true);
        Object enum57 = ((Field) term21536).get((Object) null);
        ArrayList term21420 = new ArrayList();
        Class<? extends Object> term21858 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term21857 = ((Class) term21858).getDeclaredField((String) "UNKNOW");
        ((Field) term21857).setAccessible(true);
        Object enum58 = ((Field) term21857).get((Object) null);
        ArrayList term21440 = new ArrayList();
        Class<? extends Object> term22143 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term22142 = ((Class) term22143).getDeclaredField((String) "TIME_BONUS");
        ((Field) term22142).setAccessible(true);
        Object enum59 = ((Field) term22142).get((Object) null);
        HashMap term21464 = new HashMap();
        HashMap term21469 = new HashMap();
        ArrayList term21474 = new ArrayList();
        ArrayList term21478 = new ArrayList();
        Integer term21494 = new Integer(1048535127);
        term21329 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term21419 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term21439 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term21463 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term21329, term21329.getClass(), "round", term21330);
        setField(term21329, term21329.getClass(), "id", "mXGCWJDOqA");
        setField(term21329, term21329.getClass(), "name", "dpNsDgfPso");
        setField(term21329, term21329.getClass(), "eventType", enum57);
        setField(term21329, term21329.getClass(), "startDate", "hCWPJQKpdc");
        setField(term21329, term21329.getClass(), "endDate", "WzMEhMXkKx");
        setField(term21329, term21329.getClass(), "site", "XOiDvlDhdc");
        setLongField(term21329, term21329.getClass(), "timestamp", 7495904023107549024L);
        setIntField(term21329, term21329.getClass(), "rounds", -894662986);
        setField(term21419, term21419.getClass(), "movePerTime", term21420);
        setField(term21419, term21419.getClass(), "timeControlType", enum58);
        setIntField(term21419, term21419.getClass(), "halfMoves", 304775596);
        setLongField(term21419, term21419.getClass(), "milliseconds", 8802866251294305945L);
        setLongField(term21419, term21419.getClass(), "increment", 4513004407927379358L);
        setIntField(term21419, term21419.getClass(), "depth", -1347665717);
        setLongField(term21419, term21419.getClass(), "nodes", -7115418542247301000L);
        setField(term21329, term21329.getClass(), "timeControl", term21419);
        setField(term21439, term21439.getClass(), "movePerTime", term21440);
        setField(term21439, term21439.getClass(), "timeControlType", enum59);
        setIntField(term21439, term21439.getClass(), "halfMoves", -1888585309);
        setLongField(term21439, term21439.getClass(), "milliseconds", 8034714140377562739L);
        setLongField(term21439, term21439.getClass(), "increment", -2924531382671518368L);
        setIntField(term21439, term21439.getClass(), "depth", 683666002);
        setLongField(term21439, term21439.getClass(), "nodes", -3948863953565024517L);
        setField(term21329, term21329.getClass(), "timeControl2", term21439);
        setField(term21463, term21463.getClass(), "event", term21464);
        setField(term21463, term21463.getClass(), "player", term21469);
        setField(term21463, term21463.getClass(), "games", term21474);
        setField(term21463, term21463.getClass(), "listener", term21478);
        setField(term21463, term21463.getClass(), "fileName", "AdxvLJhNLe");
        setField(term21463, term21463.getClass(), "size", term21494);
        setBooleanField(term21463, term21463.getClass(), "lazyLoad", false);
        setField(term21329, term21329.getClass(), "pgnHolder", term21463);
        ArrayList term21498 = new ArrayList();
        Class<? extends Object> term22450 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term22449 = ((Class) term22450).getDeclaredField((String) "NODES");
        ((Field) term22449).setAccessible(true);
        Object enum60 = ((Field) term22449).get((Object) null);
        term21497 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        setField(term21497, term21497.getClass(), "movePerTime", term21498);
        setField(term21497, term21497.getClass(), "timeControlType", enum60);
        setIntField(term21497, term21497.getClass(), "halfMoves", 1596213415);
        setLongField(term21497, term21497.getClass(), "milliseconds", -6587807377747738663L);
        setLongField(term21497, term21497.getClass(), "increment", -6301101997917060727L);
        setIntField(term21497, term21497.getClass(), "depth", -268815336);
        setLongField(term21497, term21497.getClass(), "nodes", 8166095254618543564L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl");
        Object[] args = new Object[1];
        args[0] = term21497;
        callMethod(klass, "setTimeControl2", argTypes, term21329, args);
    }

};


