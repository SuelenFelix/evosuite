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

public class PostCandidate_getPostStatus_55561396428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23031;

    public PostCandidate_getPostStatus_55561396428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23032 = new Long(4178434741742309755L);
        Class<? extends Object> term23261 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term23260 = ((Class) term23261).getDeclaredField((String) "COURSE");
        ((Field) term23260).setAccessible(true);
        Object enum55 = ((Field) term23260).get((Object) null);
        Class<? extends Object> term23501 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term23500 = ((Class) term23501).getDeclaredField((String) "PUBLISHED");
        ((Field) term23500).setAccessible(true);
        Object enum56 = ((Field) term23500).get((Object) null);
        HashMap term23125 = new HashMap();
        Set<Object> term23769 =  ((Map) term23125).keySet();
        HashSet term23124 = new HashSet((Collection<? extends Object>) term23769);
        HashMap term23131 = new HashMap();
        Set<Object> term23770 =  ((Map) term23131).keySet();
        HashSet term23130 = new HashSet((Collection<? extends Object>) term23770);
        ArrayList term23210 = new ArrayList();
        ArrayList term23214 = new ArrayList();
        term23031 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term23185 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term23031, term23031.getClass(), "id", term23032);
        setField(term23031, term23031.getClass(), "title", "avhRaGZaBF");
        setField(term23031, term23031.getClass(), "metaTitle", "JkgoRtImdE");
        setField(term23031, term23031.getClass(), "summary", "qFGKIJjlmV");
        setField(term23031, term23031.getClass(), "postType", enum55);
        setField(term23031, term23031.getClass(), "status", enum56);
        setField(term23031, term23031.getClass(), "content", "IHqvyhMtuM");
        setField(term23031, term23031.getClass(), "categories", term23124);
        setField(term23031, term23031.getClass(), "tags", term23130);
        setField(term23031, term23031.getClass(), "slug", "dAldIGYAXV");
        setField(term23031, term23031.getClass(), "htmlContent", "mLwibAPEsa");
        setField(term23031, term23031.getClass(), "htmlSummary", "zsWKWiTFuo");
        setField(term23031, term23031.getClass(), "postStatus", "UPUbwyHQKN");
        setBooleanField(term23031, term23031.getClass(), "seriesOrGuide", false);
        setField(term23185, term23185.getClass(), "firstName", "lgQkrXANyI");
        setField(term23185, term23185.getClass(), "lastName", "MeTmRZXErV");
        setField(term23031, term23031.getClass(), "person", term23185);
        setField(term23031, term23031.getClass(), "tagCandidates", term23210);
        setField(term23031, term23031.getClass(), "categoryCandidates", term23214);
        setField(term23031, term23031.getClass(), "updatedAt", "jNxbVmoZgq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostStatus", argTypes, term23031, args);
    }

};


