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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class PostCandidate_setPostType_174127748511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8827;
     Object enum22;

    public PostCandidate_setPostType_174127748511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8828 = new Long(-2813493605142626659L);
        Class<? extends Object> term9071 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term9070 = ((Class) term9071).getDeclaredField((String) "COURSE");
        ((Field) term9070).setAccessible(true);
        Object enum20 = ((Field) term9070).get((Object) null);
        Class<? extends Object> term9311 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term9310 = ((Class) term9311).getDeclaredField((String) "PUBLISHED");
        ((Field) term9310).setAccessible(true);
        Object enum21 = ((Field) term9310).get((Object) null);
        HashMap term8921 = new HashMap();
        Set<Object> term9579 =  ((Map) term8921).keySet();
        HashSet term8920 = new HashSet((Collection<? extends Object>) term9579);
        HashMap term8927 = new HashMap();
        Set<Object> term9580 =  ((Map) term8927).keySet();
        HashSet term8926 = new HashSet((Collection<? extends Object>) term9580);
        ArrayList term9006 = new ArrayList();
        ArrayList term9010 = new ArrayList();
        term8827 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term8981 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term8827, term8827.getClass(), "id", term8828);
        setField(term8827, term8827.getClass(), "title", "pXOkjyeIRb");
        setField(term8827, term8827.getClass(), "metaTitle", "GgZWSjxjyE");
        setField(term8827, term8827.getClass(), "summary", "EeBVbzjcCI");
        setField(term8827, term8827.getClass(), "postType", enum20);
        setField(term8827, term8827.getClass(), "status", enum21);
        setField(term8827, term8827.getClass(), "content", "UfQtPRyWRC");
        setField(term8827, term8827.getClass(), "categories", term8920);
        setField(term8827, term8827.getClass(), "tags", term8926);
        setField(term8827, term8827.getClass(), "slug", "FPvxVzzSvD");
        setField(term8827, term8827.getClass(), "htmlContent", "WHcwFgsGFC");
        setField(term8827, term8827.getClass(), "htmlSummary", "HzqpegHiRq");
        setField(term8827, term8827.getClass(), "postStatus", "jwsfVjMoJT");
        setBooleanField(term8827, term8827.getClass(), "seriesOrGuide", true);
        setField(term8981, term8981.getClass(), "firstName", "ZfdXfCCFDf");
        setField(term8981, term8981.getClass(), "lastName", "MwwjNtdOFT");
        setField(term8827, term8827.getClass(), "person", term8981);
        setField(term8827, term8827.getClass(), "tagCandidates", term9006);
        setField(term8827, term8827.getClass(), "categoryCandidates", term9010);
        setField(term8827, term8827.getClass(), "updatedAt", "VYkqXKVlAJ");
        Class<? extends Object> term9652 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term9651 = ((Class) term9652).getDeclaredField((String) "POST");
        ((Field) term9651).setAccessible(true);
        enum22 = ((Field) term9651).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.PostType");
        Object[] args = new Object[1];
        args[0] = enum22;
        callMethod(klass, "setPostType", argTypes, term8827, args);
    }

};


