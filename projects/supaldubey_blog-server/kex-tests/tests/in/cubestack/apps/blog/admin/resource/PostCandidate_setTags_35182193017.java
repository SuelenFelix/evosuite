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

public class PostCandidate_setTags_35182193017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13936;
     Object term14123;

    public PostCandidate_setTags_35182193017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13937 = new Long(-2585684163342970173L);
        Class<? extends Object> term14186 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term14185 = ((Class) term14186).getDeclaredField((String) "POST");
        ((Field) term14185).setAccessible(true);
        Object enum33 = ((Field) term14185).get((Object) null);
        Class<? extends Object> term14420 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term14419 = ((Class) term14420).getDeclaredField((String) "DRAFT");
        ((Field) term14419).setAccessible(true);
        Object enum34 = ((Field) term14419).get((Object) null);
        HashMap term14018 = new HashMap();
        Set<Object> term14676 =  ((Map) term14018).keySet();
        HashSet term14017 = new HashSet((Collection<? extends Object>) term14676);
        HashMap term14024 = new HashMap();
        Set<Object> term14677 =  ((Map) term14024).keySet();
        HashSet term14023 = new HashSet((Collection<? extends Object>) term14677);
        ArrayList term14103 = new ArrayList();
        ArrayList term14107 = new ArrayList();
        term13936 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term14078 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term13936, term13936.getClass(), "id", term13937);
        setField(term13936, term13936.getClass(), "title", "hOncybyCAH");
        setField(term13936, term13936.getClass(), "metaTitle", "QduALnDSVo");
        setField(term13936, term13936.getClass(), "summary", "izPpKDErnQ");
        setField(term13936, term13936.getClass(), "postType", enum33);
        setField(term13936, term13936.getClass(), "status", enum34);
        setField(term13936, term13936.getClass(), "content", "NnpwZBUTvx");
        setField(term13936, term13936.getClass(), "categories", term14017);
        setField(term13936, term13936.getClass(), "tags", term14023);
        setField(term13936, term13936.getClass(), "slug", "tlQSNgTkQX");
        setField(term13936, term13936.getClass(), "htmlContent", "PCipZnmBOF");
        setField(term13936, term13936.getClass(), "htmlSummary", "zcorEihhLK");
        setField(term13936, term13936.getClass(), "postStatus", "GrqozDKFOk");
        setBooleanField(term13936, term13936.getClass(), "seriesOrGuide", false);
        setField(term14078, term14078.getClass(), "firstName", "CFyoseFGLF");
        setField(term14078, term14078.getClass(), "lastName", "SFqCrhEWLm");
        setField(term13936, term13936.getClass(), "person", term14078);
        setField(term13936, term13936.getClass(), "tagCandidates", term14103);
        setField(term13936, term13936.getClass(), "categoryCandidates", term14107);
        setField(term13936, term13936.getClass(), "updatedAt", "GZdcJyZntS");
        HashMap term14124 = new HashMap();
        Set<Object> term14748 =  ((Map) term14124).keySet();
        term14123 = new HashSet((Collection<? extends Object>) term14748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term14123;
        callMethod(klass, "setTags", argTypes, term13936, args);
    }

};


