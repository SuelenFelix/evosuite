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

public class PostCandidate_getPostType_68108211551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34128;

    public PostCandidate_getPostType_68108211551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34128 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34128, term34128.getClass(), "id", null);
        setField(term34128, term34128.getClass(), "title", null);
        setField(term34128, term34128.getClass(), "metaTitle", null);
        setField(term34128, term34128.getClass(), "summary", null);
        setField(term34128, term34128.getClass(), "postType", null);
        setField(term34128, term34128.getClass(), "status", null);
        setField(term34128, term34128.getClass(), "content", null);
        setField(term34128, term34128.getClass(), "categories", null);
        setField(term34128, term34128.getClass(), "tags", null);
        setField(term34128, term34128.getClass(), "slug", null);
        setField(term34128, term34128.getClass(), "htmlContent", null);
        setField(term34128, term34128.getClass(), "htmlSummary", null);
        setField(term34128, term34128.getClass(), "postStatus", null);
        setBooleanField(term34128, term34128.getClass(), "seriesOrGuide", false);
        setField(term34128, term34128.getClass(), "person", null);
        setField(term34128, term34128.getClass(), "tagCandidates", null);
        setField(term34128, term34128.getClass(), "categoryCandidates", null);
        setField(term34128, term34128.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostType", argTypes, term34128, args);
    }

};


