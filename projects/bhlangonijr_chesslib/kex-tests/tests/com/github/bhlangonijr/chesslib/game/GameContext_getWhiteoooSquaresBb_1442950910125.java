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

public class GameContext_getWhiteoooSquaresBb_1442950910125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531185;

    public GameContext_getWhiteoooSquaresBb_1442950910125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531185 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531185, term531185.getClass(), "whiteoo", null);
        setField(term531185, term531185.getClass(), "whiteooo", null);
        setField(term531185, term531185.getClass(), "blackoo", null);
        setField(term531185, term531185.getClass(), "blackooo", null);
        setField(term531185, term531185.getClass(), "whiteRookoo", null);
        setField(term531185, term531185.getClass(), "whiteRookooo", null);
        setField(term531185, term531185.getClass(), "blackRookoo", null);
        setField(term531185, term531185.getClass(), "blackRookooo", null);
        setField(term531185, term531185.getClass(), "whiteooSquares", null);
        setField(term531185, term531185.getClass(), "whiteoooSquares", null);
        setField(term531185, term531185.getClass(), "blackooSquares", null);
        setField(term531185, term531185.getClass(), "blackoooSquares", null);
        setLongField(term531185, term531185.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531185, term531185.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531185, term531185.getClass(), "startFEN", null);
        setField(term531185, term531185.getClass(), "whiteRookooFile", null);
        setField(term531185, term531185.getClass(), "whiteRookoooFile", null);
        setField(term531185, term531185.getClass(), "blackRookooFile", null);
        setField(term531185, term531185.getClass(), "blackRookoooFile", null);
        setField(term531185, term531185.getClass(), "gameMode", null);
        setField(term531185, term531185.getClass(), "variationType", null);
        setField(term531185, term531185.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWhiteoooSquaresBb", argTypes, term531185, args);
    }

};


