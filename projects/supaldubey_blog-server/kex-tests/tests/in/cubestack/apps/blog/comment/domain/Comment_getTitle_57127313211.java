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

public class Comment_getTitle_57127313211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3314;

    public Comment_getTitle_57127313211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3314 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        setField(term3314, term3314.getClass(), "title", null);
        setField(term3314, term3314.getClass(), "commenterId", null);
        setField(term3314, term3314.getClass(), "status", null);
        setField(term3314, term3314.getClass(), "content", null);
        setField(term3314, term3314.getClass(), "publishedAt", null);
        setField(term3314, term3314.getClass(), "id", null);
        setField(term3314, term3314.getClass(), "createdAt", null);
        setField(term3314, term3314.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3314, args);
    }

};


