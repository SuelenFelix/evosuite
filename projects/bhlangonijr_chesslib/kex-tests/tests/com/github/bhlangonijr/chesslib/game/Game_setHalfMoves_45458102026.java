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

public class Game_setHalfMoves_45458102026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74185;

    public Game_setHalfMoves_45458102026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74185 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term74185, term74185.getClass(), "round", null);
        setField(term74185, term74185.getClass(), "gameId", null);
        setField(term74185, term74185.getClass(), "date", null);
        setField(term74185, term74185.getClass(), "time", null);
        setField(term74185, term74185.getClass(), "termination", null);
        setField(term74185, term74185.getClass(), "whitePlayer", null);
        setField(term74185, term74185.getClass(), "blackPlayer", null);
        setField(term74185, term74185.getClass(), "annotator", null);
        setField(term74185, term74185.getClass(), "plyCount", null);
        setField(term74185, term74185.getClass(), "result", null);
        setField(term74185, term74185.getClass(), "halfMoves", null);
        setField(term74185, term74185.getClass(), "variations", null);
        setField(term74185, term74185.getClass(), "comments", null);
        setField(term74185, term74185.getClass(), "nag", null);
        setField(term74185, term74185.getClass(), "property", null);
        setField(term74185, term74185.getClass(), "fen", null);
        setField(term74185, term74185.getClass(), "board", null);
        setIntField(term74185, term74185.getClass(), "position", 0);
        setIntField(term74185, term74185.getClass(), "initialPosition", 0);
        setField(term74185, term74185.getClass(), "currentMoveList", null);
        setField(term74185, term74185.getClass(), "eco", null);
        setField(term74185, term74185.getClass(), "moveText", null);
        setField(term74185, term74185.getClass(), "opening", null);
        setField(term74185, term74185.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHalfMoves", argTypes, term74185, args);
    }

};


