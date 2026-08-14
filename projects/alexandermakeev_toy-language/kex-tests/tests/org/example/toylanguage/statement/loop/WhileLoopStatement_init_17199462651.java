package org.example.toylanguage.statement.loop;

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
import static org.example.toylanguage.statement.loop.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class WhileLoopStatement_init_17199462651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public WhileLoopStatement_init_17199462651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26 = new ArrayList();
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        ((ArrayList) term26).add((Object)null);
        Integer term30 = new Integer(1162663216);
        term25 = newInstance(Class.forName("org.example.toylanguage.statement.loop.WhileLoopStatement"));
        setField(term25, term25.getClass(), "hasNext", null);
        setField(term25, term25.getClass(), "statements2Execute", term26);
        setField(term25, term25.getClass(), "rowNumber", term30);
        setField(term25, term25.getClass(), "blockName", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.statement.loop.WhileLoopStatement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term25, args);
    }

};


