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

public class BlogResponse_setData_18478198004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term127;

    public BlogResponse_setData_18478198004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.BlogResponse"));
        Object term101 = newInstance(Class.forName("java.lang.Object"));
        Object term102 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.Error"));
        setBooleanField(term99, term99.getClass(), "success", false);
        setField(term99, term99.getClass(), "data", term101);
        setField(term102, term102.getClass(), "code", "jJCZpVmanW");
        setField(term102, term102.getClass(), "message", "EGtDIRbSSb");
        setField(term99, term99.getClass(), "error", term102);
        term127 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.web.BlogResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127;
        callMethod(klass, "setData", argTypes, term99, args);
    }

};


