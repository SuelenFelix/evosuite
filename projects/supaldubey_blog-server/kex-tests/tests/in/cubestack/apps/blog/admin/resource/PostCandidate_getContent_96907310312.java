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

public class PostCandidate_getContent_96907310312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9885;

    public PostCandidate_getContent_96907310312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9886 = new Long(-8885298608300233488L);
        Class<? extends Object> term10107 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term10106 = ((Class) term10107).getDeclaredField((String) "COURSE");
        ((Field) term10106).setAccessible(true);
        Object enum23 = ((Field) term10106).get((Object) null);
        Class<? extends Object> term10347 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term10346 = ((Class) term10347).getDeclaredField((String) "DRAFT");
        ((Field) term10346).setAccessible(true);
        Object enum24 = ((Field) term10346).get((Object) null);
        HashMap term9971 = new HashMap();
        Set<Object> term10603 =  ((Map) term9971).keySet();
        HashSet term9970 = new HashSet((Collection<? extends Object>) term10603);
        HashMap term9977 = new HashMap();
        Set<Object> term10604 =  ((Map) term9977).keySet();
        HashSet term9976 = new HashSet((Collection<? extends Object>) term10604);
        ArrayList term10056 = new ArrayList();
        ArrayList term10060 = new ArrayList();
        term9885 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term10031 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term9885, term9885.getClass(), "id", term9886);
        setField(term9885, term9885.getClass(), "title", "XkIoWJRNwN");
        setField(term9885, term9885.getClass(), "metaTitle", "aNWLJdrZMq");
        setField(term9885, term9885.getClass(), "summary", "HHmNoYxIGj");
        setField(term9885, term9885.getClass(), "postType", enum23);
        setField(term9885, term9885.getClass(), "status", enum24);
        setField(term9885, term9885.getClass(), "content", "PtirvZmsGt");
        setField(term9885, term9885.getClass(), "categories", term9970);
        setField(term9885, term9885.getClass(), "tags", term9976);
        setField(term9885, term9885.getClass(), "slug", "HWkpTmtlrc");
        setField(term9885, term9885.getClass(), "htmlContent", "hMmaoREuCK");
        setField(term9885, term9885.getClass(), "htmlSummary", "VeDtgDzGAN");
        setField(term9885, term9885.getClass(), "postStatus", "aWYOWZFyaX");
        setBooleanField(term9885, term9885.getClass(), "seriesOrGuide", false);
        setField(term10031, term10031.getClass(), "firstName", "BRIVNtfUWU");
        setField(term10031, term10031.getClass(), "lastName", "DbiCVtPPCT");
        setField(term9885, term9885.getClass(), "person", term10031);
        setField(term9885, term9885.getClass(), "tagCandidates", term10056);
        setField(term9885, term9885.getClass(), "categoryCandidates", term10060);
        setField(term9885, term9885.getClass(), "updatedAt", "WzFopsaDuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term9885, args);
    }

};


