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

public class PostCandidate_setUpdatedAt_33793718862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34150;

    public PostCandidate_setUpdatedAt_33793718862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34150 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34150, term34150.getClass(), "id", null);
        setField(term34150, term34150.getClass(), "title", null);
        setField(term34150, term34150.getClass(), "metaTitle", null);
        setField(term34150, term34150.getClass(), "summary", null);
        setField(term34150, term34150.getClass(), "postType", null);
        setField(term34150, term34150.getClass(), "status", null);
        setField(term34150, term34150.getClass(), "content", null);
        setField(term34150, term34150.getClass(), "categories", null);
        setField(term34150, term34150.getClass(), "tags", null);
        setField(term34150, term34150.getClass(), "slug", null);
        setField(term34150, term34150.getClass(), "htmlContent", null);
        setField(term34150, term34150.getClass(), "htmlSummary", null);
        setField(term34150, term34150.getClass(), "postStatus", null);
        setBooleanField(term34150, term34150.getClass(), "seriesOrGuide", false);
        setField(term34150, term34150.getClass(), "person", null);
        setField(term34150, term34150.getClass(), "tagCandidates", null);
        setField(term34150, term34150.getClass(), "categoryCandidates", null);
        setField(term34150, term34150.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdatedAt", argTypes, term34150, args);
    }

};


