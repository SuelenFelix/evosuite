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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class ExporterConfig_setDestinyFolder_7001276174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;
     Object term1522;

    public ExporterConfig_setDestinyFolder_7001276174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1558 = Class.forName((String) "java.io.File$PathStatus");
        Field term1557 = ((Class) term1558).getDeclaredField((String) "CHECKED");
        ((Field) term1557).setAccessible(true);
        Object enum7 = ((Field) term1557).get((Object) null);
        Object term1502 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1504 = newInstance(Class.forName("java.io.File"));
        setField(term1502, term1502.getClass(), "name", "");
        setField(term1504, term1504.getClass(), "path", null);
        setField(term1504, term1504.getClass(), "status", enum7);
        setIntField(term1504, term1504.getClass(), "prefixLength", 865208305);
        setField(term1504, term1504.getClass(), "filePath", null);
        setField(term1502, term1502.getClass(), "file", term1504);
        setIntField(term1502, term1502.getClass(), "order", -1275173084);
        ArrayList term1500 = new ArrayList();
        ((ArrayList) term1500).add(term1502);
        term1474 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term1475 = newInstance(Class.forName("java.io.File"));
        setField(term1475, term1475.getClass(), "path", "AijpHYOFuy");
        setField(term1475, term1475.getClass(), "status", enum7);
        setIntField(term1475, term1475.getClass(), "prefixLength", 590364439);
        setField(term1475, term1475.getClass(), "filePath", null);
        setField(term1474, term1474.getClass(), "destinyFolder", term1475);
        setField(term1474, term1474.getClass(), "mdfiles", term1500);
        setBooleanField(term1474, term1474.getClass(), "uniqueFile", false);
        setField(term1474, term1474.getClass(), "outputFileName", "Ghbwtircqb");
        Class<? extends Object> term1721 = Class.forName((String) "java.io.File$PathStatus");
        Field term1720 = ((Class) term1721).getDeclaredField((String) "INVALID");
        ((Field) term1720).setAccessible(true);
        Object enum8 = ((Field) term1720).get((Object) null);
        term1522 = newInstance(Class.forName("java.io.File"));
        setField(term1522, term1522.getClass(), "path", "xrwlQZdwCp");
        setField(term1522, term1522.getClass(), "status", enum8);
        setIntField(term1522, term1522.getClass(), "prefixLength", -244121226);
        setField(term1522, term1522.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1522;
        callMethod(klass, "setDestinyFolder", argTypes, term1474, args);
    }

};


