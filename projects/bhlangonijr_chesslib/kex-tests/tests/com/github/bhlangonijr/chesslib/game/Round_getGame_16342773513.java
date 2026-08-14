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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Round_getGame_16342773513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33339;

    public Round_getGame_16342773513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33373 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term33372 = ((Class) term33373).getDeclaredField((String) "NORMAL");
        ((Field) term33372).setAccessible(true);
        Object enum93 = ((Field) term33372).get((Object) null);
        Object term33342 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term33343 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        setField(term33343, term33343.getClass(), "game", null);
        setField(term33343, term33343.getClass(), "event", null);
        setIntField(term33343, term33343.getClass(), "number", -1697741339);
        setField(term33342, term33342.getClass(), "round", term33343);
        setField(term33342, term33342.getClass(), "gameId", "");
        setField(term33342, term33342.getClass(), "date", "");
        setField(term33342, term33342.getClass(), "time", "");
        setField(term33342, term33342.getClass(), "termination", enum93);
        setField(term33342, term33342.getClass(), "whitePlayer", null);
        setField(term33342, term33342.getClass(), "blackPlayer", null);
        setField(term33342, term33342.getClass(), "annotator", null);
        setField(term33342, term33342.getClass(), "plyCount", null);
        setField(term33342, term33342.getClass(), "result", null);
        setField(term33342, term33342.getClass(), "halfMoves", null);
        setField(term33342, term33342.getClass(), "variations", null);
        setField(term33342, term33342.getClass(), "comments", null);
        setField(term33342, term33342.getClass(), "nag", null);
        setField(term33342, term33342.getClass(), "property", null);
        setField(term33342, term33342.getClass(), "fen", null);
        setField(term33342, term33342.getClass(), "board", null);
        setIntField(term33342, term33342.getClass(), "position", 0);
        setIntField(term33342, term33342.getClass(), "initialPosition", 0);
        setField(term33342, term33342.getClass(), "currentMoveList", null);
        setField(term33342, term33342.getClass(), "eco", null);
        setField(term33342, term33342.getClass(), "moveText", null);
        setField(term33342, term33342.getClass(), "opening", null);
        setField(term33342, term33342.getClass(), "variation", null);
        Object term33352 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33352, term33352.getClass(), "round", null);
        setField(term33352, term33352.getClass(), "gameId", null);
        setField(term33352, term33352.getClass(), "date", null);
        setField(term33352, term33352.getClass(), "time", null);
        setField(term33352, term33352.getClass(), "termination", null);
        setField(term33352, term33352.getClass(), "whitePlayer", null);
        setField(term33352, term33352.getClass(), "blackPlayer", null);
        setField(term33352, term33352.getClass(), "annotator", null);
        setField(term33352, term33352.getClass(), "plyCount", null);
        setField(term33352, term33352.getClass(), "result", null);
        setField(term33352, term33352.getClass(), "halfMoves", null);
        setField(term33352, term33352.getClass(), "variations", null);
        setField(term33352, term33352.getClass(), "comments", null);
        setField(term33352, term33352.getClass(), "nag", null);
        setField(term33352, term33352.getClass(), "property", null);
        setField(term33352, term33352.getClass(), "fen", null);
        setField(term33352, term33352.getClass(), "board", null);
        setIntField(term33352, term33352.getClass(), "position", 0);
        setIntField(term33352, term33352.getClass(), "initialPosition", 0);
        setField(term33352, term33352.getClass(), "currentMoveList", null);
        setField(term33352, term33352.getClass(), "eco", null);
        setField(term33352, term33352.getClass(), "moveText", null);
        setField(term33352, term33352.getClass(), "opening", null);
        setField(term33352, term33352.getClass(), "variation", null);
        Object term33355 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33355, term33355.getClass(), "round", null);
        setField(term33355, term33355.getClass(), "gameId", null);
        setField(term33355, term33355.getClass(), "date", null);
        setField(term33355, term33355.getClass(), "time", null);
        setField(term33355, term33355.getClass(), "termination", null);
        setField(term33355, term33355.getClass(), "whitePlayer", null);
        setField(term33355, term33355.getClass(), "blackPlayer", null);
        setField(term33355, term33355.getClass(), "annotator", null);
        setField(term33355, term33355.getClass(), "plyCount", null);
        setField(term33355, term33355.getClass(), "result", null);
        setField(term33355, term33355.getClass(), "halfMoves", null);
        setField(term33355, term33355.getClass(), "variations", null);
        setField(term33355, term33355.getClass(), "comments", null);
        setField(term33355, term33355.getClass(), "nag", null);
        setField(term33355, term33355.getClass(), "property", null);
        setField(term33355, term33355.getClass(), "fen", null);
        setField(term33355, term33355.getClass(), "board", null);
        setIntField(term33355, term33355.getClass(), "position", 0);
        setIntField(term33355, term33355.getClass(), "initialPosition", 0);
        setField(term33355, term33355.getClass(), "currentMoveList", null);
        setField(term33355, term33355.getClass(), "eco", null);
        setField(term33355, term33355.getClass(), "moveText", null);
        setField(term33355, term33355.getClass(), "opening", null);
        setField(term33355, term33355.getClass(), "variation", null);
        Object term33358 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term33358, term33358.getClass(), "round", null);
        setField(term33358, term33358.getClass(), "gameId", null);
        setField(term33358, term33358.getClass(), "date", null);
        setField(term33358, term33358.getClass(), "time", null);
        setField(term33358, term33358.getClass(), "termination", null);
        setField(term33358, term33358.getClass(), "whitePlayer", null);
        setField(term33358, term33358.getClass(), "blackPlayer", null);
        setField(term33358, term33358.getClass(), "annotator", null);
        setField(term33358, term33358.getClass(), "plyCount", null);
        setField(term33358, term33358.getClass(), "result", null);
        setField(term33358, term33358.getClass(), "halfMoves", null);
        setField(term33358, term33358.getClass(), "variations", null);
        setField(term33358, term33358.getClass(), "comments", null);
        setField(term33358, term33358.getClass(), "nag", null);
        setField(term33358, term33358.getClass(), "property", null);
        setField(term33358, term33358.getClass(), "fen", null);
        setField(term33358, term33358.getClass(), "board", null);
        setIntField(term33358, term33358.getClass(), "position", 0);
        setIntField(term33358, term33358.getClass(), "initialPosition", 0);
        setField(term33358, term33358.getClass(), "currentMoveList", null);
        setField(term33358, term33358.getClass(), "eco", null);
        setField(term33358, term33358.getClass(), "moveText", null);
        setField(term33358, term33358.getClass(), "opening", null);
        setField(term33358, term33358.getClass(), "variation", null);
        ArrayList term33340 = new ArrayList();
        ((ArrayList) term33340).add(term33342);
        ((ArrayList) term33340).add(term33352);
        ((ArrayList) term33340).add(term33355);
        ((ArrayList) term33340).add(term33358);
        ((ArrayList) term33340).add(term33352);
        ((ArrayList) term33340).add(term33342);
        HashMap term33364 = new HashMap();
        term33339 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term33363 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term33339, term33339.getClass(), "game", term33340);
        setField(term33363, term33363.getClass(), "round", term33364);
        setField(term33363, term33363.getClass(), "id", null);
        setField(term33363, term33363.getClass(), "name", null);
        setField(term33363, term33363.getClass(), "eventType", null);
        setField(term33363, term33363.getClass(), "startDate", null);
        setField(term33363, term33363.getClass(), "endDate", null);
        setField(term33363, term33363.getClass(), "site", null);
        setLongField(term33363, term33363.getClass(), "timestamp", 0L);
        setIntField(term33363, term33363.getClass(), "rounds", 0);
        setField(term33363, term33363.getClass(), "timeControl", null);
        setField(term33363, term33363.getClass(), "timeControl2", null);
        setField(term33363, term33363.getClass(), "pgnHolder", null);
        setField(term33339, term33339.getClass(), "event", term33363);
        setIntField(term33339, term33339.getClass(), "number", 98922530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Round");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGame", argTypes, term33339, args);
    }

};


