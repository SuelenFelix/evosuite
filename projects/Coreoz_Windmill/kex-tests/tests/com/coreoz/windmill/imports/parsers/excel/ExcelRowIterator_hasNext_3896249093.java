package com.coreoz.windmill.imports.parsers.excel;

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
import static com.coreoz.windmill.imports.parsers.excel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExcelRowIterator_hasNext_3896249093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public ExcelRowIterator_hasNext_3896249093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator"));
        setField(term73, term73.getClass(), "rowIterator", null);
        setBooleanField(term73, term73.getClass(), "trimValues", false);
        setField(term73, term73.getClass(), "fileSchema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term73, args);
    }

};


