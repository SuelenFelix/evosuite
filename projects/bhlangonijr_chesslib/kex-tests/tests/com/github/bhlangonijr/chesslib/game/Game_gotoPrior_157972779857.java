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

public class Game_gotoPrior_157972779857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94314;

    public Game_gotoPrior_157972779857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94314 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term94314, term94314.getClass(), "round", null);
        setField(term94314, term94314.getClass(), "gameId", null);
        setField(term94314, term94314.getClass(), "date", null);
        setField(term94314, term94314.getClass(), "time", null);
        setField(term94314, term94314.getClass(), "termination", null);
        setField(term94314, term94314.getClass(), "whitePlayer", null);
        setField(term94314, term94314.getClass(), "blackPlayer", null);
        setField(term94314, term94314.getClass(), "annotator", null);
        setField(term94314, term94314.getClass(), "plyCount", null);
        setField(term94314, term94314.getClass(), "result", null);
        setField(term94314, term94314.getClass(), "halfMoves", null);
        setField(term94314, term94314.getClass(), "variations", null);
        setField(term94314, term94314.getClass(), "comments", null);
        setField(term94314, term94314.getClass(), "nag", null);
        setField(term94314, term94314.getClass(), "property", null);
        setField(term94314, term94314.getClass(), "fen", null);
        setField(term94314, term94314.getClass(), "board", null);
        setIntField(term94314, term94314.getClass(), "position", 0);
        setIntField(term94314, term94314.getClass(), "initialPosition", 0);
        setField(term94314, term94314.getClass(), "currentMoveList", null);
        setField(term94314, term94314.getClass(), "eco", null);
        setField(term94314, term94314.getClass(), "moveText", null);
        setField(term94314, term94314.getClass(), "opening", null);
        setField(term94314, term94314.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "gotoPrior", argTypes, term94314, args);
    }

};


