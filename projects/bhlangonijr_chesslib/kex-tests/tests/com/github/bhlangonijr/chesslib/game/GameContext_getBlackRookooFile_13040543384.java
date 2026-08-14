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

public class GameContext_getBlackRookooFile_13040543384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811569;

    public GameContext_getBlackRookooFile_13040543384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811569 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811569, term1811569.getClass(), "whiteoo", null);
        setField(term1811569, term1811569.getClass(), "whiteooo", null);
        setField(term1811569, term1811569.getClass(), "blackoo", null);
        setField(term1811569, term1811569.getClass(), "blackooo", null);
        setField(term1811569, term1811569.getClass(), "whiteRookoo", null);
        setField(term1811569, term1811569.getClass(), "whiteRookooo", null);
        setField(term1811569, term1811569.getClass(), "blackRookoo", null);
        setField(term1811569, term1811569.getClass(), "blackRookooo", null);
        setField(term1811569, term1811569.getClass(), "whiteooSquares", null);
        setField(term1811569, term1811569.getClass(), "whiteoooSquares", null);
        setField(term1811569, term1811569.getClass(), "blackooSquares", null);
        setField(term1811569, term1811569.getClass(), "blackoooSquares", null);
        setLongField(term1811569, term1811569.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811569, term1811569.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811569, term1811569.getClass(), "startFEN", null);
        setField(term1811569, term1811569.getClass(), "whiteRookooFile", null);
        setField(term1811569, term1811569.getClass(), "whiteRookoooFile", null);
        setField(term1811569, term1811569.getClass(), "blackRookooFile", null);
        setField(term1811569, term1811569.getClass(), "blackRookoooFile", null);
        setField(term1811569, term1811569.getClass(), "gameMode", null);
        setField(term1811569, term1811569.getClass(), "variationType", null);
        setField(term1811569, term1811569.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackRookooFile", argTypes, term1811569, args);
    }

};


