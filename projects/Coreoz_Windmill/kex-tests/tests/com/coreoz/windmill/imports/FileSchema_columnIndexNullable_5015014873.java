package com.coreoz.windmill.imports;

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
import static com.coreoz.windmill.imports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class FileSchema_columnIndexNullable_5015014873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;

    public FileSchema_columnIndexNullable_5015014873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term862 = new ArrayList();
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        ((ArrayList) term862).add((Object)null);
        HashMap term866 = new HashMap();
        term861 = newInstance(Class.forName("com.coreoz.windmill.imports.FileSchema"));
        setField(term861, term861.getClass(), "firstRowCells", term862);
        setField(term861, term861.getClass(), "columnNameToColumnIndex", term866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.FileSchema");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "columnIndexNullable", argTypes, term861, args);
    }

};


