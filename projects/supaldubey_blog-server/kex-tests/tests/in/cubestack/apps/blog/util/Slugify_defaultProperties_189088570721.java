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

public class Slugify_defaultProperties_189088570721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12489;

    public Slugify_defaultProperties_189088570721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12489 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term12489, term12489.getClass(), "customReplacements", null);
        setField(term12489, term12489.getClass(), "builtinReplacements", null);
        setBooleanField(term12489, term12489.getClass(), "underscoreSeparator", false);
        setBooleanField(term12489, term12489.getClass(), "lowerCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "defaultProperties", argTypes, term12489, args);
    }

};


