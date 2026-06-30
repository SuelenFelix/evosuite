package kyungseo.poc.simple.web.appcore.util;

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
import static kyungseo.poc.simple.web.appcore.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtil_arrayToDelimitedString_12288602437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1932;

    public StringUtil_arrayToDelimitedString_12288602437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1932 = (Object[]) newArray("java.lang.Object", 6);
        Object term1933 = newInstance(Class.forName("java.lang.Object"));
        Object term1934 = newInstance(Class.forName("java.lang.Object"));
        Object term1935 = newInstance(Class.forName("java.lang.Object"));
        Object term1936 = newInstance(Class.forName("java.lang.Object"));
        Object term1937 = newInstance(Class.forName("java.lang.Object"));
        Object term1938 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1932, 0, term1933);
        setElement(term1932, 1, term1934);
        setElement(term1932, 2, term1935);
        setElement(term1932, 3, term1936);
        setElement(term1932, 4, term1937);
        setElement(term1932, 5, term1938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.util.StringUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1932;
        callMethod(klass, "arrayToDelimitedString", argTypes, null, args);
    }

};


