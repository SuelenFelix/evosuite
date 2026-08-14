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

public class GameContext_setWhiteRookoo_1456474874102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530976;

    public GameContext_setWhiteRookoo_1456474874102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530976 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530976, term530976.getClass(), "whiteoo", null);
        setField(term530976, term530976.getClass(), "whiteooo", null);
        setField(term530976, term530976.getClass(), "blackoo", null);
        setField(term530976, term530976.getClass(), "blackooo", null);
        setField(term530976, term530976.getClass(), "whiteRookoo", null);
        setField(term530976, term530976.getClass(), "whiteRookooo", null);
        setField(term530976, term530976.getClass(), "blackRookoo", null);
        setField(term530976, term530976.getClass(), "blackRookooo", null);
        setField(term530976, term530976.getClass(), "whiteooSquares", null);
        setField(term530976, term530976.getClass(), "whiteoooSquares", null);
        setField(term530976, term530976.getClass(), "blackooSquares", null);
        setField(term530976, term530976.getClass(), "blackoooSquares", null);
        setLongField(term530976, term530976.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530976, term530976.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530976, term530976.getClass(), "startFEN", null);
        setField(term530976, term530976.getClass(), "whiteRookooFile", null);
        setField(term530976, term530976.getClass(), "whiteRookoooFile", null);
        setField(term530976, term530976.getClass(), "blackRookooFile", null);
        setField(term530976, term530976.getClass(), "blackRookoooFile", null);
        setField(term530976, term530976.getClass(), "gameMode", null);
        setField(term530976, term530976.getClass(), "variationType", null);
        setField(term530976, term530976.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhiteRookoo", argTypes, term530976, args);
    }

};


