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
import java.lang.Integer;

public class Game_setInitialPosition_1066999316104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108120;
     Object term108123;

    public Game_setInitialPosition_1066999316104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108120 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108120, term108120.getClass(), "round", null);
        setField(term108120, term108120.getClass(), "gameId", null);
        setField(term108120, term108120.getClass(), "date", null);
        setField(term108120, term108120.getClass(), "time", null);
        setField(term108120, term108120.getClass(), "termination", null);
        setField(term108120, term108120.getClass(), "whitePlayer", null);
        setField(term108120, term108120.getClass(), "blackPlayer", null);
        setField(term108120, term108120.getClass(), "annotator", null);
        setField(term108120, term108120.getClass(), "plyCount", null);
        setField(term108120, term108120.getClass(), "result", null);
        setField(term108120, term108120.getClass(), "halfMoves", null);
        setField(term108120, term108120.getClass(), "variations", null);
        setField(term108120, term108120.getClass(), "comments", null);
        setField(term108120, term108120.getClass(), "nag", null);
        setField(term108120, term108120.getClass(), "property", null);
        setField(term108120, term108120.getClass(), "fen", null);
        setField(term108120, term108120.getClass(), "board", null);
        setIntField(term108120, term108120.getClass(), "position", 0);
        setIntField(term108120, term108120.getClass(), "initialPosition", 0);
        setField(term108120, term108120.getClass(), "currentMoveList", null);
        setField(term108120, term108120.getClass(), "eco", null);
        setField(term108120, term108120.getClass(), "moveText", null);
        setField(term108120, term108120.getClass(), "opening", null);
        setField(term108120, term108120.getClass(), "variation", null);
        term108123 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108123;
        callMethod(klass, "setInitialPosition", argTypes, term108120, args);
    }

};


