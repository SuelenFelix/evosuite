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

public class Game_setVariation_360666669111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108143;

    public Game_setVariation_360666669111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108143 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108143, term108143.getClass(), "round", null);
        setField(term108143, term108143.getClass(), "gameId", null);
        setField(term108143, term108143.getClass(), "date", null);
        setField(term108143, term108143.getClass(), "time", null);
        setField(term108143, term108143.getClass(), "termination", null);
        setField(term108143, term108143.getClass(), "whitePlayer", null);
        setField(term108143, term108143.getClass(), "blackPlayer", null);
        setField(term108143, term108143.getClass(), "annotator", null);
        setField(term108143, term108143.getClass(), "plyCount", null);
        setField(term108143, term108143.getClass(), "result", null);
        setField(term108143, term108143.getClass(), "halfMoves", null);
        setField(term108143, term108143.getClass(), "variations", null);
        setField(term108143, term108143.getClass(), "comments", null);
        setField(term108143, term108143.getClass(), "nag", null);
        setField(term108143, term108143.getClass(), "property", null);
        setField(term108143, term108143.getClass(), "fen", null);
        setField(term108143, term108143.getClass(), "board", null);
        setIntField(term108143, term108143.getClass(), "position", 0);
        setIntField(term108143, term108143.getClass(), "initialPosition", 0);
        setField(term108143, term108143.getClass(), "currentMoveList", null);
        setField(term108143, term108143.getClass(), "eco", null);
        setField(term108143, term108143.getClass(), "moveText", null);
        setField(term108143, term108143.getClass(), "opening", null);
        setField(term108143, term108143.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setVariation", argTypes, term108143, args);
    }

};


