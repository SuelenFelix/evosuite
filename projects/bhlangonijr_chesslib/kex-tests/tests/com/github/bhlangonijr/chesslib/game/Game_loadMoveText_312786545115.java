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

public class Game_loadMoveText_312786545115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108155;

    public Game_loadMoveText_312786545115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108155 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108155, term108155.getClass(), "round", null);
        setField(term108155, term108155.getClass(), "gameId", null);
        setField(term108155, term108155.getClass(), "date", null);
        setField(term108155, term108155.getClass(), "time", null);
        setField(term108155, term108155.getClass(), "termination", null);
        setField(term108155, term108155.getClass(), "whitePlayer", null);
        setField(term108155, term108155.getClass(), "blackPlayer", null);
        setField(term108155, term108155.getClass(), "annotator", null);
        setField(term108155, term108155.getClass(), "plyCount", null);
        setField(term108155, term108155.getClass(), "result", null);
        setField(term108155, term108155.getClass(), "halfMoves", null);
        setField(term108155, term108155.getClass(), "variations", null);
        setField(term108155, term108155.getClass(), "comments", null);
        setField(term108155, term108155.getClass(), "nag", null);
        setField(term108155, term108155.getClass(), "property", null);
        setField(term108155, term108155.getClass(), "fen", null);
        setField(term108155, term108155.getClass(), "board", null);
        setIntField(term108155, term108155.getClass(), "position", 0);
        setIntField(term108155, term108155.getClass(), "initialPosition", 0);
        setField(term108155, term108155.getClass(), "currentMoveList", null);
        setField(term108155, term108155.getClass(), "eco", null);
        setField(term108155, term108155.getClass(), "moveText", null);
        setField(term108155, term108155.getClass(), "opening", null);
        setField(term108155, term108155.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loadMoveText", argTypes, term108155, args);
    }

};


