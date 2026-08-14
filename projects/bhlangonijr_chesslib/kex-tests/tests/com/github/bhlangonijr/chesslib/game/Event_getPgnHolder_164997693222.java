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

public class Event_getPgnHolder_164997693222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23824;

    public Event_getPgnHolder_164997693222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term23825 = new HashMap();
        Class<? extends Object> term24002 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term24001 = ((Class) term24002).getDeclaredField((String) "GAUNTLET");
        ((Field) term24001).setAccessible(true);
        Object enum64 = ((Field) term24001).get((Object) null);
        ArrayList term23905 = new ArrayList();
        Class<? extends Object> term24293 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term24292 = ((Class) term24293).getDeclaredField((String) "TIME_BONUS");
        ((Field) term24292).setAccessible(true);
        Object enum65 = ((Field) term24292).get((Object) null);
        ArrayList term23929 = new ArrayList();
        Class<? extends Object> term24590 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term24589 = ((Class) term24590).getDeclaredField((String) "NODES");
        ((Field) term24589).setAccessible(true);
        Object enum66 = ((Field) term24589).get((Object) null);
        HashMap term23948 = new HashMap();
        HashMap term23953 = new HashMap();
        ArrayList term23958 = new ArrayList();
        ArrayList term23962 = new ArrayList();
        Integer term23978 = new Integer(-6029667);
        term23824 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term23904 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term23928 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term23947 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term23824, term23824.getClass(), "round", term23825);
        setField(term23824, term23824.getClass(), "id", "AKNapTAfmD");
        setField(term23824, term23824.getClass(), "name", "xJgPlLxpgC");
        setField(term23824, term23824.getClass(), "eventType", enum64);
        setField(term23824, term23824.getClass(), "startDate", "EYtfuJaxiM");
        setField(term23824, term23824.getClass(), "endDate", "gCWtLVKVVe");
        setField(term23824, term23824.getClass(), "site", "fWKJoSoCwE");
        setLongField(term23824, term23824.getClass(), "timestamp", -8603648071751666348L);
        setIntField(term23824, term23824.getClass(), "rounds", -341962980);
        setField(term23904, term23904.getClass(), "movePerTime", term23905);
        setField(term23904, term23904.getClass(), "timeControlType", enum65);
        setIntField(term23904, term23904.getClass(), "halfMoves", 1532716628);
        setLongField(term23904, term23904.getClass(), "milliseconds", -7884871963229073324L);
        setLongField(term23904, term23904.getClass(), "increment", -8649738738252714180L);
        setIntField(term23904, term23904.getClass(), "depth", -1801760683);
        setLongField(term23904, term23904.getClass(), "nodes", -7278883608542636188L);
        setField(term23824, term23824.getClass(), "timeControl", term23904);
        setField(term23928, term23928.getClass(), "movePerTime", term23929);
        setField(term23928, term23928.getClass(), "timeControlType", enum66);
        setIntField(term23928, term23928.getClass(), "halfMoves", 1141317871);
        setLongField(term23928, term23928.getClass(), "milliseconds", -1539859611880912454L);
        setLongField(term23928, term23928.getClass(), "increment", 4100236067313034103L);
        setIntField(term23928, term23928.getClass(), "depth", 890669485);
        setLongField(term23928, term23928.getClass(), "nodes", 1195529027276497124L);
        setField(term23824, term23824.getClass(), "timeControl2", term23928);
        setField(term23947, term23947.getClass(), "event", term23948);
        setField(term23947, term23947.getClass(), "player", term23953);
        setField(term23947, term23947.getClass(), "games", term23958);
        setField(term23947, term23947.getClass(), "listener", term23962);
        setField(term23947, term23947.getClass(), "fileName", "wfaXBpWAUH");
        setField(term23947, term23947.getClass(), "size", term23978);
        setBooleanField(term23947, term23947.getClass(), "lazyLoad", true);
        setField(term23824, term23824.getClass(), "pgnHolder", term23947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPgnHolder", argTypes, term23824, args);
    }

};


