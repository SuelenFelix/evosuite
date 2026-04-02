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

public class PostCandidate_hasTag_159445675766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34158;

    public PostCandidate_hasTag_159445675766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34158 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34158, term34158.getClass(), "id", null);
        setField(term34158, term34158.getClass(), "title", null);
        setField(term34158, term34158.getClass(), "metaTitle", null);
        setField(term34158, term34158.getClass(), "summary", null);
        setField(term34158, term34158.getClass(), "postType", null);
        setField(term34158, term34158.getClass(), "status", null);
        setField(term34158, term34158.getClass(), "content", null);
        setField(term34158, term34158.getClass(), "categories", null);
        setField(term34158, term34158.getClass(), "tags", null);
        setField(term34158, term34158.getClass(), "slug", null);
        setField(term34158, term34158.getClass(), "htmlContent", null);
        setField(term34158, term34158.getClass(), "htmlSummary", null);
        setField(term34158, term34158.getClass(), "postStatus", null);
        setBooleanField(term34158, term34158.getClass(), "seriesOrGuide", false);
        setField(term34158, term34158.getClass(), "person", null);
        setField(term34158, term34158.getClass(), "tagCandidates", null);
        setField(term34158, term34158.getClass(), "categoryCandidates", null);
        setField(term34158, term34158.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasTag", argTypes, term34158, args);
    }

};


