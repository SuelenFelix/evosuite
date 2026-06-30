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

public class PostCandidate_setCategories_199723912915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12287;
     Object term12486;

    public PostCandidate_setCategories_199723912915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12288 = new Long(-5476826692763582090L);
        Class<? extends Object> term12545 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term12544 = ((Class) term12545).getDeclaredField((String) "COURSE");
        ((Field) term12544).setAccessible(true);
        Object enum29 = ((Field) term12544).get((Object) null);
        Class<? extends Object> term12785 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term12784 = ((Class) term12785).getDeclaredField((String) "PUBLISHED");
        ((Field) term12784).setAccessible(true);
        Object enum30 = ((Field) term12784).get((Object) null);
        HashMap term12381 = new HashMap();
        Set<Object> term13053 =  ((Map) term12381).keySet();
        HashSet term12380 = new HashSet((Collection<? extends Object>) term13053);
        HashMap term12387 = new HashMap();
        Set<Object> term13054 =  ((Map) term12387).keySet();
        HashSet term12386 = new HashSet((Collection<? extends Object>) term13054);
        ArrayList term12466 = new ArrayList();
        ArrayList term12470 = new ArrayList();
        term12287 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term12441 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term12287, term12287.getClass(), "id", term12288);
        setField(term12287, term12287.getClass(), "title", "kNqaJKIATy");
        setField(term12287, term12287.getClass(), "metaTitle", "vKQukfbJUd");
        setField(term12287, term12287.getClass(), "summary", "lFRJFUMVbx");
        setField(term12287, term12287.getClass(), "postType", enum29);
        setField(term12287, term12287.getClass(), "status", enum30);
        setField(term12287, term12287.getClass(), "content", "sZdUNdggUW");
        setField(term12287, term12287.getClass(), "categories", term12380);
        setField(term12287, term12287.getClass(), "tags", term12386);
        setField(term12287, term12287.getClass(), "slug", "OqbwYQfvAe");
        setField(term12287, term12287.getClass(), "htmlContent", "tRxZafjqIx");
        setField(term12287, term12287.getClass(), "htmlSummary", "DhjNLmRMCu");
        setField(term12287, term12287.getClass(), "postStatus", "PgPzMSEjjX");
        setBooleanField(term12287, term12287.getClass(), "seriesOrGuide", true);
        setField(term12441, term12441.getClass(), "firstName", "wzsPSPcRdj");
        setField(term12441, term12441.getClass(), "lastName", "kGMQdqJYyB");
        setField(term12287, term12287.getClass(), "person", term12441);
        setField(term12287, term12287.getClass(), "tagCandidates", term12466);
        setField(term12287, term12287.getClass(), "categoryCandidates", term12470);
        setField(term12287, term12287.getClass(), "updatedAt", "XJJNClzHRf");
        HashMap term12487 = new HashMap();
        Set<Object> term13125 =  ((Map) term12487).keySet();
        term12486 = new HashSet((Collection<? extends Object>) term13125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term12486;
        callMethod(klass, "setCategories", argTypes, term12287, args);
    }

};


