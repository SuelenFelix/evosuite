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

public class MissingNumber_missingNumber_18765963571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5796;
     Object term5797;

    public MissingNumber_missingNumber_18765963571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5796 = newInstance(Class.forName("leetcode.MissingNumber"));
        term5797 = (int[]) newIntArray(5);
        setIntElement(term5797, 0, -1162790806);
        setIntElement(term5797, 1, -1264595049);
        setIntElement(term5797, 2, -2058884635);
        setIntElement(term5797, 3, 1064185088);
        setIntElement(term5797, 4, -1249782654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MissingNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5797;
        callMethod(klass, "missingNumber", argTypes, term5796, args);
    }

};


