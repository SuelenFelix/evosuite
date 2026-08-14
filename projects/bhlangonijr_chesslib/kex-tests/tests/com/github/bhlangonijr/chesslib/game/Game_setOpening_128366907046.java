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

public class Game_setOpening_128366907046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91373;

    public Game_setOpening_128366907046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91377 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term91377, term91377.getClass(), "round", null);
        setField(term91377, term91377.getClass(), "gameId", null);
        setField(term91377, term91377.getClass(), "date", null);
        setField(term91377, term91377.getClass(), "time", null);
        setField(term91377, term91377.getClass(), "termination", null);
        setField(term91377, term91377.getClass(), "whitePlayer", null);
        setField(term91377, term91377.getClass(), "blackPlayer", null);
        setField(term91377, term91377.getClass(), "annotator", null);
        setField(term91377, term91377.getClass(), "plyCount", null);
        setField(term91377, term91377.getClass(), "result", null);
        setField(term91377, term91377.getClass(), "halfMoves", null);
        setField(term91377, term91377.getClass(), "variations", null);
        setField(term91377, term91377.getClass(), "comments", null);
        setField(term91377, term91377.getClass(), "nag", null);
        setField(term91377, term91377.getClass(), "property", null);
        setField(term91377, term91377.getClass(), "fen", null);
        setField(term91377, term91377.getClass(), "board", null);
        setIntField(term91377, term91377.getClass(), "position", 0);
        setIntField(term91377, term91377.getClass(), "initialPosition", 0);
        setField(term91377, term91377.getClass(), "currentMoveList", null);
        setField(term91377, term91377.getClass(), "eco", null);
        setField(term91377, term91377.getClass(), "moveText", null);
        setField(term91377, term91377.getClass(), "opening", null);
        setField(term91377, term91377.getClass(), "variation", null);
        Object term91380 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term91380, term91380.getClass(), "round", null);
        setField(term91380, term91380.getClass(), "gameId", null);
        setField(term91380, term91380.getClass(), "date", null);
        setField(term91380, term91380.getClass(), "time", null);
        setField(term91380, term91380.getClass(), "termination", null);
        setField(term91380, term91380.getClass(), "whitePlayer", null);
        setField(term91380, term91380.getClass(), "blackPlayer", null);
        setField(term91380, term91380.getClass(), "annotator", null);
        setField(term91380, term91380.getClass(), "plyCount", null);
        setField(term91380, term91380.getClass(), "result", null);
        setField(term91380, term91380.getClass(), "halfMoves", null);
        setField(term91380, term91380.getClass(), "variations", null);
        setField(term91380, term91380.getClass(), "comments", null);
        setField(term91380, term91380.getClass(), "nag", null);
        setField(term91380, term91380.getClass(), "property", null);
        setField(term91380, term91380.getClass(), "fen", null);
        setField(term91380, term91380.getClass(), "board", null);
        setIntField(term91380, term91380.getClass(), "position", 0);
        setIntField(term91380, term91380.getClass(), "initialPosition", 0);
        setField(term91380, term91380.getClass(), "currentMoveList", null);
        setField(term91380, term91380.getClass(), "eco", null);
        setField(term91380, term91380.getClass(), "moveText", null);
        setField(term91380, term91380.getClass(), "opening", null);
        setField(term91380, term91380.getClass(), "variation", null);
        Object term91383 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term91383, term91383.getClass(), "round", null);
        setField(term91383, term91383.getClass(), "gameId", null);
        setField(term91383, term91383.getClass(), "date", null);
        setField(term91383, term91383.getClass(), "time", null);
        setField(term91383, term91383.getClass(), "termination", null);
        setField(term91383, term91383.getClass(), "whitePlayer", null);
        setField(term91383, term91383.getClass(), "blackPlayer", null);
        setField(term91383, term91383.getClass(), "annotator", null);
        setField(term91383, term91383.getClass(), "plyCount", null);
        setField(term91383, term91383.getClass(), "result", null);
        setField(term91383, term91383.getClass(), "halfMoves", null);
        setField(term91383, term91383.getClass(), "variations", null);
        setField(term91383, term91383.getClass(), "comments", null);
        setField(term91383, term91383.getClass(), "nag", null);
        setField(term91383, term91383.getClass(), "property", null);
        setField(term91383, term91383.getClass(), "fen", null);
        setField(term91383, term91383.getClass(), "board", null);
        setIntField(term91383, term91383.getClass(), "position", 0);
        setIntField(term91383, term91383.getClass(), "initialPosition", 0);
        setField(term91383, term91383.getClass(), "currentMoveList", null);
        setField(term91383, term91383.getClass(), "eco", null);
        setField(term91383, term91383.getClass(), "moveText", null);
        setField(term91383, term91383.getClass(), "opening", null);
        setField(term91383, term91383.getClass(), "variation", null);
        ArrayList term91375 = new ArrayList();
        ((ArrayList) term91375).add(term91377);
        ((ArrayList) term91375).add(term91380);
        ((ArrayList) term91375).add(term91383);
        HashMap term91389 = new HashMap();
        Class<? extends Object> term91502 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term91501 = ((Class) term91502).getDeclaredField((String) "EMERGENCY");
        ((Field) term91501).setAccessible(true);
        Object enum284 = ((Field) term91501).get((Object) null);
        term91373 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term91374 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term91388 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term91374, term91374.getClass(), "game", term91375);
        setField(term91388, term91388.getClass(), "round", term91389);
        setField(term91388, term91388.getClass(), "id", null);
        setField(term91388, term91388.getClass(), "name", null);
        setField(term91388, term91388.getClass(), "eventType", null);
        setField(term91388, term91388.getClass(), "startDate", null);
        setField(term91388, term91388.getClass(), "endDate", null);
        setField(term91388, term91388.getClass(), "site", null);
        setLongField(term91388, term91388.getClass(), "timestamp", 0L);
        setIntField(term91388, term91388.getClass(), "rounds", 0);
        setField(term91388, term91388.getClass(), "timeControl", null);
        setField(term91388, term91388.getClass(), "timeControl2", null);
        setField(term91388, term91388.getClass(), "pgnHolder", null);
        setField(term91374, term91374.getClass(), "event", term91388);
        setIntField(term91374, term91374.getClass(), "number", -1317044799);
        setField(term91373, term91373.getClass(), "round", term91374);
        setField(term91373, term91373.getClass(), "gameId", "kbxgTcnXyU");
        setField(term91373, term91373.getClass(), "date", "lnJvDbbuwo");
        setField(term91373, term91373.getClass(), "time", "KExnWkKGvF");
        setField(term91373, term91373.getClass(), "termination", enum284);
        setField(term91373, term91373.getClass(), "whitePlayer", null);
        setField(term91373, term91373.getClass(), "blackPlayer", null);
        setField(term91373, term91373.getClass(), "annotator", null);
        setField(term91373, term91373.getClass(), "plyCount", null);
        setField(term91373, term91373.getClass(), "result", null);
        setField(term91373, term91373.getClass(), "halfMoves", null);
        setField(term91373, term91373.getClass(), "variations", null);
        setField(term91373, term91373.getClass(), "comments", null);
        setField(term91373, term91373.getClass(), "nag", null);
        setField(term91373, term91373.getClass(), "property", null);
        setField(term91373, term91373.getClass(), "fen", null);
        setField(term91373, term91373.getClass(), "board", null);
        setIntField(term91373, term91373.getClass(), "position", 0);
        setIntField(term91373, term91373.getClass(), "initialPosition", 0);
        setField(term91373, term91373.getClass(), "currentMoveList", null);
        setField(term91373, term91373.getClass(), "eco", null);
        setField(term91373, term91373.getClass(), "moveText", null);
        setField(term91373, term91373.getClass(), "opening", null);
        setField(term91373, term91373.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "luGUNfvmKk";
        callMethod(klass, "setOpening", argTypes, term91373, args);
    }

};


