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

public class GameContext_getStartFEN_1335689524109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531039;

    public GameContext_getStartFEN_1335689524109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531039 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531039, term531039.getClass(), "whiteoo", null);
        setField(term531039, term531039.getClass(), "whiteooo", null);
        setField(term531039, term531039.getClass(), "blackoo", null);
        setField(term531039, term531039.getClass(), "blackooo", null);
        setField(term531039, term531039.getClass(), "whiteRookoo", null);
        setField(term531039, term531039.getClass(), "whiteRookooo", null);
        setField(term531039, term531039.getClass(), "blackRookoo", null);
        setField(term531039, term531039.getClass(), "blackRookooo", null);
        setField(term531039, term531039.getClass(), "whiteooSquares", null);
        setField(term531039, term531039.getClass(), "whiteoooSquares", null);
        setField(term531039, term531039.getClass(), "blackooSquares", null);
        setField(term531039, term531039.getClass(), "blackoooSquares", null);
        setLongField(term531039, term531039.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531039, term531039.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531039, term531039.getClass(), "startFEN", null);
        setField(term531039, term531039.getClass(), "whiteRookooFile", null);
        setField(term531039, term531039.getClass(), "whiteRookoooFile", null);
        setField(term531039, term531039.getClass(), "blackRookooFile", null);
        setField(term531039, term531039.getClass(), "blackRookoooFile", null);
        setField(term531039, term531039.getClass(), "gameMode", null);
        setField(term531039, term531039.getClass(), "variationType", null);
        setField(term531039, term531039.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartFEN", argTypes, term531039, args);
    }

};


