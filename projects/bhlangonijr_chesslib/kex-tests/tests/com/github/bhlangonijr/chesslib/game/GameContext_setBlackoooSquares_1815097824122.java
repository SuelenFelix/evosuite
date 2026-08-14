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

public class GameContext_setBlackoooSquares_1815097824122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531156;

    public GameContext_setBlackoooSquares_1815097824122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531156 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531156, term531156.getClass(), "whiteoo", null);
        setField(term531156, term531156.getClass(), "whiteooo", null);
        setField(term531156, term531156.getClass(), "blackoo", null);
        setField(term531156, term531156.getClass(), "blackooo", null);
        setField(term531156, term531156.getClass(), "whiteRookoo", null);
        setField(term531156, term531156.getClass(), "whiteRookooo", null);
        setField(term531156, term531156.getClass(), "blackRookoo", null);
        setField(term531156, term531156.getClass(), "blackRookooo", null);
        setField(term531156, term531156.getClass(), "whiteooSquares", null);
        setField(term531156, term531156.getClass(), "whiteoooSquares", null);
        setField(term531156, term531156.getClass(), "blackooSquares", null);
        setField(term531156, term531156.getClass(), "blackoooSquares", null);
        setLongField(term531156, term531156.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531156, term531156.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531156, term531156.getClass(), "startFEN", null);
        setField(term531156, term531156.getClass(), "whiteRookooFile", null);
        setField(term531156, term531156.getClass(), "whiteRookoooFile", null);
        setField(term531156, term531156.getClass(), "blackRookooFile", null);
        setField(term531156, term531156.getClass(), "blackRookoooFile", null);
        setField(term531156, term531156.getClass(), "gameMode", null);
        setField(term531156, term531156.getClass(), "variationType", null);
        setField(term531156, term531156.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBlackoooSquares", argTypes, term531156, args);
    }

};


