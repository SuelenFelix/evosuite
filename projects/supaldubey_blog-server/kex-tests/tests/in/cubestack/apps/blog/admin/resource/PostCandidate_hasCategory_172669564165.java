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

public class PostCandidate_hasCategory_172669564165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34156;

    public PostCandidate_hasCategory_172669564165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34156 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34156, term34156.getClass(), "id", null);
        setField(term34156, term34156.getClass(), "title", null);
        setField(term34156, term34156.getClass(), "metaTitle", null);
        setField(term34156, term34156.getClass(), "summary", null);
        setField(term34156, term34156.getClass(), "postType", null);
        setField(term34156, term34156.getClass(), "status", null);
        setField(term34156, term34156.getClass(), "content", null);
        setField(term34156, term34156.getClass(), "categories", null);
        setField(term34156, term34156.getClass(), "tags", null);
        setField(term34156, term34156.getClass(), "slug", null);
        setField(term34156, term34156.getClass(), "htmlContent", null);
        setField(term34156, term34156.getClass(), "htmlSummary", null);
        setField(term34156, term34156.getClass(), "postStatus", null);
        setBooleanField(term34156, term34156.getClass(), "seriesOrGuide", false);
        setField(term34156, term34156.getClass(), "person", null);
        setField(term34156, term34156.getClass(), "tagCandidates", null);
        setField(term34156, term34156.getClass(), "categoryCandidates", null);
        setField(term34156, term34156.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasCategory", argTypes, term34156, args);
    }

};


