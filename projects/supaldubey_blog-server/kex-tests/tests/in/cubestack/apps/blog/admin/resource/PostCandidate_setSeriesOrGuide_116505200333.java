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
import java.lang.Boolean;

public class PostCandidate_setSeriesOrGuide_116505200333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27035;
     Object term27226;

    public PostCandidate_setSeriesOrGuide_116505200333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27036 = new Long(-7612550318181586304L);
        Class<? extends Object> term27259 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term27258 = ((Class) term27259).getDeclaredField((String) "COURSE");
        ((Field) term27258).setAccessible(true);
        Object enum65 = ((Field) term27258).get((Object) null);
        Class<? extends Object> term27499 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term27498 = ((Class) term27499).getDeclaredField((String) "DRAFT");
        ((Field) term27498).setAccessible(true);
        Object enum66 = ((Field) term27498).get((Object) null);
        HashMap term27121 = new HashMap();
        Set<Object> term27755 =  ((Map) term27121).keySet();
        HashSet term27120 = new HashSet((Collection<? extends Object>) term27755);
        HashMap term27127 = new HashMap();
        Set<Object> term27756 =  ((Map) term27127).keySet();
        HashSet term27126 = new HashSet((Collection<? extends Object>) term27756);
        ArrayList term27206 = new ArrayList();
        ArrayList term27210 = new ArrayList();
        term27035 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term27181 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term27035, term27035.getClass(), "id", term27036);
        setField(term27035, term27035.getClass(), "title", "orEuhCStGM");
        setField(term27035, term27035.getClass(), "metaTitle", "HhEaSXWvrY");
        setField(term27035, term27035.getClass(), "summary", "CVRGEomOth");
        setField(term27035, term27035.getClass(), "postType", enum65);
        setField(term27035, term27035.getClass(), "status", enum66);
        setField(term27035, term27035.getClass(), "content", "vSeruUyNWX");
        setField(term27035, term27035.getClass(), "categories", term27120);
        setField(term27035, term27035.getClass(), "tags", term27126);
        setField(term27035, term27035.getClass(), "slug", "UkKvaeJfEC");
        setField(term27035, term27035.getClass(), "htmlContent", "WPxXsahPRq");
        setField(term27035, term27035.getClass(), "htmlSummary", "IENRuqmwUU");
        setField(term27035, term27035.getClass(), "postStatus", "GsWxOwXvSu");
        setBooleanField(term27035, term27035.getClass(), "seriesOrGuide", true);
        setField(term27181, term27181.getClass(), "firstName", "bKBSncrMEZ");
        setField(term27181, term27181.getClass(), "lastName", "yeSXGqQExb");
        setField(term27035, term27035.getClass(), "person", term27181);
        setField(term27035, term27035.getClass(), "tagCandidates", term27206);
        setField(term27035, term27035.getClass(), "categoryCandidates", term27210);
        setField(term27035, term27035.getClass(), "updatedAt", "uXYcXVYJZM");
        term27226 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term27226;
        callMethod(klass, "setSeriesOrGuide", argTypes, term27035, args);
    }

};


