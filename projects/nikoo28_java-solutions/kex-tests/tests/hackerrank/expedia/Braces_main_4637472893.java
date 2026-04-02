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
     Object term312;

    public Braces_main_4637472893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = (Object[]) newArray("java.lang.String", 9);
        setElement(term312, 0, "NRdvgJlhkX");
        setElement(term312, 1, "uuaPigETmJ");
        setElement(term312, 2, "MxlszYVzRf");
        setElement(term312, 3, "LQFpaHEwXR");
        setElement(term312, 4, "oVcInYnLWB");
        setElement(term312, 5, "aJlieCFVtF");
        setElement(term312, 6, "ZiaGIbnzTs");
        setElement(term312, 7, "tbcdzjIfER");
        setElement(term312, 8, "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.Braces");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term312;
        callMethod(klass, "main", argTypes, null, args);
    }

};


