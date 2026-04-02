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

public class Category_addPost_155233458023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84826;

    public Category_addPost_155233458023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84826 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        setField(term84826, term84826.getClass(), "title", null);
        setField(term84826, term84826.getClass(), "metaTitle", null);
        setField(term84826, term84826.getClass(), "slug", null);
        setField(term84826, term84826.getClass(), "content", null);
        setField(term84826, term84826.getClass(), "postCategories", null);
        setField(term84826, term84826.getClass(), "id", null);
        setField(term84826, term84826.getClass(), "createdAt", null);
        setField(term84826, term84826.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addPost", argTypes, term84826, args);
    }

};


