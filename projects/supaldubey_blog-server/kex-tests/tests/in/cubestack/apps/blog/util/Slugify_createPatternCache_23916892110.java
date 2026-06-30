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
import java.util.HashMap;

public class Slugify_createPatternCache_23916892110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8054;

    public Slugify_createPatternCache_23916892110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8055 = new HashMap();
        HashMap term8060 = new HashMap();
        term8054 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term8054, term8054.getClass(), "customReplacements", term8055);
        setField(term8054, term8054.getClass(), "builtinReplacements", term8060);
        setBooleanField(term8054, term8054.getClass(), "underscoreSeparator", false);
        setBooleanField(term8054, term8054.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPatternCache", argTypes, term8054, args);
    }

};


