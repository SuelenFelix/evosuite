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

public class Game_setCurrentMoveList_5813332342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90154;

    public Game_setCurrentMoveList_5813332342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90154 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term90154, term90154.getClass(), "round", null);
        setField(term90154, term90154.getClass(), "gameId", null);
        setField(term90154, term90154.getClass(), "date", null);
        setField(term90154, term90154.getClass(), "time", null);
        setField(term90154, term90154.getClass(), "termination", null);
        setField(term90154, term90154.getClass(), "whitePlayer", null);
        setField(term90154, term90154.getClass(), "blackPlayer", null);
        setField(term90154, term90154.getClass(), "annotator", null);
        setField(term90154, term90154.getClass(), "plyCount", null);
        setField(term90154, term90154.getClass(), "result", null);
        setField(term90154, term90154.getClass(), "halfMoves", null);
        setField(term90154, term90154.getClass(), "variations", null);
        setField(term90154, term90154.getClass(), "comments", null);
        setField(term90154, term90154.getClass(), "nag", null);
        setField(term90154, term90154.getClass(), "property", null);
        setField(term90154, term90154.getClass(), "fen", null);
        setField(term90154, term90154.getClass(), "board", null);
        setIntField(term90154, term90154.getClass(), "position", 0);
        setIntField(term90154, term90154.getClass(), "initialPosition", 0);
        setField(term90154, term90154.getClass(), "currentMoveList", null);
        setField(term90154, term90154.getClass(), "eco", null);
        setField(term90154, term90154.getClass(), "moveText", null);
        setField(term90154, term90154.getClass(), "opening", null);
        setField(term90154, term90154.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCurrentMoveList", argTypes, term90154, args);
    }

};


