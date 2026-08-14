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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class Game_isStartOfMoveList_209300039363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106718;

    public Game_isStartOfMoveList_209300039363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term106722 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term106722, term106722.getClass(), "round", null);
        setField(term106722, term106722.getClass(), "gameId", null);
        setField(term106722, term106722.getClass(), "date", null);
        setField(term106722, term106722.getClass(), "time", null);
        setField(term106722, term106722.getClass(), "termination", null);
        setField(term106722, term106722.getClass(), "whitePlayer", null);
        setField(term106722, term106722.getClass(), "blackPlayer", null);
        setField(term106722, term106722.getClass(), "annotator", null);
        setField(term106722, term106722.getClass(), "plyCount", null);
        setField(term106722, term106722.getClass(), "result", null);
        setField(term106722, term106722.getClass(), "halfMoves", null);
        setField(term106722, term106722.getClass(), "variations", null);
        setField(term106722, term106722.getClass(), "comments", null);
        setField(term106722, term106722.getClass(), "nag", null);
        setField(term106722, term106722.getClass(), "property", null);
        setField(term106722, term106722.getClass(), "fen", null);
        setField(term106722, term106722.getClass(), "board", null);
        setIntField(term106722, term106722.getClass(), "position", 0);
        setIntField(term106722, term106722.getClass(), "initialPosition", 0);
        setField(term106722, term106722.getClass(), "currentMoveList", null);
        setField(term106722, term106722.getClass(), "eco", null);
        setField(term106722, term106722.getClass(), "moveText", null);
        setField(term106722, term106722.getClass(), "opening", null);
        setField(term106722, term106722.getClass(), "variation", null);
        Object term106725 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term106725, term106725.getClass(), "round", null);
        setField(term106725, term106725.getClass(), "gameId", null);
        setField(term106725, term106725.getClass(), "date", null);
        setField(term106725, term106725.getClass(), "time", null);
        setField(term106725, term106725.getClass(), "termination", null);
        setField(term106725, term106725.getClass(), "whitePlayer", null);
        setField(term106725, term106725.getClass(), "blackPlayer", null);
        setField(term106725, term106725.getClass(), "annotator", null);
        setField(term106725, term106725.getClass(), "plyCount", null);
        setField(term106725, term106725.getClass(), "result", null);
        setField(term106725, term106725.getClass(), "halfMoves", null);
        setField(term106725, term106725.getClass(), "variations", null);
        setField(term106725, term106725.getClass(), "comments", null);
        setField(term106725, term106725.getClass(), "nag", null);
        setField(term106725, term106725.getClass(), "property", null);
        setField(term106725, term106725.getClass(), "fen", null);
        setField(term106725, term106725.getClass(), "board", null);
        setIntField(term106725, term106725.getClass(), "position", 0);
        setIntField(term106725, term106725.getClass(), "initialPosition", 0);
        setField(term106725, term106725.getClass(), "currentMoveList", null);
        setField(term106725, term106725.getClass(), "eco", null);
        setField(term106725, term106725.getClass(), "moveText", null);
        setField(term106725, term106725.getClass(), "opening", null);
        setField(term106725, term106725.getClass(), "variation", null);
        Object term106728 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term106728, term106728.getClass(), "round", null);
        setField(term106728, term106728.getClass(), "gameId", null);
        setField(term106728, term106728.getClass(), "date", null);
        setField(term106728, term106728.getClass(), "time", null);
        setField(term106728, term106728.getClass(), "termination", null);
        setField(term106728, term106728.getClass(), "whitePlayer", null);
        setField(term106728, term106728.getClass(), "blackPlayer", null);
        setField(term106728, term106728.getClass(), "annotator", null);
        setField(term106728, term106728.getClass(), "plyCount", null);
        setField(term106728, term106728.getClass(), "result", null);
        setField(term106728, term106728.getClass(), "halfMoves", null);
        setField(term106728, term106728.getClass(), "variations", null);
        setField(term106728, term106728.getClass(), "comments", null);
        setField(term106728, term106728.getClass(), "nag", null);
        setField(term106728, term106728.getClass(), "property", null);
        setField(term106728, term106728.getClass(), "fen", null);
        setField(term106728, term106728.getClass(), "board", null);
        setIntField(term106728, term106728.getClass(), "position", 0);
        setIntField(term106728, term106728.getClass(), "initialPosition", 0);
        setField(term106728, term106728.getClass(), "currentMoveList", null);
        setField(term106728, term106728.getClass(), "eco", null);
        setField(term106728, term106728.getClass(), "moveText", null);
        setField(term106728, term106728.getClass(), "opening", null);
        setField(term106728, term106728.getClass(), "variation", null);
        ArrayList term106720 = new ArrayList();
        ((ArrayList) term106720).add(term106722);
        ((ArrayList) term106720).add(term106722);
        ((ArrayList) term106720).add(term106725);
        ((ArrayList) term106720).add(term106728);
        HashMap term106734 = new HashMap();
        Class<? extends Object> term106829 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term106828 = ((Class) term106829).getDeclaredField((String) "NORMAL");
        ((Field) term106828).setAccessible(true);
        Object enum336 = ((Field) term106828).get((Object) null);
        term106718 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term106719 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term106733 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term106719, term106719.getClass(), "game", term106720);
        setField(term106733, term106733.getClass(), "round", term106734);
        setField(term106733, term106733.getClass(), "id", null);
        setField(term106733, term106733.getClass(), "name", null);
        setField(term106733, term106733.getClass(), "eventType", null);
        setField(term106733, term106733.getClass(), "startDate", null);
        setField(term106733, term106733.getClass(), "endDate", null);
        setField(term106733, term106733.getClass(), "site", null);
        setLongField(term106733, term106733.getClass(), "timestamp", 0L);
        setIntField(term106733, term106733.getClass(), "rounds", 0);
        setField(term106733, term106733.getClass(), "timeControl", null);
        setField(term106733, term106733.getClass(), "timeControl2", null);
        setField(term106733, term106733.getClass(), "pgnHolder", null);
        setField(term106719, term106719.getClass(), "event", term106733);
        setIntField(term106719, term106719.getClass(), "number", 27043781);
        setField(term106718, term106718.getClass(), "round", term106719);
        setField(term106718, term106718.getClass(), "gameId", "HCvSsQWjLn");
        setField(term106718, term106718.getClass(), "date", "FTuOcSieav");
        setField(term106718, term106718.getClass(), "time", "qSnwPXRuzC");
        setField(term106718, term106718.getClass(), "termination", enum336);
        setField(term106718, term106718.getClass(), "whitePlayer", null);
        setField(term106718, term106718.getClass(), "blackPlayer", null);
        setField(term106718, term106718.getClass(), "annotator", null);
        setField(term106718, term106718.getClass(), "plyCount", null);
        setField(term106718, term106718.getClass(), "result", null);
        setField(term106718, term106718.getClass(), "halfMoves", null);
        setField(term106718, term106718.getClass(), "variations", null);
        setField(term106718, term106718.getClass(), "comments", null);
        setField(term106718, term106718.getClass(), "nag", null);
        setField(term106718, term106718.getClass(), "property", null);
        setField(term106718, term106718.getClass(), "fen", null);
        setField(term106718, term106718.getClass(), "board", null);
        setIntField(term106718, term106718.getClass(), "position", 0);
        setIntField(term106718, term106718.getClass(), "initialPosition", 0);
        setField(term106718, term106718.getClass(), "currentMoveList", null);
        setField(term106718, term106718.getClass(), "eco", null);
        setField(term106718, term106718.getClass(), "moveText", null);
        setField(term106718, term106718.getClass(), "opening", null);
        setField(term106718, term106718.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStartOfMoveList", argTypes, term106718, args);
    }

};


