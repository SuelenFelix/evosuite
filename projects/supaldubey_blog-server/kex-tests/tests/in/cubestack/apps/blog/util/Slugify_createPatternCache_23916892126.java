package in.cubestack.apps.blog.util;

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
import static in.cubestack.apps.blog.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Slugify_createPatternCache_23916892126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12504;

    public Slugify_createPatternCache_23916892126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12504 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term12504, term12504.getClass(), "customReplacements", null);
        setField(term12504, term12504.getClass(), "builtinReplacements", null);
        setBooleanField(term12504, term12504.getClass(), "underscoreSeparator", false);
        setBooleanField(term12504, term12504.getClass(), "lowerCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPatternCache", argTypes, term12504, args);
    }

};


