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
import java.lang.Long;

public class CategoryCandidate_setId_89835738417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872;
     Object term874;

    public CategoryCandidate_setId_89835738417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term872 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate"));
        setLongField(term872, term872.getClass(), "id", 0L);
        setField(term872, term872.getClass(), "title", null);
        setField(term872, term872.getClass(), "metaTitle", null);
        setField(term872, term872.getClass(), "slug", null);
        term874 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term874;
        callMethod(klass, "setId", argTypes, term872, args);
    }

};


