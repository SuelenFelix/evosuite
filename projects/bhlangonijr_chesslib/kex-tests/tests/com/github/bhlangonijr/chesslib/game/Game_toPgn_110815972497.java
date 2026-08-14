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
import java.lang.Boolean;

public class Game_toPgn_110815972497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108093;
     Object term108096;
     Object term108098;

    public Game_toPgn_110815972497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108093 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108093, term108093.getClass(), "round", null);
        setField(term108093, term108093.getClass(), "gameId", null);
        setField(term108093, term108093.getClass(), "date", null);
        setField(term108093, term108093.getClass(), "time", null);
        setField(term108093, term108093.getClass(), "termination", null);
        setField(term108093, term108093.getClass(), "whitePlayer", null);
        setField(term108093, term108093.getClass(), "blackPlayer", null);
        setField(term108093, term108093.getClass(), "annotator", null);
        setField(term108093, term108093.getClass(), "plyCount", null);
        setField(term108093, term108093.getClass(), "result", null);
        setField(term108093, term108093.getClass(), "halfMoves", null);
        setField(term108093, term108093.getClass(), "variations", null);
        setField(term108093, term108093.getClass(), "comments", null);
        setField(term108093, term108093.getClass(), "nag", null);
        setField(term108093, term108093.getClass(), "property", null);
        setField(term108093, term108093.getClass(), "fen", null);
        setField(term108093, term108093.getClass(), "board", null);
        setIntField(term108093, term108093.getClass(), "position", 0);
        setIntField(term108093, term108093.getClass(), "initialPosition", 0);
        setField(term108093, term108093.getClass(), "currentMoveList", null);
        setField(term108093, term108093.getClass(), "eco", null);
        setField(term108093, term108093.getClass(), "moveText", null);
        setField(term108093, term108093.getClass(), "opening", null);
        setField(term108093, term108093.getClass(), "variation", null);
        term108096 = new Boolean(false);
        term108098 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term108096;
        args[1] = term108098;
        callMethod(klass, "toPgn", argTypes, term108093, args);
    }

};


