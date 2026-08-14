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

public class GameContext_setWhiteoooSquares_486859958118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531120;

    public GameContext_setWhiteoooSquares_486859958118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531120 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531120, term531120.getClass(), "whiteoo", null);
        setField(term531120, term531120.getClass(), "whiteooo", null);
        setField(term531120, term531120.getClass(), "blackoo", null);
        setField(term531120, term531120.getClass(), "blackooo", null);
        setField(term531120, term531120.getClass(), "whiteRookoo", null);
        setField(term531120, term531120.getClass(), "whiteRookooo", null);
        setField(term531120, term531120.getClass(), "blackRookoo", null);
        setField(term531120, term531120.getClass(), "blackRookooo", null);
        setField(term531120, term531120.getClass(), "whiteooSquares", null);
        setField(term531120, term531120.getClass(), "whiteoooSquares", null);
        setField(term531120, term531120.getClass(), "blackooSquares", null);
        setField(term531120, term531120.getClass(), "blackoooSquares", null);
        setLongField(term531120, term531120.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531120, term531120.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531120, term531120.getClass(), "startFEN", null);
        setField(term531120, term531120.getClass(), "whiteRookooFile", null);
        setField(term531120, term531120.getClass(), "whiteRookoooFile", null);
        setField(term531120, term531120.getClass(), "blackRookooFile", null);
        setField(term531120, term531120.getClass(), "blackRookoooFile", null);
        setField(term531120, term531120.getClass(), "gameMode", null);
        setField(term531120, term531120.getClass(), "variationType", null);
        setField(term531120, term531120.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhiteoooSquares", argTypes, term531120, args);
    }

};


