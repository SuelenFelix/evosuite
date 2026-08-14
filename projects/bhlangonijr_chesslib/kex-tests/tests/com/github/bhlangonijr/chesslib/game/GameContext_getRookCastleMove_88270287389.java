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

public class GameContext_getRookCastleMove_88270287389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530859;

    public GameContext_getRookCastleMove_88270287389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530859 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530859, term530859.getClass(), "whiteoo", null);
        setField(term530859, term530859.getClass(), "whiteooo", null);
        setField(term530859, term530859.getClass(), "blackoo", null);
        setField(term530859, term530859.getClass(), "blackooo", null);
        setField(term530859, term530859.getClass(), "whiteRookoo", null);
        setField(term530859, term530859.getClass(), "whiteRookooo", null);
        setField(term530859, term530859.getClass(), "blackRookoo", null);
        setField(term530859, term530859.getClass(), "blackRookooo", null);
        setField(term530859, term530859.getClass(), "whiteooSquares", null);
        setField(term530859, term530859.getClass(), "whiteoooSquares", null);
        setField(term530859, term530859.getClass(), "blackooSquares", null);
        setField(term530859, term530859.getClass(), "blackoooSquares", null);
        setLongField(term530859, term530859.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530859, term530859.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530859, term530859.getClass(), "startFEN", null);
        setField(term530859, term530859.getClass(), "whiteRookooFile", null);
        setField(term530859, term530859.getClass(), "whiteRookoooFile", null);
        setField(term530859, term530859.getClass(), "blackRookooFile", null);
        setField(term530859, term530859.getClass(), "blackRookoooFile", null);
        setField(term530859, term530859.getClass(), "gameMode", null);
        setField(term530859, term530859.getClass(), "variationType", null);
        setField(term530859, term530859.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.CastleRight");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getRookCastleMove", argTypes, term530859, args);
    }

};


