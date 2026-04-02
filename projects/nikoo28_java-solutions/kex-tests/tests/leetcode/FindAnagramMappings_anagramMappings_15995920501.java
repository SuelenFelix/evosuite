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
     Object term8314;
     Object term8315;
     Object term8316;

    public FindAnagramMappings_anagramMappings_15995920501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8314 = newInstance(Class.forName("leetcode.FindAnagramMappings"));
        term8315 = (int[]) newIntArray(0);
        term8316 = (int[]) newIntArray(5);
        setIntElement(term8316, 0, 1309545946);
        setIntElement(term8316, 1, -1457812682);
        setIntElement(term8316, 2, -161850441);
        setIntElement(term8316, 3, 1486351894);
        setIntElement(term8316, 4, 1352463113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.FindAnagramMappings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term8315;
        args[1] = term8316;
        callMethod(klass, "anagramMappings", argTypes, term8314, args);
    }

};


