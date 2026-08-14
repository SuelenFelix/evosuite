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

public class Game_setComments_131457650722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72560;
     Object term72635;

    public Game_setComments_131457650722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72564 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term72564, term72564.getClass(), "round", null);
        setField(term72564, term72564.getClass(), "gameId", null);
        setField(term72564, term72564.getClass(), "date", null);
        setField(term72564, term72564.getClass(), "time", null);
        setField(term72564, term72564.getClass(), "termination", null);
        setField(term72564, term72564.getClass(), "whitePlayer", null);
        setField(term72564, term72564.getClass(), "blackPlayer", null);
        setField(term72564, term72564.getClass(), "annotator", null);
        setField(term72564, term72564.getClass(), "plyCount", null);
        setField(term72564, term72564.getClass(), "result", null);
        setField(term72564, term72564.getClass(), "halfMoves", null);
        setField(term72564, term72564.getClass(), "variations", null);
        setField(term72564, term72564.getClass(), "comments", null);
        setField(term72564, term72564.getClass(), "nag", null);
        setField(term72564, term72564.getClass(), "property", null);
        setField(term72564, term72564.getClass(), "fen", null);
        setField(term72564, term72564.getClass(), "board", null);
        setIntField(term72564, term72564.getClass(), "position", 0);
        setIntField(term72564, term72564.getClass(), "initialPosition", 0);
        setField(term72564, term72564.getClass(), "currentMoveList", null);
        setField(term72564, term72564.getClass(), "eco", null);
        setField(term72564, term72564.getClass(), "moveText", null);
        setField(term72564, term72564.getClass(), "opening", null);
        setField(term72564, term72564.getClass(), "variation", null);
        Object term72567 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term72567, term72567.getClass(), "round", null);
        setField(term72567, term72567.getClass(), "gameId", null);
        setField(term72567, term72567.getClass(), "date", null);
        setField(term72567, term72567.getClass(), "time", null);
        setField(term72567, term72567.getClass(), "termination", null);
        setField(term72567, term72567.getClass(), "whitePlayer", null);
        setField(term72567, term72567.getClass(), "blackPlayer", null);
        setField(term72567, term72567.getClass(), "annotator", null);
        setField(term72567, term72567.getClass(), "plyCount", null);
        setField(term72567, term72567.getClass(), "result", null);
        setField(term72567, term72567.getClass(), "halfMoves", null);
        setField(term72567, term72567.getClass(), "variations", null);
        setField(term72567, term72567.getClass(), "comments", null);
        setField(term72567, term72567.getClass(), "nag", null);
        setField(term72567, term72567.getClass(), "property", null);
        setField(term72567, term72567.getClass(), "fen", null);
        setField(term72567, term72567.getClass(), "board", null);
        setIntField(term72567, term72567.getClass(), "position", 0);
        setIntField(term72567, term72567.getClass(), "initialPosition", 0);
        setField(term72567, term72567.getClass(), "currentMoveList", null);
        setField(term72567, term72567.getClass(), "eco", null);
        setField(term72567, term72567.getClass(), "moveText", null);
        setField(term72567, term72567.getClass(), "opening", null);
        setField(term72567, term72567.getClass(), "variation", null);
        ArrayList term72562 = new ArrayList();
        ((ArrayList) term72562).add(term72564);
        ((ArrayList) term72562).add(term72567);
        ((ArrayList) term72562).add(term72567);
        HashMap term72573 = new HashMap();
        Class<? extends Object> term72730 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term72729 = ((Class) term72730).getDeclaredField((String) "DEATH");
        ((Field) term72729).setAccessible(true);
        Object enum223 = ((Field) term72729).get((Object) null);
        term72560 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term72561 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term72572 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term72561, term72561.getClass(), "game", term72562);
        setField(term72572, term72572.getClass(), "round", term72573);
        setField(term72572, term72572.getClass(), "id", null);
        setField(term72572, term72572.getClass(), "name", null);
        setField(term72572, term72572.getClass(), "eventType", null);
        setField(term72572, term72572.getClass(), "startDate", null);
        setField(term72572, term72572.getClass(), "endDate", null);
        setField(term72572, term72572.getClass(), "site", null);
        setLongField(term72572, term72572.getClass(), "timestamp", 0L);
        setIntField(term72572, term72572.getClass(), "rounds", 0);
        setField(term72572, term72572.getClass(), "timeControl", null);
        setField(term72572, term72572.getClass(), "timeControl2", null);
        setField(term72572, term72572.getClass(), "pgnHolder", null);
        setField(term72561, term72561.getClass(), "event", term72572);
        setIntField(term72561, term72561.getClass(), "number", 68922753);
        setField(term72560, term72560.getClass(), "round", term72561);
        setField(term72560, term72560.getClass(), "gameId", "bShlAqoTmZ");
        setField(term72560, term72560.getClass(), "date", "nOKlKlNhtU");
        setField(term72560, term72560.getClass(), "time", "gXFNBHJSey");
        setField(term72560, term72560.getClass(), "termination", enum223);
        setField(term72560, term72560.getClass(), "whitePlayer", null);
        setField(term72560, term72560.getClass(), "blackPlayer", null);
        setField(term72560, term72560.getClass(), "annotator", null);
        setField(term72560, term72560.getClass(), "plyCount", null);
        setField(term72560, term72560.getClass(), "result", null);
        setField(term72560, term72560.getClass(), "halfMoves", null);
        setField(term72560, term72560.getClass(), "variations", null);
        setField(term72560, term72560.getClass(), "comments", null);
        setField(term72560, term72560.getClass(), "nag", null);
        setField(term72560, term72560.getClass(), "property", null);
        setField(term72560, term72560.getClass(), "fen", null);
        setField(term72560, term72560.getClass(), "board", null);
        setIntField(term72560, term72560.getClass(), "position", 0);
        setIntField(term72560, term72560.getClass(), "initialPosition", 0);
        setField(term72560, term72560.getClass(), "currentMoveList", null);
        setField(term72560, term72560.getClass(), "eco", null);
        setField(term72560, term72560.getClass(), "moveText", null);
        setField(term72560, term72560.getClass(), "opening", null);
        setField(term72560, term72560.getClass(), "variation", null);
        term72635 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term72635;
        callMethod(klass, "setComments", argTypes, term72560, args);
    }

};


