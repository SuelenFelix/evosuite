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

public class PostCandidate_setStatus_121115367880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34188;

    public PostCandidate_setStatus_121115367880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34188 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34188, term34188.getClass(), "id", null);
        setField(term34188, term34188.getClass(), "title", null);
        setField(term34188, term34188.getClass(), "metaTitle", null);
        setField(term34188, term34188.getClass(), "summary", null);
        setField(term34188, term34188.getClass(), "postType", null);
        setField(term34188, term34188.getClass(), "status", null);
        setField(term34188, term34188.getClass(), "content", null);
        setField(term34188, term34188.getClass(), "categories", null);
        setField(term34188, term34188.getClass(), "tags", null);
        setField(term34188, term34188.getClass(), "slug", null);
        setField(term34188, term34188.getClass(), "htmlContent", null);
        setField(term34188, term34188.getClass(), "htmlSummary", null);
        setField(term34188, term34188.getClass(), "postStatus", null);
        setBooleanField(term34188, term34188.getClass(), "seriesOrGuide", false);
        setField(term34188, term34188.getClass(), "person", null);
        setField(term34188, term34188.getClass(), "tagCandidates", null);
        setField(term34188, term34188.getClass(), "categoryCandidates", null);
        setField(term34188, term34188.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.PostStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatus", argTypes, term34188, args);
    }

};


