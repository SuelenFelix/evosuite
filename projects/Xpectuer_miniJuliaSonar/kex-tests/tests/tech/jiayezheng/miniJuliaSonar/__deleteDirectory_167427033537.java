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

public class __deleteDirectory_167427033537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68712;

    public __deleteDirectory_167427033537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68748 = Class.forName((String) "java.io.File$PathStatus");
        Field term68747 = ((Class) term68748).getDeclaredField((String) "CHECKED");
        ((Field) term68747).setAccessible(true);
        Object enum212 = ((Field) term68747).get((Object) null);
        term68712 = newInstance(Class.forName("java.io.File"));
        setField(term68712, term68712.getClass(), "path", "SAglaHkagn");
        setField(term68712, term68712.getClass(), "status", enum212);
        setIntField(term68712, term68712.getClass(), "prefixLength", 1048271679);
        setField(term68712, term68712.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term68712;
        callMethod(klass, "deleteDirectory", argTypes, null, args);
    }

};


