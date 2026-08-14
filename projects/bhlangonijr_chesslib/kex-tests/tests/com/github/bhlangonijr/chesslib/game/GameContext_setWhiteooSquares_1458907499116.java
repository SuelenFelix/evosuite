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

public class GameContext_setWhiteooSquares_1458907499116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531102;

    public GameContext_setWhiteooSquares_1458907499116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531102 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531102, term531102.getClass(), "whiteoo", null);
        setField(term531102, term531102.getClass(), "whiteooo", null);
        setField(term531102, term531102.getClass(), "blackoo", null);
        setField(term531102, term531102.getClass(), "blackooo", null);
        setField(term531102, term531102.getClass(), "whiteRookoo", null);
        setField(term531102, term531102.getClass(), "whiteRookooo", null);
        setField(term531102, term531102.getClass(), "blackRookoo", null);
        setField(term531102, term531102.getClass(), "blackRookooo", null);
        setField(term531102, term531102.getClass(), "whiteooSquares", null);
        setField(term531102, term531102.getClass(), "whiteoooSquares", null);
        setField(term531102, term531102.getClass(), "blackooSquares", null);
        setField(term531102, term531102.getClass(), "blackoooSquares", null);
        setLongField(term531102, term531102.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531102, term531102.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531102, term531102.getClass(), "startFEN", null);
        setField(term531102, term531102.getClass(), "whiteRookooFile", null);
        setField(term531102, term531102.getClass(), "whiteRookoooFile", null);
        setField(term531102, term531102.getClass(), "blackRookooFile", null);
        setField(term531102, term531102.getClass(), "blackRookoooFile", null);
        setField(term531102, term531102.getClass(), "gameMode", null);
        setField(term531102, term531102.getClass(), "variationType", null);
        setField(term531102, term531102.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhiteooSquares", argTypes, term531102, args);
    }

};


