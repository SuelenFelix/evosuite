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

public class CsvRow_iterator_753725261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term585;

    public CsvRow_iterator_753725261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term588 = new ArrayList();
        ((ArrayList) term588).add((Object)null);
        ((ArrayList) term588).add((Object)null);
        ((ArrayList) term588).add((Object)null);
        ((ArrayList) term588).add((Object)null);
        ((ArrayList) term588).add((Object)null);
        ((ArrayList) term588).add((Object)null);
        HashMap term592 = new HashMap();
        term585 = newInstance(Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow"));
        Object term587 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        Object[] term602 = (Object[]) newArray("java.lang.String", 7);
        setIntField(term585, term585.getClass(), "currentRowIndex", -883034806);
        setField(term587, term587.getClass(), "firstRowCells", term588);
        setField(term587, term587.getClass(), "columnNameToColumnIndex", term592);
        setField(term585, term585.getClass(), "fileSchema", term587);
        setElement(term602, 0, "flxyYxBRtu");
        setElement(term602, 1, "OclPbYPkcH");
        setElement(term602, 2, "IoAlmYsBwc");
        setElement(term602, 3, "TEParAifyi");
        setElement(term602, 4, "OWDIEULEFu");
        setElement(term602, 5, "dWRymuLBtr");
        setElement(term602, 6, "AijpHYOFuy");
        setField(term585, term585.getClass(), "row", term602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term585, args);
    }

};


