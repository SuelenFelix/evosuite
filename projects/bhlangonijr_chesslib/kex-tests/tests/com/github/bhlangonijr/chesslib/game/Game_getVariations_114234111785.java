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

public class Game_getVariations_114234111785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108057;

    public Game_getVariations_114234111785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108057 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108057, term108057.getClass(), "round", null);
        setField(term108057, term108057.getClass(), "gameId", null);
        setField(term108057, term108057.getClass(), "date", null);
        setField(term108057, term108057.getClass(), "time", null);
        setField(term108057, term108057.getClass(), "termination", null);
        setField(term108057, term108057.getClass(), "whitePlayer", null);
        setField(term108057, term108057.getClass(), "blackPlayer", null);
        setField(term108057, term108057.getClass(), "annotator", null);
        setField(term108057, term108057.getClass(), "plyCount", null);
        setField(term108057, term108057.getClass(), "result", null);
        setField(term108057, term108057.getClass(), "halfMoves", null);
        setField(term108057, term108057.getClass(), "variations", null);
        setField(term108057, term108057.getClass(), "comments", null);
        setField(term108057, term108057.getClass(), "nag", null);
        setField(term108057, term108057.getClass(), "property", null);
        setField(term108057, term108057.getClass(), "fen", null);
        setField(term108057, term108057.getClass(), "board", null);
        setIntField(term108057, term108057.getClass(), "position", 0);
        setIntField(term108057, term108057.getClass(), "initialPosition", 0);
        setField(term108057, term108057.getClass(), "currentMoveList", null);
        setField(term108057, term108057.getClass(), "eco", null);
        setField(term108057, term108057.getClass(), "moveText", null);
        setField(term108057, term108057.getClass(), "opening", null);
        setField(term108057, term108057.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariations", argTypes, term108057, args);
    }

};


