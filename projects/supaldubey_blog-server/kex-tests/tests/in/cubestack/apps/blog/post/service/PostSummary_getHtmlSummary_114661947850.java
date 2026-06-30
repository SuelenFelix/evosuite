package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PostSummary_getHtmlSummary_114661947850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10223;

    public PostSummary_getHtmlSummary_114661947850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10223 = newInstance(Class.forName("in.cubestack.apps.blog.post.service.PostSummary"));
        setField(term10223, term10223.getClass(), "id", null);
        setField(term10223, term10223.getClass(), "firstName", null);
        setField(term10223, term10223.getClass(), "lastName", null);
        setField(term10223, term10223.getClass(), "username", null);
        setField(term10223, term10223.getClass(), "title", null);
        setField(term10223, term10223.getClass(), "metaTitle", null);
        setField(term10223, term10223.getClass(), "summary", null);
        setField(term10223, term10223.getClass(), "slug", null);
        setField(term10223, term10223.getClass(), "postType", null);
        setField(term10223, term10223.getClass(), "postStatus", null);
        setField(term10223, term10223.getClass(), "content", null);
        setField(term10223, term10223.getClass(), "publishedAt", null);
        setField(term10223, term10223.getClass(), "tags", null);
        setField(term10223, term10223.getClass(), "categories", null);
        setField(term10223, term10223.getClass(), "likes", null);
        setField(term10223, term10223.getClass(), "views", null);
        setField(term10223, term10223.getClass(), "htmlContent", null);
        setField(term10223, term10223.getClass(), "htmlSummary", null);
        setField(term10223, term10223.getClass(), "readTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostSummary");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlSummary", argTypes, term10223, args);
    }

};


