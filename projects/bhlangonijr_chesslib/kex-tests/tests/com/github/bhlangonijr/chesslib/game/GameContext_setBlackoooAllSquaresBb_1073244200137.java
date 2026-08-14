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

public class GameContext_setBlackoooAllSquaresBb_1073244200137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531303;
     Object term531312;

    public GameContext_setBlackoooAllSquaresBb_1073244200137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531303 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531303, term531303.getClass(), "whiteoo", null);
        setField(term531303, term531303.getClass(), "whiteooo", null);
        setField(term531303, term531303.getClass(), "blackoo", null);
        setField(term531303, term531303.getClass(), "blackooo", null);
        setField(term531303, term531303.getClass(), "whiteRookoo", null);
        setField(term531303, term531303.getClass(), "whiteRookooo", null);
        setField(term531303, term531303.getClass(), "blackRookoo", null);
        setField(term531303, term531303.getClass(), "blackRookooo", null);
        setField(term531303, term531303.getClass(), "whiteooSquares", null);
        setField(term531303, term531303.getClass(), "whiteoooSquares", null);
        setField(term531303, term531303.getClass(), "blackooSquares", null);
        setField(term531303, term531303.getClass(), "blackoooSquares", null);
        setLongField(term531303, term531303.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531303, term531303.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531303, term531303.getClass(), "startFEN", null);
        setField(term531303, term531303.getClass(), "whiteRookooFile", null);
        setField(term531303, term531303.getClass(), "whiteRookoooFile", null);
        setField(term531303, term531303.getClass(), "blackRookooFile", null);
        setField(term531303, term531303.getClass(), "blackRookoooFile", null);
        setField(term531303, term531303.getClass(), "gameMode", null);
        setField(term531303, term531303.getClass(), "variationType", null);
        setField(term531303, term531303.getClass(), "event", null);
        term531312 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term531312;
        callMethod(klass, "setBlackoooAllSquaresBb", argTypes, term531303, args);
    }

};


