package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Tag_setSlug_34763234117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16987;

    public Tag_setSlug_34763234117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16987 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        setField(term16987, term16987.getClass(), "title", null);
        setField(term16987, term16987.getClass(), "slug", null);
        setField(term16987, term16987.getClass(), "content", null);
        setField(term16987, term16987.getClass(), "id", null);
        setField(term16987, term16987.getClass(), "createdAt", null);
        setField(term16987, term16987.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSlug", argTypes, term16987, args);
    }

};


