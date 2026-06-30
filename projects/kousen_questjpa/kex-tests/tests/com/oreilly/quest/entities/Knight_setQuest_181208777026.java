package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Knight_setQuest_181208777026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5329;

    public Knight_setQuest_181208777026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5329 = newInstance(Class.forName("com.oreilly.quest.entities.Knight"));
        setField(term5329, term5329.getClass(), "id", null);
        setField(term5329, term5329.getClass(), "title", null);
        setField(term5329, term5329.getClass(), "name", null);
        setField(term5329, term5329.getClass(), "quest", null);
        setField(term5329, term5329.getClass(), "castle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Knight");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Quest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQuest", argTypes, term5329, args);
    }

};


