package hackerrank.expedia;

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
import static hackerrank.expedia.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Braces_main_4637472893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public Braces_main_4637472893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395 = (Object[]) newArray("java.lang.String", 7);
        setElement(term395, 0, "LQFpaHEwXR");
        setElement(term395, 1, "oVcInYnLWB");
        setElement(term395, 2, "aJlieCFVtF");
        setElement(term395, 3, "ZiaGIbnzTs");
        setElement(term395, 4, "tbcdzjIfER");
        setElement(term395, 5, "HyxfbSQYBe");
        setElement(term395, 6, "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.Braces");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term395;
        callMethod(klass, "main", argTypes, null, args);
    }

};


