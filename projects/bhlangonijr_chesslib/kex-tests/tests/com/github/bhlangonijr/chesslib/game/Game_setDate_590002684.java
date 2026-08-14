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

public class Game_setDate_590002684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54429;

    public Game_setDate_590002684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54433 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54433, term54433.getClass(), "round", null);
        setField(term54433, term54433.getClass(), "gameId", null);
        setField(term54433, term54433.getClass(), "date", null);
        setField(term54433, term54433.getClass(), "time", null);
        setField(term54433, term54433.getClass(), "termination", null);
        setField(term54433, term54433.getClass(), "whitePlayer", null);
        setField(term54433, term54433.getClass(), "blackPlayer", null);
        setField(term54433, term54433.getClass(), "annotator", null);
        setField(term54433, term54433.getClass(), "plyCount", null);
        setField(term54433, term54433.getClass(), "result", null);
        setField(term54433, term54433.getClass(), "halfMoves", null);
        setField(term54433, term54433.getClass(), "variations", null);
        setField(term54433, term54433.getClass(), "comments", null);
        setField(term54433, term54433.getClass(), "nag", null);
        setField(term54433, term54433.getClass(), "property", null);
        setField(term54433, term54433.getClass(), "fen", null);
        setField(term54433, term54433.getClass(), "board", null);
        setIntField(term54433, term54433.getClass(), "position", 0);
        setIntField(term54433, term54433.getClass(), "initialPosition", 0);
        setField(term54433, term54433.getClass(), "currentMoveList", null);
        setField(term54433, term54433.getClass(), "eco", null);
        setField(term54433, term54433.getClass(), "moveText", null);
        setField(term54433, term54433.getClass(), "opening", null);
        setField(term54433, term54433.getClass(), "variation", null);
        Object term54436 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term54436, term54436.getClass(), "round", null);
        setField(term54436, term54436.getClass(), "gameId", null);
        setField(term54436, term54436.getClass(), "date", null);
        setField(term54436, term54436.getClass(), "time", null);
        setField(term54436, term54436.getClass(), "termination", null);
        setField(term54436, term54436.getClass(), "whitePlayer", null);
        setField(term54436, term54436.getClass(), "blackPlayer", null);
        setField(term54436, term54436.getClass(), "annotator", null);
        setField(term54436, term54436.getClass(), "plyCount", null);
        setField(term54436, term54436.getClass(), "result", null);
        setField(term54436, term54436.getClass(), "halfMoves", null);
        setField(term54436, term54436.getClass(), "variations", null);
        setField(term54436, term54436.getClass(), "comments", null);
        setField(term54436, term54436.getClass(), "nag", null);
        setField(term54436, term54436.getClass(), "property", null);
        setField(term54436, term54436.getClass(), "fen", null);
        setField(term54436, term54436.getClass(), "board", null);
        setIntField(term54436, term54436.getClass(), "position", 0);
        setIntField(term54436, term54436.getClass(), "initialPosition", 0);
        setField(term54436, term54436.getClass(), "currentMoveList", null);
        setField(term54436, term54436.getClass(), "eco", null);
        setField(term54436, term54436.getClass(), "moveText", null);
        setField(term54436, term54436.getClass(), "opening", null);
        setField(term54436, term54436.getClass(), "variation", null);
        ArrayList term54431 = new ArrayList();
        ((ArrayList) term54431).add(term54433);
        ((ArrayList) term54431).add(term54436);
        HashMap term54442 = new HashMap();
        Class<? extends Object> term54555 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term54554 = ((Class) term54555).getDeclaredField((String) "EMERGENCY");
        ((Field) term54554).setAccessible(true);
        Object enum163 = ((Field) term54554).get((Object) null);
        term54429 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term54430 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term54441 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term54430, term54430.getClass(), "game", term54431);
        setField(term54441, term54441.getClass(), "round", term54442);
        setField(term54441, term54441.getClass(), "id", null);
        setField(term54441, term54441.getClass(), "name", null);
        setField(term54441, term54441.getClass(), "eventType", null);
        setField(term54441, term54441.getClass(), "startDate", null);
        setField(term54441, term54441.getClass(), "endDate", null);
        setField(term54441, term54441.getClass(), "site", null);
        setLongField(term54441, term54441.getClass(), "timestamp", 0L);
        setIntField(term54441, term54441.getClass(), "rounds", 0);
        setField(term54441, term54441.getClass(), "timeControl", null);
        setField(term54441, term54441.getClass(), "timeControl2", null);
        setField(term54441, term54441.getClass(), "pgnHolder", null);
        setField(term54430, term54430.getClass(), "event", term54441);
        setIntField(term54430, term54430.getClass(), "number", 114754804);
        setField(term54429, term54429.getClass(), "round", term54430);
        setField(term54429, term54429.getClass(), "gameId", "xClUIcPECX");
        setField(term54429, term54429.getClass(), "date", "avhRaGZaBF");
        setField(term54429, term54429.getClass(), "time", "JkgoRtImdE");
        setField(term54429, term54429.getClass(), "termination", enum163);
        setField(term54429, term54429.getClass(), "whitePlayer", null);
        setField(term54429, term54429.getClass(), "blackPlayer", null);
        setField(term54429, term54429.getClass(), "annotator", null);
        setField(term54429, term54429.getClass(), "plyCount", null);
        setField(term54429, term54429.getClass(), "result", null);
        setField(term54429, term54429.getClass(), "halfMoves", null);
        setField(term54429, term54429.getClass(), "variations", null);
        setField(term54429, term54429.getClass(), "comments", null);
        setField(term54429, term54429.getClass(), "nag", null);
        setField(term54429, term54429.getClass(), "property", null);
        setField(term54429, term54429.getClass(), "fen", null);
        setField(term54429, term54429.getClass(), "board", null);
        setIntField(term54429, term54429.getClass(), "position", 0);
        setIntField(term54429, term54429.getClass(), "initialPosition", 0);
        setField(term54429, term54429.getClass(), "currentMoveList", null);
        setField(term54429, term54429.getClass(), "eco", null);
        setField(term54429, term54429.getClass(), "moveText", null);
        setField(term54429, term54429.getClass(), "opening", null);
        setField(term54429, term54429.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qFGKIJjlmV";
        callMethod(klass, "setDate", argTypes, term54429, args);
    }

};


