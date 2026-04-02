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

public class PostCandidate_getMetaTitle_18216848236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4843;

    public PostCandidate_getMetaTitle_18216848236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4844 = new Long(7411271909051562686L);
        Class<? extends Object> term5065 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term5064 = ((Class) term5065).getDeclaredField((String) "COURSE");
        ((Field) term5064).setAccessible(true);
        Object enum10 = ((Field) term5064).get((Object) null);
        Class<? extends Object> term5305 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term5304 = ((Class) term5305).getDeclaredField((String) "DRAFT");
        ((Field) term5304).setAccessible(true);
        Object enum11 = ((Field) term5304).get((Object) null);
        HashMap term4929 = new HashMap();
        Set<Object> term5561 =  ((Map) term4929).keySet();
        HashSet term4928 = new HashSet((Collection<? extends Object>) term5561);
        HashMap term4935 = new HashMap();
        Set<Object> term5562 =  ((Map) term4935).keySet();
        HashSet term4934 = new HashSet((Collection<? extends Object>) term5562);
        ArrayList term5014 = new ArrayList();
        ArrayList term5018 = new ArrayList();
        term4843 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term4989 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term4843, term4843.getClass(), "id", term4844);
        setField(term4843, term4843.getClass(), "title", "PHvxnGHptP");
        setField(term4843, term4843.getClass(), "metaTitle", "TimdotUuNC");
        setField(term4843, term4843.getClass(), "summary", "PkWMRdJcBb");
        setField(term4843, term4843.getClass(), "postType", enum10);
        setField(term4843, term4843.getClass(), "status", enum11);
        setField(term4843, term4843.getClass(), "content", "jSpAteRute");
        setField(term4843, term4843.getClass(), "categories", term4928);
        setField(term4843, term4843.getClass(), "tags", term4934);
        setField(term4843, term4843.getClass(), "slug", "swZVeJAxjt");
        setField(term4843, term4843.getClass(), "htmlContent", "xOcJIiQQDu");
        setField(term4843, term4843.getClass(), "htmlSummary", "GVizqqzXpy");
        setField(term4843, term4843.getClass(), "postStatus", "JqXGgAhZPl");
        setBooleanField(term4843, term4843.getClass(), "seriesOrGuide", true);
        setField(term4989, term4989.getClass(), "firstName", "jiKYgYHqIS");
        setField(term4989, term4989.getClass(), "lastName", "DfISiziTgG");
        setField(term4843, term4843.getClass(), "person", term4989);
        setField(term4843, term4843.getClass(), "tagCandidates", term5014);
        setField(term4843, term4843.getClass(), "categoryCandidates", term5018);
        setField(term4843, term4843.getClass(), "updatedAt", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMetaTitle", argTypes, term4843, args);
    }

};


