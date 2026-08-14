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

public class GameContext_loadChess960_15765220781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530787;

    public GameContext_loadChess960_15765220781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530787 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530787, term530787.getClass(), "whiteoo", null);
        setField(term530787, term530787.getClass(), "whiteooo", null);
        setField(term530787, term530787.getClass(), "blackoo", null);
        setField(term530787, term530787.getClass(), "blackooo", null);
        setField(term530787, term530787.getClass(), "whiteRookoo", null);
        setField(term530787, term530787.getClass(), "whiteRookooo", null);
        setField(term530787, term530787.getClass(), "blackRookoo", null);
        setField(term530787, term530787.getClass(), "blackRookooo", null);
        setField(term530787, term530787.getClass(), "whiteooSquares", null);
        setField(term530787, term530787.getClass(), "whiteoooSquares", null);
        setField(term530787, term530787.getClass(), "blackooSquares", null);
        setField(term530787, term530787.getClass(), "blackoooSquares", null);
        setLongField(term530787, term530787.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530787, term530787.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530787, term530787.getClass(), "startFEN", null);
        setField(term530787, term530787.getClass(), "whiteRookooFile", null);
        setField(term530787, term530787.getClass(), "whiteRookoooFile", null);
        setField(term530787, term530787.getClass(), "blackRookooFile", null);
        setField(term530787, term530787.getClass(), "blackRookoooFile", null);
        setField(term530787, term530787.getClass(), "gameMode", null);
        setField(term530787, term530787.getClass(), "variationType", null);
        setField(term530787, term530787.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[4] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[5] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "loadChess960", argTypes, term530787, args);
    }

};


