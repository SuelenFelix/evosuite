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

public class PostCandidate_getCategoryCandidates_62803408919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15529;

    public PostCandidate_getCategoryCandidates_62803408919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15530 = new Long(2120084523938730454L);
        Class<? extends Object> term15759 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term15758 = ((Class) term15759).getDeclaredField((String) "COURSE");
        ((Field) term15758).setAccessible(true);
        Object enum37 = ((Field) term15758).get((Object) null);
        Class<? extends Object> term15999 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term15998 = ((Class) term15999).getDeclaredField((String) "PUBLISHED");
        ((Field) term15998).setAccessible(true);
        Object enum38 = ((Field) term15998).get((Object) null);
        HashMap term15623 = new HashMap();
        Set<Object> term16267 =  ((Map) term15623).keySet();
        HashSet term15622 = new HashSet((Collection<? extends Object>) term16267);
        HashMap term15629 = new HashMap();
        Set<Object> term16268 =  ((Map) term15629).keySet();
        HashSet term15628 = new HashSet((Collection<? extends Object>) term16268);
        ArrayList term15708 = new ArrayList();
        ArrayList term15712 = new ArrayList();
        term15529 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term15683 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term15529, term15529.getClass(), "id", term15530);
        setField(term15529, term15529.getClass(), "title", "HBGNxdNURv");
        setField(term15529, term15529.getClass(), "metaTitle", "mfCpTPPQQm");
        setField(term15529, term15529.getClass(), "summary", "OcJCIDNIXA");
        setField(term15529, term15529.getClass(), "postType", enum37);
        setField(term15529, term15529.getClass(), "status", enum38);
        setField(term15529, term15529.getClass(), "content", "XfRABIFVEp");
        setField(term15529, term15529.getClass(), "categories", term15622);
        setField(term15529, term15529.getClass(), "tags", term15628);
        setField(term15529, term15529.getClass(), "slug", "MHGKyEnwKc");
        setField(term15529, term15529.getClass(), "htmlContent", "ShIELyuULw");
        setField(term15529, term15529.getClass(), "htmlSummary", "IpQuOGMgmj");
        setField(term15529, term15529.getClass(), "postStatus", "pJbnHTYrxn");
        setBooleanField(term15529, term15529.getClass(), "seriesOrGuide", true);
        setField(term15683, term15683.getClass(), "firstName", "iIRsCSYqXH");
        setField(term15683, term15683.getClass(), "lastName", "nghfqDXyCG");
        setField(term15529, term15529.getClass(), "person", term15683);
        setField(term15529, term15529.getClass(), "tagCandidates", term15708);
        setField(term15529, term15529.getClass(), "categoryCandidates", term15712);
        setField(term15529, term15529.getClass(), "updatedAt", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryCandidates", argTypes, term15529, args);
    }

};


