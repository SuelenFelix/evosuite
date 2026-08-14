package com.coreoz.windmill.imports.parsers.csv;

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
import static com.coreoz.windmill.imports.parsers.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CsvCell_asLong_175990344112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public CsvCell_asLong_175990344112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCell"));
        setIntField(term476, term476.getClass(), "columnIndex", 0);
        setField(term476, term476.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "asLong", argTypes, term476, args);
    }

};


