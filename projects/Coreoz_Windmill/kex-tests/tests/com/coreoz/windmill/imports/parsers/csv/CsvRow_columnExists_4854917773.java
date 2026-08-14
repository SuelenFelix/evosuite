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

public class CsvRow_columnExists_4854917773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907;

    public CsvRow_columnExists_4854917773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term910 = new ArrayList();
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        ((ArrayList) term910).add((Object)null);
        HashMap term914 = new HashMap();
        term907 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow"));
        Object term909 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        Object[] term924 = (Object[]) newArray("java.lang.String", 5);
        setIntField(term907, term907.getClass(), "currentRowIndex", 597278769);
        setField(term909, term909.getClass(), "firstRowCells", term910);
        setField(term909, term909.getClass(), "columnNameToColumnIndex", term914);
        setField(term907, term907.getClass(), "fileSchema", term909);
        setElement(term924, 0, "UlajhuVLaP");
        setElement(term924, 1, "gGSMzuGICf");
        setElement(term924, 2, "hxCBltsObl");
        setElement(term924, 3, "BndsHwAFMv");
        setElement(term924, 4, "GzFkzHGYFt");
        setField(term907, term907.getClass(), "row", term924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "columnExists", argTypes, term907, args);
    }

};


