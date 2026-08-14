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

public class Game_isStartOfMoveList_2093000393121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108173;

    public Game_isStartOfMoveList_2093000393121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108173 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108173, term108173.getClass(), "round", null);
        setField(term108173, term108173.getClass(), "gameId", null);
        setField(term108173, term108173.getClass(), "date", null);
        setField(term108173, term108173.getClass(), "time", null);
        setField(term108173, term108173.getClass(), "termination", null);
        setField(term108173, term108173.getClass(), "whitePlayer", null);
        setField(term108173, term108173.getClass(), "blackPlayer", null);
        setField(term108173, term108173.getClass(), "annotator", null);
        setField(term108173, term108173.getClass(), "plyCount", null);
        setField(term108173, term108173.getClass(), "result", null);
        setField(term108173, term108173.getClass(), "halfMoves", null);
        setField(term108173, term108173.getClass(), "variations", null);
        setField(term108173, term108173.getClass(), "comments", null);
        setField(term108173, term108173.getClass(), "nag", null);
        setField(term108173, term108173.getClass(), "property", null);
        setField(term108173, term108173.getClass(), "fen", null);
        setField(term108173, term108173.getClass(), "board", null);
        setIntField(term108173, term108173.getClass(), "position", 0);
        setIntField(term108173, term108173.getClass(), "initialPosition", 0);
        setField(term108173, term108173.getClass(), "currentMoveList", null);
        setField(term108173, term108173.getClass(), "eco", null);
        setField(term108173, term108173.getClass(), "moveText", null);
        setField(term108173, term108173.getClass(), "opening", null);
        setField(term108173, term108173.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStartOfMoveList", argTypes, term108173, args);
    }

};


