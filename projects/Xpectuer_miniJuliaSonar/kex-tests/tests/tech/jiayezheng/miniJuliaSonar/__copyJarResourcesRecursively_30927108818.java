package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class __copyJarResourcesRecursively_30927108818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65434;

    public __copyJarResourcesRecursively_30927108818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65470 = Class.forName((String) "java.io.File$PathStatus");
        Field term65469 = ((Class) term65470).getDeclaredField((String) "INVALID");
        ((Field) term65469).setAccessible(true);
        Object enum211 = ((Field) term65469).get((Object) null);
        term65434 = newInstance(Class.forName("java.io.File"));
        setField(term65434, term65434.getClass(), "path", "sEGgJJplmE");
        setField(term65434, term65434.getClass(), "status", enum211);
        setIntField(term65434, term65434.getClass(), "prefixLength", 798043553);
        setField(term65434, term65434.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.net.JarURLConnection");
        Object[] args = new Object[2];
        args[0] = term65434;
        args[1] = null;
        callMethod(klass, "copyJarResourcesRecursively", argTypes, null, args);
    }

};


