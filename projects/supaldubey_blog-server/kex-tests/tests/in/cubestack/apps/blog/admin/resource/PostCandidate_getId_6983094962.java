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

public class PostCandidate_getId_6983094962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1609;

    public PostCandidate_getId_6983094962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1610 = new Long(6375119433582206027L);
        Class<? extends Object> term1839 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term1838 = ((Class) term1839).getDeclaredField((String) "SERIES");
        ((Field) term1838).setAccessible(true);
        Object enum2 = ((Field) term1838).get((Object) null);
        Class<? extends Object> term2079 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term2078 = ((Class) term2079).getDeclaredField((String) "PUBLISHED");
        ((Field) term2078).setAccessible(true);
        Object enum3 = ((Field) term2078).get((Object) null);
        HashMap term1703 = new HashMap();
        Set<Object> term2347 =  ((Map) term1703).keySet();
        HashSet term1702 = new HashSet((Collection<? extends Object>) term2347);
        HashMap term1709 = new HashMap();
        Set<Object> term2348 =  ((Map) term1709).keySet();
        HashSet term1708 = new HashSet((Collection<? extends Object>) term2348);
        ArrayList term1788 = new ArrayList();
        ArrayList term1792 = new ArrayList();
        term1609 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term1763 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term1609, term1609.getClass(), "id", term1610);
        setField(term1609, term1609.getClass(), "title", "UlajhuVLaP");
        setField(term1609, term1609.getClass(), "metaTitle", "gGSMzuGICf");
        setField(term1609, term1609.getClass(), "summary", "hxCBltsObl");
        setField(term1609, term1609.getClass(), "postType", enum2);
        setField(term1609, term1609.getClass(), "status", enum3);
        setField(term1609, term1609.getClass(), "content", "BndsHwAFMv");
        setField(term1609, term1609.getClass(), "categories", term1702);
        setField(term1609, term1609.getClass(), "tags", term1708);
        setField(term1609, term1609.getClass(), "slug", "GzFkzHGYFt");
        setField(term1609, term1609.getClass(), "htmlContent", "tShwQLRGNe");
        setField(term1609, term1609.getClass(), "htmlSummary", "LvtrsXUliU");
        setField(term1609, term1609.getClass(), "postStatus", "xLbjWUgOIL");
        setBooleanField(term1609, term1609.getClass(), "seriesOrGuide", false);
        setField(term1763, term1763.getClass(), "firstName", "jDtqGUpnZN");
        setField(term1763, term1763.getClass(), "lastName", "nGKItKLYNC");
        setField(term1609, term1609.getClass(), "person", term1763);
        setField(term1609, term1609.getClass(), "tagCandidates", term1788);
        setField(term1609, term1609.getClass(), "categoryCandidates", term1792);
        setField(term1609, term1609.getClass(), "updatedAt", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1609, args);
    }

};


