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

public class Game_getGameId_170956756535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87297;

    public Game_getGameId_170956756535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term87301 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term87301, term87301.getClass(), "round", null);
        setField(term87301, term87301.getClass(), "gameId", null);
        setField(term87301, term87301.getClass(), "date", null);
        setField(term87301, term87301.getClass(), "time", null);
        setField(term87301, term87301.getClass(), "termination", null);
        setField(term87301, term87301.getClass(), "whitePlayer", null);
        setField(term87301, term87301.getClass(), "blackPlayer", null);
        setField(term87301, term87301.getClass(), "annotator", null);
        setField(term87301, term87301.getClass(), "plyCount", null);
        setField(term87301, term87301.getClass(), "result", null);
        setField(term87301, term87301.getClass(), "halfMoves", null);
        setField(term87301, term87301.getClass(), "variations", null);
        setField(term87301, term87301.getClass(), "comments", null);
        setField(term87301, term87301.getClass(), "nag", null);
        setField(term87301, term87301.getClass(), "property", null);
        setField(term87301, term87301.getClass(), "fen", null);
        setField(term87301, term87301.getClass(), "board", null);
        setIntField(term87301, term87301.getClass(), "position", 0);
        setIntField(term87301, term87301.getClass(), "initialPosition", 0);
        setField(term87301, term87301.getClass(), "currentMoveList", null);
        setField(term87301, term87301.getClass(), "eco", null);
        setField(term87301, term87301.getClass(), "moveText", null);
        setField(term87301, term87301.getClass(), "opening", null);
        setField(term87301, term87301.getClass(), "variation", null);
        ArrayList term87299 = new ArrayList();
        ((ArrayList) term87299).add(term87301);
        ((ArrayList) term87299).add(term87297);
        HashMap term87307 = new HashMap();
        Class<? extends Object> term87408 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term87407 = ((Class) term87408).getDeclaredField((String) "ABANDONED");
        ((Field) term87407).setAccessible(true);
        Object enum274 = ((Field) term87407).get((Object) null);
        term87297 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term87298 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term87306 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term87298, term87298.getClass(), "game", term87299);
        setField(term87306, term87306.getClass(), "round", term87307);
        setField(term87306, term87306.getClass(), "id", null);
        setField(term87306, term87306.getClass(), "name", null);
        setField(term87306, term87306.getClass(), "eventType", null);
        setField(term87306, term87306.getClass(), "startDate", null);
        setField(term87306, term87306.getClass(), "endDate", null);
        setField(term87306, term87306.getClass(), "site", null);
        setLongField(term87306, term87306.getClass(), "timestamp", 0L);
        setIntField(term87306, term87306.getClass(), "rounds", 0);
        setField(term87306, term87306.getClass(), "timeControl", null);
        setField(term87306, term87306.getClass(), "timeControl2", null);
        setField(term87306, term87306.getClass(), "pgnHolder", null);
        setField(term87298, term87298.getClass(), "event", term87306);
        setIntField(term87298, term87298.getClass(), "number", -19246901);
        setField(term87297, term87297.getClass(), "round", term87298);
        setField(term87297, term87297.getClass(), "gameId", "ocZcumnXEz");
        setField(term87297, term87297.getClass(), "date", "rNNwyactDR");
        setField(term87297, term87297.getClass(), "time", "QJrTMTdxyh");
        setField(term87297, term87297.getClass(), "termination", enum274);
        setField(term87297, term87297.getClass(), "whitePlayer", null);
        setField(term87297, term87297.getClass(), "blackPlayer", null);
        setField(term87297, term87297.getClass(), "annotator", null);
        setField(term87297, term87297.getClass(), "plyCount", null);
        setField(term87297, term87297.getClass(), "result", null);
        setField(term87297, term87297.getClass(), "halfMoves", null);
        setField(term87297, term87297.getClass(), "variations", null);
        setField(term87297, term87297.getClass(), "comments", null);
        setField(term87297, term87297.getClass(), "nag", null);
        setField(term87297, term87297.getClass(), "property", null);
        setField(term87297, term87297.getClass(), "fen", null);
        setField(term87297, term87297.getClass(), "board", null);
        setIntField(term87297, term87297.getClass(), "position", 0);
        setIntField(term87297, term87297.getClass(), "initialPosition", 0);
        setField(term87297, term87297.getClass(), "currentMoveList", null);
        setField(term87297, term87297.getClass(), "eco", null);
        setField(term87297, term87297.getClass(), "moveText", null);
        setField(term87297, term87297.getClass(), "opening", null);
        setField(term87297, term87297.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameId", argTypes, term87297, args);
    }

};


