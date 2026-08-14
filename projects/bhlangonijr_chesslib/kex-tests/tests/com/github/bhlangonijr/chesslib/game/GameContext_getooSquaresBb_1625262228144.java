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

public class GameContext_getooSquaresBb_1625262228144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531368;

    public GameContext_getooSquaresBb_1625262228144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531368 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531368, term531368.getClass(), "whiteoo", null);
        setField(term531368, term531368.getClass(), "whiteooo", null);
        setField(term531368, term531368.getClass(), "blackoo", null);
        setField(term531368, term531368.getClass(), "blackooo", null);
        setField(term531368, term531368.getClass(), "whiteRookoo", null);
        setField(term531368, term531368.getClass(), "whiteRookooo", null);
        setField(term531368, term531368.getClass(), "blackRookoo", null);
        setField(term531368, term531368.getClass(), "blackRookooo", null);
        setField(term531368, term531368.getClass(), "whiteooSquares", null);
        setField(term531368, term531368.getClass(), "whiteoooSquares", null);
        setField(term531368, term531368.getClass(), "blackooSquares", null);
        setField(term531368, term531368.getClass(), "blackoooSquares", null);
        setLongField(term531368, term531368.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531368, term531368.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531368, term531368.getClass(), "startFEN", null);
        setField(term531368, term531368.getClass(), "whiteRookooFile", null);
        setField(term531368, term531368.getClass(), "whiteRookoooFile", null);
        setField(term531368, term531368.getClass(), "blackRookooFile", null);
        setField(term531368, term531368.getClass(), "blackRookoooFile", null);
        setField(term531368, term531368.getClass(), "gameMode", null);
        setField(term531368, term531368.getClass(), "variationType", null);
        setField(term531368, term531368.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getooSquaresBb", argTypes, term531368, args);
    }

};


