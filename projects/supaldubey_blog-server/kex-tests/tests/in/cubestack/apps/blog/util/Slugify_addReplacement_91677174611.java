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

public class Slugify_addReplacement_91677174611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8925;

    public Slugify_addReplacement_91677174611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8926 = new HashMap();
        HashMap term8931 = new HashMap();
        term8925 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term8925, term8925.getClass(), "customReplacements", term8926);
        setField(term8925, term8925.getClass(), "builtinReplacements", term8931);
        setBooleanField(term8925, term8925.getClass(), "underscoreSeparator", true);
        setBooleanField(term8925, term8925.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addReplacement", argTypes, term8925, args);
    }

};


