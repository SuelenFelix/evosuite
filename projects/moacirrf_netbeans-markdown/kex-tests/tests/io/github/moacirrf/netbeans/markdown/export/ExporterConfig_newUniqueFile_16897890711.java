package io.github.moacirrf.netbeans.markdown.export;

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
import static io.github.moacirrf.netbeans.markdown.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class ExporterConfig_newUniqueFile_16897890711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;
     Object term889;

    public ExporterConfig_newUniqueFile_16897890711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term915 = Class.forName((String) "java.io.File$PathStatus");
        Field term914 = ((Class) term915).getDeclaredField((String) "CHECKED");
        ((Field) term914).setAccessible(true);
        Object enum4 = ((Field) term914).get((Object) null);
        term864 = newInstance(Class.forName("java.io.File"));
        setField(term864, term864.getClass(), "path", "pCTimMblYc");
        setField(term864, term864.getClass(), "status", enum4);
        setIntField(term864, term864.getClass(), "prefixLength", 597278769);
        setField(term864, term864.getClass(), "filePath", null);
        term889 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term864;
        args[1] = term889;
        args[2] = "hNxWaHcfhY";
        callMethod(klass, "newUniqueFile", argTypes, null, args);
    }

};


