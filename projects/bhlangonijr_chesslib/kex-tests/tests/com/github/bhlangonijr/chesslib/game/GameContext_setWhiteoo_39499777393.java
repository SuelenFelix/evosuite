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

public class GameContext_setWhiteoo_39499777393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811650;

    public GameContext_setWhiteoo_39499777393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811650 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811650, term1811650.getClass(), "whiteoo", null);
        setField(term1811650, term1811650.getClass(), "whiteooo", null);
        setField(term1811650, term1811650.getClass(), "blackoo", null);
        setField(term1811650, term1811650.getClass(), "blackooo", null);
        setField(term1811650, term1811650.getClass(), "whiteRookoo", null);
        setField(term1811650, term1811650.getClass(), "whiteRookooo", null);
        setField(term1811650, term1811650.getClass(), "blackRookoo", null);
        setField(term1811650, term1811650.getClass(), "blackRookooo", null);
        setField(term1811650, term1811650.getClass(), "whiteooSquares", null);
        setField(term1811650, term1811650.getClass(), "whiteoooSquares", null);
        setField(term1811650, term1811650.getClass(), "blackooSquares", null);
        setField(term1811650, term1811650.getClass(), "blackoooSquares", null);
        setLongField(term1811650, term1811650.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811650, term1811650.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811650, term1811650.getClass(), "startFEN", null);
        setField(term1811650, term1811650.getClass(), "whiteRookooFile", null);
        setField(term1811650, term1811650.getClass(), "whiteRookoooFile", null);
        setField(term1811650, term1811650.getClass(), "blackRookooFile", null);
        setField(term1811650, term1811650.getClass(), "blackRookoooFile", null);
        setField(term1811650, term1811650.getClass(), "gameMode", null);
        setField(term1811650, term1811650.getClass(), "variationType", null);
        setField(term1811650, term1811650.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhiteoo", argTypes, term1811650, args);
    }

};


