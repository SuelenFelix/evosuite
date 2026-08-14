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

public class Game_getPosition_114843617037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88108;

    public Game_getPosition_114843617037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88112 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88112, term88112.getClass(), "round", null);
        setField(term88112, term88112.getClass(), "gameId", null);
        setField(term88112, term88112.getClass(), "date", null);
        setField(term88112, term88112.getClass(), "time", null);
        setField(term88112, term88112.getClass(), "termination", null);
        setField(term88112, term88112.getClass(), "whitePlayer", null);
        setField(term88112, term88112.getClass(), "blackPlayer", null);
        setField(term88112, term88112.getClass(), "annotator", null);
        setField(term88112, term88112.getClass(), "plyCount", null);
        setField(term88112, term88112.getClass(), "result", null);
        setField(term88112, term88112.getClass(), "halfMoves", null);
        setField(term88112, term88112.getClass(), "variations", null);
        setField(term88112, term88112.getClass(), "comments", null);
        setField(term88112, term88112.getClass(), "nag", null);
        setField(term88112, term88112.getClass(), "property", null);
        setField(term88112, term88112.getClass(), "fen", null);
        setField(term88112, term88112.getClass(), "board", null);
        setIntField(term88112, term88112.getClass(), "position", 0);
        setIntField(term88112, term88112.getClass(), "initialPosition", 0);
        setField(term88112, term88112.getClass(), "currentMoveList", null);
        setField(term88112, term88112.getClass(), "eco", null);
        setField(term88112, term88112.getClass(), "moveText", null);
        setField(term88112, term88112.getClass(), "opening", null);
        setField(term88112, term88112.getClass(), "variation", null);
        Object term88115 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88115, term88115.getClass(), "round", null);
        setField(term88115, term88115.getClass(), "gameId", null);
        setField(term88115, term88115.getClass(), "date", null);
        setField(term88115, term88115.getClass(), "time", null);
        setField(term88115, term88115.getClass(), "termination", null);
        setField(term88115, term88115.getClass(), "whitePlayer", null);
        setField(term88115, term88115.getClass(), "blackPlayer", null);
        setField(term88115, term88115.getClass(), "annotator", null);
        setField(term88115, term88115.getClass(), "plyCount", null);
        setField(term88115, term88115.getClass(), "result", null);
        setField(term88115, term88115.getClass(), "halfMoves", null);
        setField(term88115, term88115.getClass(), "variations", null);
        setField(term88115, term88115.getClass(), "comments", null);
        setField(term88115, term88115.getClass(), "nag", null);
        setField(term88115, term88115.getClass(), "property", null);
        setField(term88115, term88115.getClass(), "fen", null);
        setField(term88115, term88115.getClass(), "board", null);
        setIntField(term88115, term88115.getClass(), "position", 0);
        setIntField(term88115, term88115.getClass(), "initialPosition", 0);
        setField(term88115, term88115.getClass(), "currentMoveList", null);
        setField(term88115, term88115.getClass(), "eco", null);
        setField(term88115, term88115.getClass(), "moveText", null);
        setField(term88115, term88115.getClass(), "opening", null);
        setField(term88115, term88115.getClass(), "variation", null);
        Object term88118 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88118, term88118.getClass(), "round", null);
        setField(term88118, term88118.getClass(), "gameId", null);
        setField(term88118, term88118.getClass(), "date", null);
        setField(term88118, term88118.getClass(), "time", null);
        setField(term88118, term88118.getClass(), "termination", null);
        setField(term88118, term88118.getClass(), "whitePlayer", null);
        setField(term88118, term88118.getClass(), "blackPlayer", null);
        setField(term88118, term88118.getClass(), "annotator", null);
        setField(term88118, term88118.getClass(), "plyCount", null);
        setField(term88118, term88118.getClass(), "result", null);
        setField(term88118, term88118.getClass(), "halfMoves", null);
        setField(term88118, term88118.getClass(), "variations", null);
        setField(term88118, term88118.getClass(), "comments", null);
        setField(term88118, term88118.getClass(), "nag", null);
        setField(term88118, term88118.getClass(), "property", null);
        setField(term88118, term88118.getClass(), "fen", null);
        setField(term88118, term88118.getClass(), "board", null);
        setIntField(term88118, term88118.getClass(), "position", 0);
        setIntField(term88118, term88118.getClass(), "initialPosition", 0);
        setField(term88118, term88118.getClass(), "currentMoveList", null);
        setField(term88118, term88118.getClass(), "eco", null);
        setField(term88118, term88118.getClass(), "moveText", null);
        setField(term88118, term88118.getClass(), "opening", null);
        setField(term88118, term88118.getClass(), "variation", null);
        Object term88121 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88121, term88121.getClass(), "round", null);
        setField(term88121, term88121.getClass(), "gameId", null);
        setField(term88121, term88121.getClass(), "date", null);
        setField(term88121, term88121.getClass(), "time", null);
        setField(term88121, term88121.getClass(), "termination", null);
        setField(term88121, term88121.getClass(), "whitePlayer", null);
        setField(term88121, term88121.getClass(), "blackPlayer", null);
        setField(term88121, term88121.getClass(), "annotator", null);
        setField(term88121, term88121.getClass(), "plyCount", null);
        setField(term88121, term88121.getClass(), "result", null);
        setField(term88121, term88121.getClass(), "halfMoves", null);
        setField(term88121, term88121.getClass(), "variations", null);
        setField(term88121, term88121.getClass(), "comments", null);
        setField(term88121, term88121.getClass(), "nag", null);
        setField(term88121, term88121.getClass(), "property", null);
        setField(term88121, term88121.getClass(), "fen", null);
        setField(term88121, term88121.getClass(), "board", null);
        setIntField(term88121, term88121.getClass(), "position", 0);
        setIntField(term88121, term88121.getClass(), "initialPosition", 0);
        setField(term88121, term88121.getClass(), "currentMoveList", null);
        setField(term88121, term88121.getClass(), "eco", null);
        setField(term88121, term88121.getClass(), "moveText", null);
        setField(term88121, term88121.getClass(), "opening", null);
        setField(term88121, term88121.getClass(), "variation", null);
        ArrayList term88110 = new ArrayList();
        ((ArrayList) term88110).add(term88112);
        ((ArrayList) term88110).add(term88115);
        ((ArrayList) term88110).add(term88118);
        ((ArrayList) term88110).add(term88121);
        HashMap term88127 = new HashMap();
        Class<? extends Object> term88234 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term88233 = ((Class) term88234).getDeclaredField((String) "ADJUDICATION");
        ((Field) term88233).setAccessible(true);
        Object enum276 = ((Field) term88233).get((Object) null);
        term88108 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term88109 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term88126 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term88109, term88109.getClass(), "game", term88110);
        setField(term88126, term88126.getClass(), "round", term88127);
        setField(term88126, term88126.getClass(), "id", null);
        setField(term88126, term88126.getClass(), "name", null);
        setField(term88126, term88126.getClass(), "eventType", null);
        setField(term88126, term88126.getClass(), "startDate", null);
        setField(term88126, term88126.getClass(), "endDate", null);
        setField(term88126, term88126.getClass(), "site", null);
        setLongField(term88126, term88126.getClass(), "timestamp", 0L);
        setIntField(term88126, term88126.getClass(), "rounds", 0);
        setField(term88126, term88126.getClass(), "timeControl", null);
        setField(term88126, term88126.getClass(), "timeControl2", null);
        setField(term88126, term88126.getClass(), "pgnHolder", null);
        setField(term88109, term88109.getClass(), "event", term88126);
        setIntField(term88109, term88109.getClass(), "number", 1289741214);
        setField(term88108, term88108.getClass(), "round", term88109);
        setField(term88108, term88108.getClass(), "gameId", "olmFxfIVeh");
        setField(term88108, term88108.getClass(), "date", "iSPirUEhXs");
        setField(term88108, term88108.getClass(), "time", "WWyLFmYpAy");
        setField(term88108, term88108.getClass(), "termination", enum276);
        setField(term88108, term88108.getClass(), "whitePlayer", null);
        setField(term88108, term88108.getClass(), "blackPlayer", null);
        setField(term88108, term88108.getClass(), "annotator", null);
        setField(term88108, term88108.getClass(), "plyCount", null);
        setField(term88108, term88108.getClass(), "result", null);
        setField(term88108, term88108.getClass(), "halfMoves", null);
        setField(term88108, term88108.getClass(), "variations", null);
        setField(term88108, term88108.getClass(), "comments", null);
        setField(term88108, term88108.getClass(), "nag", null);
        setField(term88108, term88108.getClass(), "property", null);
        setField(term88108, term88108.getClass(), "fen", null);
        setField(term88108, term88108.getClass(), "board", null);
        setIntField(term88108, term88108.getClass(), "position", 0);
        setIntField(term88108, term88108.getClass(), "initialPosition", 0);
        setField(term88108, term88108.getClass(), "currentMoveList", null);
        setField(term88108, term88108.getClass(), "eco", null);
        setField(term88108, term88108.getClass(), "moveText", null);
        setField(term88108, term88108.getClass(), "opening", null);
        setField(term88108, term88108.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPosition", argTypes, term88108, args);
    }

};


