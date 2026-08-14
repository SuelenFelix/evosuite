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

public class GameContext_getoooSquares_2097702543143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531359;

    public GameContext_getoooSquares_2097702543143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531359 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531359, term531359.getClass(), "whiteoo", null);
        setField(term531359, term531359.getClass(), "whiteooo", null);
        setField(term531359, term531359.getClass(), "blackoo", null);
        setField(term531359, term531359.getClass(), "blackooo", null);
        setField(term531359, term531359.getClass(), "whiteRookoo", null);
        setField(term531359, term531359.getClass(), "whiteRookooo", null);
        setField(term531359, term531359.getClass(), "blackRookoo", null);
        setField(term531359, term531359.getClass(), "blackRookooo", null);
        setField(term531359, term531359.getClass(), "whiteooSquares", null);
        setField(term531359, term531359.getClass(), "whiteoooSquares", null);
        setField(term531359, term531359.getClass(), "blackooSquares", null);
        setField(term531359, term531359.getClass(), "blackoooSquares", null);
        setLongField(term531359, term531359.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531359, term531359.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531359, term531359.getClass(), "startFEN", null);
        setField(term531359, term531359.getClass(), "whiteRookooFile", null);
        setField(term531359, term531359.getClass(), "whiteRookoooFile", null);
        setField(term531359, term531359.getClass(), "blackRookooFile", null);
        setField(term531359, term531359.getClass(), "blackRookoooFile", null);
        setField(term531359, term531359.getClass(), "gameMode", null);
        setField(term531359, term531359.getClass(), "variationType", null);
        setField(term531359, term531359.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getoooSquares", argTypes, term531359, args);
    }

};


