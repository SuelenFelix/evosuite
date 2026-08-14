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

public class Round_getEvent_20719571354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33637;

    public Round_getEvent_20719571354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33678 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term33677 = ((Class) term33678).getDeclaredField((String) "EMERGENCY");
        ((Field) term33677).setAccessible(true);
        Object enum94 = ((Field) term33677).get((Object) null);
        Object term33640 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term33641 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        setField(term33641, term33641.getClass(), "game", null);
        setField(term33641, term33641.getClass(), "event", null);
        setIntField(term33641, term33641.getClass(), "number", 1598895173);
        setField(term33640, term33640.getClass(), "round", term33641);
        setField(term33640, term33640.getClass(), "gameId", "");
        setField(term33640, term33640.getClass(), "date", "");
        setField(term33640, term33640.getClass(), "time", "");
        setField(term33640, term33640.getClass(), "termination", enum94);
        setField(term33640, term33640.getClass(), "whitePlayer", null);
        setField(term33640, term33640.getClass(), "blackPlayer", null);
        setField(term33640, term33640.getClass(), "annotator", null);
        setField(term33640, term33640.getClass(), "plyCount", null);
        setField(term33640, term33640.getClass(), "result", null);
        setField(term33640, term33640.getClass(), "halfMoves", null);
        setField(term33640, term33640.getClass(), "variations", null);
        setField(term33640, term33640.getClass(), "comments", null);
        setField(term33640, term33640.getClass(), "nag", null);
        setField(term33640, term33640.getClass(), "property", null);
        setField(term33640, term33640.getClass(), "fen", null);
        setField(term33640, term33640.getClass(), "board", null);
        setIntField(term33640, term33640.getClass(), "position", 0);
        setIntField(term33640, term33640.getClass(), "initialPosition", 0);
        setField(term33640, term33640.getClass(), "currentMoveList", null);
        setField(term33640, term33640.getClass(), "eco", null);
        setField(term33640, term33640.getClass(), "moveText", null);
        setField(term33640, term33640.getClass(), "opening", null);
        setField(term33640, term33640.getClass(), "variation", null);
        Object term33650 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33650, term33650.getClass(), "round", null);
        setField(term33650, term33650.getClass(), "gameId", null);
        setField(term33650, term33650.getClass(), "date", null);
        setField(term33650, term33650.getClass(), "time", null);
        setField(term33650, term33650.getClass(), "termination", null);
        setField(term33650, term33650.getClass(), "whitePlayer", null);
        setField(term33650, term33650.getClass(), "blackPlayer", null);
        setField(term33650, term33650.getClass(), "annotator", null);
        setField(term33650, term33650.getClass(), "plyCount", null);
        setField(term33650, term33650.getClass(), "result", null);
        setField(term33650, term33650.getClass(), "halfMoves", null);
        setField(term33650, term33650.getClass(), "variations", null);
        setField(term33650, term33650.getClass(), "comments", null);
        setField(term33650, term33650.getClass(), "nag", null);
        setField(term33650, term33650.getClass(), "property", null);
        setField(term33650, term33650.getClass(), "fen", null);
        setField(term33650, term33650.getClass(), "board", null);
        setIntField(term33650, term33650.getClass(), "position", 0);
        setIntField(term33650, term33650.getClass(), "initialPosition", 0);
        setField(term33650, term33650.getClass(), "currentMoveList", null);
        setField(term33650, term33650.getClass(), "eco", null);
        setField(term33650, term33650.getClass(), "moveText", null);
        setField(term33650, term33650.getClass(), "opening", null);
        setField(term33650, term33650.getClass(), "variation", null);
        Object term33653 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33653, term33653.getClass(), "round", null);
        setField(term33653, term33653.getClass(), "gameId", null);
        setField(term33653, term33653.getClass(), "date", null);
        setField(term33653, term33653.getClass(), "time", null);
        setField(term33653, term33653.getClass(), "termination", null);
        setField(term33653, term33653.getClass(), "whitePlayer", null);
        setField(term33653, term33653.getClass(), "blackPlayer", null);
        setField(term33653, term33653.getClass(), "annotator", null);
        setField(term33653, term33653.getClass(), "plyCount", null);
        setField(term33653, term33653.getClass(), "result", null);
        setField(term33653, term33653.getClass(), "halfMoves", null);
        setField(term33653, term33653.getClass(), "variations", null);
        setField(term33653, term33653.getClass(), "comments", null);
        setField(term33653, term33653.getClass(), "nag", null);
        setField(term33653, term33653.getClass(), "property", null);
        setField(term33653, term33653.getClass(), "fen", null);
        setField(term33653, term33653.getClass(), "board", null);
        setIntField(term33653, term33653.getClass(), "position", 0);
        setIntField(term33653, term33653.getClass(), "initialPosition", 0);
        setField(term33653, term33653.getClass(), "currentMoveList", null);
        setField(term33653, term33653.getClass(), "eco", null);
        setField(term33653, term33653.getClass(), "moveText", null);
        setField(term33653, term33653.getClass(), "opening", null);
        setField(term33653, term33653.getClass(), "variation", null);
        Class<? extends Object> term33952 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term33951 = ((Class) term33952).getDeclaredField((String) "ADJUDICATION");
        ((Field) term33951).setAccessible(true);
        Object enum95 = ((Field) term33951).get((Object) null);
        Object term33656 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term33657 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        setField(term33657, term33657.getClass(), "game", null);
        setField(term33657, term33657.getClass(), "event", null);
        setIntField(term33657, term33657.getClass(), "number", 0);
        setField(term33656, term33656.getClass(), "round", term33657);
        setField(term33656, term33656.getClass(), "gameId", "");
        setField(term33656, term33656.getClass(), "date", "");
        setField(term33656, term33656.getClass(), "time", "");
        setField(term33656, term33656.getClass(), "termination", enum95);
        setField(term33656, term33656.getClass(), "whitePlayer", null);
        setField(term33656, term33656.getClass(), "blackPlayer", null);
        setField(term33656, term33656.getClass(), "annotator", null);
        setField(term33656, term33656.getClass(), "plyCount", null);
        setField(term33656, term33656.getClass(), "result", null);
        setField(term33656, term33656.getClass(), "halfMoves", null);
        setField(term33656, term33656.getClass(), "variations", null);
        setField(term33656, term33656.getClass(), "comments", null);
        setField(term33656, term33656.getClass(), "nag", null);
        setField(term33656, term33656.getClass(), "property", null);
        setField(term33656, term33656.getClass(), "fen", null);
        setField(term33656, term33656.getClass(), "board", null);
        setIntField(term33656, term33656.getClass(), "position", 0);
        setIntField(term33656, term33656.getClass(), "initialPosition", 0);
        setField(term33656, term33656.getClass(), "currentMoveList", null);
        setField(term33656, term33656.getClass(), "eco", null);
        setField(term33656, term33656.getClass(), "moveText", null);
        setField(term33656, term33656.getClass(), "opening", null);
        setField(term33656, term33656.getClass(), "variation", null);
        ArrayList term33638 = new ArrayList();
        ((ArrayList) term33638).add(term33640);
        ((ArrayList) term33638).add(term33650);
        ((ArrayList) term33638).add(term33653);
        ((ArrayList) term33638).add(term33653);
        ((ArrayList) term33638).add(term33656);
        ((ArrayList) term33638).add(term33650);
        ((ArrayList) term33638).add(term33653);
        HashMap term33669 = new HashMap();
        term33637 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term33668 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term33637, term33637.getClass(), "game", term33638);
        setField(term33668, term33668.getClass(), "round", term33669);
        setField(term33668, term33668.getClass(), "id", null);
        setField(term33668, term33668.getClass(), "name", null);
        setField(term33668, term33668.getClass(), "eventType", null);
        setField(term33668, term33668.getClass(), "startDate", null);
        setField(term33668, term33668.getClass(), "endDate", null);
        setField(term33668, term33668.getClass(), "site", null);
        setLongField(term33668, term33668.getClass(), "timestamp", 0L);
        setIntField(term33668, term33668.getClass(), "rounds", 0);
        setField(term33668, term33668.getClass(), "timeControl", null);
        setField(term33668, term33668.getClass(), "timeControl2", null);
        setField(term33668, term33668.getClass(), "pgnHolder", null);
        setField(term33637, term33637.getClass(), "event", term33668);
        setIntField(term33637, term33637.getClass(), "number", 1830648570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Round");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEvent", argTypes, term33637, args);
    }

};


