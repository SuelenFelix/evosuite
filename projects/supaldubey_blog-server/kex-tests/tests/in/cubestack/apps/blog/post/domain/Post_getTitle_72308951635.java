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

public class Post_getTitle_72308951635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81780;

    public Post_getTitle_72308951635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81780 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Post"));
        setField(term81780, term81780.getClass(), "author", null);
        setField(term81780, term81780.getClass(), "title", null);
        setField(term81780, term81780.getClass(), "metaTitle", null);
        setField(term81780, term81780.getClass(), "summary", null);
        setField(term81780, term81780.getClass(), "slug", null);
        setField(term81780, term81780.getClass(), "postType", null);
        setField(term81780, term81780.getClass(), "postStatus", null);
        setField(term81780, term81780.getClass(), "publishedAt", null);
        setField(term81780, term81780.getClass(), "content", null);
        setField(term81780, term81780.getClass(), "postAnalytics", null);
        setField(term81780, term81780.getClass(), "postComments", null);
        setField(term81780, term81780.getClass(), "postCategories", null);
        setField(term81780, term81780.getClass(), "postTags", null);
        setField(term81780, term81780.getClass(), "htmlContent", null);
        setField(term81780, term81780.getClass(), "id", null);
        setField(term81780, term81780.getClass(), "createdAt", null);
        setField(term81780, term81780.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term81780, args);
    }

};


