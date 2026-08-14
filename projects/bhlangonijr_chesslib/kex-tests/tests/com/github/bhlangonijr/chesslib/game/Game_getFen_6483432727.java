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

public class Game_getFen_6483432727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74188;

    public Game_getFen_6483432727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74192 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74192, term74192.getClass(), "round", null);
        setField(term74192, term74192.getClass(), "gameId", null);
        setField(term74192, term74192.getClass(), "date", null);
        setField(term74192, term74192.getClass(), "time", null);
        setField(term74192, term74192.getClass(), "termination", null);
        setField(term74192, term74192.getClass(), "whitePlayer", null);
        setField(term74192, term74192.getClass(), "blackPlayer", null);
        setField(term74192, term74192.getClass(), "annotator", null);
        setField(term74192, term74192.getClass(), "plyCount", null);
        setField(term74192, term74192.getClass(), "result", null);
        setField(term74192, term74192.getClass(), "halfMoves", null);
        setField(term74192, term74192.getClass(), "variations", null);
        setField(term74192, term74192.getClass(), "comments", null);
        setField(term74192, term74192.getClass(), "nag", null);
        setField(term74192, term74192.getClass(), "property", null);
        setField(term74192, term74192.getClass(), "fen", null);
        setField(term74192, term74192.getClass(), "board", null);
        setIntField(term74192, term74192.getClass(), "position", 0);
        setIntField(term74192, term74192.getClass(), "initialPosition", 0);
        setField(term74192, term74192.getClass(), "currentMoveList", null);
        setField(term74192, term74192.getClass(), "eco", null);
        setField(term74192, term74192.getClass(), "moveText", null);
        setField(term74192, term74192.getClass(), "opening", null);
        setField(term74192, term74192.getClass(), "variation", null);
        Object term74195 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74195, term74195.getClass(), "round", null);
        setField(term74195, term74195.getClass(), "gameId", null);
        setField(term74195, term74195.getClass(), "date", null);
        setField(term74195, term74195.getClass(), "time", null);
        setField(term74195, term74195.getClass(), "termination", null);
        setField(term74195, term74195.getClass(), "whitePlayer", null);
        setField(term74195, term74195.getClass(), "blackPlayer", null);
        setField(term74195, term74195.getClass(), "annotator", null);
        setField(term74195, term74195.getClass(), "plyCount", null);
        setField(term74195, term74195.getClass(), "result", null);
        setField(term74195, term74195.getClass(), "halfMoves", null);
        setField(term74195, term74195.getClass(), "variations", null);
        setField(term74195, term74195.getClass(), "comments", null);
        setField(term74195, term74195.getClass(), "nag", null);
        setField(term74195, term74195.getClass(), "property", null);
        setField(term74195, term74195.getClass(), "fen", null);
        setField(term74195, term74195.getClass(), "board", null);
        setIntField(term74195, term74195.getClass(), "position", 0);
        setIntField(term74195, term74195.getClass(), "initialPosition", 0);
        setField(term74195, term74195.getClass(), "currentMoveList", null);
        setField(term74195, term74195.getClass(), "eco", null);
        setField(term74195, term74195.getClass(), "moveText", null);
        setField(term74195, term74195.getClass(), "opening", null);
        setField(term74195, term74195.getClass(), "variation", null);
        Object term74198 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74198, term74198.getClass(), "round", null);
        setField(term74198, term74198.getClass(), "gameId", null);
        setField(term74198, term74198.getClass(), "date", null);
        setField(term74198, term74198.getClass(), "time", null);
        setField(term74198, term74198.getClass(), "termination", null);
        setField(term74198, term74198.getClass(), "whitePlayer", null);
        setField(term74198, term74198.getClass(), "blackPlayer", null);
        setField(term74198, term74198.getClass(), "annotator", null);
        setField(term74198, term74198.getClass(), "plyCount", null);
        setField(term74198, term74198.getClass(), "result", null);
        setField(term74198, term74198.getClass(), "halfMoves", null);
        setField(term74198, term74198.getClass(), "variations", null);
        setField(term74198, term74198.getClass(), "comments", null);
        setField(term74198, term74198.getClass(), "nag", null);
        setField(term74198, term74198.getClass(), "property", null);
        setField(term74198, term74198.getClass(), "fen", null);
        setField(term74198, term74198.getClass(), "board", null);
        setIntField(term74198, term74198.getClass(), "position", 0);
        setIntField(term74198, term74198.getClass(), "initialPosition", 0);
        setField(term74198, term74198.getClass(), "currentMoveList", null);
        setField(term74198, term74198.getClass(), "eco", null);
        setField(term74198, term74198.getClass(), "moveText", null);
        setField(term74198, term74198.getClass(), "opening", null);
        setField(term74198, term74198.getClass(), "variation", null);
        ArrayList term74190 = new ArrayList();
        ((ArrayList) term74190).add(term74192);
        ((ArrayList) term74190).add(term74195);
        ((ArrayList) term74190).add(term74198);
        HashMap term74204 = new HashMap();
        Class<? extends Object> term74297 = Class.forName((String) "com.github.bhlangonijr.chesslib.game.Termination");
        Field term74296 = ((Class) term74297).getDeclaredField((String) "DEATH");
        ((Field) term74296).setAccessible(true);
        Object enum227 = ((Field) term74296).get((Object) null);
        term74188 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        Object term74189 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Round"));
        Object term74203 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term74189, term74189.getClass(), "game", term74190);
        setField(term74203, term74203.getClass(), "round", term74204);
        setField(term74203, term74203.getClass(), "id", null);
        setField(term74203, term74203.getClass(), "name", null);
        setField(term74203, term74203.getClass(), "eventType", null);
        setField(term74203, term74203.getClass(), "startDate", null);
        setField(term74203, term74203.getClass(), "endDate", null);
        setField(term74203, term74203.getClass(), "site", null);
        setLongField(term74203, term74203.getClass(), "timestamp", 0L);
        setIntField(term74203, term74203.getClass(), "rounds", 0);
        setField(term74203, term74203.getClass(), "timeControl", null);
        setField(term74203, term74203.getClass(), "timeControl2", null);
        setField(term74203, term74203.getClass(), "pgnHolder", null);
        setField(term74189, term74189.getClass(), "event", term74203);
        setIntField(term74189, term74189.getClass(), "number", -100825168);
        setField(term74188, term74188.getClass(), "round", term74189);
        setField(term74188, term74188.getClass(), "gameId", "pLvkKHqNYX");
        setField(term74188, term74188.getClass(), "date", "PwqnuJJwjR");
        setField(term74188, term74188.getClass(), "time", "NFkbBiPeiw");
        setField(term74188, term74188.getClass(), "termination", enum227);
        setField(term74188, term74188.getClass(), "whitePlayer", null);
        setField(term74188, term74188.getClass(), "blackPlayer", null);
        setField(term74188, term74188.getClass(), "annotator", null);
        setField(term74188, term74188.getClass(), "plyCount", null);
        setField(term74188, term74188.getClass(), "result", null);
        setField(term74188, term74188.getClass(), "halfMoves", null);
        setField(term74188, term74188.getClass(), "variations", null);
        setField(term74188, term74188.getClass(), "comments", null);
        setField(term74188, term74188.getClass(), "nag", null);
        setField(term74188, term74188.getClass(), "property", null);
        setField(term74188, term74188.getClass(), "fen", null);
        setField(term74188, term74188.getClass(), "board", null);
        setIntField(term74188, term74188.getClass(), "position", 0);
        setIntField(term74188, term74188.getClass(), "initialPosition", 0);
        setField(term74188, term74188.getClass(), "currentMoveList", null);
        setField(term74188, term74188.getClass(), "eco", null);
        setField(term74188, term74188.getClass(), "moveText", null);
        setField(term74188, term74188.getClass(), "opening", null);
        setField(term74188, term74188.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFen", argTypes, term74188, args);
    }

};


