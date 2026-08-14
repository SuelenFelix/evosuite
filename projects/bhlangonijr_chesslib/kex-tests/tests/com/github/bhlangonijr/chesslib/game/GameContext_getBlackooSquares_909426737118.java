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

public class GameContext_getBlackooSquares_909426737118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811875;

    public GameContext_getBlackooSquares_909426737118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811875 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811875, term1811875.getClass(), "whiteoo", null);
        setField(term1811875, term1811875.getClass(), "whiteooo", null);
        setField(term1811875, term1811875.getClass(), "blackoo", null);
        setField(term1811875, term1811875.getClass(), "blackooo", null);
        setField(term1811875, term1811875.getClass(), "whiteRookoo", null);
        setField(term1811875, term1811875.getClass(), "whiteRookooo", null);
        setField(term1811875, term1811875.getClass(), "blackRookoo", null);
        setField(term1811875, term1811875.getClass(), "blackRookooo", null);
        setField(term1811875, term1811875.getClass(), "whiteooSquares", null);
        setField(term1811875, term1811875.getClass(), "whiteoooSquares", null);
        setField(term1811875, term1811875.getClass(), "blackooSquares", null);
        setField(term1811875, term1811875.getClass(), "blackoooSquares", null);
        setLongField(term1811875, term1811875.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811875, term1811875.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811875, term1811875.getClass(), "startFEN", null);
        setField(term1811875, term1811875.getClass(), "whiteRookooFile", null);
        setField(term1811875, term1811875.getClass(), "whiteRookoooFile", null);
        setField(term1811875, term1811875.getClass(), "blackRookooFile", null);
        setField(term1811875, term1811875.getClass(), "blackRookoooFile", null);
        setField(term1811875, term1811875.getClass(), "gameMode", null);
        setField(term1811875, term1811875.getClass(), "variationType", null);
        setField(term1811875, term1811875.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackooSquares", argTypes, term1811875, args);
    }

};


