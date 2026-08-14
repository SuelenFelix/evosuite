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

public class GameContext_getVariationType_1165528326112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811821;

    public GameContext_getVariationType_1165528326112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811821 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811821, term1811821.getClass(), "whiteoo", null);
        setField(term1811821, term1811821.getClass(), "whiteooo", null);
        setField(term1811821, term1811821.getClass(), "blackoo", null);
        setField(term1811821, term1811821.getClass(), "blackooo", null);
        setField(term1811821, term1811821.getClass(), "whiteRookoo", null);
        setField(term1811821, term1811821.getClass(), "whiteRookooo", null);
        setField(term1811821, term1811821.getClass(), "blackRookoo", null);
        setField(term1811821, term1811821.getClass(), "blackRookooo", null);
        setField(term1811821, term1811821.getClass(), "whiteooSquares", null);
        setField(term1811821, term1811821.getClass(), "whiteoooSquares", null);
        setField(term1811821, term1811821.getClass(), "blackooSquares", null);
        setField(term1811821, term1811821.getClass(), "blackoooSquares", null);
        setLongField(term1811821, term1811821.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811821, term1811821.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811821, term1811821.getClass(), "startFEN", null);
        setField(term1811821, term1811821.getClass(), "whiteRookooFile", null);
        setField(term1811821, term1811821.getClass(), "whiteRookoooFile", null);
        setField(term1811821, term1811821.getClass(), "blackRookooFile", null);
        setField(term1811821, term1811821.getClass(), "blackRookoooFile", null);
        setField(term1811821, term1811821.getClass(), "gameMode", null);
        setField(term1811821, term1811821.getClass(), "variationType", null);
        setField(term1811821, term1811821.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVariationType", argTypes, term1811821, args);
    }

};


