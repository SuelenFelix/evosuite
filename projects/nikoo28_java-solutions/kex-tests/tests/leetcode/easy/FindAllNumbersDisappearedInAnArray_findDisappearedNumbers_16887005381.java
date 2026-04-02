package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FindAllNumbersDisappearedInAnArray_findDisappearedNumbers_16887005381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593;
     Object term594;

    public FindAllNumbersDisappearedInAnArray_findDisappearedNumbers_16887005381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term593 = newInstance(Class.forName("leetcode.easy.FindAllNumbersDisappearedInAnArray"));
        term594 = (int[]) newIntArray(3);
        setIntElement(term594, 0, 568954359);
        setIntElement(term594, 1, 53410913);
        setIntElement(term594, 2, -375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.FindAllNumbersDisappearedInAnArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term594;
        callMethod(klass, "findDisappearedNumbers", argTypes, term593, args);
    }

};


