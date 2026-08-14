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

public class PgnIterator_GameIterator_init_21334307230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PgnIterator_GameIterator_init_21334307230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4 = new ArrayList();
        ((ArrayList) term4).add((Object)null);
        ((ArrayList) term4).add((Object)null);
        ((ArrayList) term4).add((Object)null);
        ((ArrayList) term4).add((Object)null);
        ((ArrayList) term4).add((Object)null);
        HashMap term9 = new HashMap();
        Class<? extends Object> term326 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term325 = ((Class) term326).getDeclaredField((String) "DEATH");
        ((Field) term325).setAccessible(true);
        Object enum0 = ((Field) term325).get((Object) null);
        term1 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator"));
        Object term2 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term3 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term8 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term1, term1.getClass(), "pgnLines", null);
        setField(term3, term3.getClass(), "game", term4);
        setField(term8, term8.getClass(), "round", term9);
        setField(term8, term8.getClass(), "id", null);
        setField(term8, term8.getClass(), "name", null);
        setField(term8, term8.getClass(), "eventType", null);
        setField(term8, term8.getClass(), "startDate", null);
        setField(term8, term8.getClass(), "endDate", null);
        setField(term8, term8.getClass(), "site", null);
        setLongField(term8, term8.getClass(), "timestamp", 0L);
        setIntField(term8, term8.getClass(), "rounds", 0);
        setField(term8, term8.getClass(), "timeControl", null);
        setField(term8, term8.getClass(), "timeControl2", null);
        setField(term8, term8.getClass(), "pgnHolder", null);
        setField(term3, term3.getClass(), "event", term8);
        setIntField(term3, term3.getClass(), "number", 391863371);
        setField(term2, term2.getClass(), "round", term3);
        setField(term2, term2.getClass(), "gameId", "RMFIsYGgne");
        setField(term2, term2.getClass(), "date", "NRdvgJlhkX");
        setField(term2, term2.getClass(), "time", "uuaPigETmJ");
        setField(term2, term2.getClass(), "termination", enum0);
        setField(term2, term2.getClass(), "whitePlayer", null);
        setField(term2, term2.getClass(), "blackPlayer", null);
        setField(term2, term2.getClass(), "annotator", null);
        setField(term2, term2.getClass(), "plyCount", null);
        setField(term2, term2.getClass(), "result", null);
        setField(term2, term2.getClass(), "halfMoves", null);
        setField(term2, term2.getClass(), "variations", null);
        setField(term2, term2.getClass(), "comments", null);
        setField(term2, term2.getClass(), "nag", null);
        setField(term2, term2.getClass(), "property", null);
        setField(term2, term2.getClass(), "fen", null);
        setField(term2, term2.getClass(), "board", null);
        setIntField(term2, term2.getClass(), "position", 0);
        setIntField(term2, term2.getClass(), "initialPosition", 0);
        setField(term2, term2.getClass(), "currentMoveList", null);
        setField(term2, term2.getClass(), "eco", null);
        setField(term2, term2.getClass(), "moveText", null);
        setField(term2, term2.getClass(), "opening", null);
        setField(term2, term2.getClass(), "variation", null);
        setField(term1, term1.getClass(), "game", term2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator$GameIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.pgn.PgnIterator");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


