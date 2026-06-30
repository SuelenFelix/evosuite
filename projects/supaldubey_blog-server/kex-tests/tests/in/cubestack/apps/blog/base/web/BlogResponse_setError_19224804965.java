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
import java.lang.Object;

public class BlogResponse_setError_19224804965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term176;

    public BlogResponse_setError_19224804965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.BlogResponse"));
        Object term150 = newInstance(Class.forName("java.lang.Object"));
        Object term151 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.Error"));
        setBooleanField(term148, term148.getClass(), "success", true);
        setField(term148, term148.getClass(), "data", term150);
        setField(term151, term151.getClass(), "code", "SzjVpOQTyS");
        setField(term151, term151.getClass(), "message", "MjGYSRKTNF");
        setField(term148, term148.getClass(), "error", term151);
        term176 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.Error"));
        setField(term176, term176.getClass(), "code", "hRNSzYYIrc");
        setField(term176, term176.getClass(), "message", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.web.BlogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.base.web.Error");
        Object[] args = new Object[1];
        args[0] = term176;
        callMethod(klass, "setError", argTypes, term148, args);
    }

};


