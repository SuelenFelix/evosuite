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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class CsvRow_init_2405002170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522;
     Object term524;
     Object term540;

    public CsvRow_init_2405002170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522 = new Integer(1134449235);
        ArrayList term525 = new ArrayList();
        ((ArrayList) term525).add((Object)null);
        ((ArrayList) term525).add((Object)null);
        ((ArrayList) term525).add((Object)null);
        ((ArrayList) term525).add((Object)null);
        ((ArrayList) term525).add((Object)null);
        ((ArrayList) term525).add((Object)null);
        HashMap term529 = new HashMap();
        term524 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term524, term524.getClass(), "firstRowCells", term525);
        setField(term524, term524.getClass(), "columnNameToColumnIndex", term529);
        term540 = (Object[]) newArray("java.lang.String", 2);
        setElement(term540, 0, "eZFUvlxvGV");
        setElement(term540, 1, "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.parsers.csv.CsvRow");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.coreoz.windmill.imports.FileSchema");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term522;
        args[1] = term524;
        args[2] = term540;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


