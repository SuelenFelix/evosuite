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

public class PostCandidate_setPostType_174127748552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34130;

    public PostCandidate_setPostType_174127748552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34130 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34130, term34130.getClass(), "id", null);
        setField(term34130, term34130.getClass(), "title", null);
        setField(term34130, term34130.getClass(), "metaTitle", null);
        setField(term34130, term34130.getClass(), "summary", null);
        setField(term34130, term34130.getClass(), "postType", null);
        setField(term34130, term34130.getClass(), "status", null);
        setField(term34130, term34130.getClass(), "content", null);
        setField(term34130, term34130.getClass(), "categories", null);
        setField(term34130, term34130.getClass(), "tags", null);
        setField(term34130, term34130.getClass(), "slug", null);
        setField(term34130, term34130.getClass(), "htmlContent", null);
        setField(term34130, term34130.getClass(), "htmlSummary", null);
        setField(term34130, term34130.getClass(), "postStatus", null);
        setBooleanField(term34130, term34130.getClass(), "seriesOrGuide", false);
        setField(term34130, term34130.getClass(), "person", null);
        setField(term34130, term34130.getClass(), "tagCandidates", null);
        setField(term34130, term34130.getClass(), "categoryCandidates", null);
        setField(term34130, term34130.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.PostType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPostType", argTypes, term34130, args);
    }

};


