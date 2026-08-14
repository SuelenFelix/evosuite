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
     Object term70220;

    public __debugf_22140103854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70220 = (Object[]) newArray("java.lang.Object", 7);
        Object term70221 = newInstance(Class.forName("java.lang.Object"));
        Object term70222 = newInstance(Class.forName("java.lang.Object"));
        Object term70223 = newInstance(Class.forName("java.lang.Object"));
        Object term70224 = newInstance(Class.forName("java.lang.Object"));
        Object term70225 = newInstance(Class.forName("java.lang.Object"));
        Object term70226 = newInstance(Class.forName("java.lang.Object"));
        Object term70227 = newInstance(Class.forName("java.lang.Object"));
        setElement(term70220, 0, term70221);
        setElement(term70220, 1, term70222);
        setElement(term70220, 2, term70223);
        setElement(term70220, 3, term70224);
        setElement(term70220, 4, term70225);
        setElement(term70220, 5, term70226);
        setElement(term70220, 6, term70227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "oFBhNamtAs";
        args[1] = term70220;
        callMethod(klass, "debugf", argTypes, null, args);
    }

};


