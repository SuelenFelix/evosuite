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

public class GameContext_hasCastleRight_92436248989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811614;

    public GameContext_hasCastleRight_92436248989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811614 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term1811614, term1811614.getClass(), "whiteoo", null);
        setField(term1811614, term1811614.getClass(), "whiteooo", null);
        setField(term1811614, term1811614.getClass(), "blackoo", null);
        setField(term1811614, term1811614.getClass(), "blackooo", null);
        setField(term1811614, term1811614.getClass(), "whiteRookoo", null);
        setField(term1811614, term1811614.getClass(), "whiteRookooo", null);
        setField(term1811614, term1811614.getClass(), "blackRookoo", null);
        setField(term1811614, term1811614.getClass(), "blackRookooo", null);
        setField(term1811614, term1811614.getClass(), "whiteooSquares", null);
        setField(term1811614, term1811614.getClass(), "whiteoooSquares", null);
        setField(term1811614, term1811614.getClass(), "blackooSquares", null);
        setField(term1811614, term1811614.getClass(), "blackoooSquares", null);
        setLongField(term1811614, term1811614.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "blackooSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term1811614, term1811614.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term1811614, term1811614.getClass(), "startFEN", null);
        setField(term1811614, term1811614.getClass(), "whiteRookooFile", null);
        setField(term1811614, term1811614.getClass(), "whiteRookoooFile", null);
        setField(term1811614, term1811614.getClass(), "blackRookooFile", null);
        setField(term1811614, term1811614.getClass(), "blackRookoooFile", null);
        setField(term1811614, term1811614.getClass(), "gameMode", null);
        setField(term1811614, term1811614.getClass(), "variationType", null);
        setField(term1811614, term1811614.getClass(), "event", null);
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
        callMethod(klass, "hasCastleRight", argTypes, term1811614, args);
    }

};


