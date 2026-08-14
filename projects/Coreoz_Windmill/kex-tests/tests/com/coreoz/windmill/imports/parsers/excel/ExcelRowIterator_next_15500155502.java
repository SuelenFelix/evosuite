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

public class ExcelRowIterator_next_15500155502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public ExcelRowIterator_next_15500155502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term59 = new ArrayList();
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        ((ArrayList) term59).add((Object)null);
        HashMap term63 = new HashMap();
        term56 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator"));
        Object term58 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term56, term56.getClass(), "rowIterator", null);
        setBooleanField(term56, term56.getClass(), "trimValues", false);
        setField(term58, term58.getClass(), "firstRowCells", term59);
        setField(term58, term58.getClass(), "columnNameToColumnIndex", term63);
        setField(term56, term56.getClass(), "fileSchema", term58);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.excel.ExcelRowIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term56, args);
    }

};


