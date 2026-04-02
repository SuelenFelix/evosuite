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

public class PostCandidate_setMetaTitle_16589273837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5633;

    public PostCandidate_setMetaTitle_16589273837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5634 = new Long(4872422362414183754L);
        Class<? extends Object> term5867 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term5866 = ((Class) term5867).getDeclaredField((String) "SERIES");
        ((Field) term5866).setAccessible(true);
        Object enum12 = ((Field) term5866).get((Object) null);
        Class<? extends Object> term6107 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term6106 = ((Class) term6107).getDeclaredField((String) "DRAFT");
        ((Field) term6106).setAccessible(true);
        Object enum13 = ((Field) term6106).get((Object) null);
        HashMap term5719 = new HashMap();
        Set<Object> term6363 =  ((Map) term5719).keySet();
        HashSet term5718 = new HashSet((Collection<? extends Object>) term6363);
        HashMap term5725 = new HashMap();
        Set<Object> term6364 =  ((Map) term5725).keySet();
        HashSet term5724 = new HashSet((Collection<? extends Object>) term6364);
        ArrayList term5804 = new ArrayList();
        ArrayList term5808 = new ArrayList();
        term5633 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term5779 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term5633, term5633.getClass(), "id", term5634);
        setField(term5633, term5633.getClass(), "title", "JiVRgTZvKc");
        setField(term5633, term5633.getClass(), "metaTitle", "XPKmummaqg");
        setField(term5633, term5633.getClass(), "summary", "BKLfkLiZTH");
        setField(term5633, term5633.getClass(), "postType", enum12);
        setField(term5633, term5633.getClass(), "status", enum13);
        setField(term5633, term5633.getClass(), "content", "SPpkrGcPRr");
        setField(term5633, term5633.getClass(), "categories", term5718);
        setField(term5633, term5633.getClass(), "tags", term5724);
        setField(term5633, term5633.getClass(), "slug", "sEccwbJKYE");
        setField(term5633, term5633.getClass(), "htmlContent", "AWRooQKkdW");
        setField(term5633, term5633.getClass(), "htmlSummary", "vjxIhXHxGR");
        setField(term5633, term5633.getClass(), "postStatus", "QXzGXbEXMu");
        setBooleanField(term5633, term5633.getClass(), "seriesOrGuide", true);
        setField(term5779, term5779.getClass(), "firstName", "qxSDVejjiY");
        setField(term5779, term5779.getClass(), "lastName", "xBsXSDjXYK");
        setField(term5633, term5633.getClass(), "person", term5779);
        setField(term5633, term5633.getClass(), "tagCandidates", term5804);
        setField(term5633, term5633.getClass(), "categoryCandidates", term5808);
        setField(term5633, term5633.getClass(), "updatedAt", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setMetaTitle", argTypes, term5633, args);
    }

};


