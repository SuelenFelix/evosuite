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

public class PostCandidate_getUpdatedAt_17517974820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16339;

    public PostCandidate_getUpdatedAt_17517974820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16340 = new Long(6855071767938501807L);
        Class<? extends Object> term16569 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term16568 = ((Class) term16569).getDeclaredField((String) "COURSE");
        ((Field) term16568).setAccessible(true);
        Object enum39 = ((Field) term16568).get((Object) null);
        Class<? extends Object> term16809 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term16808 = ((Class) term16809).getDeclaredField((String) "PUBLISHED");
        ((Field) term16808).setAccessible(true);
        Object enum40 = ((Field) term16808).get((Object) null);
        HashMap term16433 = new HashMap();
        Set<Object> term17077 =  ((Map) term16433).keySet();
        HashSet term16432 = new HashSet((Collection<? extends Object>) term17077);
        HashMap term16439 = new HashMap();
        Set<Object> term17078 =  ((Map) term16439).keySet();
        HashSet term16438 = new HashSet((Collection<? extends Object>) term17078);
        ArrayList term16518 = new ArrayList();
        ArrayList term16522 = new ArrayList();
        term16339 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term16493 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term16339, term16339.getClass(), "id", term16340);
        setField(term16339, term16339.getClass(), "title", "PqtVXXZMqK");
        setField(term16339, term16339.getClass(), "metaTitle", "rYbtIDVdnd");
        setField(term16339, term16339.getClass(), "summary", "UKAReurpHG");
        setField(term16339, term16339.getClass(), "postType", enum39);
        setField(term16339, term16339.getClass(), "status", enum40);
        setField(term16339, term16339.getClass(), "content", "WVRMUmrljA");
        setField(term16339, term16339.getClass(), "categories", term16432);
        setField(term16339, term16339.getClass(), "tags", term16438);
        setField(term16339, term16339.getClass(), "slug", "NTlKJDDWlk");
        setField(term16339, term16339.getClass(), "htmlContent", "vOuMEpOQAg");
        setField(term16339, term16339.getClass(), "htmlSummary", "SIODFGaQhr");
        setField(term16339, term16339.getClass(), "postStatus", "qYzsiuXOgS");
        setBooleanField(term16339, term16339.getClass(), "seriesOrGuide", false);
        setField(term16493, term16493.getClass(), "firstName", "bxrCBbrrct");
        setField(term16493, term16493.getClass(), "lastName", "CKWpJaaaxX");
        setField(term16339, term16339.getClass(), "person", term16493);
        setField(term16339, term16339.getClass(), "tagCandidates", term16518);
        setField(term16339, term16339.getClass(), "categoryCandidates", term16522);
        setField(term16339, term16339.getClass(), "updatedAt", "UBRmXJmfrt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term16339, args);
    }

};


