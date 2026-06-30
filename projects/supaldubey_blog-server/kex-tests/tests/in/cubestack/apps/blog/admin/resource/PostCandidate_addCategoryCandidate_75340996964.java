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

public class PostCandidate_addCategoryCandidate_75340996964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34154;

    public PostCandidate_addCategoryCandidate_75340996964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34154 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34154, term34154.getClass(), "id", null);
        setField(term34154, term34154.getClass(), "title", null);
        setField(term34154, term34154.getClass(), "metaTitle", null);
        setField(term34154, term34154.getClass(), "summary", null);
        setField(term34154, term34154.getClass(), "postType", null);
        setField(term34154, term34154.getClass(), "status", null);
        setField(term34154, term34154.getClass(), "content", null);
        setField(term34154, term34154.getClass(), "categories", null);
        setField(term34154, term34154.getClass(), "tags", null);
        setField(term34154, term34154.getClass(), "slug", null);
        setField(term34154, term34154.getClass(), "htmlContent", null);
        setField(term34154, term34154.getClass(), "htmlSummary", null);
        setField(term34154, term34154.getClass(), "postStatus", null);
        setBooleanField(term34154, term34154.getClass(), "seriesOrGuide", false);
        setField(term34154, term34154.getClass(), "person", null);
        setField(term34154, term34154.getClass(), "tagCandidates", null);
        setField(term34154, term34154.getClass(), "categoryCandidates", null);
        setField(term34154, term34154.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCategoryCandidate", argTypes, term34154, args);
    }

};


