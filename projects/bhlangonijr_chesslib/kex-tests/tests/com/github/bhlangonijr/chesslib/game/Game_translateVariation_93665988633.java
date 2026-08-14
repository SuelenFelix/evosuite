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

public class Game_translateVariation_93665988633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86888;
     Object term86891;
     Object term86893;
     Object term86895;
     Object term86897;
     Object term86899;

    public Game_translateVariation_93665988633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86888 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Game"));
        setField(term86888, term86888.getClass(), "round", null);
        setField(term86888, term86888.getClass(), "gameId", null);
        setField(term86888, term86888.getClass(), "date", null);
        setField(term86888, term86888.getClass(), "time", null);
        setField(term86888, term86888.getClass(), "termination", null);
        setField(term86888, term86888.getClass(), "whitePlayer", null);
        setField(term86888, term86888.getClass(), "blackPlayer", null);
        setField(term86888, term86888.getClass(), "annotator", null);
        setField(term86888, term86888.getClass(), "plyCount", null);
        setField(term86888, term86888.getClass(), "result", null);
        setField(term86888, term86888.getClass(), "halfMoves", null);
        setField(term86888, term86888.getClass(), "variations", null);
        setField(term86888, term86888.getClass(), "comments", null);
        setField(term86888, term86888.getClass(), "nag", null);
        setField(term86888, term86888.getClass(), "property", null);
        setField(term86888, term86888.getClass(), "fen", null);
        setField(term86888, term86888.getClass(), "board", null);
        setIntField(term86888, term86888.getClass(), "position", 0);
        setIntField(term86888, term86888.getClass(), "initialPosition", 0);
        setField(term86888, term86888.getClass(), "currentMoveList", null);
        setField(term86888, term86888.getClass(), "eco", null);
        setField(term86888, term86888.getClass(), "moveText", null);
        setField(term86888, term86888.getClass(), "opening", null);
        setField(term86888, term86888.getClass(), "variation", null);
        term86891 = new Integer(0);
        term86893 = new Integer(0);
        term86895 = new Integer(0);
        term86897 = new Integer(0);
        term86899 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Game");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.move.MoveList");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term86891;
        args[3] = term86893;
        args[4] = term86895;
        args[5] = term86897;
        args[6] = term86899;
        callMethod(klass, "translateVariation", argTypes, term86888, args);
    }

};


