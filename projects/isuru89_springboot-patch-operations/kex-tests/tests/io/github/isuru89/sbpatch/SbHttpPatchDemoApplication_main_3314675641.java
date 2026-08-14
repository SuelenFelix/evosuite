package io.github.isuru89.sbpatch;

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
import static io.github.isuru89.sbpatch.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SbHttpPatchDemoApplication_main_3314675641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public SbHttpPatchDemoApplication_main_3314675641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = (Object[]) newArray("java.lang.String", 3);
        setElement(term222, 0, "tbcdzjIfER");
        setElement(term222, 1, "HyxfbSQYBe");
        setElement(term222, 2, "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.SbHttpPatchDemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term222;
        callMethod(klass, "main", argTypes, null, args);
    }

};


