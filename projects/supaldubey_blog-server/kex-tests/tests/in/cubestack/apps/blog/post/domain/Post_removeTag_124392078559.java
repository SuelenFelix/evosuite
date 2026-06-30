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

public class Post_removeTag_124392078559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81804;

    public Post_removeTag_124392078559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81804 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Post"));
        setField(term81804, term81804.getClass(), "author", null);
        setField(term81804, term81804.getClass(), "title", null);
        setField(term81804, term81804.getClass(), "metaTitle", null);
        setField(term81804, term81804.getClass(), "summary", null);
        setField(term81804, term81804.getClass(), "slug", null);
        setField(term81804, term81804.getClass(), "postType", null);
        setField(term81804, term81804.getClass(), "postStatus", null);
        setField(term81804, term81804.getClass(), "publishedAt", null);
        setField(term81804, term81804.getClass(), "content", null);
        setField(term81804, term81804.getClass(), "postAnalytics", null);
        setField(term81804, term81804.getClass(), "postComments", null);
        setField(term81804, term81804.getClass(), "postCategories", null);
        setField(term81804, term81804.getClass(), "postTags", null);
        setField(term81804, term81804.getClass(), "htmlContent", null);
        setField(term81804, term81804.getClass(), "id", null);
        setField(term81804, term81804.getClass(), "createdAt", null);
        setField(term81804, term81804.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeTag", argTypes, term81804, args);
    }

};


