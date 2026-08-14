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

public class GameContext_setWhiteoooSquaresBb_1535259864126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531194;
     Object term531203;

    public GameContext_setWhiteoooSquaresBb_1535259864126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531194 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531194, term531194.getClass(), "whiteoo", null);
        setField(term531194, term531194.getClass(), "whiteooo", null);
        setField(term531194, term531194.getClass(), "blackoo", null);
        setField(term531194, term531194.getClass(), "blackooo", null);
        setField(term531194, term531194.getClass(), "whiteRookoo", null);
        setField(term531194, term531194.getClass(), "whiteRookooo", null);
        setField(term531194, term531194.getClass(), "blackRookoo", null);
        setField(term531194, term531194.getClass(), "blackRookooo", null);
        setField(term531194, term531194.getClass(), "whiteooSquares", null);
        setField(term531194, term531194.getClass(), "whiteoooSquares", null);
        setField(term531194, term531194.getClass(), "blackooSquares", null);
        setField(term531194, term531194.getClass(), "blackoooSquares", null);
        setLongField(term531194, term531194.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531194, term531194.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531194, term531194.getClass(), "startFEN", null);
        setField(term531194, term531194.getClass(), "whiteRookooFile", null);
        setField(term531194, term531194.getClass(), "whiteRookoooFile", null);
        setField(term531194, term531194.getClass(), "blackRookooFile", null);
        setField(term531194, term531194.getClass(), "blackRookoooFile", null);
        setField(term531194, term531194.getClass(), "gameMode", null);
        setField(term531194, term531194.getClass(), "variationType", null);
        setField(term531194, term531194.getClass(), "event", null);
        term531203 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term531203;
        callMethod(klass, "setWhiteoooSquaresBb", argTypes, term531194, args);
    }

};


