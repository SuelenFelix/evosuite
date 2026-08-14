package com.github.cuteluobo.livedanmuarchive.service;

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
import static com.github.cuteluobo.livedanmuarchive.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AbstractFilesDanMuExportService_setSavePath_201849068315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14258;

    public AbstractFilesDanMuExportService_setSavePath_201849068315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14294 = Class.forName((String) "java.io.File$PathStatus");
        Field term14293 = ((Class) term14294).getDeclaredField((String) "CHECKED");
        ((Field) term14293).setAccessible(true);
        Object enum37 = ((Field) term14293).get((Object) null);
        term14258 = newInstance(Class.forName("java.io.File"));
        setField(term14258, term14258.getClass(), "path", "pFAfANnxup");
        setField(term14258, term14258.getClass(), "status", enum37);
        setIntField(term14258, term14258.getClass(), "prefixLength", -129547140);
        setField(term14258, term14258.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.AbstractFilesDanMuExportService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term14258;
        callMethod(klass, "setSavePath", argTypes, null, args);
    }

};


