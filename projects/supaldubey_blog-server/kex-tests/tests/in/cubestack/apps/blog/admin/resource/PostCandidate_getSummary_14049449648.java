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

public class PostCandidate_getSummary_14049449648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6445;

    public PostCandidate_getSummary_14049449648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6446 = new Long(6811161968424632369L);
        Class<? extends Object> term6663 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term6662 = ((Class) term6663).getDeclaredField((String) "POST");
        ((Field) term6662).setAccessible(true);
        Object enum14 = ((Field) term6662).get((Object) null);
        Class<? extends Object> term6897 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term6896 = ((Class) term6897).getDeclaredField((String) "DRAFT");
        ((Field) term6896).setAccessible(true);
        Object enum15 = ((Field) term6896).get((Object) null);
        HashMap term6527 = new HashMap();
        Set<Object> term7153 =  ((Map) term6527).keySet();
        HashSet term6526 = new HashSet((Collection<? extends Object>) term7153);
        HashMap term6533 = new HashMap();
        Set<Object> term7154 =  ((Map) term6533).keySet();
        HashSet term6532 = new HashSet((Collection<? extends Object>) term7154);
        ArrayList term6612 = new ArrayList();
        ArrayList term6616 = new ArrayList();
        term6445 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term6587 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term6445, term6445.getClass(), "id", term6446);
        setField(term6445, term6445.getClass(), "title", "fztQhjqwdP");
        setField(term6445, term6445.getClass(), "metaTitle", "eVpkWxjuki");
        setField(term6445, term6445.getClass(), "summary", "SJiQaLvSKv");
        setField(term6445, term6445.getClass(), "postType", enum14);
        setField(term6445, term6445.getClass(), "status", enum15);
        setField(term6445, term6445.getClass(), "content", "OEXDRUKcFl");
        setField(term6445, term6445.getClass(), "categories", term6526);
        setField(term6445, term6445.getClass(), "tags", term6532);
        setField(term6445, term6445.getClass(), "slug", "RYdKCNNMBR");
        setField(term6445, term6445.getClass(), "htmlContent", "yGtHPyvYiQ");
        setField(term6445, term6445.getClass(), "htmlSummary", "MvRIxilFMJ");
        setField(term6445, term6445.getClass(), "postStatus", "iNwOJRBEjp");
        setBooleanField(term6445, term6445.getClass(), "seriesOrGuide", true);
        setField(term6587, term6587.getClass(), "firstName", "XylxrMBraH");
        setField(term6587, term6587.getClass(), "lastName", "pORebkoRdD");
        setField(term6445, term6445.getClass(), "person", term6587);
        setField(term6445, term6445.getClass(), "tagCandidates", term6612);
        setField(term6445, term6445.getClass(), "categoryCandidates", term6616);
        setField(term6445, term6445.getClass(), "updatedAt", "mXGCWJDOqA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSummary", argTypes, term6445, args);
    }

};


