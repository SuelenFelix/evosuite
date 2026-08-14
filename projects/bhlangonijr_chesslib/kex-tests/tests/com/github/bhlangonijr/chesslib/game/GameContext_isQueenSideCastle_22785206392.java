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

public class GameContext_isQueenSideCastle_22785206392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530886;

    public GameContext_isQueenSideCastle_22785206392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530886 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530886, term530886.getClass(), "whiteoo", null);
        setField(term530886, term530886.getClass(), "whiteooo", null);
        setField(term530886, term530886.getClass(), "blackoo", null);
        setField(term530886, term530886.getClass(), "blackooo", null);
        setField(term530886, term530886.getClass(), "whiteRookoo", null);
        setField(term530886, term530886.getClass(), "whiteRookooo", null);
        setField(term530886, term530886.getClass(), "blackRookoo", null);
        setField(term530886, term530886.getClass(), "blackRookooo", null);
        setField(term530886, term530886.getClass(), "whiteooSquares", null);
        setField(term530886, term530886.getClass(), "whiteoooSquares", null);
        setField(term530886, term530886.getClass(), "blackooSquares", null);
        setField(term530886, term530886.getClass(), "blackoooSquares", null);
        setLongField(term530886, term530886.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530886, term530886.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530886, term530886.getClass(), "startFEN", null);
        setField(term530886, term530886.getClass(), "whiteRookooFile", null);
        setField(term530886, term530886.getClass(), "whiteRookoooFile", null);
        setField(term530886, term530886.getClass(), "blackRookooFile", null);
        setField(term530886, term530886.getClass(), "blackRookoooFile", null);
        setField(term530886, term530886.getClass(), "gameMode", null);
        setField(term530886, term530886.getClass(), "variationType", null);
        setField(term530886, term530886.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isQueenSideCastle", argTypes, term530886, args);
    }

};


