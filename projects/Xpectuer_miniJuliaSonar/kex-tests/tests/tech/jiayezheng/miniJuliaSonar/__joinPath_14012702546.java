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

public class __joinPath_14012702546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69488;

    public __joinPath_14012702546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69536 = Class.forName((String) "java.io.File$PathStatus");
        Field term69535 = ((Class) term69536).getDeclaredField((String) "INVALID");
        ((Field) term69535).setAccessible(true);
        Object enum214 = ((Field) term69535).get((Object) null);
        term69488 = newInstance(Class.forName("java.io.File"));
        setField(term69488, term69488.getClass(), "path", "URWnZtbrQH");
        setField(term69488, term69488.getClass(), "status", enum214);
        setIntField(term69488, term69488.getClass(), "prefixLength", -868676396);
        setField(term69488, term69488.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term69488;
        args[1] = "hpTAdtnQku";
        callMethod(klass, "joinPath", argTypes, null, args);
    }

};


