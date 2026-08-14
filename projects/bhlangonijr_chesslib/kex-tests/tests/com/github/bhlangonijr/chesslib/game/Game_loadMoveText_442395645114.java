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

public class Game_loadMoveText_442395645114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108152;

    public Game_loadMoveText_442395645114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108152 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108152, term108152.getClass(), "round", null);
        setField(term108152, term108152.getClass(), "gameId", null);
        setField(term108152, term108152.getClass(), "date", null);
        setField(term108152, term108152.getClass(), "time", null);
        setField(term108152, term108152.getClass(), "termination", null);
        setField(term108152, term108152.getClass(), "whitePlayer", null);
        setField(term108152, term108152.getClass(), "blackPlayer", null);
        setField(term108152, term108152.getClass(), "annotator", null);
        setField(term108152, term108152.getClass(), "plyCount", null);
        setField(term108152, term108152.getClass(), "result", null);
        setField(term108152, term108152.getClass(), "halfMoves", null);
        setField(term108152, term108152.getClass(), "variations", null);
        setField(term108152, term108152.getClass(), "comments", null);
        setField(term108152, term108152.getClass(), "nag", null);
        setField(term108152, term108152.getClass(), "property", null);
        setField(term108152, term108152.getClass(), "fen", null);
        setField(term108152, term108152.getClass(), "board", null);
        setIntField(term108152, term108152.getClass(), "position", 0);
        setIntField(term108152, term108152.getClass(), "initialPosition", 0);
        setField(term108152, term108152.getClass(), "currentMoveList", null);
        setField(term108152, term108152.getClass(), "eco", null);
        setField(term108152, term108152.getClass(), "moveText", null);
        setField(term108152, term108152.getClass(), "opening", null);
        setField(term108152, term108152.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadMoveText", argTypes, term108152, args);
    }

};


