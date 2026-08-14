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

public class CsvRowIterator_hasNext_9223516631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term484;

    public CsvRowIterator_hasNext_9223516631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term486 = new ArrayList();
        ((ArrayList) term486).add((Object)null);
        ((ArrayList) term486).add((Object)null);
        ((ArrayList) term486).add((Object)null);
        ((ArrayList) term486).add((Object)null);
        HashMap term490 = new HashMap();
        term484 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator"));
        Object term485 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term484, term484.getClass(), "csvRowIterator", null);
        setField(term485, term485.getClass(), "firstRowCells", term486);
        setField(term485, term485.getClass(), "columnNameToColumnIndex", term490);
        setField(term484, term484.getClass(), "fileSchema", term485);
        setIntField(term484, term484.getClass(), "currentRowIndex", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term484, args);
    }

};


