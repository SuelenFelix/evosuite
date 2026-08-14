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

public class Game_getNag_116522466789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108069;

    public Game_getNag_116522466789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108069 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108069, term108069.getClass(), "round", null);
        setField(term108069, term108069.getClass(), "gameId", null);
        setField(term108069, term108069.getClass(), "date", null);
        setField(term108069, term108069.getClass(), "time", null);
        setField(term108069, term108069.getClass(), "termination", null);
        setField(term108069, term108069.getClass(), "whitePlayer", null);
        setField(term108069, term108069.getClass(), "blackPlayer", null);
        setField(term108069, term108069.getClass(), "annotator", null);
        setField(term108069, term108069.getClass(), "plyCount", null);
        setField(term108069, term108069.getClass(), "result", null);
        setField(term108069, term108069.getClass(), "halfMoves", null);
        setField(term108069, term108069.getClass(), "variations", null);
        setField(term108069, term108069.getClass(), "comments", null);
        setField(term108069, term108069.getClass(), "nag", null);
        setField(term108069, term108069.getClass(), "property", null);
        setField(term108069, term108069.getClass(), "fen", null);
        setField(term108069, term108069.getClass(), "board", null);
        setIntField(term108069, term108069.getClass(), "position", 0);
        setIntField(term108069, term108069.getClass(), "initialPosition", 0);
        setField(term108069, term108069.getClass(), "currentMoveList", null);
        setField(term108069, term108069.getClass(), "eco", null);
        setField(term108069, term108069.getClass(), "moveText", null);
        setField(term108069, term108069.getClass(), "opening", null);
        setField(term108069, term108069.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNag", argTypes, term108069, args);
    }

};


