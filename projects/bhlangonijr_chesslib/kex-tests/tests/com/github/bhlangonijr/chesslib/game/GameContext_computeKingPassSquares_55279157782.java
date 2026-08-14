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

public class GameContext_computeKingPassSquares_55279157782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530796;

    public GameContext_computeKingPassSquares_55279157782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530796 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530796, term530796.getClass(), "whiteoo", null);
        setField(term530796, term530796.getClass(), "whiteooo", null);
        setField(term530796, term530796.getClass(), "blackoo", null);
        setField(term530796, term530796.getClass(), "blackooo", null);
        setField(term530796, term530796.getClass(), "whiteRookoo", null);
        setField(term530796, term530796.getClass(), "whiteRookooo", null);
        setField(term530796, term530796.getClass(), "blackRookoo", null);
        setField(term530796, term530796.getClass(), "blackRookooo", null);
        setField(term530796, term530796.getClass(), "whiteooSquares", null);
        setField(term530796, term530796.getClass(), "whiteoooSquares", null);
        setField(term530796, term530796.getClass(), "blackooSquares", null);
        setField(term530796, term530796.getClass(), "blackoooSquares", null);
        setLongField(term530796, term530796.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530796, term530796.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530796, term530796.getClass(), "startFEN", null);
        setField(term530796, term530796.getClass(), "whiteRookooFile", null);
        setField(term530796, term530796.getClass(), "whiteRookoooFile", null);
        setField(term530796, term530796.getClass(), "blackRookooFile", null);
        setField(term530796, term530796.getClass(), "blackRookoooFile", null);
        setField(term530796, term530796.getClass(), "gameMode", null);
        setField(term530796, term530796.getClass(), "variationType", null);
        setField(term530796, term530796.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "computeKingPassSquares", argTypes, term530796, args);
    }

};


