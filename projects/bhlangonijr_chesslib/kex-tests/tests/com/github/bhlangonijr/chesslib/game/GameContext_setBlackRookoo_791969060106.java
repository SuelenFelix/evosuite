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

public class GameContext_setBlackRookoo_791969060106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531012;

    public GameContext_setBlackRookoo_791969060106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531012 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531012, term531012.getClass(), "whiteoo", null);
        setField(term531012, term531012.getClass(), "whiteooo", null);
        setField(term531012, term531012.getClass(), "blackoo", null);
        setField(term531012, term531012.getClass(), "blackooo", null);
        setField(term531012, term531012.getClass(), "whiteRookoo", null);
        setField(term531012, term531012.getClass(), "whiteRookooo", null);
        setField(term531012, term531012.getClass(), "blackRookoo", null);
        setField(term531012, term531012.getClass(), "blackRookooo", null);
        setField(term531012, term531012.getClass(), "whiteooSquares", null);
        setField(term531012, term531012.getClass(), "whiteoooSquares", null);
        setField(term531012, term531012.getClass(), "blackooSquares", null);
        setField(term531012, term531012.getClass(), "blackoooSquares", null);
        setLongField(term531012, term531012.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531012, term531012.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531012, term531012.getClass(), "startFEN", null);
        setField(term531012, term531012.getClass(), "whiteRookooFile", null);
        setField(term531012, term531012.getClass(), "whiteRookoooFile", null);
        setField(term531012, term531012.getClass(), "blackRookooFile", null);
        setField(term531012, term531012.getClass(), "blackRookoooFile", null);
        setField(term531012, term531012.getClass(), "gameMode", null);
        setField(term531012, term531012.getClass(), "variationType", null);
        setField(term531012, term531012.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBlackRookoo", argTypes, term531012, args);
    }

};


