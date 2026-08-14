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
import java.lang.Long;

public class Event_setTimestamp_100987646538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25746;
     Object term25749;

    public Event_setTimestamp_100987646538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25746 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25746, term25746.getClass(), "round", null);
        setField(term25746, term25746.getClass(), "id", null);
        setField(term25746, term25746.getClass(), "name", null);
        setField(term25746, term25746.getClass(), "eventType", null);
        setField(term25746, term25746.getClass(), "startDate", null);
        setField(term25746, term25746.getClass(), "endDate", null);
        setField(term25746, term25746.getClass(), "site", null);
        setLongField(term25746, term25746.getClass(), "timestamp", 0L);
        setIntField(term25746, term25746.getClass(), "rounds", 0);
        setField(term25746, term25746.getClass(), "timeControl", null);
        setField(term25746, term25746.getClass(), "timeControl2", null);
        setField(term25746, term25746.getClass(), "pgnHolder", null);
        term25749 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term25749;
        callMethod(klass, "setTimestamp", argTypes, term25746, args);
    }

};


