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

public class Slugify_loadReplacements_10923530569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7183;

    public Slugify_loadReplacements_10923530569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7184 = new HashMap();
        HashMap term7189 = new HashMap();
        term7183 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term7183, term7183.getClass(), "customReplacements", term7184);
        setField(term7183, term7183.getClass(), "builtinReplacements", term7189);
        setBooleanField(term7183, term7183.getClass(), "underscoreSeparator", true);
        setBooleanField(term7183, term7183.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loadReplacements", argTypes, term7183, args);
    }

};


