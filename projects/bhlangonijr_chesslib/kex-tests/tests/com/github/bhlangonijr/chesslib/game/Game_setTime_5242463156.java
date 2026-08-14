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

public class Game_setTime_5242463156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55231;

    public Game_setTime_5242463156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term55235 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term55235, term55235.getClass(), "round", null);
        setField(term55235, term55235.getClass(), "gameId", null);
        setField(term55235, term55235.getClass(), "date", null);
        setField(term55235, term55235.getClass(), "time", null);
        setField(term55235, term55235.getClass(), "termination", null);
        setField(term55235, term55235.getClass(), "whitePlayer", null);
        setField(term55235, term55235.getClass(), "blackPlayer", null);
        setField(term55235, term55235.getClass(), "annotator", null);
        setField(term55235, term55235.getClass(), "plyCount", null);
        setField(term55235, term55235.getClass(), "result", null);
        setField(term55235, term55235.getClass(), "halfMoves", null);
        setField(term55235, term55235.getClass(), "variations", null);
        setField(term55235, term55235.getClass(), "comments", null);
        setField(term55235, term55235.getClass(), "nag", null);
        setField(term55235, term55235.getClass(), "property", null);
        setField(term55235, term55235.getClass(), "fen", null);
        setField(term55235, term55235.getClass(), "board", null);
        setIntField(term55235, term55235.getClass(), "position", 0);
        setIntField(term55235, term55235.getClass(), "initialPosition", 0);
        setField(term55235, term55235.getClass(), "currentMoveList", null);
        setField(term55235, term55235.getClass(), "eco", null);
        setField(term55235, term55235.getClass(), "moveText", null);
        setField(term55235, term55235.getClass(), "opening", null);
        setField(term55235, term55235.getClass(), "variation", null);
        ArrayList term55233 = new ArrayList();
        ((ArrayList) term55233).add(term55235);
        HashMap term55241 = new HashMap();
        Class<? extends Object> term55360 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term55359 = ((Class) term55360).getDeclaredField((String) "ADJUDICATION");
        ((Field) term55359).setAccessible(true);
        Object enum165 = ((Field) term55359).get((Object) null);
        term55231 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term55232 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term55240 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term55232, term55232.getClass(), "game", term55233);
        setField(term55240, term55240.getClass(), "round", term55241);
        setField(term55240, term55240.getClass(), "id", null);
        setField(term55240, term55240.getClass(), "name", null);
        setField(term55240, term55240.getClass(), "eventType", null);
        setField(term55240, term55240.getClass(), "startDate", null);
        setField(term55240, term55240.getClass(), "endDate", null);
        setField(term55240, term55240.getClass(), "site", null);
        setLongField(term55240, term55240.getClass(), "timestamp", 0L);
        setIntField(term55240, term55240.getClass(), "rounds", 0);
        setField(term55240, term55240.getClass(), "timeControl", null);
        setField(term55240, term55240.getClass(), "timeControl2", null);
        setField(term55240, term55240.getClass(), "pgnHolder", null);
        setField(term55232, term55232.getClass(), "event", term55240);
        setIntField(term55232, term55232.getClass(), "number", -1667990367);
        setField(term55231, term55231.getClass(), "round", term55232);
        setField(term55231, term55231.getClass(), "gameId", "dtGZCsKXbW");
        setField(term55231, term55231.getClass(), "date", "bdyhHbDAmJ");
        setField(term55231, term55231.getClass(), "time", "BBXiTNHqGE");
        setField(term55231, term55231.getClass(), "termination", enum165);
        setField(term55231, term55231.getClass(), "whitePlayer", null);
        setField(term55231, term55231.getClass(), "blackPlayer", null);
        setField(term55231, term55231.getClass(), "annotator", null);
        setField(term55231, term55231.getClass(), "plyCount", null);
        setField(term55231, term55231.getClass(), "result", null);
        setField(term55231, term55231.getClass(), "halfMoves", null);
        setField(term55231, term55231.getClass(), "variations", null);
        setField(term55231, term55231.getClass(), "comments", null);
        setField(term55231, term55231.getClass(), "nag", null);
        setField(term55231, term55231.getClass(), "property", null);
        setField(term55231, term55231.getClass(), "fen", null);
        setField(term55231, term55231.getClass(), "board", null);
        setIntField(term55231, term55231.getClass(), "position", 0);
        setIntField(term55231, term55231.getClass(), "initialPosition", 0);
        setField(term55231, term55231.getClass(), "currentMoveList", null);
        setField(term55231, term55231.getClass(), "eco", null);
        setField(term55231, term55231.getClass(), "moveText", null);
        setField(term55231, term55231.getClass(), "opening", null);
        setField(term55231, term55231.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IEYhJmgCVd";
        callMethod(klass, "setTime", argTypes, term55231, args);
    }

};


