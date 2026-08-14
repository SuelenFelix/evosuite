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

public class Game_getComments_177075908921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72193;

    public Game_getComments_177075908921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72197 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term72197, term72197.getClass(), "round", null);
        setField(term72197, term72197.getClass(), "gameId", null);
        setField(term72197, term72197.getClass(), "date", null);
        setField(term72197, term72197.getClass(), "time", null);
        setField(term72197, term72197.getClass(), "termination", null);
        setField(term72197, term72197.getClass(), "whitePlayer", null);
        setField(term72197, term72197.getClass(), "blackPlayer", null);
        setField(term72197, term72197.getClass(), "annotator", null);
        setField(term72197, term72197.getClass(), "plyCount", null);
        setField(term72197, term72197.getClass(), "result", null);
        setField(term72197, term72197.getClass(), "halfMoves", null);
        setField(term72197, term72197.getClass(), "variations", null);
        setField(term72197, term72197.getClass(), "comments", null);
        setField(term72197, term72197.getClass(), "nag", null);
        setField(term72197, term72197.getClass(), "property", null);
        setField(term72197, term72197.getClass(), "fen", null);
        setField(term72197, term72197.getClass(), "board", null);
        setIntField(term72197, term72197.getClass(), "position", 0);
        setIntField(term72197, term72197.getClass(), "initialPosition", 0);
        setField(term72197, term72197.getClass(), "currentMoveList", null);
        setField(term72197, term72197.getClass(), "eco", null);
        setField(term72197, term72197.getClass(), "moveText", null);
        setField(term72197, term72197.getClass(), "opening", null);
        setField(term72197, term72197.getClass(), "variation", null);
        Object term72200 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term72200, term72200.getClass(), "round", null);
        setField(term72200, term72200.getClass(), "gameId", null);
        setField(term72200, term72200.getClass(), "date", null);
        setField(term72200, term72200.getClass(), "time", null);
        setField(term72200, term72200.getClass(), "termination", null);
        setField(term72200, term72200.getClass(), "whitePlayer", null);
        setField(term72200, term72200.getClass(), "blackPlayer", null);
        setField(term72200, term72200.getClass(), "annotator", null);
        setField(term72200, term72200.getClass(), "plyCount", null);
        setField(term72200, term72200.getClass(), "result", null);
        setField(term72200, term72200.getClass(), "halfMoves", null);
        setField(term72200, term72200.getClass(), "variations", null);
        setField(term72200, term72200.getClass(), "comments", null);
        setField(term72200, term72200.getClass(), "nag", null);
        setField(term72200, term72200.getClass(), "property", null);
        setField(term72200, term72200.getClass(), "fen", null);
        setField(term72200, term72200.getClass(), "board", null);
        setIntField(term72200, term72200.getClass(), "position", 0);
        setIntField(term72200, term72200.getClass(), "initialPosition", 0);
        setField(term72200, term72200.getClass(), "currentMoveList", null);
        setField(term72200, term72200.getClass(), "eco", null);
        setField(term72200, term72200.getClass(), "moveText", null);
        setField(term72200, term72200.getClass(), "opening", null);
        setField(term72200, term72200.getClass(), "variation", null);
        ArrayList term72195 = new ArrayList();
        ((ArrayList) term72195).add(term72197);
        ((ArrayList) term72195).add(term72200);
        ((ArrayList) term72195).add(term72200);
        HashMap term72206 = new HashMap();
        Class<? extends Object> term72299 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term72298 = ((Class) term72299).getDeclaredField((String) "DEATH");
        ((Field) term72298).setAccessible(true);
        Object enum222 = ((Field) term72298).get((Object) null);
        term72193 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term72194 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term72205 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term72194, term72194.getClass(), "game", term72195);
        setField(term72205, term72205.getClass(), "round", term72206);
        setField(term72205, term72205.getClass(), "id", null);
        setField(term72205, term72205.getClass(), "name", null);
        setField(term72205, term72205.getClass(), "eventType", null);
        setField(term72205, term72205.getClass(), "startDate", null);
        setField(term72205, term72205.getClass(), "endDate", null);
        setField(term72205, term72205.getClass(), "site", null);
        setLongField(term72205, term72205.getClass(), "timestamp", 0L);
        setIntField(term72205, term72205.getClass(), "rounds", 0);
        setField(term72205, term72205.getClass(), "timeControl", null);
        setField(term72205, term72205.getClass(), "timeControl2", null);
        setField(term72205, term72205.getClass(), "pgnHolder", null);
        setField(term72194, term72194.getClass(), "event", term72205);
        setIntField(term72194, term72194.getClass(), "number", -1891015523);
        setField(term72193, term72193.getClass(), "round", term72194);
        setField(term72193, term72193.getClass(), "gameId", "lEcrFlxJXH");
        setField(term72193, term72193.getClass(), "date", "VNdDwXMYxR");
        setField(term72193, term72193.getClass(), "time", "bVbexZPmwW");
        setField(term72193, term72193.getClass(), "termination", enum222);
        setField(term72193, term72193.getClass(), "whitePlayer", null);
        setField(term72193, term72193.getClass(), "blackPlayer", null);
        setField(term72193, term72193.getClass(), "annotator", null);
        setField(term72193, term72193.getClass(), "plyCount", null);
        setField(term72193, term72193.getClass(), "result", null);
        setField(term72193, term72193.getClass(), "halfMoves", null);
        setField(term72193, term72193.getClass(), "variations", null);
        setField(term72193, term72193.getClass(), "comments", null);
        setField(term72193, term72193.getClass(), "nag", null);
        setField(term72193, term72193.getClass(), "property", null);
        setField(term72193, term72193.getClass(), "fen", null);
        setField(term72193, term72193.getClass(), "board", null);
        setIntField(term72193, term72193.getClass(), "position", 0);
        setIntField(term72193, term72193.getClass(), "initialPosition", 0);
        setField(term72193, term72193.getClass(), "currentMoveList", null);
        setField(term72193, term72193.getClass(), "eco", null);
        setField(term72193, term72193.getClass(), "moveText", null);
        setField(term72193, term72193.getClass(), "opening", null);
        setField(term72193, term72193.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComments", argTypes, term72193, args);
    }

};


