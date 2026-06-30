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

public class PostCandidate_getCategories_197834371714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11497;

    public PostCandidate_getCategories_197834371714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11498 = new Long(2535595959091595249L);
        Class<? extends Object> term11719 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term11718 = ((Class) term11719).getDeclaredField((String) "SERIES");
        ((Field) term11718).setAccessible(true);
        Object enum27 = ((Field) term11718).get((Object) null);
        Class<? extends Object> term11959 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term11958 = ((Class) term11959).getDeclaredField((String) "DRAFT");
        ((Field) term11958).setAccessible(true);
        Object enum28 = ((Field) term11958).get((Object) null);
        HashMap term11583 = new HashMap();
        Set<Object> term12215 =  ((Map) term11583).keySet();
        HashSet term11582 = new HashSet((Collection<? extends Object>) term12215);
        HashMap term11589 = new HashMap();
        Set<Object> term12216 =  ((Map) term11589).keySet();
        HashSet term11588 = new HashSet((Collection<? extends Object>) term12216);
        ArrayList term11668 = new ArrayList();
        ArrayList term11672 = new ArrayList();
        term11497 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term11643 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term11497, term11497.getClass(), "id", term11498);
        setField(term11497, term11497.getClass(), "title", "JmcmxoGhIK");
        setField(term11497, term11497.getClass(), "metaTitle", "jXzmYyrnnT");
        setField(term11497, term11497.getClass(), "summary", "igCAtimmYB");
        setField(term11497, term11497.getClass(), "postType", enum27);
        setField(term11497, term11497.getClass(), "status", enum28);
        setField(term11497, term11497.getClass(), "content", "DyiXbeYIaN");
        setField(term11497, term11497.getClass(), "categories", term11582);
        setField(term11497, term11497.getClass(), "tags", term11588);
        setField(term11497, term11497.getClass(), "slug", "VGizxZnyHX");
        setField(term11497, term11497.getClass(), "htmlContent", "kVEZMHmRtR");
        setField(term11497, term11497.getClass(), "htmlSummary", "ekxGuOYIwi");
        setField(term11497, term11497.getClass(), "postStatus", "RbVQXSpxXy");
        setBooleanField(term11497, term11497.getClass(), "seriesOrGuide", false);
        setField(term11643, term11643.getClass(), "firstName", "YpJbIgJWWv");
        setField(term11643, term11643.getClass(), "lastName", "JppkknKVOw");
        setField(term11497, term11497.getClass(), "person", term11643);
        setField(term11497, term11497.getClass(), "tagCandidates", term11668);
        setField(term11497, term11497.getClass(), "categoryCandidates", term11672);
        setField(term11497, term11497.getClass(), "updatedAt", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategories", argTypes, term11497, args);
    }

};


