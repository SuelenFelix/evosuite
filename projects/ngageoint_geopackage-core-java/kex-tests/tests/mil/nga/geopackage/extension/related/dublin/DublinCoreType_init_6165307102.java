package mil.nga.geopackage.extension.related.dublin;

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
import static mil.nga.geopackage.extension.related.dublin.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DublinCoreType_init_6165307102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2273;

    public DublinCoreType_init_6165307102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2273 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2273, 0, "MuLcgQHgqz");
        setElement(term2273, 1, "xxtlPwDYFs");
        setElement(term2273, 2, "jJCZpVmanW");
        setElement(term2273, 3, "EGtDIRbSSb");
        setElement(term2273, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.dublin.DublinCoreType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = "sjlJAEtRrb";
        args[1] = term2273;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


