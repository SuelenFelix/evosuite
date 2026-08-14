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

public class GameContext_getBlackooAllSquaresBb_1416138178134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531274;

    public GameContext_getBlackooAllSquaresBb_1416138178134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531274 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531274, term531274.getClass(), "whiteoo", null);
        setField(term531274, term531274.getClass(), "whiteooo", null);
        setField(term531274, term531274.getClass(), "blackoo", null);
        setField(term531274, term531274.getClass(), "blackooo", null);
        setField(term531274, term531274.getClass(), "whiteRookoo", null);
        setField(term531274, term531274.getClass(), "whiteRookooo", null);
        setField(term531274, term531274.getClass(), "blackRookoo", null);
        setField(term531274, term531274.getClass(), "blackRookooo", null);
        setField(term531274, term531274.getClass(), "whiteooSquares", null);
        setField(term531274, term531274.getClass(), "whiteoooSquares", null);
        setField(term531274, term531274.getClass(), "blackooSquares", null);
        setField(term531274, term531274.getClass(), "blackoooSquares", null);
        setLongField(term531274, term531274.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531274, term531274.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531274, term531274.getClass(), "startFEN", null);
        setField(term531274, term531274.getClass(), "whiteRookooFile", null);
        setField(term531274, term531274.getClass(), "whiteRookoooFile", null);
        setField(term531274, term531274.getClass(), "blackRookooFile", null);
        setField(term531274, term531274.getClass(), "blackRookoooFile", null);
        setField(term531274, term531274.getClass(), "gameMode", null);
        setField(term531274, term531274.getClass(), "variationType", null);
        setField(term531274, term531274.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackooAllSquaresBb", argTypes, term531274, args);
    }

};


