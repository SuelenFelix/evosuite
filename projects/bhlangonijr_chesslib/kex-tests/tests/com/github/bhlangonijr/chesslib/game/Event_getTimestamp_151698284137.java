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

public class Event_getTimestamp_151698284137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25743;

    public Event_getTimestamp_151698284137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25743 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25743, term25743.getClass(), "round", null);
        setField(term25743, term25743.getClass(), "id", null);
        setField(term25743, term25743.getClass(), "name", null);
        setField(term25743, term25743.getClass(), "eventType", null);
        setField(term25743, term25743.getClass(), "startDate", null);
        setField(term25743, term25743.getClass(), "endDate", null);
        setField(term25743, term25743.getClass(), "site", null);
        setLongField(term25743, term25743.getClass(), "timestamp", 0L);
        setIntField(term25743, term25743.getClass(), "rounds", 0);
        setField(term25743, term25743.getClass(), "timeControl", null);
        setField(term25743, term25743.getClass(), "timeControl2", null);
        setField(term25743, term25743.getClass(), "pgnHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term25743, args);
    }

};


