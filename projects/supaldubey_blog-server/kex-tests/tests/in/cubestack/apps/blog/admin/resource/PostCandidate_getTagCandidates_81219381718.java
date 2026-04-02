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

public class PostCandidate_getTagCandidates_81219381718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14749;

    public PostCandidate_getTagCandidates_81219381718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14750 = new Long(1967728129628047933L);
        Class<? extends Object> term14967 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term14966 = ((Class) term14967).getDeclaredField((String) "POST");
        ((Field) term14966).setAccessible(true);
        Object enum35 = ((Field) term14966).get((Object) null);
        Class<? extends Object> term15201 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term15200 = ((Class) term15201).getDeclaredField((String) "DRAFT");
        ((Field) term15200).setAccessible(true);
        Object enum36 = ((Field) term15200).get((Object) null);
        HashMap term14831 = new HashMap();
        Set<Object> term15457 =  ((Map) term14831).keySet();
        HashSet term14830 = new HashSet((Collection<? extends Object>) term15457);
        HashMap term14837 = new HashMap();
        Set<Object> term15458 =  ((Map) term14837).keySet();
        HashSet term14836 = new HashSet((Collection<? extends Object>) term15458);
        ArrayList term14916 = new ArrayList();
        ArrayList term14920 = new ArrayList();
        term14749 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term14891 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term14749, term14749.getClass(), "id", term14750);
        setField(term14749, term14749.getClass(), "title", "OIHoJeysUi");
        setField(term14749, term14749.getClass(), "metaTitle", "WXMWFDGcLB");
        setField(term14749, term14749.getClass(), "summary", "wKWbJssZuG");
        setField(term14749, term14749.getClass(), "postType", enum35);
        setField(term14749, term14749.getClass(), "status", enum36);
        setField(term14749, term14749.getClass(), "content", "NzBMMhkhpT");
        setField(term14749, term14749.getClass(), "categories", term14830);
        setField(term14749, term14749.getClass(), "tags", term14836);
        setField(term14749, term14749.getClass(), "slug", "qCpEbQDHdF");
        setField(term14749, term14749.getClass(), "htmlContent", "AHbZyFOmlo");
        setField(term14749, term14749.getClass(), "htmlSummary", "TwfWVQGiIj");
        setField(term14749, term14749.getClass(), "postStatus", "gUvcueTURF");
        setBooleanField(term14749, term14749.getClass(), "seriesOrGuide", true);
        setField(term14891, term14891.getClass(), "firstName", "EwQBhZjCIT");
        setField(term14891, term14891.getClass(), "lastName", "aSkmSwTnEw");
        setField(term14749, term14749.getClass(), "person", term14891);
        setField(term14749, term14749.getClass(), "tagCandidates", term14916);
        setField(term14749, term14749.getClass(), "categoryCandidates", term14920);
        setField(term14749, term14749.getClass(), "updatedAt", "xvkbvaEGYd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTagCandidates", argTypes, term14749, args);
    }

};


