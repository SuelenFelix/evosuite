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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class Round_setNumber_18407794362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33027;
     Object term33054;

    public Round_setNumber_18407794362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33057 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term33056 = ((Class) term33057).getDeclaredField((String) "ADJUDICATION");
        ((Field) term33056).setAccessible(true);
        Object enum92 = ((Field) term33056).get((Object) null);
        Object term33030 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term33031 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        setField(term33031, term33031.getClass(), "game", null);
        setField(term33031, term33031.getClass(), "event", null);
        setIntField(term33031, term33031.getClass(), "number", 9726679);
        setField(term33030, term33030.getClass(), "round", term33031);
        setField(term33030, term33030.getClass(), "gameId", "");
        setField(term33030, term33030.getClass(), "date", "");
        setField(term33030, term33030.getClass(), "time", "");
        setField(term33030, term33030.getClass(), "termination", enum92);
        setField(term33030, term33030.getClass(), "whitePlayer", null);
        setField(term33030, term33030.getClass(), "blackPlayer", null);
        setField(term33030, term33030.getClass(), "annotator", null);
        setField(term33030, term33030.getClass(), "plyCount", null);
        setField(term33030, term33030.getClass(), "result", null);
        setField(term33030, term33030.getClass(), "halfMoves", null);
        setField(term33030, term33030.getClass(), "variations", null);
        setField(term33030, term33030.getClass(), "comments", null);
        setField(term33030, term33030.getClass(), "nag", null);
        setField(term33030, term33030.getClass(), "property", null);
        setField(term33030, term33030.getClass(), "fen", null);
        setField(term33030, term33030.getClass(), "board", null);
        setIntField(term33030, term33030.getClass(), "position", 0);
        setIntField(term33030, term33030.getClass(), "initialPosition", 0);
        setField(term33030, term33030.getClass(), "currentMoveList", null);
        setField(term33030, term33030.getClass(), "eco", null);
        setField(term33030, term33030.getClass(), "moveText", null);
        setField(term33030, term33030.getClass(), "opening", null);
        setField(term33030, term33030.getClass(), "variation", null);
        Object term33040 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33040, term33040.getClass(), "round", null);
        setField(term33040, term33040.getClass(), "gameId", null);
        setField(term33040, term33040.getClass(), "date", null);
        setField(term33040, term33040.getClass(), "time", null);
        setField(term33040, term33040.getClass(), "termination", null);
        setField(term33040, term33040.getClass(), "whitePlayer", null);
        setField(term33040, term33040.getClass(), "blackPlayer", null);
        setField(term33040, term33040.getClass(), "annotator", null);
        setField(term33040, term33040.getClass(), "plyCount", null);
        setField(term33040, term33040.getClass(), "result", null);
        setField(term33040, term33040.getClass(), "halfMoves", null);
        setField(term33040, term33040.getClass(), "variations", null);
        setField(term33040, term33040.getClass(), "comments", null);
        setField(term33040, term33040.getClass(), "nag", null);
        setField(term33040, term33040.getClass(), "property", null);
        setField(term33040, term33040.getClass(), "fen", null);
        setField(term33040, term33040.getClass(), "board", null);
        setIntField(term33040, term33040.getClass(), "position", 0);
        setIntField(term33040, term33040.getClass(), "initialPosition", 0);
        setField(term33040, term33040.getClass(), "currentMoveList", null);
        setField(term33040, term33040.getClass(), "eco", null);
        setField(term33040, term33040.getClass(), "moveText", null);
        setField(term33040, term33040.getClass(), "opening", null);
        setField(term33040, term33040.getClass(), "variation", null);
        ArrayList term33028 = new ArrayList();
        ((ArrayList) term33028).add(term33030);
        ((ArrayList) term33028).add(term33040);
        HashMap term33046 = new HashMap();
        term33027 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term33045 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term33027, term33027.getClass(), "game", term33028);
        setField(term33045, term33045.getClass(), "round", term33046);
        setField(term33045, term33045.getClass(), "id", null);
        setField(term33045, term33045.getClass(), "name", null);
        setField(term33045, term33045.getClass(), "eventType", null);
        setField(term33045, term33045.getClass(), "startDate", null);
        setField(term33045, term33045.getClass(), "endDate", null);
        setField(term33045, term33045.getClass(), "site", null);
        setLongField(term33045, term33045.getClass(), "timestamp", 0L);
        setIntField(term33045, term33045.getClass(), "rounds", 0);
        setField(term33045, term33045.getClass(), "timeControl", null);
        setField(term33045, term33045.getClass(), "timeControl2", null);
        setField(term33045, term33045.getClass(), "pgnHolder", null);
        setField(term33027, term33027.getClass(), "event", term33045);
        setIntField(term33027, term33027.getClass(), "number", -25637976);
        term33054 = new Integer(1555897383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Round");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33054;
        callMethod(klass, "setNumber", argTypes, term33027, args);
    }

};


