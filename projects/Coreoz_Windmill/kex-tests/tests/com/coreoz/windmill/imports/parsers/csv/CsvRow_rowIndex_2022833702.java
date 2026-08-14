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

public class CsvRow_rowIndex_2022833702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757;

    public CsvRow_rowIndex_2022833702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term760 = new ArrayList();
        ((ArrayList) term760).add((Object)null);
        HashMap term764 = new HashMap();
        term757 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow"));
        Object term759 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        Object[] term774 = (Object[]) newArray("java.lang.String", 6);
        setIntField(term757, term757.getClass(), "currentRowIndex", 1585847225);
        setField(term759, term759.getClass(), "firstRowCells", term760);
        setField(term759, term759.getClass(), "columnNameToColumnIndex", term764);
        setField(term757, term757.getClass(), "fileSchema", term759);
        setElement(term774, 0, "kuTXqwMtDB");
        setElement(term774, 1, "Ghbwtircqb");
        setElement(term774, 2, "xrwlQZdwCp");
        setElement(term774, 3, "IDCWpPLRkE");
        setElement(term774, 4, "nyiiPDVjAc");
        setElement(term774, 5, "aKnKipADSo");
        setField(term757, term757.getClass(), "row", term774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rowIndex", argTypes, term757, args);
    }

};


