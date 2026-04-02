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

public class Slugify_customReplacements_10383231617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5397;

    public Slugify_customReplacements_10383231617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5398 = new HashMap();
        HashMap term5403 = new HashMap();
        term5397 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term5397, term5397.getClass(), "customReplacements", term5398);
        setField(term5397, term5397.getClass(), "builtinReplacements", term5403);
        setBooleanField(term5397, term5397.getClass(), "underscoreSeparator", true);
        setBooleanField(term5397, term5397.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "customReplacements", argTypes, term5397, args);
    }

};


