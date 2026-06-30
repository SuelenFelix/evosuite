package in.cubestack.apps.blog.post.web;

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
import static in.cubestack.apps.blog.post.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PostResource_update_6160802328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3494;

    public PostResource_update_6160802328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3494 = newInstance(Class.forName("in.cubestack.apps.blog.post.web.PostResource"));
        setField(term3494, term3494.getClass(), "postService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.web.PostResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "update", argTypes, term3494, args);
    }

};


