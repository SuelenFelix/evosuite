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

public class GameContext_getBlackoooSquares_1609706830120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811893;

    public GameContext_getBlackoooSquares_1609706830120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811893 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811893, term1811893.getClass(), "whiteoo", null);
        setField(term1811893, term1811893.getClass(), "whiteooo", null);
        setField(term1811893, term1811893.getClass(), "blackoo", null);
        setField(term1811893, term1811893.getClass(), "blackooo", null);
        setField(term1811893, term1811893.getClass(), "whiteRookoo", null);
        setField(term1811893, term1811893.getClass(), "whiteRookooo", null);
        setField(term1811893, term1811893.getClass(), "blackRookoo", null);
        setField(term1811893, term1811893.getClass(), "blackRookooo", null);
        setField(term1811893, term1811893.getClass(), "whiteooSquares", null);
        setField(term1811893, term1811893.getClass(), "whiteoooSquares", null);
        setField(term1811893, term1811893.getClass(), "blackooSquares", null);
        setField(term1811893, term1811893.getClass(), "blackoooSquares", null);
        setLongField(term1811893, term1811893.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811893, term1811893.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811893, term1811893.getClass(), "startFEN", null);
        setField(term1811893, term1811893.getClass(), "whiteRookooFile", null);
        setField(term1811893, term1811893.getClass(), "whiteRookoooFile", null);
        setField(term1811893, term1811893.getClass(), "blackRookooFile", null);
        setField(term1811893, term1811893.getClass(), "blackRookoooFile", null);
        setField(term1811893, term1811893.getClass(), "gameMode", null);
        setField(term1811893, term1811893.getClass(), "variationType", null);
        setField(term1811893, term1811893.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackoooSquares", argTypes, term1811893, args);
    }

};


