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

public class GameContext_getBlackRookoo_471610650105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531003;

    public GameContext_getBlackRookoo_471610650105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531003 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531003, term531003.getClass(), "whiteoo", null);
        setField(term531003, term531003.getClass(), "whiteooo", null);
        setField(term531003, term531003.getClass(), "blackoo", null);
        setField(term531003, term531003.getClass(), "blackooo", null);
        setField(term531003, term531003.getClass(), "whiteRookoo", null);
        setField(term531003, term531003.getClass(), "whiteRookooo", null);
        setField(term531003, term531003.getClass(), "blackRookoo", null);
        setField(term531003, term531003.getClass(), "blackRookooo", null);
        setField(term531003, term531003.getClass(), "whiteooSquares", null);
        setField(term531003, term531003.getClass(), "whiteoooSquares", null);
        setField(term531003, term531003.getClass(), "blackooSquares", null);
        setField(term531003, term531003.getClass(), "blackoooSquares", null);
        setLongField(term531003, term531003.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531003, term531003.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531003, term531003.getClass(), "startFEN", null);
        setField(term531003, term531003.getClass(), "whiteRookooFile", null);
        setField(term531003, term531003.getClass(), "whiteRookoooFile", null);
        setField(term531003, term531003.getClass(), "blackRookooFile", null);
        setField(term531003, term531003.getClass(), "blackRookoooFile", null);
        setField(term531003, term531003.getClass(), "gameMode", null);
        setField(term531003, term531003.getClass(), "variationType", null);
        setField(term531003, term531003.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackRookoo", argTypes, term531003, args);
    }

};


