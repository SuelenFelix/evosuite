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

public class PostCandidate_hasCategory_172669564124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19725;
     Object term19916;

    public PostCandidate_hasCategory_172669564124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19726 = new Long(6617340557564669657L);
        Class<? extends Object> term19985 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term19984 = ((Class) term19985).getDeclaredField((String) "COURSE");
        ((Field) term19984).setAccessible(true);
        Object enum47 = ((Field) term19984).get((Object) null);
        Class<? extends Object> term20225 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term20224 = ((Class) term20225).getDeclaredField((String) "DRAFT");
        ((Field) term20224).setAccessible(true);
        Object enum48 = ((Field) term20224).get((Object) null);
        HashMap term19811 = new HashMap();
        Set<Object> term20481 =  ((Map) term19811).keySet();
        HashSet term19810 = new HashSet((Collection<? extends Object>) term20481);
        HashMap term19817 = new HashMap();
        Set<Object> term20482 =  ((Map) term19817).keySet();
        HashSet term19816 = new HashSet((Collection<? extends Object>) term20482);
        ArrayList term19896 = new ArrayList();
        ArrayList term19900 = new ArrayList();
        term19725 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term19871 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term19725, term19725.getClass(), "id", term19726);
        setField(term19725, term19725.getClass(), "title", "dJGPlmSRnz");
        setField(term19725, term19725.getClass(), "metaTitle", "DPskuFUobI");
        setField(term19725, term19725.getClass(), "summary", "wBGfLpNNiZ");
        setField(term19725, term19725.getClass(), "postType", enum47);
        setField(term19725, term19725.getClass(), "status", enum48);
        setField(term19725, term19725.getClass(), "content", "yUGCjlqgJE");
        setField(term19725, term19725.getClass(), "categories", term19810);
        setField(term19725, term19725.getClass(), "tags", term19816);
        setField(term19725, term19725.getClass(), "slug", "PXdVZyoJyC");
        setField(term19725, term19725.getClass(), "htmlContent", "vLerpqavFM");
        setField(term19725, term19725.getClass(), "htmlSummary", "qnvxzwuGKX");
        setField(term19725, term19725.getClass(), "postStatus", "EdPAvpluZg");
        setBooleanField(term19725, term19725.getClass(), "seriesOrGuide", true);
        setField(term19871, term19871.getClass(), "firstName", "DzHVBMqWtE");
        setField(term19871, term19871.getClass(), "lastName", "THZSpzBRYP");
        setField(term19725, term19725.getClass(), "person", term19871);
        setField(term19725, term19725.getClass(), "tagCandidates", term19896);
        setField(term19725, term19725.getClass(), "categoryCandidates", term19900);
        setField(term19725, term19725.getClass(), "updatedAt", "ZfBIVGBQOE");
        term19916 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate"));
        setLongField(term19916, term19916.getClass(), "id", 2535595959091595249L);
        setField(term19916, term19916.getClass(), "title", "QSrDQfEsTR");
        setField(term19916, term19916.getClass(), "metaTitle", "PsqusYmejD");
        setField(term19916, term19916.getClass(), "slug", "NTWMiBEaDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.resource.CategoryCandidate");
        Object[] args = new Object[1];
        args[0] = term19916;
        callMethod(klass, "hasCategory", argTypes, term19725, args);
    }

};


