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
import java.lang.Boolean;

public class PostCandidate_setSeriesOrGuide_116505200374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34174;
     Object term34176;

    public PostCandidate_setSeriesOrGuide_116505200374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34174 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        setField(term34174, term34174.getClass(), "id", null);
        setField(term34174, term34174.getClass(), "title", null);
        setField(term34174, term34174.getClass(), "metaTitle", null);
        setField(term34174, term34174.getClass(), "summary", null);
        setField(term34174, term34174.getClass(), "postType", null);
        setField(term34174, term34174.getClass(), "status", null);
        setField(term34174, term34174.getClass(), "content", null);
        setField(term34174, term34174.getClass(), "categories", null);
        setField(term34174, term34174.getClass(), "tags", null);
        setField(term34174, term34174.getClass(), "slug", null);
        setField(term34174, term34174.getClass(), "htmlContent", null);
        setField(term34174, term34174.getClass(), "htmlSummary", null);
        setField(term34174, term34174.getClass(), "postStatus", null);
        setBooleanField(term34174, term34174.getClass(), "seriesOrGuide", false);
        setField(term34174, term34174.getClass(), "person", null);
        setField(term34174, term34174.getClass(), "tagCandidates", null);
        setField(term34174, term34174.getClass(), "categoryCandidates", null);
        setField(term34174, term34174.getClass(), "updatedAt", null);
        term34176 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term34176;
        callMethod(klass, "setSeriesOrGuide", argTypes, term34174, args);
    }

};


