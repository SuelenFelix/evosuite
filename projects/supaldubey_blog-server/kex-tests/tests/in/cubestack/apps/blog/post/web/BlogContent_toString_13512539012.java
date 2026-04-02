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
import java.lang.String;
import java.lang.Object;

public class BlogContent_toString_13512539012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4467;

    public BlogContent_toString_13512539012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4477 = Class.forName((String) "in.cubestack.apps.blog.post.web.BlogContent$ContentType");
        Field term4476 = ((Class) term4477).getDeclaredField((String) "TAG");
        ((Field) term4476).setAccessible(true);
        Object enum11 = ((Field) term4476).get((Object) null);
        term4467 = newInstance(Class.forName("in.cubestack.apps.blog.post.web.BlogContent"));
        Object term4475 = newInstance(Class.forName("java.lang.Object"));
        setField(term4467, term4467.getClass(), "type", enum11);
        setField(term4467, term4467.getClass(), "content", term4475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.web.BlogContent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4467, args);
    }

};


