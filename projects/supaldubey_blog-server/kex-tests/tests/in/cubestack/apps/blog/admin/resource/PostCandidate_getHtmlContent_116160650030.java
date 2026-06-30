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

public class PostCandidate_getHtmlContent_116160650030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24653;

    public PostCandidate_getHtmlContent_116160650030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24654 = new Long(-6292278961887936280L);
        Class<? extends Object> term24875 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term24874 = ((Class) term24875).getDeclaredField((String) "SERIES");
        ((Field) term24874).setAccessible(true);
        Object enum59 = ((Field) term24874).get((Object) null);
        Class<? extends Object> term25115 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term25114 = ((Class) term25115).getDeclaredField((String) "DRAFT");
        ((Field) term25114).setAccessible(true);
        Object enum60 = ((Field) term25114).get((Object) null);
        HashMap term24739 = new HashMap();
        Set<Object> term25371 =  ((Map) term24739).keySet();
        HashSet term24738 = new HashSet((Collection<? extends Object>) term25371);
        HashMap term24745 = new HashMap();
        Set<Object> term25372 =  ((Map) term24745).keySet();
        HashSet term24744 = new HashSet((Collection<? extends Object>) term25372);
        ArrayList term24824 = new ArrayList();
        ArrayList term24828 = new ArrayList();
        term24653 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term24799 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term24653, term24653.getClass(), "id", term24654);
        setField(term24653, term24653.getClass(), "title", "RSaoipUlsg");
        setField(term24653, term24653.getClass(), "metaTitle", "cSHGbqKqlN");
        setField(term24653, term24653.getClass(), "summary", "pFAfANnxup");
        setField(term24653, term24653.getClass(), "postType", enum59);
        setField(term24653, term24653.getClass(), "status", enum60);
        setField(term24653, term24653.getClass(), "content", "FbSIUZyBXZ");
        setField(term24653, term24653.getClass(), "categories", term24738);
        setField(term24653, term24653.getClass(), "tags", term24744);
        setField(term24653, term24653.getClass(), "slug", "mhQDwIyrRi");
        setField(term24653, term24653.getClass(), "htmlContent", "HpZXWDPhlg");
        setField(term24653, term24653.getClass(), "htmlSummary", "lBOokzEPfe");
        setField(term24653, term24653.getClass(), "postStatus", "dtGZCsKXbW");
        setBooleanField(term24653, term24653.getClass(), "seriesOrGuide", true);
        setField(term24799, term24799.getClass(), "firstName", "bdyhHbDAmJ");
        setField(term24799, term24799.getClass(), "lastName", "BBXiTNHqGE");
        setField(term24653, term24653.getClass(), "person", term24799);
        setField(term24653, term24653.getClass(), "tagCandidates", term24824);
        setField(term24653, term24653.getClass(), "categoryCandidates", term24828);
        setField(term24653, term24653.getClass(), "updatedAt", "IEYhJmgCVd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlContent", argTypes, term24653, args);
    }

};


