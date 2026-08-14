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

public class Game_setGameId_13634625136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87681;

    public Game_setGameId_13634625136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87685 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term87685, term87685.getClass(), "round", null);
        setField(term87685, term87685.getClass(), "gameId", null);
        setField(term87685, term87685.getClass(), "date", null);
        setField(term87685, term87685.getClass(), "time", null);
        setField(term87685, term87685.getClass(), "termination", null);
        setField(term87685, term87685.getClass(), "whitePlayer", null);
        setField(term87685, term87685.getClass(), "blackPlayer", null);
        setField(term87685, term87685.getClass(), "annotator", null);
        setField(term87685, term87685.getClass(), "plyCount", null);
        setField(term87685, term87685.getClass(), "result", null);
        setField(term87685, term87685.getClass(), "halfMoves", null);
        setField(term87685, term87685.getClass(), "variations", null);
        setField(term87685, term87685.getClass(), "comments", null);
        setField(term87685, term87685.getClass(), "nag", null);
        setField(term87685, term87685.getClass(), "property", null);
        setField(term87685, term87685.getClass(), "fen", null);
        setField(term87685, term87685.getClass(), "board", null);
        setIntField(term87685, term87685.getClass(), "position", 0);
        setIntField(term87685, term87685.getClass(), "initialPosition", 0);
        setField(term87685, term87685.getClass(), "currentMoveList", null);
        setField(term87685, term87685.getClass(), "eco", null);
        setField(term87685, term87685.getClass(), "moveText", null);
        setField(term87685, term87685.getClass(), "opening", null);
        setField(term87685, term87685.getClass(), "variation", null);
        Object term87688 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term87688, term87688.getClass(), "round", null);
        setField(term87688, term87688.getClass(), "gameId", null);
        setField(term87688, term87688.getClass(), "date", null);
        setField(term87688, term87688.getClass(), "time", null);
        setField(term87688, term87688.getClass(), "termination", null);
        setField(term87688, term87688.getClass(), "whitePlayer", null);
        setField(term87688, term87688.getClass(), "blackPlayer", null);
        setField(term87688, term87688.getClass(), "annotator", null);
        setField(term87688, term87688.getClass(), "plyCount", null);
        setField(term87688, term87688.getClass(), "result", null);
        setField(term87688, term87688.getClass(), "halfMoves", null);
        setField(term87688, term87688.getClass(), "variations", null);
        setField(term87688, term87688.getClass(), "comments", null);
        setField(term87688, term87688.getClass(), "nag", null);
        setField(term87688, term87688.getClass(), "property", null);
        setField(term87688, term87688.getClass(), "fen", null);
        setField(term87688, term87688.getClass(), "board", null);
        setIntField(term87688, term87688.getClass(), "position", 0);
        setIntField(term87688, term87688.getClass(), "initialPosition", 0);
        setField(term87688, term87688.getClass(), "currentMoveList", null);
        setField(term87688, term87688.getClass(), "eco", null);
        setField(term87688, term87688.getClass(), "moveText", null);
        setField(term87688, term87688.getClass(), "opening", null);
        setField(term87688, term87688.getClass(), "variation", null);
        Object term87691 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term87691, term87691.getClass(), "round", null);
        setField(term87691, term87691.getClass(), "gameId", null);
        setField(term87691, term87691.getClass(), "date", null);
        setField(term87691, term87691.getClass(), "time", null);
        setField(term87691, term87691.getClass(), "termination", null);
        setField(term87691, term87691.getClass(), "whitePlayer", null);
        setField(term87691, term87691.getClass(), "blackPlayer", null);
        setField(term87691, term87691.getClass(), "annotator", null);
        setField(term87691, term87691.getClass(), "plyCount", null);
        setField(term87691, term87691.getClass(), "result", null);
        setField(term87691, term87691.getClass(), "halfMoves", null);
        setField(term87691, term87691.getClass(), "variations", null);
        setField(term87691, term87691.getClass(), "comments", null);
        setField(term87691, term87691.getClass(), "nag", null);
        setField(term87691, term87691.getClass(), "property", null);
        setField(term87691, term87691.getClass(), "fen", null);
        setField(term87691, term87691.getClass(), "board", null);
        setIntField(term87691, term87691.getClass(), "position", 0);
        setIntField(term87691, term87691.getClass(), "initialPosition", 0);
        setField(term87691, term87691.getClass(), "currentMoveList", null);
        setField(term87691, term87691.getClass(), "eco", null);
        setField(term87691, term87691.getClass(), "moveText", null);
        setField(term87691, term87691.getClass(), "opening", null);
        setField(term87691, term87691.getClass(), "variation", null);
        ArrayList term87683 = new ArrayList();
        ((ArrayList) term87683).add(term87685);
        ((ArrayList) term87683).add(term87688);
        ((ArrayList) term87683).add(term87691);
        ((ArrayList) term87683).add(term87681);
        HashMap term87697 = new HashMap();
        Class<? extends Object> term87816 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term87815 = ((Class) term87816).getDeclaredField((String) "ADJUDICATION");
        ((Field) term87815).setAccessible(true);
        Object enum275 = ((Field) term87815).get((Object) null);
        term87681 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term87682 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term87696 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term87682, term87682.getClass(), "game", term87683);
        setField(term87696, term87696.getClass(), "round", term87697);
        setField(term87696, term87696.getClass(), "id", null);
        setField(term87696, term87696.getClass(), "name", null);
        setField(term87696, term87696.getClass(), "eventType", null);
        setField(term87696, term87696.getClass(), "startDate", null);
        setField(term87696, term87696.getClass(), "endDate", null);
        setField(term87696, term87696.getClass(), "site", null);
        setLongField(term87696, term87696.getClass(), "timestamp", 0L);
        setIntField(term87696, term87696.getClass(), "rounds", 0);
        setField(term87696, term87696.getClass(), "timeControl", null);
        setField(term87696, term87696.getClass(), "timeControl2", null);
        setField(term87696, term87696.getClass(), "pgnHolder", null);
        setField(term87682, term87682.getClass(), "event", term87696);
        setIntField(term87682, term87682.getClass(), "number", -2063365430);
        setField(term87681, term87681.getClass(), "round", term87682);
        setField(term87681, term87681.getClass(), "gameId", "dTGwgkfDVj");
        setField(term87681, term87681.getClass(), "date", "zHiuLPzYQM");
        setField(term87681, term87681.getClass(), "time", "ioYxUYJBrh");
        setField(term87681, term87681.getClass(), "termination", enum275);
        setField(term87681, term87681.getClass(), "whitePlayer", null);
        setField(term87681, term87681.getClass(), "blackPlayer", null);
        setField(term87681, term87681.getClass(), "annotator", null);
        setField(term87681, term87681.getClass(), "plyCount", null);
        setField(term87681, term87681.getClass(), "result", null);
        setField(term87681, term87681.getClass(), "halfMoves", null);
        setField(term87681, term87681.getClass(), "variations", null);
        setField(term87681, term87681.getClass(), "comments", null);
        setField(term87681, term87681.getClass(), "nag", null);
        setField(term87681, term87681.getClass(), "property", null);
        setField(term87681, term87681.getClass(), "fen", null);
        setField(term87681, term87681.getClass(), "board", null);
        setIntField(term87681, term87681.getClass(), "position", 0);
        setIntField(term87681, term87681.getClass(), "initialPosition", 0);
        setField(term87681, term87681.getClass(), "currentMoveList", null);
        setField(term87681, term87681.getClass(), "eco", null);
        setField(term87681, term87681.getClass(), "moveText", null);
        setField(term87681, term87681.getClass(), "opening", null);
        setField(term87681, term87681.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GXoLEdKEIe";
        callMethod(klass, "setGameId", argTypes, term87681, args);
    }

};


