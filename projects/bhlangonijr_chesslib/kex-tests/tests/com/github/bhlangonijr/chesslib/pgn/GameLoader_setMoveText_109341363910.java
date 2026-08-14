package com.github.bhlangonijr.chesslib.pgn;

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
import static com.github.bhlangonijr.chesslib.pgn.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class GameLoader_setMoveText_109341363910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4701;
     Object term4784;

    public GameLoader_setMoveText_109341363910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4705 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term4705, term4705.getClass(), "round", null);
        setField(term4705, term4705.getClass(), "gameId", null);
        setField(term4705, term4705.getClass(), "date", null);
        setField(term4705, term4705.getClass(), "time", null);
        setField(term4705, term4705.getClass(), "termination", null);
        setField(term4705, term4705.getClass(), "whitePlayer", null);
        setField(term4705, term4705.getClass(), "blackPlayer", null);
        setField(term4705, term4705.getClass(), "annotator", null);
        setField(term4705, term4705.getClass(), "plyCount", null);
        setField(term4705, term4705.getClass(), "result", null);
        setField(term4705, term4705.getClass(), "halfMoves", null);
        setField(term4705, term4705.getClass(), "variations", null);
        setField(term4705, term4705.getClass(), "comments", null);
        setField(term4705, term4705.getClass(), "nag", null);
        setField(term4705, term4705.getClass(), "property", null);
        setField(term4705, term4705.getClass(), "fen", null);
        setField(term4705, term4705.getClass(), "board", null);
        setIntField(term4705, term4705.getClass(), "position", 0);
        setIntField(term4705, term4705.getClass(), "initialPosition", 0);
        setField(term4705, term4705.getClass(), "currentMoveList", null);
        setField(term4705, term4705.getClass(), "eco", null);
        setField(term4705, term4705.getClass(), "moveText", null);
        setField(term4705, term4705.getClass(), "opening", null);
        setField(term4705, term4705.getClass(), "variation", null);
        Object term4708 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term4708, term4708.getClass(), "round", null);
        setField(term4708, term4708.getClass(), "gameId", null);
        setField(term4708, term4708.getClass(), "date", null);
        setField(term4708, term4708.getClass(), "time", null);
        setField(term4708, term4708.getClass(), "termination", null);
        setField(term4708, term4708.getClass(), "whitePlayer", null);
        setField(term4708, term4708.getClass(), "blackPlayer", null);
        setField(term4708, term4708.getClass(), "annotator", null);
        setField(term4708, term4708.getClass(), "plyCount", null);
        setField(term4708, term4708.getClass(), "result", null);
        setField(term4708, term4708.getClass(), "halfMoves", null);
        setField(term4708, term4708.getClass(), "variations", null);
        setField(term4708, term4708.getClass(), "comments", null);
        setField(term4708, term4708.getClass(), "nag", null);
        setField(term4708, term4708.getClass(), "property", null);
        setField(term4708, term4708.getClass(), "fen", null);
        setField(term4708, term4708.getClass(), "board", null);
        setIntField(term4708, term4708.getClass(), "position", 0);
        setIntField(term4708, term4708.getClass(), "initialPosition", 0);
        setField(term4708, term4708.getClass(), "currentMoveList", null);
        setField(term4708, term4708.getClass(), "eco", null);
        setField(term4708, term4708.getClass(), "moveText", null);
        setField(term4708, term4708.getClass(), "opening", null);
        setField(term4708, term4708.getClass(), "variation", null);
        ArrayList term4703 = new ArrayList();
        ((ArrayList) term4703).add(term4705);
        ((ArrayList) term4703).add(term4708);
        HashMap term4714 = new HashMap();
        Class<? extends Object> term4835 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term4834 = ((Class) term4835).getDeclaredField((String) "EMERGENCY");
        ((Field) term4834).setAccessible(true);
        Object enum9 = ((Field) term4834).get((Object) null);
        term4701 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term4702 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term4713 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term4702, term4702.getClass(), "game", term4703);
        setField(term4713, term4713.getClass(), "round", term4714);
        setField(term4713, term4713.getClass(), "id", null);
        setField(term4713, term4713.getClass(), "name", null);
        setField(term4713, term4713.getClass(), "eventType", null);
        setField(term4713, term4713.getClass(), "startDate", null);
        setField(term4713, term4713.getClass(), "endDate", null);
        setField(term4713, term4713.getClass(), "site", null);
        setLongField(term4713, term4713.getClass(), "timestamp", 0L);
        setIntField(term4713, term4713.getClass(), "rounds", 0);
        setField(term4713, term4713.getClass(), "timeControl", null);
        setField(term4713, term4713.getClass(), "timeControl2", null);
        setField(term4713, term4713.getClass(), "pgnHolder", null);
        setField(term4702, term4702.getClass(), "event", term4713);
        setIntField(term4702, term4702.getClass(), "number", -14890619);
        setField(term4701, term4701.getClass(), "round", term4702);
        setField(term4701, term4701.getClass(), "gameId", "ZzIujlwVsw");
        setField(term4701, term4701.getClass(), "date", "LWyEaeIyAo");
        setField(term4701, term4701.getClass(), "time", "yVMkkQhvmN");
        setField(term4701, term4701.getClass(), "termination", enum9);
        setField(term4701, term4701.getClass(), "whitePlayer", null);
        setField(term4701, term4701.getClass(), "blackPlayer", null);
        setField(term4701, term4701.getClass(), "annotator", null);
        setField(term4701, term4701.getClass(), "plyCount", null);
        setField(term4701, term4701.getClass(), "result", null);
        setField(term4701, term4701.getClass(), "halfMoves", null);
        setField(term4701, term4701.getClass(), "variations", null);
        setField(term4701, term4701.getClass(), "comments", null);
        setField(term4701, term4701.getClass(), "nag", null);
        setField(term4701, term4701.getClass(), "property", null);
        setField(term4701, term4701.getClass(), "fen", null);
        setField(term4701, term4701.getClass(), "board", null);
        setIntField(term4701, term4701.getClass(), "position", 0);
        setIntField(term4701, term4701.getClass(), "initialPosition", 0);
        setField(term4701, term4701.getClass(), "currentMoveList", null);
        setField(term4701, term4701.getClass(), "eco", null);
        setField(term4701, term4701.getClass(), "moveText", null);
        setField(term4701, term4701.getClass(), "opening", null);
        setField(term4701, term4701.getClass(), "variation", null);
        term4784 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4785 = (byte[]) newByteArray(16);
        setField(term4784, term4784.getClass(), "value", term4785);
        setByteField(term4784, term4784.getClass(), "coder", (byte) 89);
        setIntField(term4784, term4784.getClass(), "count", 1632125673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.GameLoader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term4701;
        args[1] = term4784;
        callMethod(klass, "setMoveText", argTypes, null, args);
    }

};


