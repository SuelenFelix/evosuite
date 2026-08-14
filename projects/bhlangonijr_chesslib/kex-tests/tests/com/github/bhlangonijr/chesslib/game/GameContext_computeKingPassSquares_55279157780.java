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

public class GameContext_computeKingPassSquares_55279157780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811533;

    public GameContext_computeKingPassSquares_55279157780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811533 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811533, term1811533.getClass(), "whiteoo", null);
        setField(term1811533, term1811533.getClass(), "whiteooo", null);
        setField(term1811533, term1811533.getClass(), "blackoo", null);
        setField(term1811533, term1811533.getClass(), "blackooo", null);
        setField(term1811533, term1811533.getClass(), "whiteRookoo", null);
        setField(term1811533, term1811533.getClass(), "whiteRookooo", null);
        setField(term1811533, term1811533.getClass(), "blackRookoo", null);
        setField(term1811533, term1811533.getClass(), "blackRookooo", null);
        setField(term1811533, term1811533.getClass(), "whiteooSquares", null);
        setField(term1811533, term1811533.getClass(), "whiteoooSquares", null);
        setField(term1811533, term1811533.getClass(), "blackooSquares", null);
        setField(term1811533, term1811533.getClass(), "blackoooSquares", null);
        setLongField(term1811533, term1811533.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811533, term1811533.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811533, term1811533.getClass(), "startFEN", null);
        setField(term1811533, term1811533.getClass(), "whiteRookooFile", null);
        setField(term1811533, term1811533.getClass(), "whiteRookoooFile", null);
        setField(term1811533, term1811533.getClass(), "blackRookooFile", null);
        setField(term1811533, term1811533.getClass(), "blackRookoooFile", null);
        setField(term1811533, term1811533.getClass(), "gameMode", null);
        setField(term1811533, term1811533.getClass(), "variationType", null);
        setField(term1811533, term1811533.getClass(), "event", null);
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
        callMethod(klass, "computeKingPassSquares", argTypes, term1811533, args);
    }

};


