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

public class Comment_commentBy_27415573310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3313;

    public Comment_commentBy_27415573310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3313 = newInstance(Class.forName("in.cubestack.apps.blog.comment.domain.Comment"));
        setField(term3313, term3313.getClass(), "title", null);
        setField(term3313, term3313.getClass(), "commenterId", null);
        setField(term3313, term3313.getClass(), "status", null);
        setField(term3313, term3313.getClass(), "content", null);
        setField(term3313, term3313.getClass(), "publishedAt", null);
        setField(term3313, term3313.getClass(), "id", null);
        setField(term3313, term3313.getClass(), "createdAt", null);
        setField(term3313, term3313.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.comment.domain.Comment");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "commentBy", argTypes, term3313, args);
    }

};


