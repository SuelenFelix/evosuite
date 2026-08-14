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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ExcelRowIterator_hasNext_3896249091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;

    public ExcelRowIterator_hasNext_3896249091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term42 = new ArrayList();
        ((ArrayList) term42).add((Object)null);
        ((ArrayList) term42).add((Object)null);
        ((ArrayList) term42).add((Object)null);
        ((ArrayList) term42).add((Object)null);
        ((ArrayList) term42).add((Object)null);
        HashMap term46 = new HashMap();
        term39 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator"));
        Object term41 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term39, term39.getClass(), "rowIterator", null);
        setBooleanField(term39, term39.getClass(), "trimValues", false);
        setField(term41, term41.getClass(), "firstRowCells", term42);
        setField(term41, term41.getClass(), "columnNameToColumnIndex", term46);
        setField(term39, term39.getClass(), "fileSchema", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term39, args);
    }

};


