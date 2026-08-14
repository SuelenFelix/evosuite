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

public class GameContext_setBlackoooSquaresBb_1928405118129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531223;
     Object term531232;

    public GameContext_setBlackoooSquaresBb_1928405118129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531223 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531223, term531223.getClass(), "whiteoo", null);
        setField(term531223, term531223.getClass(), "whiteooo", null);
        setField(term531223, term531223.getClass(), "blackoo", null);
        setField(term531223, term531223.getClass(), "blackooo", null);
        setField(term531223, term531223.getClass(), "whiteRookoo", null);
        setField(term531223, term531223.getClass(), "whiteRookooo", null);
        setField(term531223, term531223.getClass(), "blackRookoo", null);
        setField(term531223, term531223.getClass(), "blackRookooo", null);
        setField(term531223, term531223.getClass(), "whiteooSquares", null);
        setField(term531223, term531223.getClass(), "whiteoooSquares", null);
        setField(term531223, term531223.getClass(), "blackooSquares", null);
        setField(term531223, term531223.getClass(), "blackoooSquares", null);
        setLongField(term531223, term531223.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531223, term531223.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531223, term531223.getClass(), "startFEN", null);
        setField(term531223, term531223.getClass(), "whiteRookooFile", null);
        setField(term531223, term531223.getClass(), "whiteRookoooFile", null);
        setField(term531223, term531223.getClass(), "blackRookooFile", null);
        setField(term531223, term531223.getClass(), "blackRookoooFile", null);
        setField(term531223, term531223.getClass(), "gameMode", null);
        setField(term531223, term531223.getClass(), "variationType", null);
        setField(term531223, term531223.getClass(), "event", null);
        term531232 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term531232;
        callMethod(klass, "setBlackoooSquaresBb", argTypes, term531223, args);
    }

};


