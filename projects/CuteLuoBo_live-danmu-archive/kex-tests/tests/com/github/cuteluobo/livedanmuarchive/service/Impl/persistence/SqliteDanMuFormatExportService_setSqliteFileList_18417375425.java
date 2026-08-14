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
import java.lang.Object;
import java.lang.String;

public class SqliteDanMuFormatExportService_setSqliteFileList_18417375425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;

    public SqliteDanMuFormatExportService_setSqliteFileList_18417375425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245 = Class.forName((String) "java.io.File$PathStatus");
        Field term244 = ((Class) term245).getDeclaredField((String) "INVALID");
        ((Field) term244).setAccessible(true);
        Object enum0 = ((Field) term244).get((Object) null);
        Object term164 = newInstance(Class.forName("java.io.File"));
        setField(term164, term164.getClass(), "path", "MxlszYVzRf");
        setField(term164, term164.getClass(), "status", enum0);
        setIntField(term164, term164.getClass(), "prefixLength", -1955890973);
        setField(term164, term164.getClass(), "filePath", null);
        Object term182 = newInstance(Class.forName("java.io.File"));
        setField(term182, term182.getClass(), "path", "");
        setField(term182, term182.getClass(), "status", enum0);
        setIntField(term182, term182.getClass(), "prefixLength", -2038273078);
        setField(term182, term182.getClass(), "filePath", null);
        Object term186 = newInstance(Class.forName("java.io.File"));
        setField(term186, term186.getClass(), "path", null);
        setField(term186, term186.getClass(), "status", enum0);
        setIntField(term186, term186.getClass(), "prefixLength", 1227103734);
        setField(term186, term186.getClass(), "filePath", null);
        term161 = new LinkedList();
        ((LinkedList) term161).add(term164);
        ((LinkedList) term161).add(term182);
        ((LinkedList) term161).add(term186);
        ((LinkedList) term161).add((Object)null);
        ((LinkedList) term161).add((Object)null);
        ((LinkedList) term161).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.SqliteDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term161;
        callMethod(klass, "setSqliteFileList", argTypes, null, args);
    }

};


