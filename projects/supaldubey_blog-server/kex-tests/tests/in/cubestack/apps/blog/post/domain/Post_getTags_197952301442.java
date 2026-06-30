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

public class Post_getTags_197952301442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81787;

    public Post_getTags_197952301442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81787 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Post"));
        setField(term81787, term81787.getClass(), "author", null);
        setField(term81787, term81787.getClass(), "title", null);
        setField(term81787, term81787.getClass(), "metaTitle", null);
        setField(term81787, term81787.getClass(), "summary", null);
        setField(term81787, term81787.getClass(), "slug", null);
        setField(term81787, term81787.getClass(), "postType", null);
        setField(term81787, term81787.getClass(), "postStatus", null);
        setField(term81787, term81787.getClass(), "publishedAt", null);
        setField(term81787, term81787.getClass(), "content", null);
        setField(term81787, term81787.getClass(), "postAnalytics", null);
        setField(term81787, term81787.getClass(), "postComments", null);
        setField(term81787, term81787.getClass(), "postCategories", null);
        setField(term81787, term81787.getClass(), "postTags", null);
        setField(term81787, term81787.getClass(), "htmlContent", null);
        setField(term81787, term81787.getClass(), "id", null);
        setField(term81787, term81787.getClass(), "createdAt", null);
        setField(term81787, term81787.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTags", argTypes, term81787, args);
    }

};


