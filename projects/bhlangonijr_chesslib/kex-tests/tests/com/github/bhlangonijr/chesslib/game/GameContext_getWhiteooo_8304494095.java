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

public class GameContext_getWhiteooo_8304494095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530913;

    public GameContext_getWhiteooo_8304494095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530913 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530913, term530913.getClass(), "whiteoo", null);
        setField(term530913, term530913.getClass(), "whiteooo", null);
        setField(term530913, term530913.getClass(), "blackoo", null);
        setField(term530913, term530913.getClass(), "blackooo", null);
        setField(term530913, term530913.getClass(), "whiteRookoo", null);
        setField(term530913, term530913.getClass(), "whiteRookooo", null);
        setField(term530913, term530913.getClass(), "blackRookoo", null);
        setField(term530913, term530913.getClass(), "blackRookooo", null);
        setField(term530913, term530913.getClass(), "whiteooSquares", null);
        setField(term530913, term530913.getClass(), "whiteoooSquares", null);
        setField(term530913, term530913.getClass(), "blackooSquares", null);
        setField(term530913, term530913.getClass(), "blackoooSquares", null);
        setLongField(term530913, term530913.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530913, term530913.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530913, term530913.getClass(), "startFEN", null);
        setField(term530913, term530913.getClass(), "whiteRookooFile", null);
        setField(term530913, term530913.getClass(), "whiteRookoooFile", null);
        setField(term530913, term530913.getClass(), "blackRookooFile", null);
        setField(term530913, term530913.getClass(), "blackRookoooFile", null);
        setField(term530913, term530913.getClass(), "gameMode", null);
        setField(term530913, term530913.getClass(), "variationType", null);
        setField(term530913, term530913.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteooo", argTypes, term530913, args);
    }

};


