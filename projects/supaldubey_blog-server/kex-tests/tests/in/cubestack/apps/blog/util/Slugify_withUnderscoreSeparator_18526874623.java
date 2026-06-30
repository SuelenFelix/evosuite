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
import java.lang.Boolean;

public class Slugify_withUnderscoreSeparator_18526874623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889;
     Object term2760;

    public Slugify_withUnderscoreSeparator_18526874623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1890 = new HashMap();
        HashMap term1895 = new HashMap();
        term1889 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term1889, term1889.getClass(), "customReplacements", term1890);
        setField(term1889, term1889.getClass(), "builtinReplacements", term1895);
        setBooleanField(term1889, term1889.getClass(), "underscoreSeparator", false);
        setBooleanField(term1889, term1889.getClass(), "lowerCase", true);
        term2760 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2760;
        callMethod(klass, "withUnderscoreSeparator", argTypes, term1889, args);
    }

};


