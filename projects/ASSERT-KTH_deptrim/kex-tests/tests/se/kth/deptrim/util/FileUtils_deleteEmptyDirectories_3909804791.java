package se.kth.deptrim.util;

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
import static se.kth.deptrim.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FileUtils_deleteEmptyDirectories_3909804791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;

    public FileUtils_deleteEmptyDirectories_3909804791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("se.kth.deptrim.util.FileUtils"));
        setIntField(term7, term7.getClass(), "deletedDirectories", 568599855);
        Class<? extends Object> term67 = Class.forName((String) "java.io.File$PathStatus");
        Field term66 = ((Class) term67).getDeclaredField((String) "INVALID");
        ((Field) term66).setAccessible(true);
        Object enum0 = ((Field) term66).get((Object) null);
        term9 = newInstance(Class.forName("java.io.File"));
        setField(term9, term9.getClass(), "path", "PAEBtnZtTD");
        setField(term9, term9.getClass(), "status", enum0);
        setIntField(term9, term9.getClass(), "prefixLength", 1162663216);
        setField(term9, term9.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term9;
        callMethod(klass, "deleteEmptyDirectories", argTypes, term7, args);
    }

};


