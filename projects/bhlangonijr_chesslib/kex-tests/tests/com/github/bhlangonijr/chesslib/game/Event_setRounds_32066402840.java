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
import java.lang.Integer;

public class Event_setRounds_32066402840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25754;
     Object term25757;

    public Event_setRounds_32066402840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25754 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25754, term25754.getClass(), "round", null);
        setField(term25754, term25754.getClass(), "id", null);
        setField(term25754, term25754.getClass(), "name", null);
        setField(term25754, term25754.getClass(), "eventType", null);
        setField(term25754, term25754.getClass(), "startDate", null);
        setField(term25754, term25754.getClass(), "endDate", null);
        setField(term25754, term25754.getClass(), "site", null);
        setLongField(term25754, term25754.getClass(), "timestamp", 0L);
        setIntField(term25754, term25754.getClass(), "rounds", 0);
        setField(term25754, term25754.getClass(), "timeControl", null);
        setField(term25754, term25754.getClass(), "timeControl2", null);
        setField(term25754, term25754.getClass(), "pgnHolder", null);
        term25757 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25757;
        callMethod(klass, "setRounds", argTypes, term25754, args);
    }

};


