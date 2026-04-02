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
import java.lang.Object;

public class __debugf_22140103854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70214;

    public __debugf_22140103854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70214 = (Object[]) newArray("java.lang.Object", 7);
        Object term70215 = newInstance(Class.forName("java.lang.Object"));
        Object term70216 = newInstance(Class.forName("java.lang.Object"));
        Object term70217 = newInstance(Class.forName("java.lang.Object"));
        Object term70218 = newInstance(Class.forName("java.lang.Object"));
        Object term70219 = newInstance(Class.forName("java.lang.Object"));
        Object term70220 = newInstance(Class.forName("java.lang.Object"));
        Object term70221 = newInstance(Class.forName("java.lang.Object"));
        setElement(term70214, 0, term70215);
        setElement(term70214, 1, term70216);
        setElement(term70214, 2, term70217);
        setElement(term70214, 3, term70218);
        setElement(term70214, 4, term70219);
        setElement(term70214, 5, term70220);
        setElement(term70214, 6, term70221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "oFBhNamtAs";
        args[1] = term70214;
        callMethod(klass, "debugf", argTypes, null, args);
    }

};


