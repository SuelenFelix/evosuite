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

public class PostCandidate_getStatus_24152423838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31698;

    public PostCandidate_getStatus_24152423838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31699 = new Long(682356318767179819L);
        Class<? extends Object> term31928 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term31927 = ((Class) term31928).getDeclaredField((String) "COURSE");
        ((Field) term31927).setAccessible(true);
        Object enum76 = ((Field) term31927).get((Object) null);
        Class<? extends Object> term32168 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term32167 = ((Class) term32168).getDeclaredField((String) "PUBLISHED");
        ((Field) term32167).setAccessible(true);
        Object enum77 = ((Field) term32167).get((Object) null);
        HashMap term31792 = new HashMap();
        Set<Object> term32436 =  ((Map) term31792).keySet();
        HashSet term31791 = new HashSet((Collection<? extends Object>) term32436);
        HashMap term31798 = new HashMap();
        Set<Object> term32437 =  ((Map) term31798).keySet();
        HashSet term31797 = new HashSet((Collection<? extends Object>) term32437);
        ArrayList term31877 = new ArrayList();
        ArrayList term31881 = new ArrayList();
        term31698 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term31852 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term31698, term31698.getClass(), "id", term31699);
        setField(term31698, term31698.getClass(), "title", "jQWttOAiwL");
        setField(term31698, term31698.getClass(), "metaTitle", "DzKFxEuEEC");
        setField(term31698, term31698.getClass(), "summary", "CAMnvfDLJL");
        setField(term31698, term31698.getClass(), "postType", enum76);
        setField(term31698, term31698.getClass(), "status", enum77);
        setField(term31698, term31698.getClass(), "content", "mfHtgSbdjD");
        setField(term31698, term31698.getClass(), "categories", term31791);
        setField(term31698, term31698.getClass(), "tags", term31797);
        setField(term31698, term31698.getClass(), "slug", "cmuaUiHMVL");
        setField(term31698, term31698.getClass(), "htmlContent", "xjoSGPWUgu");
        setField(term31698, term31698.getClass(), "htmlSummary", "uzmqjnOUXu");
        setField(term31698, term31698.getClass(), "postStatus", "xeyjTOCOJb");
        setBooleanField(term31698, term31698.getClass(), "seriesOrGuide", true);
        setField(term31852, term31852.getClass(), "firstName", "DGRqjjdhzy");
        setField(term31852, term31852.getClass(), "lastName", "lQFkjJUPAR");
        setField(term31698, term31698.getClass(), "person", term31852);
        setField(term31698, term31698.getClass(), "tagCandidates", term31877);
        setField(term31698, term31698.getClass(), "categoryCandidates", term31881);
        setField(term31698, term31698.getClass(), "updatedAt", "BsuVlGUUjV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term31698, args);
    }

};


