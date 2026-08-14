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
import java.lang.Long;

public class GameContext_setWhiteooAllSquaresBb_1961845693131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531243;
     Object term531252;

    public GameContext_setWhiteooAllSquaresBb_1961845693131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531243 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531243, term531243.getClass(), "whiteoo", null);
        setField(term531243, term531243.getClass(), "whiteooo", null);
        setField(term531243, term531243.getClass(), "blackoo", null);
        setField(term531243, term531243.getClass(), "blackooo", null);
        setField(term531243, term531243.getClass(), "whiteRookoo", null);
        setField(term531243, term531243.getClass(), "whiteRookooo", null);
        setField(term531243, term531243.getClass(), "blackRookoo", null);
        setField(term531243, term531243.getClass(), "blackRookooo", null);
        setField(term531243, term531243.getClass(), "whiteooSquares", null);
        setField(term531243, term531243.getClass(), "whiteoooSquares", null);
        setField(term531243, term531243.getClass(), "blackooSquares", null);
        setField(term531243, term531243.getClass(), "blackoooSquares", null);
        setLongField(term531243, term531243.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531243, term531243.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531243, term531243.getClass(), "startFEN", null);
        setField(term531243, term531243.getClass(), "whiteRookooFile", null);
        setField(term531243, term531243.getClass(), "whiteRookoooFile", null);
        setField(term531243, term531243.getClass(), "blackRookooFile", null);
        setField(term531243, term531243.getClass(), "blackRookoooFile", null);
        setField(term531243, term531243.getClass(), "gameMode", null);
        setField(term531243, term531243.getClass(), "variationType", null);
        setField(term531243, term531243.getClass(), "event", null);
        term531252 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term531252;
        callMethod(klass, "setWhiteooAllSquaresBb", argTypes, term531243, args);
    }

};


