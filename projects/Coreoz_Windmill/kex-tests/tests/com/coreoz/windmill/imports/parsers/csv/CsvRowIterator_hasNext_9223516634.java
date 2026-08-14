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

public class CsvRowIterator_hasNext_9223516634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518;

    public CsvRowIterator_hasNext_9223516634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator"));
        setField(term518, term518.getClass(), "csvRowIterator", null);
        setField(term518, term518.getClass(), "fileSchema", null);
        setIntField(term518, term518.getClass(), "currentRowIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term518, args);
    }

};


