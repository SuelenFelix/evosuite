package cn.edu.sustech.cs307.util;

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
import static cn.edu.sustech.cs307.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ProjectJudge_readValueFromFile_98994364213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2018;

    public ProjectJudge_readValueFromFile_98994364213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2054 = Class.forName((String) "java.io.File$PathStatus");
        Field term2053 = ((Class) term2054).getDeclaredField((String) "INVALID");
        ((Field) term2053).setAccessible(true);
        Object enum3 = ((Field) term2053).get((Object) null);
        term2018 = newInstance(Class.forName("java.io.File"));
        setField(term2018, term2018.getClass(), "path", "UuYWMTqWTV");
        setField(term2018, term2018.getClass(), "status", enum3);
        setIntField(term2018, term2018.getClass(), "prefixLength", -2005784375);
        setField(term2018, term2018.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term2018;
        args[1] = null;
        callMethod(klass, "readValueFromFile", argTypes, null, args);
    }

};


