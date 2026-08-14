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

public class GameContext_loadChess960_15765220779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811524;

    public GameContext_loadChess960_15765220779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811524 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811524, term1811524.getClass(), "whiteoo", null);
        setField(term1811524, term1811524.getClass(), "whiteooo", null);
        setField(term1811524, term1811524.getClass(), "blackoo", null);
        setField(term1811524, term1811524.getClass(), "blackooo", null);
        setField(term1811524, term1811524.getClass(), "whiteRookoo", null);
        setField(term1811524, term1811524.getClass(), "whiteRookooo", null);
        setField(term1811524, term1811524.getClass(), "blackRookoo", null);
        setField(term1811524, term1811524.getClass(), "blackRookooo", null);
        setField(term1811524, term1811524.getClass(), "whiteooSquares", null);
        setField(term1811524, term1811524.getClass(), "whiteoooSquares", null);
        setField(term1811524, term1811524.getClass(), "blackooSquares", null);
        setField(term1811524, term1811524.getClass(), "blackoooSquares", null);
        setLongField(term1811524, term1811524.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811524, term1811524.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811524, term1811524.getClass(), "startFEN", null);
        setField(term1811524, term1811524.getClass(), "whiteRookooFile", null);
        setField(term1811524, term1811524.getClass(), "whiteRookoooFile", null);
        setField(term1811524, term1811524.getClass(), "blackRookooFile", null);
        setField(term1811524, term1811524.getClass(), "blackRookoooFile", null);
        setField(term1811524, term1811524.getClass(), "gameMode", null);
        setField(term1811524, term1811524.getClass(), "variationType", null);
        setField(term1811524, term1811524.getClass(), "event", null);
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
        callMethod(klass, "loadChess960", argTypes, term1811524, args);
    }

};


