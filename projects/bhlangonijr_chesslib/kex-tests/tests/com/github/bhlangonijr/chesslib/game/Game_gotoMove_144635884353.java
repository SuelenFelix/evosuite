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

public class Game_gotoMove_144635884353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94300;
     Object term94303;

    public Game_gotoMove_144635884353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94300 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term94300, term94300.getClass(), "round", null);
        setField(term94300, term94300.getClass(), "gameId", null);
        setField(term94300, term94300.getClass(), "date", null);
        setField(term94300, term94300.getClass(), "time", null);
        setField(term94300, term94300.getClass(), "termination", null);
        setField(term94300, term94300.getClass(), "whitePlayer", null);
        setField(term94300, term94300.getClass(), "blackPlayer", null);
        setField(term94300, term94300.getClass(), "annotator", null);
        setField(term94300, term94300.getClass(), "plyCount", null);
        setField(term94300, term94300.getClass(), "result", null);
        setField(term94300, term94300.getClass(), "halfMoves", null);
        setField(term94300, term94300.getClass(), "variations", null);
        setField(term94300, term94300.getClass(), "comments", null);
        setField(term94300, term94300.getClass(), "nag", null);
        setField(term94300, term94300.getClass(), "property", null);
        setField(term94300, term94300.getClass(), "fen", null);
        setField(term94300, term94300.getClass(), "board", null);
        setIntField(term94300, term94300.getClass(), "position", 0);
        setIntField(term94300, term94300.getClass(), "initialPosition", 0);
        setField(term94300, term94300.getClass(), "currentMoveList", null);
        setField(term94300, term94300.getClass(), "eco", null);
        setField(term94300, term94300.getClass(), "moveText", null);
        setField(term94300, term94300.getClass(), "opening", null);
        setField(term94300, term94300.getClass(), "variation", null);
        term94303 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term94303;
        callMethod(klass, "gotoMove", argTypes, term94300, args);
    }

};


