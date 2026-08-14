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
import java.lang.Integer;

public class Game_getMovesAt_136702890868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108004;
     Object term108007;

    public Game_getMovesAt_136702890868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108004 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108004, term108004.getClass(), "round", null);
        setField(term108004, term108004.getClass(), "gameId", null);
        setField(term108004, term108004.getClass(), "date", null);
        setField(term108004, term108004.getClass(), "time", null);
        setField(term108004, term108004.getClass(), "termination", null);
        setField(term108004, term108004.getClass(), "whitePlayer", null);
        setField(term108004, term108004.getClass(), "blackPlayer", null);
        setField(term108004, term108004.getClass(), "annotator", null);
        setField(term108004, term108004.getClass(), "plyCount", null);
        setField(term108004, term108004.getClass(), "result", null);
        setField(term108004, term108004.getClass(), "halfMoves", null);
        setField(term108004, term108004.getClass(), "variations", null);
        setField(term108004, term108004.getClass(), "comments", null);
        setField(term108004, term108004.getClass(), "nag", null);
        setField(term108004, term108004.getClass(), "property", null);
        setField(term108004, term108004.getClass(), "fen", null);
        setField(term108004, term108004.getClass(), "board", null);
        setIntField(term108004, term108004.getClass(), "position", 0);
        setIntField(term108004, term108004.getClass(), "initialPosition", 0);
        setField(term108004, term108004.getClass(), "currentMoveList", null);
        setField(term108004, term108004.getClass(), "eco", null);
        setField(term108004, term108004.getClass(), "moveText", null);
        setField(term108004, term108004.getClass(), "opening", null);
        setField(term108004, term108004.getClass(), "variation", null);
        term108007 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term108007;
        callMethod(klass, "getMovesAt", argTypes, term108004, args);
    }

};


