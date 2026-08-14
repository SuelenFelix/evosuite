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

public class GameContext_computeAllEmptySquaresBb_105644155983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530805;

    public GameContext_computeAllEmptySquaresBb_105644155983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530805 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530805, term530805.getClass(), "whiteoo", null);
        setField(term530805, term530805.getClass(), "whiteooo", null);
        setField(term530805, term530805.getClass(), "blackoo", null);
        setField(term530805, term530805.getClass(), "blackooo", null);
        setField(term530805, term530805.getClass(), "whiteRookoo", null);
        setField(term530805, term530805.getClass(), "whiteRookooo", null);
        setField(term530805, term530805.getClass(), "blackRookoo", null);
        setField(term530805, term530805.getClass(), "blackRookooo", null);
        setField(term530805, term530805.getClass(), "whiteooSquares", null);
        setField(term530805, term530805.getClass(), "whiteoooSquares", null);
        setField(term530805, term530805.getClass(), "blackooSquares", null);
        setField(term530805, term530805.getClass(), "blackoooSquares", null);
        setLongField(term530805, term530805.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530805, term530805.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530805, term530805.getClass(), "startFEN", null);
        setField(term530805, term530805.getClass(), "whiteRookooFile", null);
        setField(term530805, term530805.getClass(), "whiteRookoooFile", null);
        setField(term530805, term530805.getClass(), "blackRookooFile", null);
        setField(term530805, term530805.getClass(), "blackRookoooFile", null);
        setField(term530805, term530805.getClass(), "gameMode", null);
        setField(term530805, term530805.getClass(), "variationType", null);
        setField(term530805, term530805.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[2] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        argTypes[3] = Class.forName("com.github.bhlangonijr.chesslib.Square");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "computeAllEmptySquaresBb", argTypes, term530805, args);
    }

};


