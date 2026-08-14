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

public class Game_setEco_130756471544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90556;

    public Game_setEco_130756471544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90560 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90560, term90560.getClass(), "round", null);
        setField(term90560, term90560.getClass(), "gameId", null);
        setField(term90560, term90560.getClass(), "date", null);
        setField(term90560, term90560.getClass(), "time", null);
        setField(term90560, term90560.getClass(), "termination", null);
        setField(term90560, term90560.getClass(), "whitePlayer", null);
        setField(term90560, term90560.getClass(), "blackPlayer", null);
        setField(term90560, term90560.getClass(), "annotator", null);
        setField(term90560, term90560.getClass(), "plyCount", null);
        setField(term90560, term90560.getClass(), "result", null);
        setField(term90560, term90560.getClass(), "halfMoves", null);
        setField(term90560, term90560.getClass(), "variations", null);
        setField(term90560, term90560.getClass(), "comments", null);
        setField(term90560, term90560.getClass(), "nag", null);
        setField(term90560, term90560.getClass(), "property", null);
        setField(term90560, term90560.getClass(), "fen", null);
        setField(term90560, term90560.getClass(), "board", null);
        setIntField(term90560, term90560.getClass(), "position", 0);
        setIntField(term90560, term90560.getClass(), "initialPosition", 0);
        setField(term90560, term90560.getClass(), "currentMoveList", null);
        setField(term90560, term90560.getClass(), "eco", null);
        setField(term90560, term90560.getClass(), "moveText", null);
        setField(term90560, term90560.getClass(), "opening", null);
        setField(term90560, term90560.getClass(), "variation", null);
        Object term90563 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90563, term90563.getClass(), "round", null);
        setField(term90563, term90563.getClass(), "gameId", null);
        setField(term90563, term90563.getClass(), "date", null);
        setField(term90563, term90563.getClass(), "time", null);
        setField(term90563, term90563.getClass(), "termination", null);
        setField(term90563, term90563.getClass(), "whitePlayer", null);
        setField(term90563, term90563.getClass(), "blackPlayer", null);
        setField(term90563, term90563.getClass(), "annotator", null);
        setField(term90563, term90563.getClass(), "plyCount", null);
        setField(term90563, term90563.getClass(), "result", null);
        setField(term90563, term90563.getClass(), "halfMoves", null);
        setField(term90563, term90563.getClass(), "variations", null);
        setField(term90563, term90563.getClass(), "comments", null);
        setField(term90563, term90563.getClass(), "nag", null);
        setField(term90563, term90563.getClass(), "property", null);
        setField(term90563, term90563.getClass(), "fen", null);
        setField(term90563, term90563.getClass(), "board", null);
        setIntField(term90563, term90563.getClass(), "position", 0);
        setIntField(term90563, term90563.getClass(), "initialPosition", 0);
        setField(term90563, term90563.getClass(), "currentMoveList", null);
        setField(term90563, term90563.getClass(), "eco", null);
        setField(term90563, term90563.getClass(), "moveText", null);
        setField(term90563, term90563.getClass(), "opening", null);
        setField(term90563, term90563.getClass(), "variation", null);
        Object term90566 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90566, term90566.getClass(), "round", null);
        setField(term90566, term90566.getClass(), "gameId", null);
        setField(term90566, term90566.getClass(), "date", null);
        setField(term90566, term90566.getClass(), "time", null);
        setField(term90566, term90566.getClass(), "termination", null);
        setField(term90566, term90566.getClass(), "whitePlayer", null);
        setField(term90566, term90566.getClass(), "blackPlayer", null);
        setField(term90566, term90566.getClass(), "annotator", null);
        setField(term90566, term90566.getClass(), "plyCount", null);
        setField(term90566, term90566.getClass(), "result", null);
        setField(term90566, term90566.getClass(), "halfMoves", null);
        setField(term90566, term90566.getClass(), "variations", null);
        setField(term90566, term90566.getClass(), "comments", null);
        setField(term90566, term90566.getClass(), "nag", null);
        setField(term90566, term90566.getClass(), "property", null);
        setField(term90566, term90566.getClass(), "fen", null);
        setField(term90566, term90566.getClass(), "board", null);
        setIntField(term90566, term90566.getClass(), "position", 0);
        setIntField(term90566, term90566.getClass(), "initialPosition", 0);
        setField(term90566, term90566.getClass(), "currentMoveList", null);
        setField(term90566, term90566.getClass(), "eco", null);
        setField(term90566, term90566.getClass(), "moveText", null);
        setField(term90566, term90566.getClass(), "opening", null);
        setField(term90566, term90566.getClass(), "variation", null);
        ArrayList term90558 = new ArrayList();
        ((ArrayList) term90558).add(term90560);
        ((ArrayList) term90558).add(term90563);
        ((ArrayList) term90558).add(term90566);
        HashMap term90572 = new HashMap();
        Class<? extends Object> term90691 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term90690 = ((Class) term90691).getDeclaredField((String) "TIME_FORFEIT");
        ((Field) term90690).setAccessible(true);
        Object enum282 = ((Field) term90690).get((Object) null);
        term90556 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term90557 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term90571 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term90557, term90557.getClass(), "game", term90558);
        setField(term90571, term90571.getClass(), "round", term90572);
        setField(term90571, term90571.getClass(), "id", null);
        setField(term90571, term90571.getClass(), "name", null);
        setField(term90571, term90571.getClass(), "eventType", null);
        setField(term90571, term90571.getClass(), "startDate", null);
        setField(term90571, term90571.getClass(), "endDate", null);
        setField(term90571, term90571.getClass(), "site", null);
        setLongField(term90571, term90571.getClass(), "timestamp", 0L);
        setIntField(term90571, term90571.getClass(), "rounds", 0);
        setField(term90571, term90571.getClass(), "timeControl", null);
        setField(term90571, term90571.getClass(), "timeControl2", null);
        setField(term90571, term90571.getClass(), "pgnHolder", null);
        setField(term90557, term90557.getClass(), "event", term90571);
        setIntField(term90557, term90557.getClass(), "number", 1692937831);
        setField(term90556, term90556.getClass(), "round", term90557);
        setField(term90556, term90556.getClass(), "gameId", "WfUmxdiHcU");
        setField(term90556, term90556.getClass(), "date", "BRrftvRvmF");
        setField(term90556, term90556.getClass(), "time", "fvoyRbZTsm");
        setField(term90556, term90556.getClass(), "termination", enum282);
        setField(term90556, term90556.getClass(), "whitePlayer", null);
        setField(term90556, term90556.getClass(), "blackPlayer", null);
        setField(term90556, term90556.getClass(), "annotator", null);
        setField(term90556, term90556.getClass(), "plyCount", null);
        setField(term90556, term90556.getClass(), "result", null);
        setField(term90556, term90556.getClass(), "halfMoves", null);
        setField(term90556, term90556.getClass(), "variations", null);
        setField(term90556, term90556.getClass(), "comments", null);
        setField(term90556, term90556.getClass(), "nag", null);
        setField(term90556, term90556.getClass(), "property", null);
        setField(term90556, term90556.getClass(), "fen", null);
        setField(term90556, term90556.getClass(), "board", null);
        setIntField(term90556, term90556.getClass(), "position", 0);
        setIntField(term90556, term90556.getClass(), "initialPosition", 0);
        setField(term90556, term90556.getClass(), "currentMoveList", null);
        setField(term90556, term90556.getClass(), "eco", null);
        setField(term90556, term90556.getClass(), "moveText", null);
        setField(term90556, term90556.getClass(), "opening", null);
        setField(term90556, term90556.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iOCnOQXWTl";
        callMethod(klass, "setEco", argTypes, term90556, args);
    }

};


