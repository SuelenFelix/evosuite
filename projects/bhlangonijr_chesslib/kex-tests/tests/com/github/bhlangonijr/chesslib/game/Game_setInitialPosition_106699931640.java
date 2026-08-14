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
import java.lang.Integer;

public class Game_setInitialPosition_106699931640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89357;
     Object term89452;

    public Game_setInitialPosition_106699931640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term89361 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89361, term89361.getClass(), "round", null);
        setField(term89361, term89361.getClass(), "gameId", null);
        setField(term89361, term89361.getClass(), "date", null);
        setField(term89361, term89361.getClass(), "time", null);
        setField(term89361, term89361.getClass(), "termination", null);
        setField(term89361, term89361.getClass(), "whitePlayer", null);
        setField(term89361, term89361.getClass(), "blackPlayer", null);
        setField(term89361, term89361.getClass(), "annotator", null);
        setField(term89361, term89361.getClass(), "plyCount", null);
        setField(term89361, term89361.getClass(), "result", null);
        setField(term89361, term89361.getClass(), "halfMoves", null);
        setField(term89361, term89361.getClass(), "variations", null);
        setField(term89361, term89361.getClass(), "comments", null);
        setField(term89361, term89361.getClass(), "nag", null);
        setField(term89361, term89361.getClass(), "property", null);
        setField(term89361, term89361.getClass(), "fen", null);
        setField(term89361, term89361.getClass(), "board", null);
        setIntField(term89361, term89361.getClass(), "position", 21031843);
        setIntField(term89361, term89361.getClass(), "initialPosition", -380787857);
        setField(term89361, term89361.getClass(), "currentMoveList", null);
        setField(term89361, term89361.getClass(), "eco", null);
        setField(term89361, term89361.getClass(), "moveText", null);
        setField(term89361, term89361.getClass(), "opening", null);
        setField(term89361, term89361.getClass(), "variation", null);
        Object term89364 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89364, term89364.getClass(), "round", null);
        setField(term89364, term89364.getClass(), "gameId", null);
        setField(term89364, term89364.getClass(), "date", null);
        setField(term89364, term89364.getClass(), "time", null);
        setField(term89364, term89364.getClass(), "termination", null);
        setField(term89364, term89364.getClass(), "whitePlayer", null);
        setField(term89364, term89364.getClass(), "blackPlayer", null);
        setField(term89364, term89364.getClass(), "annotator", null);
        setField(term89364, term89364.getClass(), "plyCount", null);
        setField(term89364, term89364.getClass(), "result", null);
        setField(term89364, term89364.getClass(), "halfMoves", null);
        setField(term89364, term89364.getClass(), "variations", null);
        setField(term89364, term89364.getClass(), "comments", null);
        setField(term89364, term89364.getClass(), "nag", null);
        setField(term89364, term89364.getClass(), "property", null);
        setField(term89364, term89364.getClass(), "fen", null);
        setField(term89364, term89364.getClass(), "board", null);
        setIntField(term89364, term89364.getClass(), "position", 0);
        setIntField(term89364, term89364.getClass(), "initialPosition", 0);
        setField(term89364, term89364.getClass(), "currentMoveList", null);
        setField(term89364, term89364.getClass(), "eco", null);
        setField(term89364, term89364.getClass(), "moveText", null);
        setField(term89364, term89364.getClass(), "opening", null);
        setField(term89364, term89364.getClass(), "variation", null);
        Object term89367 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89367, term89367.getClass(), "round", null);
        setField(term89367, term89367.getClass(), "gameId", null);
        setField(term89367, term89367.getClass(), "date", null);
        setField(term89367, term89367.getClass(), "time", null);
        setField(term89367, term89367.getClass(), "termination", null);
        setField(term89367, term89367.getClass(), "whitePlayer", null);
        setField(term89367, term89367.getClass(), "blackPlayer", null);
        setField(term89367, term89367.getClass(), "annotator", null);
        setField(term89367, term89367.getClass(), "plyCount", null);
        setField(term89367, term89367.getClass(), "result", null);
        setField(term89367, term89367.getClass(), "halfMoves", null);
        setField(term89367, term89367.getClass(), "variations", null);
        setField(term89367, term89367.getClass(), "comments", null);
        setField(term89367, term89367.getClass(), "nag", null);
        setField(term89367, term89367.getClass(), "property", null);
        setField(term89367, term89367.getClass(), "fen", null);
        setField(term89367, term89367.getClass(), "board", null);
        setIntField(term89367, term89367.getClass(), "position", 0);
        setIntField(term89367, term89367.getClass(), "initialPosition", 0);
        setField(term89367, term89367.getClass(), "currentMoveList", null);
        setField(term89367, term89367.getClass(), "eco", null);
        setField(term89367, term89367.getClass(), "moveText", null);
        setField(term89367, term89367.getClass(), "opening", null);
        setField(term89367, term89367.getClass(), "variation", null);
        Object term89370 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term89370, term89370.getClass(), "round", null);
        setField(term89370, term89370.getClass(), "gameId", null);
        setField(term89370, term89370.getClass(), "date", null);
        setField(term89370, term89370.getClass(), "time", null);
        setField(term89370, term89370.getClass(), "termination", null);
        setField(term89370, term89370.getClass(), "whitePlayer", null);
        setField(term89370, term89370.getClass(), "blackPlayer", null);
        setField(term89370, term89370.getClass(), "annotator", null);
        setField(term89370, term89370.getClass(), "plyCount", null);
        setField(term89370, term89370.getClass(), "result", null);
        setField(term89370, term89370.getClass(), "halfMoves", null);
        setField(term89370, term89370.getClass(), "variations", null);
        setField(term89370, term89370.getClass(), "comments", null);
        setField(term89370, term89370.getClass(), "nag", null);
        setField(term89370, term89370.getClass(), "property", null);
        setField(term89370, term89370.getClass(), "fen", null);
        setField(term89370, term89370.getClass(), "board", null);
        setIntField(term89370, term89370.getClass(), "position", 0);
        setIntField(term89370, term89370.getClass(), "initialPosition", 0);
        setField(term89370, term89370.getClass(), "currentMoveList", null);
        setField(term89370, term89370.getClass(), "eco", null);
        setField(term89370, term89370.getClass(), "moveText", null);
        setField(term89370, term89370.getClass(), "opening", null);
        setField(term89370, term89370.getClass(), "variation", null);
        ArrayList term89359 = new ArrayList();
        ((ArrayList) term89359).add(term89361);
        ((ArrayList) term89359).add(term89364);
        ((ArrayList) term89359).add(term89367);
        ((ArrayList) term89359).add(term89370);
        HashMap term89376 = new HashMap();
        Class<? extends Object> term89485 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term89484 = ((Class) term89485).getDeclaredField((String) "ADJUDICATION");
        ((Field) term89484).setAccessible(true);
        Object enum279 = ((Field) term89484).get((Object) null);
        term89357 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term89358 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term89375 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term89358, term89358.getClass(), "game", term89359);
        setField(term89375, term89375.getClass(), "round", term89376);
        setField(term89375, term89375.getClass(), "id", null);
        setField(term89375, term89375.getClass(), "name", null);
        setField(term89375, term89375.getClass(), "eventType", null);
        setField(term89375, term89375.getClass(), "startDate", null);
        setField(term89375, term89375.getClass(), "endDate", null);
        setField(term89375, term89375.getClass(), "site", null);
        setLongField(term89375, term89375.getClass(), "timestamp", 0L);
        setIntField(term89375, term89375.getClass(), "rounds", 0);
        setField(term89375, term89375.getClass(), "timeControl", null);
        setField(term89375, term89375.getClass(), "timeControl2", null);
        setField(term89375, term89375.getClass(), "pgnHolder", null);
        setField(term89358, term89358.getClass(), "event", term89375);
        setIntField(term89358, term89358.getClass(), "number", -516303035);
        setField(term89357, term89357.getClass(), "round", term89358);
        setField(term89357, term89357.getClass(), "gameId", "sBmtvFPDso");
        setField(term89357, term89357.getClass(), "date", "qsUIxrLolr");
        setField(term89357, term89357.getClass(), "time", "IlQxArYcgB");
        setField(term89357, term89357.getClass(), "termination", enum279);
        setField(term89357, term89357.getClass(), "whitePlayer", null);
        setField(term89357, term89357.getClass(), "blackPlayer", null);
        setField(term89357, term89357.getClass(), "annotator", null);
        setField(term89357, term89357.getClass(), "plyCount", null);
        setField(term89357, term89357.getClass(), "result", null);
        setField(term89357, term89357.getClass(), "halfMoves", null);
        setField(term89357, term89357.getClass(), "variations", null);
        setField(term89357, term89357.getClass(), "comments", null);
        setField(term89357, term89357.getClass(), "nag", null);
        setField(term89357, term89357.getClass(), "property", null);
        setField(term89357, term89357.getClass(), "fen", null);
        setField(term89357, term89357.getClass(), "board", null);
        setIntField(term89357, term89357.getClass(), "position", 0);
        setIntField(term89357, term89357.getClass(), "initialPosition", 0);
        setField(term89357, term89357.getClass(), "currentMoveList", null);
        setField(term89357, term89357.getClass(), "eco", null);
        setField(term89357, term89357.getClass(), "moveText", null);
        setField(term89357, term89357.getClass(), "opening", null);
        setField(term89357, term89357.getClass(), "variation", null);
        term89452 = new Integer(-2143043890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term89452;
        callMethod(klass, "setInitialPosition", argTypes, term89357, args);
    }

};


