package in.cubestack.apps.blog.admin.resource;

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
import static in.cubestack.apps.blog.admin.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CategoryCandidate_getMetaTitle_4127019598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;

    public CategoryCandidate_getMetaTitle_4127019598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate"));
        setLongField(term548, term548.getClass(), "id", 6811161968424632369L);
        setField(term548, term548.getClass(), "title", "eZFUvlxvGV");
        setField(term548, term548.getClass(), "metaTitle", "BYqFIqCKAV");
        setField(term548, term548.getClass(), "slug", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetaTitle", argTypes, term548, args);
    }

};


