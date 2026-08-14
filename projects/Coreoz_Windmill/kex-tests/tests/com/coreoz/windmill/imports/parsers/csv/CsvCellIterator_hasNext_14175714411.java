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

public class CsvCellIterator_hasNext_14175714411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public CsvCellIterator_hasNext_14175714411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCellIterator"));
        Object[] term113 = (Object[]) newArray("java.lang.String", 4);
        setElement(term113, 0, "EGtDIRbSSb");
        setElement(term113, 1, "SzjVpOQTyS");
        setElement(term113, 2, "MjGYSRKTNF");
        setElement(term113, 3, "hRNSzYYIrc");
        setField(term112, term112.getClass(), "csvRow", term113);
        setIntField(term112, term112.getClass(), "rowIndex", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvCellIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term112, args);
    }

};


