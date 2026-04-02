package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PermutationsII_permuteUnique_1455495931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3483;
     Object term3484;

    public PermutationsII_permuteUnique_1455495931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3483 = newInstance(Class.forName("leetcode.medium.PermutationsII"));
        term3484 = (int[]) newIntArray(7);
        setIntElement(term3484, 0, -1769933499);
        setIntElement(term3484, 1, -1510932472);
        setIntElement(term3484, 2, 1970654816);
        setIntElement(term3484, 3, 1354781442);
        setIntElement(term3484, 4, -393590701);
        setIntElement(term3484, 5, 86344574);
        setIntElement(term3484, 6, -829441157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.PermutationsII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3484;
        callMethod(klass, "permuteUnique", argTypes, term3483, args);
    }

};


