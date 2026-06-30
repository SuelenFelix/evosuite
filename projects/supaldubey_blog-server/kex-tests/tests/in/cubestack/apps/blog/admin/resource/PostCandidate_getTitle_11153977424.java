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

public class PostCandidate_getTitle_11153977424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3231;

    public PostCandidate_getTitle_11153977424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3232 = new Long(-8400487765614892086L);
        Class<? extends Object> term3461 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term3460 = ((Class) term3461).getDeclaredField((String) "SERIES");
        ((Field) term3460).setAccessible(true);
        Object enum6 = ((Field) term3460).get((Object) null);
        Class<? extends Object> term3701 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term3700 = ((Class) term3701).getDeclaredField((String) "PUBLISHED");
        ((Field) term3700).setAccessible(true);
        Object enum7 = ((Field) term3700).get((Object) null);
        HashMap term3325 = new HashMap();
        Set<Object> term3969 =  ((Map) term3325).keySet();
        HashSet term3324 = new HashSet((Collection<? extends Object>) term3969);
        HashMap term3331 = new HashMap();
        Set<Object> term3970 =  ((Map) term3331).keySet();
        HashSet term3330 = new HashSet((Collection<? extends Object>) term3970);
        ArrayList term3410 = new ArrayList();
        ArrayList term3414 = new ArrayList();
        term3231 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term3385 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term3231, term3231.getClass(), "id", term3232);
        setField(term3231, term3231.getClass(), "title", "eqJfYWRaEL");
        setField(term3231, term3231.getClass(), "metaTitle", "fhkbdRViHi");
        setField(term3231, term3231.getClass(), "summary", "uWHnvSvaPl");
        setField(term3231, term3231.getClass(), "postType", enum6);
        setField(term3231, term3231.getClass(), "status", enum7);
        setField(term3231, term3231.getClass(), "content", "kBdSllIBVz");
        setField(term3231, term3231.getClass(), "categories", term3324);
        setField(term3231, term3231.getClass(), "tags", term3330);
        setField(term3231, term3231.getClass(), "slug", "TJmVBGfTML");
        setField(term3231, term3231.getClass(), "htmlContent", "tPlsykYBqO");
        setField(term3231, term3231.getClass(), "htmlSummary", "bLPjGVBhlX");
        setField(term3231, term3231.getClass(), "postStatus", "whBvTVIIlC");
        setBooleanField(term3231, term3231.getClass(), "seriesOrGuide", false);
        setField(term3385, term3385.getClass(), "firstName", "IgRJUzaCwW");
        setField(term3385, term3385.getClass(), "lastName", "JUmudUmaaV");
        setField(term3231, term3231.getClass(), "person", term3385);
        setField(term3231, term3231.getClass(), "tagCandidates", term3410);
        setField(term3231, term3231.getClass(), "categoryCandidates", term3414);
        setField(term3231, term3231.getClass(), "updatedAt", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term3231, args);
    }

};


