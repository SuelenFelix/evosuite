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

public class Slugify_slugify_14300323444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2762;

    public Slugify_slugify_14300323444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2763 = new HashMap();
        HashMap term2768 = new HashMap();
        term2762 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term2762, term2762.getClass(), "customReplacements", term2763);
        setField(term2762, term2762.getClass(), "builtinReplacements", term2768);
        setBooleanField(term2762, term2762.getClass(), "underscoreSeparator", true);
        setBooleanField(term2762, term2762.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "slugify", argTypes, term2762, args);
    }

};


