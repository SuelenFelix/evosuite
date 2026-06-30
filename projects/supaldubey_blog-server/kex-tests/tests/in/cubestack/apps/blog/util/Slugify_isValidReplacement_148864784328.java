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

public class Slugify_isValidReplacement_148864784328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12510;

    public Slugify_isValidReplacement_148864784328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12510 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term12510, term12510.getClass(), "customReplacements", null);
        setField(term12510, term12510.getClass(), "builtinReplacements", null);
        setBooleanField(term12510, term12510.getClass(), "underscoreSeparator", false);
        setBooleanField(term12510, term12510.getClass(), "lowerCase", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map$Entry");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "isValidReplacement", argTypes, term12510, args);
    }

};


