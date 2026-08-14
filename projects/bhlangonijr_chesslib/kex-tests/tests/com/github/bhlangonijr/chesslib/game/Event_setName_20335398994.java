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

public class Event_setName_20335398994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3589;

    public Event_setName_20335398994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3590 = new HashMap();
        Class<? extends Object> term3786 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term3785 = ((Class) term3786).getDeclaredField((String) "NORMAL_MATCH");
        ((Field) term3785).setAccessible(true);
        Object enum9 = ((Field) term3785).get((Object) null);
        ArrayList term3674 = new ArrayList();
        Class<? extends Object> term4089 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term4088 = ((Class) term4089).getDeclaredField((String) "NODES");
        ((Field) term4088).setAccessible(true);
        Object enum10 = ((Field) term4088).get((Object) null);
        ArrayList term3693 = new ArrayList();
        Class<? extends Object> term4371 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term4370 = ((Class) term4371).getDeclaredField((String) "TIME_PER_MOVE");
        ((Field) term4370).setAccessible(true);
        Object enum11 = ((Field) term4370).get((Object) null);
        HashMap term3720 = new HashMap();
        HashMap term3725 = new HashMap();
        ArrayList term3730 = new ArrayList();
        ArrayList term3734 = new ArrayList();
        Integer term3750 = new Integer(391863371);
        term3589 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term3673 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term3692 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term3719 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term3589, term3589.getClass(), "round", term3590);
        setField(term3589, term3589.getClass(), "id", "pCTimMblYc");
        setField(term3589, term3589.getClass(), "name", "hNxWaHcfhY");
        setField(term3589, term3589.getClass(), "eventType", enum9);
        setField(term3589, term3589.getClass(), "startDate", "RkybSrpybU");
        setField(term3589, term3589.getClass(), "endDate", "xOEqzGAmDU");
        setField(term3589, term3589.getClass(), "site", "eZFUvlxvGV");
        setLongField(term3589, term3589.getClass(), "timestamp", -2585684163342970173L);
        setIntField(term3589, term3589.getClass(), "rounds", 597278769);
        setField(term3673, term3673.getClass(), "movePerTime", term3674);
        setField(term3673, term3673.getClass(), "timeControlType", enum10);
        setIntField(term3673, term3673.getClass(), "halfMoves", -1685132342);
        setLongField(term3673, term3673.getClass(), "milliseconds", 8059786003080744426L);
        setLongField(term3673, term3673.getClass(), "increment", -4365849114644724155L);
        setIntField(term3673, term3673.getClass(), "depth", -1456670397);
        setLongField(term3673, term3673.getClass(), "nodes", 2486810210675247493L);
        setField(term3589, term3589.getClass(), "timeControl", term3673);
        setField(term3692, term3692.getClass(), "movePerTime", term3693);
        setField(term3692, term3692.getClass(), "timeControlType", enum11);
        setIntField(term3692, term3692.getClass(), "halfMoves", 1622346318);
        setLongField(term3692, term3692.getClass(), "milliseconds", 7009926388951271268L);
        setLongField(term3692, term3692.getClass(), "increment", -7672528020740371001L);
        setIntField(term3692, term3692.getClass(), "depth", 1048535127);
        setLongField(term3692, term3692.getClass(), "nodes", -4502405999831680926L);
        setField(term3589, term3589.getClass(), "timeControl2", term3692);
        setField(term3719, term3719.getClass(), "event", term3720);
        setField(term3719, term3719.getClass(), "player", term3725);
        setField(term3719, term3719.getClass(), "games", term3730);
        setField(term3719, term3719.getClass(), "listener", term3734);
        setField(term3719, term3719.getClass(), "fileName", "BYqFIqCKAV");
        setField(term3719, term3719.getClass(), "size", term3750);
        setBooleanField(term3719, term3719.getClass(), "lazyLoad", false);
        setField(term3589, term3589.getClass(), "pgnHolder", term3719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setName", argTypes, term3589, args);
    }

};


