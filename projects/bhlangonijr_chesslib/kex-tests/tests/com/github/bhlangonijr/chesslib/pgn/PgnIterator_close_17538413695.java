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

public class PgnIterator_close_17538413695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1134;

    public PgnIterator_close_17538413695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1137 = new ArrayList();
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        HashMap term1142 = new HashMap();
        Class<? extends Object> term1243 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term1242 = ((Class) term1243).getDeclaredField((String) "ABANDONED");
        ((Field) term1242).setAccessible(true);
        Object enum2 = ((Field) term1242).get((Object) null);
        term1134 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator"));
        Object term1135 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term1136 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term1141 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term1134, term1134.getClass(), "pgnLines", null);
        setField(term1136, term1136.getClass(), "game", term1137);
        setField(term1141, term1141.getClass(), "round", term1142);
        setField(term1141, term1141.getClass(), "id", null);
        setField(term1141, term1141.getClass(), "name", null);
        setField(term1141, term1141.getClass(), "eventType", null);
        setField(term1141, term1141.getClass(), "startDate", null);
        setField(term1141, term1141.getClass(), "endDate", null);
        setField(term1141, term1141.getClass(), "site", null);
        setLongField(term1141, term1141.getClass(), "timestamp", 0L);
        setIntField(term1141, term1141.getClass(), "rounds", 0);
        setField(term1141, term1141.getClass(), "timeControl", null);
        setField(term1141, term1141.getClass(), "timeControl2", null);
        setField(term1141, term1141.getClass(), "pgnHolder", null);
        setField(term1136, term1136.getClass(), "event", term1141);
        setIntField(term1136, term1136.getClass(), "number", 597278769);
        setField(term1135, term1135.getClass(), "round", term1136);
        setField(term1135, term1135.getClass(), "gameId", "aKnKipADSo");
        setField(term1135, term1135.getClass(), "date", "wSQxaModmm");
        setField(term1135, term1135.getClass(), "time", "UlajhuVLaP");
        setField(term1135, term1135.getClass(), "termination", enum2);
        setField(term1135, term1135.getClass(), "whitePlayer", null);
        setField(term1135, term1135.getClass(), "blackPlayer", null);
        setField(term1135, term1135.getClass(), "annotator", null);
        setField(term1135, term1135.getClass(), "plyCount", null);
        setField(term1135, term1135.getClass(), "result", null);
        setField(term1135, term1135.getClass(), "halfMoves", null);
        setField(term1135, term1135.getClass(), "variations", null);
        setField(term1135, term1135.getClass(), "comments", null);
        setField(term1135, term1135.getClass(), "nag", null);
        setField(term1135, term1135.getClass(), "property", null);
        setField(term1135, term1135.getClass(), "fen", null);
        setField(term1135, term1135.getClass(), "board", null);
        setIntField(term1135, term1135.getClass(), "position", 0);
        setIntField(term1135, term1135.getClass(), "initialPosition", 0);
        setField(term1135, term1135.getClass(), "currentMoveList", null);
        setField(term1135, term1135.getClass(), "eco", null);
        setField(term1135, term1135.getClass(), "moveText", null);
        setField(term1135, term1135.getClass(), "opening", null);
        setField(term1135, term1135.getClass(), "variation", null);
        setField(term1134, term1134.getClass(), "game", term1135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term1134, args);
    }

};


