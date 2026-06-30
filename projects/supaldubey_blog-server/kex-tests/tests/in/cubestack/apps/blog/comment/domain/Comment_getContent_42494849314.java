package in.cubestack.apps.blog.comment.domain;

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
import static in.cubestack.apps.blog.comment.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Comment_getContent_42494849314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3317;

    public Comment_getContent_42494849314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3317 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        setField(term3317, term3317.getClass(), "title", null);
        setField(term3317, term3317.getClass(), "commenterId", null);
        setField(term3317, term3317.getClass(), "status", null);
        setField(term3317, term3317.getClass(), "content", null);
        setField(term3317, term3317.getClass(), "publishedAt", null);
        setField(term3317, term3317.getClass(), "id", null);
        setField(term3317, term3317.getClass(), "createdAt", null);
        setField(term3317, term3317.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term3317, args);
    }

};


