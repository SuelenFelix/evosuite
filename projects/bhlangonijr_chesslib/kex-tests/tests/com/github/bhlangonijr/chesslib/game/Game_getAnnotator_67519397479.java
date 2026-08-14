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

public class Game_getAnnotator_67519397479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108039;

    public Game_getAnnotator_67519397479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108039 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108039, term108039.getClass(), "round", null);
        setField(term108039, term108039.getClass(), "gameId", null);
        setField(term108039, term108039.getClass(), "date", null);
        setField(term108039, term108039.getClass(), "time", null);
        setField(term108039, term108039.getClass(), "termination", null);
        setField(term108039, term108039.getClass(), "whitePlayer", null);
        setField(term108039, term108039.getClass(), "blackPlayer", null);
        setField(term108039, term108039.getClass(), "annotator", null);
        setField(term108039, term108039.getClass(), "plyCount", null);
        setField(term108039, term108039.getClass(), "result", null);
        setField(term108039, term108039.getClass(), "halfMoves", null);
        setField(term108039, term108039.getClass(), "variations", null);
        setField(term108039, term108039.getClass(), "comments", null);
        setField(term108039, term108039.getClass(), "nag", null);
        setField(term108039, term108039.getClass(), "property", null);
        setField(term108039, term108039.getClass(), "fen", null);
        setField(term108039, term108039.getClass(), "board", null);
        setIntField(term108039, term108039.getClass(), "position", 0);
        setIntField(term108039, term108039.getClass(), "initialPosition", 0);
        setField(term108039, term108039.getClass(), "currentMoveList", null);
        setField(term108039, term108039.getClass(), "eco", null);
        setField(term108039, term108039.getClass(), "moveText", null);
        setField(term108039, term108039.getClass(), "opening", null);
        setField(term108039, term108039.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotator", argTypes, term108039, args);
    }

};


