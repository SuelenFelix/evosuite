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

public class Braces_braces_5769237911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public Braces_braces_5769237911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = (Object[]) newArray("java.lang.String", 9);
        setElement(term91, 0, "PAEBtnZtTD");
        setElement(term91, 1, "sjlJAEtRrb");
        setElement(term91, 2, "MuLcgQHgqz");
        setElement(term91, 3, "xxtlPwDYFs");
        setElement(term91, 4, "jJCZpVmanW");
        setElement(term91, 5, "EGtDIRbSSb");
        setElement(term91, 6, "SzjVpOQTyS");
        setElement(term91, 7, "MjGYSRKTNF");
        setElement(term91, 8, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.Braces");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91;
        callMethod(klass, "braces", argTypes, null, args);
    }

};


