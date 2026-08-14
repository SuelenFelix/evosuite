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

public class GameContext_hasCastleRight_92436248915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179632;

    public GameContext_hasCastleRight_92436248915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179632 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term179632, term179632.getClass(), "whiteoo", null);
        setField(term179632, term179632.getClass(), "whiteooo", null);
        setField(term179632, term179632.getClass(), "blackoo", null);
        setField(term179632, term179632.getClass(), "blackooo", null);
        setField(term179632, term179632.getClass(), "whiteRookoo", null);
        setField(term179632, term179632.getClass(), "whiteRookooo", null);
        setField(term179632, term179632.getClass(), "blackRookoo", null);
        setField(term179632, term179632.getClass(), "blackRookooo", null);
        setField(term179632, term179632.getClass(), "whiteooSquares", null);
        setField(term179632, term179632.getClass(), "whiteoooSquares", null);
        setField(term179632, term179632.getClass(), "blackooSquares", null);
        setField(term179632, term179632.getClass(), "blackoooSquares", null);
        setLongField(term179632, term179632.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "blackooSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term179632, term179632.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term179632, term179632.getClass(), "startFEN", null);
        setField(term179632, term179632.getClass(), "whiteRookooFile", null);
        setField(term179632, term179632.getClass(), "whiteRookoooFile", null);
        setField(term179632, term179632.getClass(), "blackRookooFile", null);
        setField(term179632, term179632.getClass(), "blackRookoooFile", null);
        setField(term179632, term179632.getClass(), "gameMode", null);
        setField(term179632, term179632.getClass(), "variationType", null);
        setField(term179632, term179632.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.move.Move");
        argTypes[1] = Class.forName("com.github.bhlangonijr.chesslib.CastleRight");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "hasCastleRight", argTypes, term179632, args);
    }

};


