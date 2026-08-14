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

public class Game_setNag_133831637590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108072;

    public Game_setNag_133831637590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108072 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term108072, term108072.getClass(), "round", null);
        setField(term108072, term108072.getClass(), "gameId", null);
        setField(term108072, term108072.getClass(), "date", null);
        setField(term108072, term108072.getClass(), "time", null);
        setField(term108072, term108072.getClass(), "termination", null);
        setField(term108072, term108072.getClass(), "whitePlayer", null);
        setField(term108072, term108072.getClass(), "blackPlayer", null);
        setField(term108072, term108072.getClass(), "annotator", null);
        setField(term108072, term108072.getClass(), "plyCount", null);
        setField(term108072, term108072.getClass(), "result", null);
        setField(term108072, term108072.getClass(), "halfMoves", null);
        setField(term108072, term108072.getClass(), "variations", null);
        setField(term108072, term108072.getClass(), "comments", null);
        setField(term108072, term108072.getClass(), "nag", null);
        setField(term108072, term108072.getClass(), "property", null);
        setField(term108072, term108072.getClass(), "fen", null);
        setField(term108072, term108072.getClass(), "board", null);
        setIntField(term108072, term108072.getClass(), "position", 0);
        setIntField(term108072, term108072.getClass(), "initialPosition", 0);
        setField(term108072, term108072.getClass(), "currentMoveList", null);
        setField(term108072, term108072.getClass(), "eco", null);
        setField(term108072, term108072.getClass(), "moveText", null);
        setField(term108072, term108072.getClass(), "opening", null);
        setField(term108072, term108072.getClass(), "variation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNag", argTypes, term108072, args);
    }

};


