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

public class Slugify_matchAndReplace_211517141515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11582;

    public Slugify_matchAndReplace_211517141515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11583 = new HashMap();
        HashMap term11588 = new HashMap();
        term11582 = newInstance(Class.forName("in.cubestack.apps.blog.util.Slugify"));
        setField(term11582, term11582.getClass(), "customReplacements", term11583);
        setField(term11582, term11582.getClass(), "builtinReplacements", term11588);
        setBooleanField(term11582, term11582.getClass(), "underscoreSeparator", false);
        setBooleanField(term11582, term11582.getClass(), "lowerCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.util.Slugify");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tbcdzjIfER";
        callMethod(klass, "matchAndReplace", argTypes, term11582, args);
    }

};


