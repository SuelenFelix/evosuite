package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_init_16953010180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339;
     Object term1354;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_init_16953010180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1339 = new LinkedList();
        Class<? extends Object> term1400 = Class.forName((String) "java.io.File$PathStatus");
        Field term1399 = ((Class) term1400).getDeclaredField((String) "CHECKED");
        ((Field) term1399).setAccessible(true);
        Object enum4 = ((Field) term1399).get((Object) null);
        term1354 = newInstance(Class.forName("java.io.File"));
        setField(term1354, term1354.getClass(), "path", "IDCWpPLRkE");
        setField(term1354, term1354.getClass(), "status", enum4);
        setIntField(term1354, term1354.getClass(), "prefixLength", -1179120542);
        setField(term1354, term1354.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.io.File");
        Object[] args = new Object[3];
        args[0] = term1339;
        args[1] = "xrwlQZdwCp";
        args[2] = term1354;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


