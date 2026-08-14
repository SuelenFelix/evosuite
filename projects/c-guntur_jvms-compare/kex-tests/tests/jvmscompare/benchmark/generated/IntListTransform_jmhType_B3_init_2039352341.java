package jvmscompare.benchmark.generated;

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
import static jvmscompare.benchmark.generated.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IntListTransform_jmhType_B3_init_2039352341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public IntListTransform_jmhType_B3_init_2039352341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("jvmscompare.benchmark.generated.IntListTransform_jmhType_B3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
    }

};


