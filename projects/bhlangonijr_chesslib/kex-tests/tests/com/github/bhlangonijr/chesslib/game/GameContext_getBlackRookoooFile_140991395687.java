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

public class GameContext_getBlackRookoooFile_140991395687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530841;

    public GameContext_getBlackRookoooFile_140991395687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530841 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530841, term530841.getClass(), "whiteoo", null);
        setField(term530841, term530841.getClass(), "whiteooo", null);
        setField(term530841, term530841.getClass(), "blackoo", null);
        setField(term530841, term530841.getClass(), "blackooo", null);
        setField(term530841, term530841.getClass(), "whiteRookoo", null);
        setField(term530841, term530841.getClass(), "whiteRookooo", null);
        setField(term530841, term530841.getClass(), "blackRookoo", null);
        setField(term530841, term530841.getClass(), "blackRookooo", null);
        setField(term530841, term530841.getClass(), "whiteooSquares", null);
        setField(term530841, term530841.getClass(), "whiteoooSquares", null);
        setField(term530841, term530841.getClass(), "blackooSquares", null);
        setField(term530841, term530841.getClass(), "blackoooSquares", null);
        setLongField(term530841, term530841.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530841, term530841.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530841, term530841.getClass(), "startFEN", null);
        setField(term530841, term530841.getClass(), "whiteRookooFile", null);
        setField(term530841, term530841.getClass(), "whiteRookoooFile", null);
        setField(term530841, term530841.getClass(), "blackRookooFile", null);
        setField(term530841, term530841.getClass(), "blackRookoooFile", null);
        setField(term530841, term530841.getClass(), "gameMode", null);
        setField(term530841, term530841.getClass(), "variationType", null);
        setField(term530841, term530841.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackRookoooFile", argTypes, term530841, args);
    }

};


