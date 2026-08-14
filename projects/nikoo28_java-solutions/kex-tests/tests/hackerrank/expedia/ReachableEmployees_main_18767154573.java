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

public class ReachableEmployees_main_18767154573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public ReachableEmployees_main_18767154573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = (Object[]) newArray("java.lang.String", 9);
        setElement(term98, 0, "PAEBtnZtTD");
        setElement(term98, 1, "sjlJAEtRrb");
        setElement(term98, 2, "MuLcgQHgqz");
        setElement(term98, 3, "xxtlPwDYFs");
        setElement(term98, 4, "jJCZpVmanW");
        setElement(term98, 5, "EGtDIRbSSb");
        setElement(term98, 6, "SzjVpOQTyS");
        setElement(term98, 7, "MjGYSRKTNF");
        setElement(term98, 8, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.ReachableEmployees");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98;
        callMethod(klass, "main", argTypes, null, args);
    }

};


