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
import java.lang.String;
import java.lang.Object;

public class FileDanMuExportServiceImpl_init_8786170270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;

    public FileDanMuExportServiceImpl_init_8786170270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term498 = Class.forName((String) "java.io.File$PathStatus");
        Field term497 = ((Class) term498).getDeclaredField((String) "CHECKED");
        ((Field) term497).setAccessible(true);
        Object enum1 = ((Field) term497).get((Object) null);
        term462 = newInstance(Class.forName("java.io.File"));
        setField(term462, term462.getClass(), "path", "pCTimMblYc");
        setField(term462, term462.getClass(), "status", enum1);
        setIntField(term462, term462.getClass(), "prefixLength", -655067527);
        setField(term462, term462.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.FileDanMuExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term462;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


