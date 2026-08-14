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
import java.lang.Integer;

public class CsvRow_cell_121542215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1163;
     Object term1181;

    public CsvRow_cell_121542215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1166 = new ArrayList();
        ((ArrayList) term1166).add((Object)null);
        HashMap term1170 = new HashMap();
        term1163 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow"));
        Object term1165 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        Object[] term1180 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term1163, term1163.getClass(), "currentRowIndex", -1456670397);
        setField(term1165, term1165.getClass(), "firstRowCells", term1166);
        setField(term1165, term1165.getClass(), "columnNameToColumnIndex", term1170);
        setField(term1163, term1163.getClass(), "fileSchema", term1165);
        setField(term1163, term1163.getClass(), "row", term1180);
        term1181 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1181;
        callMethod(klass, "cell", argTypes, term1163, args);
    }

};


