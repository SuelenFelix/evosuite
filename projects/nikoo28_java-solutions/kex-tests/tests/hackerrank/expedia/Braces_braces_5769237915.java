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

public class Braces_braces_5769237915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;

    public Braces_braces_5769237915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550 = newInstance(Class.forName("hackerrank.expedia.Braces"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.expedia.Braces");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "braces", argTypes, term550, args);
    }

};


