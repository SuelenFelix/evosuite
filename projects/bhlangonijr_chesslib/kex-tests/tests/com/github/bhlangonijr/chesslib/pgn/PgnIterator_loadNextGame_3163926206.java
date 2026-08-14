package com.github.bhlangonijr.chesslib.pgn;

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
import static com.github.bhlangonijr.chesslib.pgn.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class PgnIterator_loadNextGame_3163926206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;

    public PgnIterator_loadNextGame_3163926206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1519 = new ArrayList();
        ((ArrayList) term1519).add((Object)null);
        ((ArrayList) term1519).add((Object)null);
        ((ArrayList) term1519).add((Object)null);
        HashMap term1524 = new HashMap();
        Class<? extends Object> term1631 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term1630 = ((Class) term1631).getDeclaredField((String) "UNTERMINATED");
        ((Field) term1630).setAccessible(true);
        Object enum3 = ((Field) term1630).get((Object) null);
        term1516 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator"));
        Object term1517 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term1518 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term1523 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term1516, term1516.getClass(), "pgnLines", null);
        setField(term1518, term1518.getClass(), "game", term1519);
        setField(term1523, term1523.getClass(), "round", term1524);
        setField(term1523, term1523.getClass(), "id", null);
        setField(term1523, term1523.getClass(), "name", null);
        setField(term1523, term1523.getClass(), "eventType", null);
        setField(term1523, term1523.getClass(), "startDate", null);
        setField(term1523, term1523.getClass(), "endDate", null);
        setField(term1523, term1523.getClass(), "site", null);
        setLongField(term1523, term1523.getClass(), "timestamp", 0L);
        setIntField(term1523, term1523.getClass(), "rounds", 0);
        setField(term1523, term1523.getClass(), "timeControl", null);
        setField(term1523, term1523.getClass(), "timeControl2", null);
        setField(term1523, term1523.getClass(), "pgnHolder", null);
        setField(term1518, term1518.getClass(), "event", term1523);
        setIntField(term1518, term1518.getClass(), "number", -1087774327);
        setField(term1517, term1517.getClass(), "round", term1518);
        setField(term1517, term1517.getClass(), "gameId", "bWWfajKbEX");
        setField(term1517, term1517.getClass(), "date", "cAPeiZHKGJ");
        setField(term1517, term1517.getClass(), "time", "LvJFtLBaxj");
        setField(term1517, term1517.getClass(), "termination", enum3);
        setField(term1517, term1517.getClass(), "whitePlayer", null);
        setField(term1517, term1517.getClass(), "blackPlayer", null);
        setField(term1517, term1517.getClass(), "annotator", null);
        setField(term1517, term1517.getClass(), "plyCount", null);
        setField(term1517, term1517.getClass(), "result", null);
        setField(term1517, term1517.getClass(), "halfMoves", null);
        setField(term1517, term1517.getClass(), "variations", null);
        setField(term1517, term1517.getClass(), "comments", null);
        setField(term1517, term1517.getClass(), "nag", null);
        setField(term1517, term1517.getClass(), "property", null);
        setField(term1517, term1517.getClass(), "fen", null);
        setField(term1517, term1517.getClass(), "board", null);
        setIntField(term1517, term1517.getClass(), "position", 0);
        setIntField(term1517, term1517.getClass(), "initialPosition", 0);
        setField(term1517, term1517.getClass(), "currentMoveList", null);
        setField(term1517, term1517.getClass(), "eco", null);
        setField(term1517, term1517.getClass(), "moveText", null);
        setField(term1517, term1517.getClass(), "opening", null);
        setField(term1517, term1517.getClass(), "variation", null);
        setField(term1516, term1516.getClass(), "game", term1517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadNextGame", argTypes, term1516, args);
    }

};


