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

public class BlogResponse_getError_18569438566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;

    public BlogResponse_getError_18569438566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.BlogResponse"));
        Object term243 = newInstance(Class.forName("java.lang.Object"));
        Object term244 = newInstance(Class.forName("in.cubestack.apps.blog.base.web.Error"));
        setBooleanField(term241, term241.getClass(), "success", true);
        setField(term241, term241.getClass(), "data", term243);
        setField(term244, term244.getClass(), "code", "NRdvgJlhkX");
        setField(term244, term244.getClass(), "message", "uuaPigETmJ");
        setField(term241, term241.getClass(), "error", term244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.base.web.BlogResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getError", argTypes, term241, args);
    }

};


