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

public class GameContext_getWhiteooSquares_1697864347115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531093;

    public GameContext_getWhiteooSquares_1697864347115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531093 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531093, term531093.getClass(), "whiteoo", null);
        setField(term531093, term531093.getClass(), "whiteooo", null);
        setField(term531093, term531093.getClass(), "blackoo", null);
        setField(term531093, term531093.getClass(), "blackooo", null);
        setField(term531093, term531093.getClass(), "whiteRookoo", null);
        setField(term531093, term531093.getClass(), "whiteRookooo", null);
        setField(term531093, term531093.getClass(), "blackRookoo", null);
        setField(term531093, term531093.getClass(), "blackRookooo", null);
        setField(term531093, term531093.getClass(), "whiteooSquares", null);
        setField(term531093, term531093.getClass(), "whiteoooSquares", null);
        setField(term531093, term531093.getClass(), "blackooSquares", null);
        setField(term531093, term531093.getClass(), "blackoooSquares", null);
        setLongField(term531093, term531093.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531093, term531093.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531093, term531093.getClass(), "startFEN", null);
        setField(term531093, term531093.getClass(), "whiteRookooFile", null);
        setField(term531093, term531093.getClass(), "whiteRookoooFile", null);
        setField(term531093, term531093.getClass(), "blackRookooFile", null);
        setField(term531093, term531093.getClass(), "blackRookoooFile", null);
        setField(term531093, term531093.getClass(), "gameMode", null);
        setField(term531093, term531093.getClass(), "variationType", null);
        setField(term531093, term531093.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteooSquares", argTypes, term531093, args);
    }

};


