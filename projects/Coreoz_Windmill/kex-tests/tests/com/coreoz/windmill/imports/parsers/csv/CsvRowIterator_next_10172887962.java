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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class CsvRowIterator_next_10172887962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;

    public CsvRowIterator_next_10172887962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term503 = new ArrayList();
        ((ArrayList) term503).add((Object)null);
        HashMap term507 = new HashMap();
        term501 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator"));
        Object term502 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term501, term501.getClass(), "csvRowIterator", null);
        setField(term502, term502.getClass(), "firstRowCells", term503);
        setField(term502, term502.getClass(), "columnNameToColumnIndex", term507);
        setField(term501, term501.getClass(), "fileSchema", term502);
        setIntField(term501, term501.getClass(), "currentRowIndex", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term501, args);
    }

};


