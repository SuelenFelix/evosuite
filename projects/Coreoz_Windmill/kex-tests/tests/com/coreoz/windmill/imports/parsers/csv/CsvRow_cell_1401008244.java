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

public class CsvRow_cell_1401008244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1057;

    public CsvRow_cell_1401008244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1060 = new ArrayList();
        ((ArrayList) term1060).add((Object)null);
        ((ArrayList) term1060).add((Object)null);
        HashMap term1064 = new HashMap();
        term1057 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow"));
        Object term1059 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        Object[] term1074 = (Object[]) newArray("java.lang.String", 3);
        setIntField(term1057, term1057.getClass(), "currentRowIndex", -1685132342);
        setField(term1059, term1059.getClass(), "firstRowCells", term1060);
        setField(term1059, term1059.getClass(), "columnNameToColumnIndex", term1064);
        setField(term1057, term1057.getClass(), "fileSchema", term1059);
        setElement(term1074, 0, "xLbjWUgOIL");
        setElement(term1074, 1, "jDtqGUpnZN");
        setElement(term1074, 2, "nGKItKLYNC");
        setField(term1057, term1057.getClass(), "row", term1074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "cell", argTypes, term1057, args);
    }

};


