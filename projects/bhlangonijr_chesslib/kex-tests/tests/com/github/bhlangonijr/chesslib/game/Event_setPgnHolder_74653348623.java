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

public class Event_setPgnHolder_74653348623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24881;
     Object term25033;

    public Event_setPgnHolder_74653348623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term24882 = new HashMap();
        Class<? extends Object> term25088 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.EventType");
        Field term25087 = ((Class) term25088).getDeclaredField((String) "ANALYSES");
        ((Field) term25087).setAccessible(true);
        Object enum67 = ((Field) term25087).get((Object) null);
        ArrayList term24962 = new ArrayList();
        Class<? extends Object> term25379 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.TimeControlType");
        Field term25378 = ((Class) term25379).getDeclaredField((String) "MOVES_PER_TIME");
        ((Field) term25378).setAccessible(true);
        Object enum68 = ((Field) term25378).get((Object) null);
        ArrayList term24990 = new ArrayList();
        HashMap term25000 = new HashMap();
        HashMap term25005 = new HashMap();
        ArrayList term25010 = new ArrayList();
        ArrayList term25014 = new ArrayList();
        Integer term25030 = new Integer(-2068769794);
        term24881 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        Object term24961 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term24989 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.TimeControl"));
        Object term24999 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term24881, term24881.getClass(), "round", term24882);
        setField(term24881, term24881.getClass(), "id", "VMeAzAHwZj");
        setField(term24881, term24881.getClass(), "name", "PznxWXsZME");
        setField(term24881, term24881.getClass(), "eventType", enum67);
        setField(term24881, term24881.getClass(), "startDate", "ZzIujlwVsw");
        setField(term24881, term24881.getClass(), "endDate", "LWyEaeIyAo");
        setField(term24881, term24881.getClass(), "site", "yVMkkQhvmN");
        setLongField(term24881, term24881.getClass(), "timestamp", -2783999800714825789L);
        setIntField(term24881, term24881.getClass(), "rounds", 691577392);
        setField(term24961, term24961.getClass(), "movePerTime", term24962);
        setField(term24961, term24961.getClass(), "timeControlType", enum68);
        setIntField(term24961, term24961.getClass(), "halfMoves", -893623680);
        setLongField(term24961, term24961.getClass(), "milliseconds", 4266570509071948633L);
        setLongField(term24961, term24961.getClass(), "increment", -7291742736502427077L);
        setIntField(term24961, term24961.getClass(), "depth", -1963434938);
        setLongField(term24961, term24961.getClass(), "nodes", -8121849829073967555L);
        setField(term24881, term24881.getClass(), "timeControl", term24961);
        setField(term24989, term24989.getClass(), "movePerTime", term24990);
        setField(term24989, term24989.getClass(), "timeControlType", enum68);
        setIntField(term24989, term24989.getClass(), "halfMoves", 906181092);
        setLongField(term24989, term24989.getClass(), "milliseconds", 5219030281405653303L);
        setLongField(term24989, term24989.getClass(), "increment", -8471550651709805183L);
        setIntField(term24989, term24989.getClass(), "depth", 1045657203);
        setLongField(term24989, term24989.getClass(), "nodes", -948292411727204525L);
        setField(term24881, term24881.getClass(), "timeControl2", term24989);
        setField(term24999, term24999.getClass(), "event", term25000);
        setField(term24999, term24999.getClass(), "player", term25005);
        setField(term24999, term24999.getClass(), "games", term25010);
        setField(term24999, term24999.getClass(), "listener", term25014);
        setField(term24999, term24999.getClass(), "fileName", "mvrkADEgpp");
        setField(term24999, term24999.getClass(), "size", term25030);
        setBooleanField(term24999, term24999.getClass(), "lazyLoad", true);
        setField(term24881, term24881.getClass(), "pgnHolder", term24999);
        HashMap term25034 = new HashMap();
        HashMap term25039 = new HashMap();
        ArrayList term25044 = new ArrayList();
        ArrayList term25048 = new ArrayList();
        Integer term25064 = new Integer(-117576464);
        term25033 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder"));
        setField(term25033, term25033.getClass(), "event", term25034);
        setField(term25033, term25033.getClass(), "player", term25039);
        setField(term25033, term25033.getClass(), "games", term25044);
        setField(term25033, term25033.getClass(), "listener", term25048);
        setField(term25033, term25033.getClass(), "fileName", "pXOkjyeIRb");
        setField(term25033, term25033.getClass(), "size", term25064);
        setBooleanField(term25033, term25033.getClass(), "lazyLoad", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnHolder");
        Object[] args = new Object[1];
        args[0] = term25033;
        callMethod(klass, "setPgnHolder", argTypes, term24881, args);
    }

};


