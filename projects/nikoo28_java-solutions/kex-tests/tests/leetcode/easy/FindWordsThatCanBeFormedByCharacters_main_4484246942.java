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
import java.lang.Object;

public class FindWordsThatCanBeFormedByCharacters_main_4484246942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2476;

    public FindWordsThatCanBeFormedByCharacters_main_4484246942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2476 = (Object[]) newArray("java.lang.String", 2);
        setElement(term2476, 0, "dEnhdmILtU");
        setElement(term2476, 1, "hoicvmsovO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.FindWordsThatCanBeFormedByCharacters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2476;
        callMethod(klass, "main", argTypes, null, args);
    }

};


