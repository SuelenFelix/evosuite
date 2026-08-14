package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FindAnagramMappings_anagramMappings_15995920501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8517;
     Object term8518;
     Object term8522;

    public FindAnagramMappings_anagramMappings_15995920501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8517 = newInstance(Class.forName("leetcode.FindAnagramMappings"));
        term8518 = (int[]) newIntArray(3);
        setIntElement(term8518, 0, 251039122);
        setIntElement(term8518, 1, 459471826);
        setIntElement(term8518, 2, -1054011286);
        term8522 = (int[]) newIntArray(5);
        setIntElement(term8522, 0, -1640361091);
        setIntElement(term8522, 1, -1908164516);
        setIntElement(term8522, 2, -1343269854);
        setIntElement(term8522, 3, -731459309);
        setIntElement(term8522, 4, -913468095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FindAnagramMappings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term8518;
        args[1] = term8522;
        callMethod(klass, "anagramMappings", argTypes, term8517, args);
    }

};


