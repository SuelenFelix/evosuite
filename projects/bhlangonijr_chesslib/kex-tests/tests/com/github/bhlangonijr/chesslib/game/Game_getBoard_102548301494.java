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

public class Game_getBoard_102548301494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108084;

    public Game_getBoard_102548301494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108084 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108084, term108084.getClass(), "round", null);
        setField(term108084, term108084.getClass(), "gameId", null);
        setField(term108084, term108084.getClass(), "date", null);
        setField(term108084, term108084.getClass(), "time", null);
        setField(term108084, term108084.getClass(), "termination", null);
        setField(term108084, term108084.getClass(), "whitePlayer", null);
        setField(term108084, term108084.getClass(), "blackPlayer", null);
        setField(term108084, term108084.getClass(), "annotator", null);
        setField(term108084, term108084.getClass(), "plyCount", null);
        setField(term108084, term108084.getClass(), "result", null);
        setField(term108084, term108084.getClass(), "halfMoves", null);
        setField(term108084, term108084.getClass(), "variations", null);
        setField(term108084, term108084.getClass(), "comments", null);
        setField(term108084, term108084.getClass(), "nag", null);
        setField(term108084, term108084.getClass(), "property", null);
        setField(term108084, term108084.getClass(), "fen", null);
        setField(term108084, term108084.getClass(), "board", null);
        setIntField(term108084, term108084.getClass(), "position", 0);
        setIntField(term108084, term108084.getClass(), "initialPosition", 0);
        setField(term108084, term108084.getClass(), "currentMoveList", null);
        setField(term108084, term108084.getClass(), "eco", null);
        setField(term108084, term108084.getClass(), "moveText", null);
        setField(term108084, term108084.getClass(), "opening", null);
        setField(term108084, term108084.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBoard", argTypes, term108084, args);
    }

};


