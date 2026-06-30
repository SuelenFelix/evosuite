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

public class PostCandidate_setSummary_20785413089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7225;

    public PostCandidate_setSummary_20785413089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7226 = new Long(-7237588299778557629L);
        Class<? extends Object> term7463 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term7462 = ((Class) term7463).getDeclaredField((String) "POST");
        ((Field) term7462).setAccessible(true);
        Object enum16 = ((Field) term7462).get((Object) null);
        Class<? extends Object> term7697 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term7696 = ((Class) term7697).getDeclaredField((String) "PUBLISHED");
        ((Field) term7696).setAccessible(true);
        Object enum17 = ((Field) term7696).get((Object) null);
        HashMap term7315 = new HashMap();
        Set<Object> term7965 =  ((Map) term7315).keySet();
        HashSet term7314 = new HashSet((Collection<? extends Object>) term7965);
        HashMap term7321 = new HashMap();
        Set<Object> term7966 =  ((Map) term7321).keySet();
        HashSet term7320 = new HashSet((Collection<? extends Object>) term7966);
        ArrayList term7400 = new ArrayList();
        ArrayList term7404 = new ArrayList();
        term7225 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term7375 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term7225, term7225.getClass(), "id", term7226);
        setField(term7225, term7225.getClass(), "title", "dpNsDgfPso");
        setField(term7225, term7225.getClass(), "metaTitle", "hCWPJQKpdc");
        setField(term7225, term7225.getClass(), "summary", "WzMEhMXkKx");
        setField(term7225, term7225.getClass(), "postType", enum16);
        setField(term7225, term7225.getClass(), "status", enum17);
        setField(term7225, term7225.getClass(), "content", "XOiDvlDhdc");
        setField(term7225, term7225.getClass(), "categories", term7314);
        setField(term7225, term7225.getClass(), "tags", term7320);
        setField(term7225, term7225.getClass(), "slug", "AdxvLJhNLe");
        setField(term7225, term7225.getClass(), "htmlContent", "lHfTrWKMPk");
        setField(term7225, term7225.getClass(), "htmlSummary", "JDaAnsVTGV");
        setField(term7225, term7225.getClass(), "postStatus", "mLUZFTfjle");
        setBooleanField(term7225, term7225.getClass(), "seriesOrGuide", true);
        setField(term7375, term7375.getClass(), "firstName", "xIeFjkHkOe");
        setField(term7375, term7375.getClass(), "lastName", "SdCKLMIYnX");
        setField(term7225, term7225.getClass(), "person", term7375);
        setField(term7225, term7225.getClass(), "tagCandidates", term7400);
        setField(term7225, term7225.getClass(), "categoryCandidates", term7404);
        setField(term7225, term7225.getClass(), "updatedAt", "OJJtVNPyKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setSummary", argTypes, term7225, args);
    }

};


