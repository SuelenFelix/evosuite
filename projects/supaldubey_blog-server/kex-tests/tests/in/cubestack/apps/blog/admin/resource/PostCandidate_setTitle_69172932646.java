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

public class PostCandidate_setTitle_69172932646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34118;

    public PostCandidate_setTitle_69172932646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34118 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34118, term34118.getClass(), "id", null);
        setField(term34118, term34118.getClass(), "title", null);
        setField(term34118, term34118.getClass(), "metaTitle", null);
        setField(term34118, term34118.getClass(), "summary", null);
        setField(term34118, term34118.getClass(), "postType", null);
        setField(term34118, term34118.getClass(), "status", null);
        setField(term34118, term34118.getClass(), "content", null);
        setField(term34118, term34118.getClass(), "categories", null);
        setField(term34118, term34118.getClass(), "tags", null);
        setField(term34118, term34118.getClass(), "slug", null);
        setField(term34118, term34118.getClass(), "htmlContent", null);
        setField(term34118, term34118.getClass(), "htmlSummary", null);
        setField(term34118, term34118.getClass(), "postStatus", null);
        setBooleanField(term34118, term34118.getClass(), "seriesOrGuide", false);
        setField(term34118, term34118.getClass(), "person", null);
        setField(term34118, term34118.getClass(), "tagCandidates", null);
        setField(term34118, term34118.getClass(), "categoryCandidates", null);
        setField(term34118, term34118.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term34118, args);
    }

};


