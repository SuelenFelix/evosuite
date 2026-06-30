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

public class PostCandidate_isSeriesOrGuide_84066902532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26255;

    public PostCandidate_isSeriesOrGuide_84066902532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26256 = new Long(4784595517102746672L);
        Class<? extends Object> term26473 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term26472 = ((Class) term26473).getDeclaredField((String) "POST");
        ((Field) term26472).setAccessible(true);
        Object enum63 = ((Field) term26472).get((Object) null);
        Class<? extends Object> term26707 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term26706 = ((Class) term26707).getDeclaredField((String) "DRAFT");
        ((Field) term26706).setAccessible(true);
        Object enum64 = ((Field) term26706).get((Object) null);
        HashMap term26337 = new HashMap();
        Set<Object> term26963 =  ((Map) term26337).keySet();
        HashSet term26336 = new HashSet((Collection<? extends Object>) term26963);
        HashMap term26343 = new HashMap();
        Set<Object> term26964 =  ((Map) term26343).keySet();
        HashSet term26342 = new HashSet((Collection<? extends Object>) term26964);
        ArrayList term26422 = new ArrayList();
        ArrayList term26426 = new ArrayList();
        term26255 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term26397 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term26255, term26255.getClass(), "id", term26256);
        setField(term26255, term26255.getClass(), "title", "dkZFDZxcde");
        setField(term26255, term26255.getClass(), "metaTitle", "WXcZEtUKlI");
        setField(term26255, term26255.getClass(), "summary", "IkpjUOuWQU");
        setField(term26255, term26255.getClass(), "postType", enum63);
        setField(term26255, term26255.getClass(), "status", enum64);
        setField(term26255, term26255.getClass(), "content", "boSSpezHeU");
        setField(term26255, term26255.getClass(), "categories", term26336);
        setField(term26255, term26255.getClass(), "tags", term26342);
        setField(term26255, term26255.getClass(), "slug", "OUeBWNTQDh");
        setField(term26255, term26255.getClass(), "htmlContent", "gltJarNuUk");
        setField(term26255, term26255.getClass(), "htmlSummary", "ZwZIDwYcSW");
        setField(term26255, term26255.getClass(), "postStatus", "sOdkipUKRu");
        setBooleanField(term26255, term26255.getClass(), "seriesOrGuide", true);
        setField(term26397, term26397.getClass(), "firstName", "oKwCDqywym");
        setField(term26397, term26397.getClass(), "lastName", "zjZYTddemL");
        setField(term26255, term26255.getClass(), "person", term26397);
        setField(term26255, term26255.getClass(), "tagCandidates", term26422);
        setField(term26255, term26255.getClass(), "categoryCandidates", term26426);
        setField(term26255, term26255.getClass(), "updatedAt", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSeriesOrGuide", argTypes, term26255, args);
    }

};


