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

public class Game_getHalfMoves_20791247025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73813;

    public Game_getHalfMoves_20791247025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73817 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term73817, term73817.getClass(), "round", null);
        setField(term73817, term73817.getClass(), "gameId", null);
        setField(term73817, term73817.getClass(), "date", null);
        setField(term73817, term73817.getClass(), "time", null);
        setField(term73817, term73817.getClass(), "termination", null);
        setField(term73817, term73817.getClass(), "whitePlayer", null);
        setField(term73817, term73817.getClass(), "blackPlayer", null);
        setField(term73817, term73817.getClass(), "annotator", null);
        setField(term73817, term73817.getClass(), "plyCount", null);
        setField(term73817, term73817.getClass(), "result", null);
        setField(term73817, term73817.getClass(), "halfMoves", null);
        setField(term73817, term73817.getClass(), "variations", null);
        setField(term73817, term73817.getClass(), "comments", null);
        setField(term73817, term73817.getClass(), "nag", null);
        setField(term73817, term73817.getClass(), "property", null);
        setField(term73817, term73817.getClass(), "fen", null);
        setField(term73817, term73817.getClass(), "board", null);
        setIntField(term73817, term73817.getClass(), "position", 0);
        setIntField(term73817, term73817.getClass(), "initialPosition", 0);
        setField(term73817, term73817.getClass(), "currentMoveList", null);
        setField(term73817, term73817.getClass(), "eco", null);
        setField(term73817, term73817.getClass(), "moveText", null);
        setField(term73817, term73817.getClass(), "opening", null);
        setField(term73817, term73817.getClass(), "variation", null);
        Object term73820 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term73820, term73820.getClass(), "round", null);
        setField(term73820, term73820.getClass(), "gameId", null);
        setField(term73820, term73820.getClass(), "date", null);
        setField(term73820, term73820.getClass(), "time", null);
        setField(term73820, term73820.getClass(), "termination", null);
        setField(term73820, term73820.getClass(), "whitePlayer", null);
        setField(term73820, term73820.getClass(), "blackPlayer", null);
        setField(term73820, term73820.getClass(), "annotator", null);
        setField(term73820, term73820.getClass(), "plyCount", null);
        setField(term73820, term73820.getClass(), "result", null);
        setField(term73820, term73820.getClass(), "halfMoves", null);
        setField(term73820, term73820.getClass(), "variations", null);
        setField(term73820, term73820.getClass(), "comments", null);
        setField(term73820, term73820.getClass(), "nag", null);
        setField(term73820, term73820.getClass(), "property", null);
        setField(term73820, term73820.getClass(), "fen", null);
        setField(term73820, term73820.getClass(), "board", null);
        setIntField(term73820, term73820.getClass(), "position", 0);
        setIntField(term73820, term73820.getClass(), "initialPosition", 0);
        setField(term73820, term73820.getClass(), "currentMoveList", null);
        setField(term73820, term73820.getClass(), "eco", null);
        setField(term73820, term73820.getClass(), "moveText", null);
        setField(term73820, term73820.getClass(), "opening", null);
        setField(term73820, term73820.getClass(), "variation", null);
        ArrayList term73815 = new ArrayList();
        ((ArrayList) term73815).add(term73817);
        ((ArrayList) term73815).add(term73820);
        HashMap term73826 = new HashMap();
        Class<? extends Object> term73921 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term73920 = ((Class) term73921).getDeclaredField((String) "NORMAL");
        ((Field) term73920).setAccessible(true);
        Object enum226 = ((Field) term73920).get((Object) null);
        term73813 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term73814 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term73825 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term73814, term73814.getClass(), "game", term73815);
        setField(term73825, term73825.getClass(), "round", term73826);
        setField(term73825, term73825.getClass(), "id", null);
        setField(term73825, term73825.getClass(), "name", null);
        setField(term73825, term73825.getClass(), "eventType", null);
        setField(term73825, term73825.getClass(), "startDate", null);
        setField(term73825, term73825.getClass(), "endDate", null);
        setField(term73825, term73825.getClass(), "site", null);
        setLongField(term73825, term73825.getClass(), "timestamp", 0L);
        setIntField(term73825, term73825.getClass(), "rounds", 0);
        setField(term73825, term73825.getClass(), "timeControl", null);
        setField(term73825, term73825.getClass(), "timeControl2", null);
        setField(term73825, term73825.getClass(), "pgnHolder", null);
        setField(term73814, term73814.getClass(), "event", term73825);
        setIntField(term73814, term73814.getClass(), "number", 1116576792);
        setField(term73813, term73813.getClass(), "round", term73814);
        setField(term73813, term73813.getClass(), "gameId", "DRhkpDneCC");
        setField(term73813, term73813.getClass(), "date", "vuIJRrypuA");
        setField(term73813, term73813.getClass(), "time", "AxfSZmaiyA");
        setField(term73813, term73813.getClass(), "termination", enum226);
        setField(term73813, term73813.getClass(), "whitePlayer", null);
        setField(term73813, term73813.getClass(), "blackPlayer", null);
        setField(term73813, term73813.getClass(), "annotator", null);
        setField(term73813, term73813.getClass(), "plyCount", null);
        setField(term73813, term73813.getClass(), "result", null);
        setField(term73813, term73813.getClass(), "halfMoves", null);
        setField(term73813, term73813.getClass(), "variations", null);
        setField(term73813, term73813.getClass(), "comments", null);
        setField(term73813, term73813.getClass(), "nag", null);
        setField(term73813, term73813.getClass(), "property", null);
        setField(term73813, term73813.getClass(), "fen", null);
        setField(term73813, term73813.getClass(), "board", null);
        setIntField(term73813, term73813.getClass(), "position", 0);
        setIntField(term73813, term73813.getClass(), "initialPosition", 0);
        setField(term73813, term73813.getClass(), "currentMoveList", null);
        setField(term73813, term73813.getClass(), "eco", null);
        setField(term73813, term73813.getClass(), "moveText", null);
        setField(term73813, term73813.getClass(), "opening", null);
        setField(term73813, term73813.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHalfMoves", argTypes, term73813, args);
    }

};


