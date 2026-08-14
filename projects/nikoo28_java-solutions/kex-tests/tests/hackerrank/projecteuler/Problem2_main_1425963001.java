package hackerrank.projecteuler;

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
import static hackerrank.projecteuler.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Problem2_main_1425963001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;

    public Problem2_main_1425963001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = (Object[]) newArray("java.lang.String", 6);
        setElement(term292, 0, "MxlszYVzRf");
        setElement(term292, 1, "LQFpaHEwXR");
        setElement(term292, 2, "oVcInYnLWB");
        setElement(term292, 3, "aJlieCFVtF");
        setElement(term292, 4, "ZiaGIbnzTs");
        setElement(term292, 5, "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.projecteuler.Problem2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "main", argTypes, null, args);
    }

};


