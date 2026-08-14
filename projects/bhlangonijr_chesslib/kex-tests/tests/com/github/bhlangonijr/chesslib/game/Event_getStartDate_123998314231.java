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

public class Event_getStartDate_123998314231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25725;

    public Event_getStartDate_123998314231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25725 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25725, term25725.getClass(), "round", null);
        setField(term25725, term25725.getClass(), "id", null);
        setField(term25725, term25725.getClass(), "name", null);
        setField(term25725, term25725.getClass(), "eventType", null);
        setField(term25725, term25725.getClass(), "startDate", null);
        setField(term25725, term25725.getClass(), "endDate", null);
        setField(term25725, term25725.getClass(), "site", null);
        setLongField(term25725, term25725.getClass(), "timestamp", 0L);
        setIntField(term25725, term25725.getClass(), "rounds", 0);
        setField(term25725, term25725.getClass(), "timeControl", null);
        setField(term25725, term25725.getClass(), "timeControl2", null);
        setField(term25725, term25725.getClass(), "pgnHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term25725, args);
    }

};


