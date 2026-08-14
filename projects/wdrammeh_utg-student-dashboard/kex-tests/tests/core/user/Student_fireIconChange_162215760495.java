package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Student_fireIconChange_162215760495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297779;

    public Student_fireIconChange_162215760495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term297837 = Class.forName((String) "java.io.File$PathStatus");
        Field term297836 = ((Class) term297837).getDeclaredField((String) "INVALID");
        ((Field) term297836).setAccessible(true);
        Object enum0 = ((Field) term297836).get((Object) null);
        term297779 = newInstance(Class.forName("java.io.File"));
        setField(term297779, term297779.getClass(), "path", "qkMduZHBXR");
        setField(term297779, term297779.getClass(), "status", enum0);
        setIntField(term297779, term297779.getClass(), "prefixLength", -164869996);
        setField(term297779, term297779.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.awt.Component");
        Object[] args = new Object[2];
        args[0] = term297779;
        args[1] = null;
        callMethod(klass, "fireIconChange", argTypes, null, args);
    }

};


