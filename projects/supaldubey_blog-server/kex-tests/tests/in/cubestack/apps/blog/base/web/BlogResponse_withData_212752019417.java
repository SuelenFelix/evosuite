package in.cubestack.apps.blog.base.web;

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
import static in.cubestack.apps.blog.base.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BlogResponse_withData_212752019417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349;

    public BlogResponse_withData_212752019417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.BlogResponse"));
        setBooleanField(term349, term349.getClass(), "success", false);
        setField(term349, term349.getClass(), "data", null);
        setField(term349, term349.getClass(), "error", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.web.BlogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withData", argTypes, term349, args);
    }

};


