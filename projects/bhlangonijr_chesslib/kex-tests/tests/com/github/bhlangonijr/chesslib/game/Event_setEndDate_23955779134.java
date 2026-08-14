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

public class Event_setEndDate_23955779134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25734;

    public Event_setEndDate_23955779134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25734 = newInstance(Class.forName("com.github.bhlangonijr.chesslib.game.Event"));
        setField(term25734, term25734.getClass(), "round", null);
        setField(term25734, term25734.getClass(), "id", null);
        setField(term25734, term25734.getClass(), "name", null);
        setField(term25734, term25734.getClass(), "eventType", null);
        setField(term25734, term25734.getClass(), "startDate", null);
        setField(term25734, term25734.getClass(), "endDate", null);
        setField(term25734, term25734.getClass(), "site", null);
        setLongField(term25734, term25734.getClass(), "timestamp", 0L);
        setIntField(term25734, term25734.getClass(), "rounds", 0);
        setField(term25734, term25734.getClass(), "timeControl", null);
        setField(term25734, term25734.getClass(), "timeControl2", null);
        setField(term25734, term25734.getClass(), "pgnHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.bhlangonijr.chesslib.game.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndDate", argTypes, term25734, args);
    }

};


