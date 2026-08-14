package au.csiro.fhir.owl.util;

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
import static au.csiro.fhir.owl.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FileUtils_delete_15319446891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;

    public FileUtils_delete_15319446891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term171 = Class.forName((String) "java.io.File$PathStatus");
        Field term170 = ((Class) term171).getDeclaredField((String) "INVALID");
        ((Field) term170).setAccessible(true);
        Object enum0 = ((Field) term170).get((Object) null);
        term113 = newInstance(Class.forName("java.io.File"));
        setField(term113, term113.getClass(), "path", "PAEBtnZtTD");
        setField(term113, term113.getClass(), "status", enum0);
        setIntField(term113, term113.getClass(), "prefixLength", 568599855);
        setField(term113, term113.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("au.csiro.fhir.owl.util.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "delete", argTypes, null, args);
    }

};


