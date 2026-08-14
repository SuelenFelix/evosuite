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

public class GameContext_setWhiteooo_125894939096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530922;

    public GameContext_setWhiteooo_125894939096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530922 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530922, term530922.getClass(), "whiteoo", null);
        setField(term530922, term530922.getClass(), "whiteooo", null);
        setField(term530922, term530922.getClass(), "blackoo", null);
        setField(term530922, term530922.getClass(), "blackooo", null);
        setField(term530922, term530922.getClass(), "whiteRookoo", null);
        setField(term530922, term530922.getClass(), "whiteRookooo", null);
        setField(term530922, term530922.getClass(), "blackRookoo", null);
        setField(term530922, term530922.getClass(), "blackRookooo", null);
        setField(term530922, term530922.getClass(), "whiteooSquares", null);
        setField(term530922, term530922.getClass(), "whiteoooSquares", null);
        setField(term530922, term530922.getClass(), "blackooSquares", null);
        setField(term530922, term530922.getClass(), "blackoooSquares", null);
        setLongField(term530922, term530922.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530922, term530922.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530922, term530922.getClass(), "startFEN", null);
        setField(term530922, term530922.getClass(), "whiteRookooFile", null);
        setField(term530922, term530922.getClass(), "whiteRookoooFile", null);
        setField(term530922, term530922.getClass(), "blackRookooFile", null);
        setField(term530922, term530922.getClass(), "blackRookoooFile", null);
        setField(term530922, term530922.getClass(), "gameMode", null);
        setField(term530922, term530922.getClass(), "variationType", null);
        setField(term530922, term530922.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhiteooo", argTypes, term530922, args);
    }

};


