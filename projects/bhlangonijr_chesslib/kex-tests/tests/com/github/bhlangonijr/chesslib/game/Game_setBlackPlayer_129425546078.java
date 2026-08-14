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

public class Game_setBlackPlayer_129425546078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108036;

    public Game_setBlackPlayer_129425546078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108036 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108036, term108036.getClass(), "round", null);
        setField(term108036, term108036.getClass(), "gameId", null);
        setField(term108036, term108036.getClass(), "date", null);
        setField(term108036, term108036.getClass(), "time", null);
        setField(term108036, term108036.getClass(), "termination", null);
        setField(term108036, term108036.getClass(), "whitePlayer", null);
        setField(term108036, term108036.getClass(), "blackPlayer", null);
        setField(term108036, term108036.getClass(), "annotator", null);
        setField(term108036, term108036.getClass(), "plyCount", null);
        setField(term108036, term108036.getClass(), "result", null);
        setField(term108036, term108036.getClass(), "halfMoves", null);
        setField(term108036, term108036.getClass(), "variations", null);
        setField(term108036, term108036.getClass(), "comments", null);
        setField(term108036, term108036.getClass(), "nag", null);
        setField(term108036, term108036.getClass(), "property", null);
        setField(term108036, term108036.getClass(), "fen", null);
        setField(term108036, term108036.getClass(), "board", null);
        setIntField(term108036, term108036.getClass(), "position", 0);
        setIntField(term108036, term108036.getClass(), "initialPosition", 0);
        setField(term108036, term108036.getClass(), "currentMoveList", null);
        setField(term108036, term108036.getClass(), "eco", null);
        setField(term108036, term108036.getClass(), "moveText", null);
        setField(term108036, term108036.getClass(), "opening", null);
        setField(term108036, term108036.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Player");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBlackPlayer", argTypes, term108036, args);
    }

};


