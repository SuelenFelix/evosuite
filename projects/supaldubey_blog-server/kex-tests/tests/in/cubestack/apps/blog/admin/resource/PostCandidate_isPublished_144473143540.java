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

public class PostCandidate_isPublished_144473143540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33298;

    public PostCandidate_isPublished_144473143540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33299 = new Long(-5963439350418910964L);
        Class<? extends Object> term33528 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term33527 = ((Class) term33528).getDeclaredField((String) "COURSE");
        ((Field) term33527).setAccessible(true);
        Object enum80 = ((Field) term33527).get((Object) null);
        Class<? extends Object> term33768 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term33767 = ((Class) term33768).getDeclaredField((String) "PUBLISHED");
        ((Field) term33767).setAccessible(true);
        Object enum81 = ((Field) term33767).get((Object) null);
        HashMap term33392 = new HashMap();
        Set<Object> term34036 =  ((Map) term33392).keySet();
        HashSet term33391 = new HashSet((Collection<? extends Object>) term34036);
        HashMap term33398 = new HashMap();
        Set<Object> term34037 =  ((Map) term33398).keySet();
        HashSet term33397 = new HashSet((Collection<? extends Object>) term34037);
        ArrayList term33477 = new ArrayList();
        ArrayList term33481 = new ArrayList();
        term33298 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term33452 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term33298, term33298.getClass(), "id", term33299);
        setField(term33298, term33298.getClass(), "title", "vMsWjuPTnO");
        setField(term33298, term33298.getClass(), "metaTitle", "zHvfKaOstO");
        setField(term33298, term33298.getClass(), "summary", "tOszriqETr");
        setField(term33298, term33298.getClass(), "postType", enum80);
        setField(term33298, term33298.getClass(), "status", enum81);
        setField(term33298, term33298.getClass(), "content", "ncSPTkhKjO");
        setField(term33298, term33298.getClass(), "categories", term33391);
        setField(term33298, term33298.getClass(), "tags", term33397);
        setField(term33298, term33298.getClass(), "slug", "jcWKHRWhyj");
        setField(term33298, term33298.getClass(), "htmlContent", "nrQjODRMLD");
        setField(term33298, term33298.getClass(), "htmlSummary", "PNoWXrsFic");
        setField(term33298, term33298.getClass(), "postStatus", "QZBHZqZope");
        setBooleanField(term33298, term33298.getClass(), "seriesOrGuide", true);
        setField(term33452, term33452.getClass(), "firstName", "VBUahCvyxC");
        setField(term33452, term33452.getClass(), "lastName", "MlzTkzKMCX");
        setField(term33298, term33298.getClass(), "person", term33452);
        setField(term33298, term33298.getClass(), "tagCandidates", term33477);
        setField(term33298, term33298.getClass(), "categoryCandidates", term33481);
        setField(term33298, term33298.getClass(), "updatedAt", "UqKUbMyPMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPublished", argTypes, term33298, args);
    }

};


