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
import java.lang.Long;

public class PostCandidate_setId_116222313044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34112;
     Object term34114;

    public PostCandidate_setId_116222313044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34112 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34112, term34112.getClass(), "id", null);
        setField(term34112, term34112.getClass(), "title", null);
        setField(term34112, term34112.getClass(), "metaTitle", null);
        setField(term34112, term34112.getClass(), "summary", null);
        setField(term34112, term34112.getClass(), "postType", null);
        setField(term34112, term34112.getClass(), "status", null);
        setField(term34112, term34112.getClass(), "content", null);
        setField(term34112, term34112.getClass(), "categories", null);
        setField(term34112, term34112.getClass(), "tags", null);
        setField(term34112, term34112.getClass(), "slug", null);
        setField(term34112, term34112.getClass(), "htmlContent", null);
        setField(term34112, term34112.getClass(), "htmlSummary", null);
        setField(term34112, term34112.getClass(), "postStatus", null);
        setBooleanField(term34112, term34112.getClass(), "seriesOrGuide", false);
        setField(term34112, term34112.getClass(), "person", null);
        setField(term34112, term34112.getClass(), "tagCandidates", null);
        setField(term34112, term34112.getClass(), "categoryCandidates", null);
        setField(term34112, term34112.getClass(), "updatedAt", null);
        term34114 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term34114;
        callMethod(klass, "setId", argTypes, term34112, args);
    }

};


