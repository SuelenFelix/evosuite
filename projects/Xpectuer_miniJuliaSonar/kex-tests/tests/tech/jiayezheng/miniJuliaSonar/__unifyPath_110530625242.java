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

public class __unifyPath_110530625242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69228;

    public __unifyPath_110530625242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69264 = Class.forName((String) "java.io.File$PathStatus");
        Field term69263 = ((Class) term69264).getDeclaredField((String) "INVALID");
        ((Field) term69263).setAccessible(true);
        Object enum213 = ((Field) term69263).get((Object) null);
        term69228 = newInstance(Class.forName("java.io.File"));
        setField(term69228, term69228.getClass(), "path", "esbhDGQDgF");
        setField(term69228, term69228.getClass(), "status", enum213);
        setIntField(term69228, term69228.getClass(), "prefixLength", -1529797673);
        setField(term69228, term69228.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term69228;
        callMethod(klass, "unifyPath", argTypes, null, args);
    }

};


