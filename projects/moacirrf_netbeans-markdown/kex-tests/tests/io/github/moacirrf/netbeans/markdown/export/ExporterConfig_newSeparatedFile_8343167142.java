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

public class ExporterConfig_newSeparatedFile_8343167142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1067;
     Object term1092;

    public ExporterConfig_newSeparatedFile_8343167142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1106 = Class.forName((String) "java.io.File$PathStatus");
        Field term1105 = ((Class) term1106).getDeclaredField((String) "INVALID");
        ((Field) term1105).setAccessible(true);
        Object enum5 = ((Field) term1105).get((Object) null);
        term1067 = newInstance(Class.forName("java.io.File"));
        setField(term1067, term1067.getClass(), "path", "RkybSrpybU");
        setField(term1067, term1067.getClass(), "status", enum5);
        setIntField(term1067, term1067.getClass(), "prefixLength", -1685132342);
        setField(term1067, term1067.getClass(), "filePath", null);
        term1092 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1067;
        args[1] = term1092;
        callMethod(klass, "newSeparatedFile", argTypes, null, args);
    }

};


