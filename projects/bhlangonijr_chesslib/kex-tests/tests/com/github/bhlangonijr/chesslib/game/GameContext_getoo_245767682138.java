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

public class GameContext_getoo_245767682138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531314;

    public GameContext_getoo_245767682138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531314 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531314, term531314.getClass(), "whiteoo", null);
        setField(term531314, term531314.getClass(), "whiteooo", null);
        setField(term531314, term531314.getClass(), "blackoo", null);
        setField(term531314, term531314.getClass(), "blackooo", null);
        setField(term531314, term531314.getClass(), "whiteRookoo", null);
        setField(term531314, term531314.getClass(), "whiteRookooo", null);
        setField(term531314, term531314.getClass(), "blackRookoo", null);
        setField(term531314, term531314.getClass(), "blackRookooo", null);
        setField(term531314, term531314.getClass(), "whiteooSquares", null);
        setField(term531314, term531314.getClass(), "whiteoooSquares", null);
        setField(term531314, term531314.getClass(), "blackooSquares", null);
        setField(term531314, term531314.getClass(), "blackoooSquares", null);
        setLongField(term531314, term531314.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531314, term531314.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531314, term531314.getClass(), "startFEN", null);
        setField(term531314, term531314.getClass(), "whiteRookooFile", null);
        setField(term531314, term531314.getClass(), "whiteRookoooFile", null);
        setField(term531314, term531314.getClass(), "blackRookooFile", null);
        setField(term531314, term531314.getClass(), "blackRookoooFile", null);
        setField(term531314, term531314.getClass(), "gameMode", null);
        setField(term531314, term531314.getClass(), "variationType", null);
        setField(term531314, term531314.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.Side");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getoo", argTypes, term531314, args);
    }

};


