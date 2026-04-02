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

public class PostCandidate_getSlug_211245333126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21409;

    public PostCandidate_getSlug_211245333126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21410 = new Long(-8708192233349544946L);
        Class<? extends Object> term21635 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term21634 = ((Class) term21635).getDeclaredField((String) "POST");
        ((Field) term21634).setAccessible(true);
        Object enum51 = ((Field) term21634).get((Object) null);
        Class<? extends Object> term21869 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term21868 = ((Class) term21869).getDeclaredField((String) "PUBLISHED");
        ((Field) term21868).setAccessible(true);
        Object enum52 = ((Field) term21868).get((Object) null);
        HashMap term21499 = new HashMap();
        Set<Object> term22137 =  ((Map) term21499).keySet();
        HashSet term21498 = new HashSet((Collection<? extends Object>) term22137);
        HashMap term21505 = new HashMap();
        Set<Object> term22138 =  ((Map) term21505).keySet();
        HashSet term21504 = new HashSet((Collection<? extends Object>) term22138);
        ArrayList term21584 = new ArrayList();
        ArrayList term21588 = new ArrayList();
        term21409 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term21559 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term21409, term21409.getClass(), "id", term21410);
        setField(term21409, term21409.getClass(), "title", "riMtzCoxNj");
        setField(term21409, term21409.getClass(), "metaTitle", "YAXkVjQZcV");
        setField(term21409, term21409.getClass(), "summary", "pumvwBWvpy");
        setField(term21409, term21409.getClass(), "postType", enum51);
        setField(term21409, term21409.getClass(), "status", enum52);
        setField(term21409, term21409.getClass(), "content", "HwLHeGLyhe");
        setField(term21409, term21409.getClass(), "categories", term21498);
        setField(term21409, term21409.getClass(), "tags", term21504);
        setField(term21409, term21409.getClass(), "slug", "RDnkgWkcbz");
        setField(term21409, term21409.getClass(), "htmlContent", "IBpaxltauX");
        setField(term21409, term21409.getClass(), "htmlSummary", "hePqROaplw");
        setField(term21409, term21409.getClass(), "postStatus", "PJcSNDruWd");
        setBooleanField(term21409, term21409.getClass(), "seriesOrGuide", true);
        setField(term21559, term21559.getClass(), "firstName", "VVNNlAePXF");
        setField(term21559, term21559.getClass(), "lastName", "jnwVnmKAFv");
        setField(term21409, term21409.getClass(), "person", term21559);
        setField(term21409, term21409.getClass(), "tagCandidates", term21584);
        setField(term21409, term21409.getClass(), "categoryCandidates", term21588);
        setField(term21409, term21409.getClass(), "updatedAt", "TXyHhqeCjR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlug", argTypes, term21409, args);
    }

};


