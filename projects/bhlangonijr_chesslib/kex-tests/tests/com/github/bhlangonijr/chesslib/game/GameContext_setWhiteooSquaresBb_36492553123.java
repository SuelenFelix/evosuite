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

public class GameContext_setWhiteooSquaresBb_36492553123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811920;
     Object term1811929;

    public GameContext_setWhiteooSquaresBb_36492553123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811920 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811920, term1811920.getClass(), "whiteoo", null);
        setField(term1811920, term1811920.getClass(), "whiteooo", null);
        setField(term1811920, term1811920.getClass(), "blackoo", null);
        setField(term1811920, term1811920.getClass(), "blackooo", null);
        setField(term1811920, term1811920.getClass(), "whiteRookoo", null);
        setField(term1811920, term1811920.getClass(), "whiteRookooo", null);
        setField(term1811920, term1811920.getClass(), "blackRookoo", null);
        setField(term1811920, term1811920.getClass(), "blackRookooo", null);
        setField(term1811920, term1811920.getClass(), "whiteooSquares", null);
        setField(term1811920, term1811920.getClass(), "whiteoooSquares", null);
        setField(term1811920, term1811920.getClass(), "blackooSquares", null);
        setField(term1811920, term1811920.getClass(), "blackoooSquares", null);
        setLongField(term1811920, term1811920.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811920, term1811920.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811920, term1811920.getClass(), "startFEN", null);
        setField(term1811920, term1811920.getClass(), "whiteRookooFile", null);
        setField(term1811920, term1811920.getClass(), "whiteRookoooFile", null);
        setField(term1811920, term1811920.getClass(), "blackRookooFile", null);
        setField(term1811920, term1811920.getClass(), "blackRookoooFile", null);
        setField(term1811920, term1811920.getClass(), "gameMode", null);
        setField(term1811920, term1811920.getClass(), "variationType", null);
        setField(term1811920, term1811920.getClass(), "event", null);
        term1811929 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1811929;
        callMethod(klass, "setWhiteooSquaresBb", argTypes, term1811920, args);
    }

};


