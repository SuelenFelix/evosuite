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

public class PostCandidate_getTags_109293212016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13126;

    public PostCandidate_getTags_109293212016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13127 = new Long(8428634514691209827L);
        Class<? extends Object> term13356 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term13355 = ((Class) term13356).getDeclaredField((String) "COURSE");
        ((Field) term13355).setAccessible(true);
        Object enum31 = ((Field) term13355).get((Object) null);
        Class<? extends Object> term13596 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term13595 = ((Class) term13596).getDeclaredField((String) "PUBLISHED");
        ((Field) term13595).setAccessible(true);
        Object enum32 = ((Field) term13595).get((Object) null);
        HashMap term13220 = new HashMap();
        Set<Object> term13864 =  ((Map) term13220).keySet();
        HashSet term13219 = new HashSet((Collection<? extends Object>) term13864);
        HashMap term13226 = new HashMap();
        Set<Object> term13865 =  ((Map) term13226).keySet();
        HashSet term13225 = new HashSet((Collection<? extends Object>) term13865);
        ArrayList term13305 = new ArrayList();
        ArrayList term13309 = new ArrayList();
        term13126 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term13280 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term13126, term13126.getClass(), "id", term13127);
        setField(term13126, term13126.getClass(), "title", "HDaezxQfQR");
        setField(term13126, term13126.getClass(), "metaTitle", "iikZEapDlu");
        setField(term13126, term13126.getClass(), "summary", "nhoHrZfnIN");
        setField(term13126, term13126.getClass(), "postType", enum31);
        setField(term13126, term13126.getClass(), "status", enum32);
        setField(term13126, term13126.getClass(), "content", "ZkMALXpEAZ");
        setField(term13126, term13126.getClass(), "categories", term13219);
        setField(term13126, term13126.getClass(), "tags", term13225);
        setField(term13126, term13126.getClass(), "slug", "tXfQjSqDzN");
        setField(term13126, term13126.getClass(), "htmlContent", "BjugTaMcxJ");
        setField(term13126, term13126.getClass(), "htmlSummary", "vGiuZVPJNH");
        setField(term13126, term13126.getClass(), "postStatus", "tlzpzIjMib");
        setBooleanField(term13126, term13126.getClass(), "seriesOrGuide", false);
        setField(term13280, term13280.getClass(), "firstName", "AZdLeSugwv");
        setField(term13280, term13280.getClass(), "lastName", "RMsXuyzKJV");
        setField(term13126, term13126.getClass(), "person", term13280);
        setField(term13126, term13126.getClass(), "tagCandidates", term13305);
        setField(term13126, term13126.getClass(), "categoryCandidates", term13309);
        setField(term13126, term13126.getClass(), "updatedAt", "FwPbDZcHmB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTags", argTypes, term13126, args);
    }

};


