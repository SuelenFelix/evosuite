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
import java.lang.Boolean;

public class Slugify_withUnderscoreSeparator_185268746219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12481;
     Object term12484;

    public Slugify_withUnderscoreSeparator_185268746219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12481 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term12481, term12481.getClass(), "customReplacements", null);
        setField(term12481, term12481.getClass(), "builtinReplacements", null);
        setBooleanField(term12481, term12481.getClass(), "underscoreSeparator", false);
        setBooleanField(term12481, term12481.getClass(), "lowerCase", false);
        term12484 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term12484;
        callMethod(klass, "withUnderscoreSeparator", argTypes, term12481, args);
    }

};


