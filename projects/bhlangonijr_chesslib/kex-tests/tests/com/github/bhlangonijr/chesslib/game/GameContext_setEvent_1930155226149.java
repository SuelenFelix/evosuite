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

public class GameContext_setEvent_1930155226149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531413;

    public GameContext_setEvent_1930155226149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531413 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.GameContext"));
        setField(term531413, term531413.getClass(), "whiteoo", null);
        setField(term531413, term531413.getClass(), "whiteooo", null);
        setField(term531413, term531413.getClass(), "blackoo", null);
        setField(term531413, term531413.getClass(), "blackooo", null);
        setField(term531413, term531413.getClass(), "whiteRookoo", null);
        setField(term531413, term531413.getClass(), "whiteRookooo", null);
        setField(term531413, term531413.getClass(), "blackRookoo", null);
        setField(term531413, term531413.getClass(), "blackRookooo", null);
        setField(term531413, term531413.getClass(), "whiteooSquares", null);
        setField(term531413, term531413.getClass(), "whiteoooSquares", null);
        setField(term531413, term531413.getClass(), "blackooSquares", null);
        setField(term531413, term531413.getClass(), "blackoooSquares", null);
        setLongField(term531413, term531413.getClass(), "whiteooSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "whiteoooSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "blackooSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "blackoooSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "whiteooAllSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "whiteoooAllSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "blackooAllSquaresBb", 0L);
        setLongField(term531413, term531413.getClass(), "blackoooAllSquaresBb", 0L);
        setField(term531413, term531413.getClass(), "startFEN", null);
        setField(term531413, term531413.getClass(), "whiteRookooFile", null);
        setField(term531413, term531413.getClass(), "whiteRookoooFile", null);
        setField(term531413, term531413.getClass(), "blackRookooFile", null);
        setField(term531413, term531413.getClass(), "blackRookoooFile", null);
        setField(term531413, term531413.getClass(), "gameMode", null);
        setField(term531413, term531413.getClass(), "variationType", null);
        setField(term531413, term531413.getClass(), "event", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.GameContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEvent", argTypes, term531413, args);
    }

};


