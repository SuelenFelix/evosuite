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

public class Event_getRounds_23571145439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25751;

    public Event_getRounds_23571145439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25751 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25751, term25751.getClass(), "round", null);
        setField(term25751, term25751.getClass(), "id", null);
        setField(term25751, term25751.getClass(), "name", null);
        setField(term25751, term25751.getClass(), "eventType", null);
        setField(term25751, term25751.getClass(), "startDate", null);
        setField(term25751, term25751.getClass(), "endDate", null);
        setField(term25751, term25751.getClass(), "site", null);
        setLongField(term25751, term25751.getClass(), "timestamp", 0L);
        setIntField(term25751, term25751.getClass(), "rounds", 0);
        setField(term25751, term25751.getClass(), "timeControl", null);
        setField(term25751, term25751.getClass(), "timeControl2", null);
        setField(term25751, term25751.getClass(), "pgnHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRounds", argTypes, term25751, args);
    }

};


