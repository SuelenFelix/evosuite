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

public class Game_getInitialPosition_45970316639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88929;

    public Game_getInitialPosition_45970316639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term88933 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88933, term88933.getClass(), "round", null);
        setField(term88933, term88933.getClass(), "gameId", null);
        setField(term88933, term88933.getClass(), "date", null);
        setField(term88933, term88933.getClass(), "time", null);
        setField(term88933, term88933.getClass(), "termination", null);
        setField(term88933, term88933.getClass(), "whitePlayer", null);
        setField(term88933, term88933.getClass(), "blackPlayer", null);
        setField(term88933, term88933.getClass(), "annotator", null);
        setField(term88933, term88933.getClass(), "plyCount", null);
        setField(term88933, term88933.getClass(), "result", null);
        setField(term88933, term88933.getClass(), "halfMoves", null);
        setField(term88933, term88933.getClass(), "variations", null);
        setField(term88933, term88933.getClass(), "comments", null);
        setField(term88933, term88933.getClass(), "nag", null);
        setField(term88933, term88933.getClass(), "property", null);
        setField(term88933, term88933.getClass(), "fen", null);
        setField(term88933, term88933.getClass(), "board", null);
        setIntField(term88933, term88933.getClass(), "position", 0);
        setIntField(term88933, term88933.getClass(), "initialPosition", 0);
        setField(term88933, term88933.getClass(), "currentMoveList", null);
        setField(term88933, term88933.getClass(), "eco", null);
        setField(term88933, term88933.getClass(), "moveText", null);
        setField(term88933, term88933.getClass(), "opening", null);
        setField(term88933, term88933.getClass(), "variation", null);
        Object term88936 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88936, term88936.getClass(), "round", null);
        setField(term88936, term88936.getClass(), "gameId", null);
        setField(term88936, term88936.getClass(), "date", null);
        setField(term88936, term88936.getClass(), "time", null);
        setField(term88936, term88936.getClass(), "termination", null);
        setField(term88936, term88936.getClass(), "whitePlayer", null);
        setField(term88936, term88936.getClass(), "blackPlayer", null);
        setField(term88936, term88936.getClass(), "annotator", null);
        setField(term88936, term88936.getClass(), "plyCount", null);
        setField(term88936, term88936.getClass(), "result", null);
        setField(term88936, term88936.getClass(), "halfMoves", null);
        setField(term88936, term88936.getClass(), "variations", null);
        setField(term88936, term88936.getClass(), "comments", null);
        setField(term88936, term88936.getClass(), "nag", null);
        setField(term88936, term88936.getClass(), "property", null);
        setField(term88936, term88936.getClass(), "fen", null);
        setField(term88936, term88936.getClass(), "board", null);
        setIntField(term88936, term88936.getClass(), "position", 0);
        setIntField(term88936, term88936.getClass(), "initialPosition", 0);
        setField(term88936, term88936.getClass(), "currentMoveList", null);
        setField(term88936, term88936.getClass(), "eco", null);
        setField(term88936, term88936.getClass(), "moveText", null);
        setField(term88936, term88936.getClass(), "opening", null);
        setField(term88936, term88936.getClass(), "variation", null);
        Object term88939 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88939, term88939.getClass(), "round", null);
        setField(term88939, term88939.getClass(), "gameId", null);
        setField(term88939, term88939.getClass(), "date", null);
        setField(term88939, term88939.getClass(), "time", null);
        setField(term88939, term88939.getClass(), "termination", null);
        setField(term88939, term88939.getClass(), "whitePlayer", null);
        setField(term88939, term88939.getClass(), "blackPlayer", null);
        setField(term88939, term88939.getClass(), "annotator", null);
        setField(term88939, term88939.getClass(), "plyCount", null);
        setField(term88939, term88939.getClass(), "result", null);
        setField(term88939, term88939.getClass(), "halfMoves", null);
        setField(term88939, term88939.getClass(), "variations", null);
        setField(term88939, term88939.getClass(), "comments", null);
        setField(term88939, term88939.getClass(), "nag", null);
        setField(term88939, term88939.getClass(), "property", null);
        setField(term88939, term88939.getClass(), "fen", null);
        setField(term88939, term88939.getClass(), "board", null);
        setIntField(term88939, term88939.getClass(), "position", 0);
        setIntField(term88939, term88939.getClass(), "initialPosition", 0);
        setField(term88939, term88939.getClass(), "currentMoveList", null);
        setField(term88939, term88939.getClass(), "eco", null);
        setField(term88939, term88939.getClass(), "moveText", null);
        setField(term88939, term88939.getClass(), "opening", null);
        setField(term88939, term88939.getClass(), "variation", null);
        Object term88942 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term88942, term88942.getClass(), "round", null);
        setField(term88942, term88942.getClass(), "gameId", null);
        setField(term88942, term88942.getClass(), "date", null);
        setField(term88942, term88942.getClass(), "time", null);
        setField(term88942, term88942.getClass(), "termination", null);
        setField(term88942, term88942.getClass(), "whitePlayer", null);
        setField(term88942, term88942.getClass(), "blackPlayer", null);
        setField(term88942, term88942.getClass(), "annotator", null);
        setField(term88942, term88942.getClass(), "plyCount", null);
        setField(term88942, term88942.getClass(), "result", null);
        setField(term88942, term88942.getClass(), "halfMoves", null);
        setField(term88942, term88942.getClass(), "variations", null);
        setField(term88942, term88942.getClass(), "comments", null);
        setField(term88942, term88942.getClass(), "nag", null);
        setField(term88942, term88942.getClass(), "property", null);
        setField(term88942, term88942.getClass(), "fen", null);
        setField(term88942, term88942.getClass(), "board", null);
        setIntField(term88942, term88942.getClass(), "position", 0);
        setIntField(term88942, term88942.getClass(), "initialPosition", 0);
        setField(term88942, term88942.getClass(), "currentMoveList", null);
        setField(term88942, term88942.getClass(), "eco", null);
        setField(term88942, term88942.getClass(), "moveText", null);
        setField(term88942, term88942.getClass(), "opening", null);
        setField(term88942, term88942.getClass(), "variation", null);
        ArrayList term88931 = new ArrayList();
        ((ArrayList) term88931).add(term88933);
        ((ArrayList) term88931).add(term88933);
        ((ArrayList) term88931).add(term88936);
        ((ArrayList) term88931).add(term88939);
        ((ArrayList) term88931).add(term88939);
        ((ArrayList) term88931).add(term88942);
        ((ArrayList) term88931).add(term88936);
        ((ArrayList) term88931).add(term88939);
        HashMap term88948 = new HashMap();
        Class<? extends Object> term89063 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term89062 = ((Class) term89063).getDeclaredField((String) "RULES_INFRACTION");
        ((Field) term89062).setAccessible(true);
        Object enum278 = ((Field) term89062).get((Object) null);
        term88929 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term88930 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term88947 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term88930, term88930.getClass(), "game", term88931);
        setField(term88947, term88947.getClass(), "round", term88948);
        setField(term88947, term88947.getClass(), "id", null);
        setField(term88947, term88947.getClass(), "name", null);
        setField(term88947, term88947.getClass(), "eventType", null);
        setField(term88947, term88947.getClass(), "startDate", null);
        setField(term88947, term88947.getClass(), "endDate", null);
        setField(term88947, term88947.getClass(), "site", null);
        setLongField(term88947, term88947.getClass(), "timestamp", 0L);
        setIntField(term88947, term88947.getClass(), "rounds", 0);
        setField(term88947, term88947.getClass(), "timeControl", null);
        setField(term88947, term88947.getClass(), "timeControl2", null);
        setField(term88947, term88947.getClass(), "pgnHolder", null);
        setField(term88930, term88930.getClass(), "event", term88947);
        setIntField(term88930, term88930.getClass(), "number", -1736183862);
        setField(term88929, term88929.getClass(), "round", term88930);
        setField(term88929, term88929.getClass(), "gameId", "XUVRcnELFP");
        setField(term88929, term88929.getClass(), "date", "xIeSbezmkD");
        setField(term88929, term88929.getClass(), "time", "txUWLZRkSv");
        setField(term88929, term88929.getClass(), "termination", enum278);
        setField(term88929, term88929.getClass(), "whitePlayer", null);
        setField(term88929, term88929.getClass(), "blackPlayer", null);
        setField(term88929, term88929.getClass(), "annotator", null);
        setField(term88929, term88929.getClass(), "plyCount", null);
        setField(term88929, term88929.getClass(), "result", null);
        setField(term88929, term88929.getClass(), "halfMoves", null);
        setField(term88929, term88929.getClass(), "variations", null);
        setField(term88929, term88929.getClass(), "comments", null);
        setField(term88929, term88929.getClass(), "nag", null);
        setField(term88929, term88929.getClass(), "property", null);
        setField(term88929, term88929.getClass(), "fen", null);
        setField(term88929, term88929.getClass(), "board", null);
        setIntField(term88929, term88929.getClass(), "position", 0);
        setIntField(term88929, term88929.getClass(), "initialPosition", 0);
        setField(term88929, term88929.getClass(), "currentMoveList", null);
        setField(term88929, term88929.getClass(), "eco", null);
        setField(term88929, term88929.getClass(), "moveText", null);
        setField(term88929, term88929.getClass(), "opening", null);
        setField(term88929, term88929.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitialPosition", argTypes, term88929, args);
    }

};


