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

public class PostCandidate_setUpdatedAt_33793718821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17149;

    public PostCandidate_setUpdatedAt_33793718821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17150 = new Long(-5892135042702373494L);
        Class<? extends Object> term17379 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term17378 = ((Class) term17379).getDeclaredField((String) "POST");
        ((Field) term17378).setAccessible(true);
        Object enum41 = ((Field) term17378).get((Object) null);
        Class<? extends Object> term17613 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term17612 = ((Class) term17613).getDeclaredField((String) "DRAFT");
        ((Field) term17612).setAccessible(true);
        Object enum42 = ((Field) term17612).get((Object) null);
        HashMap term17231 = new HashMap();
        Set<Object> term17869 =  ((Map) term17231).keySet();
        HashSet term17230 = new HashSet((Collection<? extends Object>) term17869);
        HashMap term17237 = new HashMap();
        Set<Object> term17870 =  ((Map) term17237).keySet();
        HashSet term17236 = new HashSet((Collection<? extends Object>) term17870);
        ArrayList term17316 = new ArrayList();
        ArrayList term17320 = new ArrayList();
        term17149 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term17291 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term17149, term17149.getClass(), "id", term17150);
        setField(term17149, term17149.getClass(), "title", "WZzvmIHhzZ");
        setField(term17149, term17149.getClass(), "metaTitle", "doQLHkjpNm");
        setField(term17149, term17149.getClass(), "summary", "lCyLIcSuom");
        setField(term17149, term17149.getClass(), "postType", enum41);
        setField(term17149, term17149.getClass(), "status", enum42);
        setField(term17149, term17149.getClass(), "content", "CGOpQSZZwI");
        setField(term17149, term17149.getClass(), "categories", term17230);
        setField(term17149, term17149.getClass(), "tags", term17236);
        setField(term17149, term17149.getClass(), "slug", "ypEdrstygY");
        setField(term17149, term17149.getClass(), "htmlContent", "sNQFlATEeQ");
        setField(term17149, term17149.getClass(), "htmlSummary", "ZKMLioamsY");
        setField(term17149, term17149.getClass(), "postStatus", "WVbxuoDBcn");
        setBooleanField(term17149, term17149.getClass(), "seriesOrGuide", false);
        setField(term17291, term17291.getClass(), "firstName", "pvDEABOxLt");
        setField(term17291, term17291.getClass(), "lastName", "beAMpkroCQ");
        setField(term17149, term17149.getClass(), "person", term17291);
        setField(term17149, term17149.getClass(), "tagCandidates", term17316);
        setField(term17149, term17149.getClass(), "categoryCandidates", term17320);
        setField(term17149, term17149.getClass(), "updatedAt", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onQLVONGuf";
        callMethod(klass, "setUpdatedAt", argTypes, term17149, args);
    }

};


