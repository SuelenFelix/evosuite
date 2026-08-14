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

public class GameContext_getooAllSquaresBb_397962465146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531386;

    public GameContext_getooAllSquaresBb_397962465146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531386 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531386, term531386.getClass(), "whiteoo", null);
        setField(term531386, term531386.getClass(), "whiteooo", null);
        setField(term531386, term531386.getClass(), "blackoo", null);
        setField(term531386, term531386.getClass(), "blackooo", null);
        setField(term531386, term531386.getClass(), "whiteRookoo", null);
        setField(term531386, term531386.getClass(), "whiteRookooo", null);
        setField(term531386, term531386.getClass(), "blackRookoo", null);
        setField(term531386, term531386.getClass(), "blackRookooo", null);
        setField(term531386, term531386.getClass(), "whiteooSquares", null);
        setField(term531386, term531386.getClass(), "whiteoooSquares", null);
        setField(term531386, term531386.getClass(), "blackooSquares", null);
        setField(term531386, term531386.getClass(), "blackoooSquares", null);
        setLongField(term531386, term531386.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531386, term531386.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531386, term531386.getClass(), "startFEN", null);
        setField(term531386, term531386.getClass(), "whiteRookooFile", null);
        setField(term531386, term531386.getClass(), "whiteRookoooFile", null);
        setField(term531386, term531386.getClass(), "blackRookooFile", null);
        setField(term531386, term531386.getClass(), "blackRookoooFile", null);
        setField(term531386, term531386.getClass(), "gameMode", null);
        setField(term531386, term531386.getClass(), "variationType", null);
        setField(term531386, term531386.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getooAllSquaresBb", argTypes, term531386, args);
    }

};


