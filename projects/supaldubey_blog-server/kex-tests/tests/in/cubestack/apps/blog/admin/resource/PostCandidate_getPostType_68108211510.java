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

public class PostCandidate_getPostType_68108211510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8047;

    public PostCandidate_getPostType_68108211510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8048 = new Long(6967924379644551255L);
        Class<? extends Object> term8265 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term8264 = ((Class) term8265).getDeclaredField((String) "POST");
        ((Field) term8264).setAccessible(true);
        Object enum18 = ((Field) term8264).get((Object) null);
        Class<? extends Object> term8499 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term8498 = ((Class) term8499).getDeclaredField((String) "DRAFT");
        ((Field) term8498).setAccessible(true);
        Object enum19 = ((Field) term8498).get((Object) null);
        HashMap term8129 = new HashMap();
        Set<Object> term8755 =  ((Map) term8129).keySet();
        HashSet term8128 = new HashSet((Collection<? extends Object>) term8755);
        HashMap term8135 = new HashMap();
        Set<Object> term8756 =  ((Map) term8135).keySet();
        HashSet term8134 = new HashSet((Collection<? extends Object>) term8756);
        ArrayList term8214 = new ArrayList();
        ArrayList term8218 = new ArrayList();
        term8047 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term8189 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term8047, term8047.getClass(), "id", term8048);
        setField(term8047, term8047.getClass(), "title", "xJgPlLxpgC");
        setField(term8047, term8047.getClass(), "metaTitle", "EYtfuJaxiM");
        setField(term8047, term8047.getClass(), "summary", "gCWtLVKVVe");
        setField(term8047, term8047.getClass(), "postType", enum18);
        setField(term8047, term8047.getClass(), "status", enum19);
        setField(term8047, term8047.getClass(), "content", "fWKJoSoCwE");
        setField(term8047, term8047.getClass(), "categories", term8128);
        setField(term8047, term8047.getClass(), "tags", term8134);
        setField(term8047, term8047.getClass(), "slug", "wfaXBpWAUH");
        setField(term8047, term8047.getClass(), "htmlContent", "VMeAzAHwZj");
        setField(term8047, term8047.getClass(), "htmlSummary", "PznxWXsZME");
        setField(term8047, term8047.getClass(), "postStatus", "ZzIujlwVsw");
        setBooleanField(term8047, term8047.getClass(), "seriesOrGuide", false);
        setField(term8189, term8189.getClass(), "firstName", "LWyEaeIyAo");
        setField(term8189, term8189.getClass(), "lastName", "yVMkkQhvmN");
        setField(term8047, term8047.getClass(), "person", term8189);
        setField(term8047, term8047.getClass(), "tagCandidates", term8214);
        setField(term8047, term8047.getClass(), "categoryCandidates", term8218);
        setField(term8047, term8047.getClass(), "updatedAt", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostType", argTypes, term8047, args);
    }

};


