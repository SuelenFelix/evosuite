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

public class CsvCellIterator_next_60791885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public CsvCellIterator_next_60791885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCellIterator"));
        setField(term274, term274.getClass(), "csvRow", null);
        setIntField(term274, term274.getClass(), "rowIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCellIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term274, args);
    }

};


