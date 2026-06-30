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

public class TagCandidate_toNewTag_2451588405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34419;

    public TagCandidate_toNewTag_2451588405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34419 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate"));
        setLongField(term34419, term34419.getClass(), "tagId", -6573104506744284592L);
        setField(term34419, term34419.getClass(), "slug", "ONcbPCQnHd");
        setField(term34419, term34419.getClass(), "tagName", "AobDaplFLl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toNewTag", argTypes, term34419, args);
    }

};


