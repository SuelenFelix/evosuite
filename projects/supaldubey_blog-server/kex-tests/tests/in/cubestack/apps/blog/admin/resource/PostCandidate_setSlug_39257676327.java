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

public class PostCandidate_setSlug_39257676327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22209;

    public PostCandidate_setSlug_39257676327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22210 = new Long(5907001541142728739L);
        Class<? extends Object> term22447 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term22446 = ((Class) term22447).getDeclaredField((String) "POST");
        ((Field) term22446).setAccessible(true);
        Object enum53 = ((Field) term22446).get((Object) null);
        Class<? extends Object> term22681 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term22680 = ((Class) term22681).getDeclaredField((String) "PUBLISHED");
        ((Field) term22680).setAccessible(true);
        Object enum54 = ((Field) term22680).get((Object) null);
        HashMap term22299 = new HashMap();
        Set<Object> term22949 =  ((Map) term22299).keySet();
        HashSet term22298 = new HashSet((Collection<? extends Object>) term22949);
        HashMap term22305 = new HashMap();
        Set<Object> term22950 =  ((Map) term22305).keySet();
        HashSet term22304 = new HashSet((Collection<? extends Object>) term22950);
        ArrayList term22384 = new ArrayList();
        ArrayList term22388 = new ArrayList();
        term22209 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term22359 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term22209, term22209.getClass(), "id", term22210);
        setField(term22209, term22209.getClass(), "title", "lZIgPZPgTu");
        setField(term22209, term22209.getClass(), "metaTitle", "iuCxnHGMoW");
        setField(term22209, term22209.getClass(), "summary", "GPSEWEDSTo");
        setField(term22209, term22209.getClass(), "postType", enum53);
        setField(term22209, term22209.getClass(), "status", enum54);
        setField(term22209, term22209.getClass(), "content", "RCOqfVsRHt");
        setField(term22209, term22209.getClass(), "categories", term22298);
        setField(term22209, term22209.getClass(), "tags", term22304);
        setField(term22209, term22209.getClass(), "slug", "TSyCeEZPaT");
        setField(term22209, term22209.getClass(), "htmlContent", "JeZFtaqkzW");
        setField(term22209, term22209.getClass(), "htmlSummary", "vOVuNSCCLe");
        setField(term22209, term22209.getClass(), "postStatus", "fzeqPnzpnt");
        setBooleanField(term22209, term22209.getClass(), "seriesOrGuide", false);
        setField(term22359, term22359.getClass(), "firstName", "RxbhrFBjkO");
        setField(term22359, term22359.getClass(), "lastName", "aanyiAOJCl");
        setField(term22209, term22209.getClass(), "person", term22359);
        setField(term22209, term22209.getClass(), "tagCandidates", term22384);
        setField(term22209, term22209.getClass(), "categoryCandidates", term22388);
        setField(term22209, term22209.getClass(), "updatedAt", "VDokbsCuqq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xClUIcPECX";
        callMethod(klass, "setSlug", argTypes, term22209, args);
    }

};


