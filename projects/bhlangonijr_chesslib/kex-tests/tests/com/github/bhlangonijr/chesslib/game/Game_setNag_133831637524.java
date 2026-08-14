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
import java.util.LinkedHashMap;

public class Game_setNag_133831637524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73365;
     Object term73465;

    public Game_setNag_133831637524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73369 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term73369, term73369.getClass(), "round", null);
        setField(term73369, term73369.getClass(), "gameId", null);
        setField(term73369, term73369.getClass(), "date", null);
        setField(term73369, term73369.getClass(), "time", null);
        setField(term73369, term73369.getClass(), "termination", null);
        setField(term73369, term73369.getClass(), "whitePlayer", null);
        setField(term73369, term73369.getClass(), "blackPlayer", null);
        setField(term73369, term73369.getClass(), "annotator", null);
        setField(term73369, term73369.getClass(), "plyCount", null);
        setField(term73369, term73369.getClass(), "result", null);
        setField(term73369, term73369.getClass(), "halfMoves", null);
        setField(term73369, term73369.getClass(), "variations", null);
        setField(term73369, term73369.getClass(), "comments", null);
        setField(term73369, term73369.getClass(), "nag", null);
        setField(term73369, term73369.getClass(), "property", null);
        setField(term73369, term73369.getClass(), "fen", null);
        setField(term73369, term73369.getClass(), "board", null);
        setIntField(term73369, term73369.getClass(), "position", 0);
        setIntField(term73369, term73369.getClass(), "initialPosition", 0);
        setField(term73369, term73369.getClass(), "currentMoveList", null);
        setField(term73369, term73369.getClass(), "eco", null);
        setField(term73369, term73369.getClass(), "moveText", null);
        setField(term73369, term73369.getClass(), "opening", null);
        setField(term73369, term73369.getClass(), "variation", null);
        Object term73372 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term73372, term73372.getClass(), "round", null);
        setField(term73372, term73372.getClass(), "gameId", null);
        setField(term73372, term73372.getClass(), "date", null);
        setField(term73372, term73372.getClass(), "time", null);
        setField(term73372, term73372.getClass(), "termination", null);
        setField(term73372, term73372.getClass(), "whitePlayer", null);
        setField(term73372, term73372.getClass(), "blackPlayer", null);
        setField(term73372, term73372.getClass(), "annotator", null);
        setField(term73372, term73372.getClass(), "plyCount", null);
        setField(term73372, term73372.getClass(), "result", null);
        setField(term73372, term73372.getClass(), "halfMoves", null);
        setField(term73372, term73372.getClass(), "variations", null);
        setField(term73372, term73372.getClass(), "comments", null);
        setField(term73372, term73372.getClass(), "nag", null);
        setField(term73372, term73372.getClass(), "property", null);
        setField(term73372, term73372.getClass(), "fen", null);
        setField(term73372, term73372.getClass(), "board", null);
        setIntField(term73372, term73372.getClass(), "position", 0);
        setIntField(term73372, term73372.getClass(), "initialPosition", 0);
        setField(term73372, term73372.getClass(), "currentMoveList", null);
        setField(term73372, term73372.getClass(), "eco", null);
        setField(term73372, term73372.getClass(), "moveText", null);
        setField(term73372, term73372.getClass(), "opening", null);
        setField(term73372, term73372.getClass(), "variation", null);
        Object term73375 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term73375, term73375.getClass(), "round", null);
        setField(term73375, term73375.getClass(), "gameId", null);
        setField(term73375, term73375.getClass(), "date", null);
        setField(term73375, term73375.getClass(), "time", null);
        setField(term73375, term73375.getClass(), "termination", null);
        setField(term73375, term73375.getClass(), "whitePlayer", null);
        setField(term73375, term73375.getClass(), "blackPlayer", null);
        setField(term73375, term73375.getClass(), "annotator", null);
        setField(term73375, term73375.getClass(), "plyCount", null);
        setField(term73375, term73375.getClass(), "result", null);
        setField(term73375, term73375.getClass(), "halfMoves", null);
        setField(term73375, term73375.getClass(), "variations", null);
        setField(term73375, term73375.getClass(), "comments", null);
        setField(term73375, term73375.getClass(), "nag", null);
        setField(term73375, term73375.getClass(), "property", null);
        setField(term73375, term73375.getClass(), "fen", null);
        setField(term73375, term73375.getClass(), "board", null);
        setIntField(term73375, term73375.getClass(), "position", 0);
        setIntField(term73375, term73375.getClass(), "initialPosition", 0);
        setField(term73375, term73375.getClass(), "currentMoveList", null);
        setField(term73375, term73375.getClass(), "eco", null);
        setField(term73375, term73375.getClass(), "moveText", null);
        setField(term73375, term73375.getClass(), "opening", null);
        setField(term73375, term73375.getClass(), "variation", null);
        ArrayList term73367 = new ArrayList();
        ((ArrayList) term73367).add(term73369);
        ((ArrayList) term73367).add(term73372);
        ((ArrayList) term73367).add(term73372);
        ((ArrayList) term73367).add(term73375);
        HashMap term73381 = new HashMap();
        Class<? extends Object> term73519 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term73518 = ((Class) term73519).getDeclaredField((String) "RULES_INFRACTION");
        ((Field) term73518).setAccessible(true);
        Object enum225 = ((Field) term73518).get((Object) null);
        term73365 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term73366 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term73380 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term73366, term73366.getClass(), "game", term73367);
        setField(term73380, term73380.getClass(), "round", term73381);
        setField(term73380, term73380.getClass(), "id", null);
        setField(term73380, term73380.getClass(), "name", null);
        setField(term73380, term73380.getClass(), "eventType", null);
        setField(term73380, term73380.getClass(), "startDate", null);
        setField(term73380, term73380.getClass(), "endDate", null);
        setField(term73380, term73380.getClass(), "site", null);
        setLongField(term73380, term73380.getClass(), "timestamp", 0L);
        setIntField(term73380, term73380.getClass(), "rounds", 0);
        setField(term73380, term73380.getClass(), "timeControl", null);
        setField(term73380, term73380.getClass(), "timeControl2", null);
        setField(term73380, term73380.getClass(), "pgnHolder", null);
        setField(term73366, term73366.getClass(), "event", term73380);
        setIntField(term73366, term73366.getClass(), "number", -1529797673);
        setField(term73365, term73365.getClass(), "round", term73366);
        setField(term73365, term73365.getClass(), "gameId", "YTxBqWRAlo");
        setField(term73365, term73365.getClass(), "date", "ReruUQRXwl");
        setField(term73365, term73365.getClass(), "time", "DWEsVQwuaE");
        setField(term73365, term73365.getClass(), "termination", enum225);
        setField(term73365, term73365.getClass(), "whitePlayer", null);
        setField(term73365, term73365.getClass(), "blackPlayer", null);
        setField(term73365, term73365.getClass(), "annotator", null);
        setField(term73365, term73365.getClass(), "plyCount", null);
        setField(term73365, term73365.getClass(), "result", null);
        setField(term73365, term73365.getClass(), "halfMoves", null);
        setField(term73365, term73365.getClass(), "variations", null);
        setField(term73365, term73365.getClass(), "comments", null);
        setField(term73365, term73365.getClass(), "nag", null);
        setField(term73365, term73365.getClass(), "property", null);
        setField(term73365, term73365.getClass(), "fen", null);
        setField(term73365, term73365.getClass(), "board", null);
        setIntField(term73365, term73365.getClass(), "position", 0);
        setIntField(term73365, term73365.getClass(), "initialPosition", 0);
        setField(term73365, term73365.getClass(), "currentMoveList", null);
        setField(term73365, term73365.getClass(), "eco", null);
        setField(term73365, term73365.getClass(), "moveText", null);
        setField(term73365, term73365.getClass(), "opening", null);
        setField(term73365, term73365.getClass(), "variation", null);
        term73465 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term73465;
        callMethod(klass, "setNag", argTypes, term73365, args);
    }

};


