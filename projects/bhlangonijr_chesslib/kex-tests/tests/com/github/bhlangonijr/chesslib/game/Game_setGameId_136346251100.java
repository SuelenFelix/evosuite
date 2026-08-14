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

public class Game_setGameId_136346251100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108106;

    public Game_setGameId_136346251100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108106 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108106, term108106.getClass(), "round", null);
        setField(term108106, term108106.getClass(), "gameId", null);
        setField(term108106, term108106.getClass(), "date", null);
        setField(term108106, term108106.getClass(), "time", null);
        setField(term108106, term108106.getClass(), "termination", null);
        setField(term108106, term108106.getClass(), "whitePlayer", null);
        setField(term108106, term108106.getClass(), "blackPlayer", null);
        setField(term108106, term108106.getClass(), "annotator", null);
        setField(term108106, term108106.getClass(), "plyCount", null);
        setField(term108106, term108106.getClass(), "result", null);
        setField(term108106, term108106.getClass(), "halfMoves", null);
        setField(term108106, term108106.getClass(), "variations", null);
        setField(term108106, term108106.getClass(), "comments", null);
        setField(term108106, term108106.getClass(), "nag", null);
        setField(term108106, term108106.getClass(), "property", null);
        setField(term108106, term108106.getClass(), "fen", null);
        setField(term108106, term108106.getClass(), "board", null);
        setIntField(term108106, term108106.getClass(), "position", 0);
        setIntField(term108106, term108106.getClass(), "initialPosition", 0);
        setField(term108106, term108106.getClass(), "currentMoveList", null);
        setField(term108106, term108106.getClass(), "eco", null);
        setField(term108106, term108106.getClass(), "moveText", null);
        setField(term108106, term108106.getClass(), "opening", null);
        setField(term108106, term108106.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGameId", argTypes, term108106, args);
    }

};


