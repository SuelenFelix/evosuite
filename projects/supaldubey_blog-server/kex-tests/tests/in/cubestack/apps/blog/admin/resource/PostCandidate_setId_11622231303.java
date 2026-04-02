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

public class PostCandidate_setId_11622231303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2419;
     Object term2618;

    public PostCandidate_setId_11622231303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2420 = new Long(-8257434502486459194L);
        Class<? extends Object> term2651 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term2650 = ((Class) term2651).getDeclaredField((String) "COURSE");
        ((Field) term2650).setAccessible(true);
        Object enum4 = ((Field) term2650).get((Object) null);
        Class<? extends Object> term2891 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term2890 = ((Class) term2891).getDeclaredField((String) "PUBLISHED");
        ((Field) term2890).setAccessible(true);
        Object enum5 = ((Field) term2890).get((Object) null);
        HashMap term2513 = new HashMap();
        Set<Object> term3159 =  ((Map) term2513).keySet();
        HashSet term2512 = new HashSet((Collection<? extends Object>) term3159);
        HashMap term2519 = new HashMap();
        Set<Object> term3160 =  ((Map) term2519).keySet();
        HashSet term2518 = new HashSet((Collection<? extends Object>) term3160);
        ArrayList term2598 = new ArrayList();
        ArrayList term2602 = new ArrayList();
        term2419 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term2573 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term2419, term2419.getClass(), "id", term2420);
        setField(term2419, term2419.getClass(), "title", "UoYtihxVaS");
        setField(term2419, term2419.getClass(), "metaTitle", "JDswTTCZHV");
        setField(term2419, term2419.getClass(), "summary", "onpbIeEKoi");
        setField(term2419, term2419.getClass(), "postType", enum4);
        setField(term2419, term2419.getClass(), "status", enum5);
        setField(term2419, term2419.getClass(), "content", "YRHGsAkhxb");
        setField(term2419, term2419.getClass(), "categories", term2512);
        setField(term2419, term2419.getClass(), "tags", term2518);
        setField(term2419, term2419.getClass(), "slug", "ffYhPOzlUs");
        setField(term2419, term2419.getClass(), "htmlContent", "MLqYREekMl");
        setField(term2419, term2419.getClass(), "htmlSummary", "ytSBIKXogI");
        setField(term2419, term2419.getClass(), "postStatus", "nHXjMycHlU");
        setBooleanField(term2419, term2419.getClass(), "seriesOrGuide", false);
        setField(term2573, term2573.getClass(), "firstName", "ieCtQFdkii");
        setField(term2573, term2573.getClass(), "lastName", "dEnhdmILtU");
        setField(term2419, term2419.getClass(), "person", term2573);
        setField(term2419, term2419.getClass(), "tagCandidates", term2598);
        setField(term2419, term2419.getClass(), "categoryCandidates", term2602);
        setField(term2419, term2419.getClass(), "updatedAt", "hoicvmsovO");
        term2618 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2618;
        callMethod(klass, "setId", argTypes, term2419, args);
    }

};


