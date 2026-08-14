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

public class GameContext_getWhiteoooAllSquaresBb_556421675132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531254;

    public GameContext_getWhiteoooAllSquaresBb_556421675132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531254 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531254, term531254.getClass(), "whiteoo", null);
        setField(term531254, term531254.getClass(), "whiteooo", null);
        setField(term531254, term531254.getClass(), "blackoo", null);
        setField(term531254, term531254.getClass(), "blackooo", null);
        setField(term531254, term531254.getClass(), "whiteRookoo", null);
        setField(term531254, term531254.getClass(), "whiteRookooo", null);
        setField(term531254, term531254.getClass(), "blackRookoo", null);
        setField(term531254, term531254.getClass(), "blackRookooo", null);
        setField(term531254, term531254.getClass(), "whiteooSquares", null);
        setField(term531254, term531254.getClass(), "whiteoooSquares", null);
        setField(term531254, term531254.getClass(), "blackooSquares", null);
        setField(term531254, term531254.getClass(), "blackoooSquares", null);
        setLongField(term531254, term531254.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531254, term531254.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531254, term531254.getClass(), "startFEN", null);
        setField(term531254, term531254.getClass(), "whiteRookooFile", null);
        setField(term531254, term531254.getClass(), "whiteRookoooFile", null);
        setField(term531254, term531254.getClass(), "blackRookooFile", null);
        setField(term531254, term531254.getClass(), "blackRookoooFile", null);
        setField(term531254, term531254.getClass(), "gameMode", null);
        setField(term531254, term531254.getClass(), "variationType", null);
        setField(term531254, term531254.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteoooAllSquaresBb", argTypes, term531254, args);
    }

};


