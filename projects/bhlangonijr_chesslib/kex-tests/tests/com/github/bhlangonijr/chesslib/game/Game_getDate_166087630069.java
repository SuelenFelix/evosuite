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

public class Game_getDate_166087630069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108009;

    public Game_getDate_166087630069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108009 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108009, term108009.getClass(), "round", null);
        setField(term108009, term108009.getClass(), "gameId", null);
        setField(term108009, term108009.getClass(), "date", null);
        setField(term108009, term108009.getClass(), "time", null);
        setField(term108009, term108009.getClass(), "termination", null);
        setField(term108009, term108009.getClass(), "whitePlayer", null);
        setField(term108009, term108009.getClass(), "blackPlayer", null);
        setField(term108009, term108009.getClass(), "annotator", null);
        setField(term108009, term108009.getClass(), "plyCount", null);
        setField(term108009, term108009.getClass(), "result", null);
        setField(term108009, term108009.getClass(), "halfMoves", null);
        setField(term108009, term108009.getClass(), "variations", null);
        setField(term108009, term108009.getClass(), "comments", null);
        setField(term108009, term108009.getClass(), "nag", null);
        setField(term108009, term108009.getClass(), "property", null);
        setField(term108009, term108009.getClass(), "fen", null);
        setField(term108009, term108009.getClass(), "board", null);
        setIntField(term108009, term108009.getClass(), "position", 0);
        setIntField(term108009, term108009.getClass(), "initialPosition", 0);
        setField(term108009, term108009.getClass(), "currentMoveList", null);
        setField(term108009, term108009.getClass(), "eco", null);
        setField(term108009, term108009.getClass(), "moveText", null);
        setField(term108009, term108009.getClass(), "opening", null);
        setField(term108009, term108009.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term108009, args);
    }

};


