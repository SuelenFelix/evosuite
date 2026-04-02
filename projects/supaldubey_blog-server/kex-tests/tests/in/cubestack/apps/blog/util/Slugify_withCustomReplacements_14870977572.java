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
import java.util.LinkedHashMap;

public class Slugify_withCustomReplacements_14870977572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;
     Object term1798;

    public Slugify_withCustomReplacements_14870977572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term928 = new HashMap();
        HashMap term933 = new HashMap();
        term927 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term927, term927.getClass(), "customReplacements", term928);
        setField(term927, term927.getClass(), "builtinReplacements", term933);
        setBooleanField(term927, term927.getClass(), "underscoreSeparator", false);
        setBooleanField(term927, term927.getClass(), "lowerCase", true);
        term1798 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1798;
        callMethod(klass, "withCustomReplacements", argTypes, term927, args);
    }

};


