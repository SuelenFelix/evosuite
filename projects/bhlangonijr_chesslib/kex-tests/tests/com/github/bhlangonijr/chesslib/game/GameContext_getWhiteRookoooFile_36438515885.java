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

public class GameContext_getWhiteRookoooFile_36438515885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530823;

    public GameContext_getWhiteRookoooFile_36438515885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530823 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530823, term530823.getClass(), "whiteoo", null);
        setField(term530823, term530823.getClass(), "whiteooo", null);
        setField(term530823, term530823.getClass(), "blackoo", null);
        setField(term530823, term530823.getClass(), "blackooo", null);
        setField(term530823, term530823.getClass(), "whiteRookoo", null);
        setField(term530823, term530823.getClass(), "whiteRookooo", null);
        setField(term530823, term530823.getClass(), "blackRookoo", null);
        setField(term530823, term530823.getClass(), "blackRookooo", null);
        setField(term530823, term530823.getClass(), "whiteooSquares", null);
        setField(term530823, term530823.getClass(), "whiteoooSquares", null);
        setField(term530823, term530823.getClass(), "blackooSquares", null);
        setField(term530823, term530823.getClass(), "blackoooSquares", null);
        setLongField(term530823, term530823.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530823, term530823.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530823, term530823.getClass(), "startFEN", null);
        setField(term530823, term530823.getClass(), "whiteRookooFile", null);
        setField(term530823, term530823.getClass(), "whiteRookoooFile", null);
        setField(term530823, term530823.getClass(), "blackRookooFile", null);
        setField(term530823, term530823.getClass(), "blackRookoooFile", null);
        setField(term530823, term530823.getClass(), "gameMode", null);
        setField(term530823, term530823.getClass(), "variationType", null);
        setField(term530823, term530823.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteRookoooFile", argTypes, term530823, args);
    }

};


