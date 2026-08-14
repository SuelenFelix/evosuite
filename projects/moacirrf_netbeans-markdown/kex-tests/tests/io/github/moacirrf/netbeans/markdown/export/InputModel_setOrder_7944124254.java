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
import java.lang.Integer;

public class InputModel_setOrder_7944124254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4068;
     Object term4107;

    public InputModel_setOrder_7944124254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4130 = Class.forName((String) "java.io.File$PathStatus");
        Field term4129 = ((Class) term4130).getDeclaredField((String) "INVALID");
        ((Field) term4129).setAccessible(true);
        Object enum19 = ((Field) term4129).get((Object) null);
        term4068 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term4081 = newInstance(Class.forName("java.io.File"));
        setField(term4068, term4068.getClass(), "name", "mXGCWJDOqA");
        setField(term4081, term4081.getClass(), "path", "dpNsDgfPso");
        setField(term4081, term4081.getClass(), "status", enum19);
        setIntField(term4081, term4081.getClass(), "prefixLength", -663691365);
        setField(term4081, term4081.getClass(), "filePath", null);
        setField(term4068, term4068.getClass(), "file", term4081);
        setIntField(term4068, term4068.getClass(), "order", 339854490);
        term4107 = new Integer(-615654495);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4107;
        callMethod(klass, "setOrder", argTypes, term4068, args);
    }

};


