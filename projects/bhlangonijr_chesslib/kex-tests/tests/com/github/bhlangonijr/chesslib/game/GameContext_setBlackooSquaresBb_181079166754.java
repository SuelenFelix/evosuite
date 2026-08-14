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

public class GameContext_setBlackooSquaresBb_181079166754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403761;
     Object term403770;

    public GameContext_setBlackooSquaresBb_181079166754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403761 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term403761, term403761.getClass(), "whiteoo", null);
        setField(term403761, term403761.getClass(), "whiteooo", null);
        setField(term403761, term403761.getClass(), "blackoo", null);
        setField(term403761, term403761.getClass(), "blackooo", null);
        setField(term403761, term403761.getClass(), "whiteRookoo", null);
        setField(term403761, term403761.getClass(), "whiteRookooo", null);
        setField(term403761, term403761.getClass(), "blackRookoo", null);
        setField(term403761, term403761.getClass(), "blackRookooo", null);
        setField(term403761, term403761.getClass(), "whiteooSquares", null);
        setField(term403761, term403761.getClass(), "whiteoooSquares", null);
        setField(term403761, term403761.getClass(), "blackooSquares", null);
        setField(term403761, term403761.getClass(), "blackoooSquares", null);
        setLongField(term403761, term403761.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "blackooSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term403761, term403761.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term403761, term403761.getClass(), "startFEN", null);
        setField(term403761, term403761.getClass(), "whiteRookooFile", null);
        setField(term403761, term403761.getClass(), "whiteRookoooFile", null);
        setField(term403761, term403761.getClass(), "blackRookooFile", null);
        setField(term403761, term403761.getClass(), "blackRookoooFile", null);
        setField(term403761, term403761.getClass(), "gameMode", null);
        setField(term403761, term403761.getClass(), "variationType", null);
        setField(term403761, term403761.getClass(), "event", null);
        term403770 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term403770;
        callMethod(klass, "setBlackooSquaresBb", argTypes, term403761, args);
    }

};


