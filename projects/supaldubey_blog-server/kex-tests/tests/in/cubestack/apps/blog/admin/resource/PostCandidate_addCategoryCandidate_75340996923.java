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

public class PostCandidate_addCategoryCandidate_75340996923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18820;
     Object term19011;

    public PostCandidate_addCategoryCandidate_75340996923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18821 = new Long(-484994522244390100L);
        Class<? extends Object> term19117 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term19116 = ((Class) term19117).getDeclaredField((String) "COURSE");
        ((Field) term19116).setAccessible(true);
        Object enum45 = ((Field) term19116).get((Object) null);
        Class<? extends Object> term19357 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term19356 = ((Class) term19357).getDeclaredField((String) "DRAFT");
        ((Field) term19356).setAccessible(true);
        Object enum46 = ((Field) term19356).get((Object) null);
        HashMap term18906 = new HashMap();
        Set<Object> term19613 =  ((Map) term18906).keySet();
        HashSet term18905 = new HashSet((Collection<? extends Object>) term19613);
        HashMap term18912 = new HashMap();
        Set<Object> term19614 =  ((Map) term18912).keySet();
        HashSet term18911 = new HashSet((Collection<? extends Object>) term19614);
        ArrayList term18991 = new ArrayList();
        ArrayList term18995 = new ArrayList();
        term18820 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term18966 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term18820, term18820.getClass(), "id", term18821);
        setField(term18820, term18820.getClass(), "title", "NBrvVzvQHe");
        setField(term18820, term18820.getClass(), "metaTitle", "FjOiNAfBOc");
        setField(term18820, term18820.getClass(), "summary", "iCCsaLHohG");
        setField(term18820, term18820.getClass(), "postType", enum45);
        setField(term18820, term18820.getClass(), "status", enum46);
        setField(term18820, term18820.getClass(), "content", "NJhGgctbdj");
        setField(term18820, term18820.getClass(), "categories", term18905);
        setField(term18820, term18820.getClass(), "tags", term18911);
        setField(term18820, term18820.getClass(), "slug", "MYWYUeLGOp");
        setField(term18820, term18820.getClass(), "htmlContent", "tsTGdgQYUL");
        setField(term18820, term18820.getClass(), "htmlSummary", "TtGbVmKcnX");
        setField(term18820, term18820.getClass(), "postStatus", "GJVkUrCVdD");
        setBooleanField(term18820, term18820.getClass(), "seriesOrGuide", true);
        setField(term18966, term18966.getClass(), "firstName", "zNdorvdUgu");
        setField(term18966, term18966.getClass(), "lastName", "oPxuZbkYio");
        setField(term18820, term18820.getClass(), "person", term18966);
        setField(term18820, term18820.getClass(), "tagCandidates", term18991);
        setField(term18820, term18820.getClass(), "categoryCandidates", term18995);
        setField(term18820, term18820.getClass(), "updatedAt", "vKitydDVnM");
        ArrayList term19060 = new ArrayList();
        Long term19064 = new Long(1233889271256172047L);
        term19011 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term19066 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19067 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19071 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19081 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19011, term19011.getClass(), "title", "urCiQnUFBM");
        setField(term19011, term19011.getClass(), "metaTitle", "EKjQdtKxAM");
        setField(term19011, term19011.getClass(), "slug", "TXZAIPQJHt");
        setField(term19011, term19011.getClass(), "content", "DIbeDHICho");
        setField(term19011, term19011.getClass(), "postCategories", term19060);
        setField(term19011, term19011.getClass(), "id", term19064);
        setIntField(term19067, term19067.getClass(), "year", 2022);
        setShortField(term19067, term19067.getClass(), "month", (short) 2);
        setShortField(term19067, term19067.getClass(), "day", (short) 26);
        setField(term19066, term19066.getClass(), "date", term19067);
        setByteField(term19071, term19071.getClass(), "hour", (byte) 11);
        setByteField(term19071, term19071.getClass(), "minute", (byte) 42);
        setByteField(term19071, term19071.getClass(), "second", (byte) 15);
        setIntField(term19071, term19071.getClass(), "nano", 377731937);
        setField(term19066, term19066.getClass(), "time", term19071);
        setField(term19011, term19011.getClass(), "createdAt", term19066);
        setIntField(term19077, term19077.getClass(), "year", 2026);
        setShortField(term19077, term19077.getClass(), "month", (short) 12);
        setShortField(term19077, term19077.getClass(), "day", (short) 14);
        setField(term19076, term19076.getClass(), "date", term19077);
        setByteField(term19081, term19081.getClass(), "hour", (byte) 16);
        setByteField(term19081, term19081.getClass(), "minute", (byte) 34);
        setByteField(term19081, term19081.getClass(), "second", (byte) 9);
        setIntField(term19081, term19081.getClass(), "nano", 518326996);
        setField(term19076, term19076.getClass(), "time", term19081);
        setField(term19011, term19011.getClass(), "updatedAt", term19076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Object[] args = new Object[1];
        args[0] = term19011;
        callMethod(klass, "addCategoryCandidate", argTypes, term18820, args);
    }

};


