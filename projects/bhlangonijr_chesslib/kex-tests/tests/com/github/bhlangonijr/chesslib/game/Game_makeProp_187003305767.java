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

public class Game_makeProp_187003305767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108001;

    public Game_makeProp_187003305767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108001 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108001, term108001.getClass(), "round", null);
        setField(term108001, term108001.getClass(), "gameId", null);
        setField(term108001, term108001.getClass(), "date", null);
        setField(term108001, term108001.getClass(), "time", null);
        setField(term108001, term108001.getClass(), "termination", null);
        setField(term108001, term108001.getClass(), "whitePlayer", null);
        setField(term108001, term108001.getClass(), "blackPlayer", null);
        setField(term108001, term108001.getClass(), "annotator", null);
        setField(term108001, term108001.getClass(), "plyCount", null);
        setField(term108001, term108001.getClass(), "result", null);
        setField(term108001, term108001.getClass(), "halfMoves", null);
        setField(term108001, term108001.getClass(), "variations", null);
        setField(term108001, term108001.getClass(), "comments", null);
        setField(term108001, term108001.getClass(), "nag", null);
        setField(term108001, term108001.getClass(), "property", null);
        setField(term108001, term108001.getClass(), "fen", null);
        setField(term108001, term108001.getClass(), "board", null);
        setIntField(term108001, term108001.getClass(), "position", 0);
        setIntField(term108001, term108001.getClass(), "initialPosition", 0);
        setField(term108001, term108001.getClass(), "currentMoveList", null);
        setField(term108001, term108001.getClass(), "eco", null);
        setField(term108001, term108001.getClass(), "moveText", null);
        setField(term108001, term108001.getClass(), "opening", null);
        setField(term108001, term108001.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "makeProp", argTypes, term108001, args);
    }

};


