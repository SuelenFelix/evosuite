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

public class GameContext_getKingCastleMove_138526920788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530850;

    public GameContext_getKingCastleMove_138526920788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530850 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term530850, term530850.getClass(), "whiteoo", null);
        setField(term530850, term530850.getClass(), "whiteooo", null);
        setField(term530850, term530850.getClass(), "blackoo", null);
        setField(term530850, term530850.getClass(), "blackooo", null);
        setField(term530850, term530850.getClass(), "whiteRookoo", null);
        setField(term530850, term530850.getClass(), "whiteRookooo", null);
        setField(term530850, term530850.getClass(), "blackRookoo", null);
        setField(term530850, term530850.getClass(), "blackRookooo", null);
        setField(term530850, term530850.getClass(), "whiteooSquares", null);
        setField(term530850, term530850.getClass(), "whiteoooSquares", null);
        setField(term530850, term530850.getClass(), "blackooSquares", null);
        setField(term530850, term530850.getClass(), "blackoooSquares", null);
        setLongField(term530850, term530850.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "blackooSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term530850, term530850.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term530850, term530850.getClass(), "startFEN", null);
        setField(term530850, term530850.getClass(), "whiteRookooFile", null);
        setField(term530850, term530850.getClass(), "whiteRookoooFile", null);
        setField(term530850, term530850.getClass(), "blackRookooFile", null);
        setField(term530850, term530850.getClass(), "blackRookoooFile", null);
        setField(term530850, term530850.getClass(), "gameMode", null);
        setField(term530850, term530850.getClass(), "variationType", null);
        setField(term530850, term530850.getClass(), "event", null);
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
        callMethod(klass, "getKingCastleMove", argTypes, term530850, args);
    }

};


