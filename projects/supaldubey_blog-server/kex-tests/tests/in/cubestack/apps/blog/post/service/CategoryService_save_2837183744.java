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

public class CategoryService_save_2837183744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;

    public CategoryService_save_2837183744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate"));
        setLongField(term392, term392.getClass(), "id", 2442117782898005296L);
        setField(term392, term392.getClass(), "title", "ZiaGIbnzTs");
        setField(term392, term392.getClass(), "metaTitle", "tbcdzjIfER");
        setField(term392, term392.getClass(), "slug", "HyxfbSQYBe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.CategoryService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Object[] args = new Object[1];
        args[0] = term392;
        callMethod(klass, "save", argTypes, null, args);
    }

};


