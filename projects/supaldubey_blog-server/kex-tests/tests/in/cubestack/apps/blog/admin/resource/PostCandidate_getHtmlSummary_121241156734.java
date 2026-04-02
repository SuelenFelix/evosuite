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

public class PostCandidate_getHtmlSummary_121241156734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27827;

    public PostCandidate_getHtmlSummary_121241156734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27828 = new Long(-2170847986967241072L);
        Class<? extends Object> term28045 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term28044 = ((Class) term28045).getDeclaredField((String) "POST");
        ((Field) term28044).setAccessible(true);
        Object enum67 = ((Field) term28044).get((Object) null);
        Class<? extends Object> term28279 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term28278 = ((Class) term28279).getDeclaredField((String) "DRAFT");
        ((Field) term28278).setAccessible(true);
        Object enum68 = ((Field) term28278).get((Object) null);
        HashMap term27909 = new HashMap();
        Set<Object> term28535 =  ((Map) term27909).keySet();
        HashSet term27908 = new HashSet((Collection<? extends Object>) term28535);
        HashMap term27915 = new HashMap();
        Set<Object> term28536 =  ((Map) term27915).keySet();
        HashSet term27914 = new HashSet((Collection<? extends Object>) term28536);
        ArrayList term27994 = new ArrayList();
        ArrayList term27998 = new ArrayList();
        term27827 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term27969 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term27827, term27827.getClass(), "id", term27828);
        setField(term27827, term27827.getClass(), "title", "BJhjdJUhkz");
        setField(term27827, term27827.getClass(), "metaTitle", "cdHYQDgUZR");
        setField(term27827, term27827.getClass(), "summary", "KAORSSPSeV");
        setField(term27827, term27827.getClass(), "postType", enum67);
        setField(term27827, term27827.getClass(), "status", enum68);
        setField(term27827, term27827.getClass(), "content", "UimMMORkzd");
        setField(term27827, term27827.getClass(), "categories", term27908);
        setField(term27827, term27827.getClass(), "tags", term27914);
        setField(term27827, term27827.getClass(), "slug", "huVIXUWLtI");
        setField(term27827, term27827.getClass(), "htmlContent", "vhKzFyKPOT");
        setField(term27827, term27827.getClass(), "htmlSummary", "nQhIgWXdRc");
        setField(term27827, term27827.getClass(), "postStatus", "EusenEbIoF");
        setBooleanField(term27827, term27827.getClass(), "seriesOrGuide", true);
        setField(term27969, term27969.getClass(), "firstName", "SScVQYSvWH");
        setField(term27969, term27969.getClass(), "lastName", "MnovcqFhCl");
        setField(term27827, term27827.getClass(), "person", term27969);
        setField(term27827, term27827.getClass(), "tagCandidates", term27994);
        setField(term27827, term27827.getClass(), "categoryCandidates", term27998);
        setField(term27827, term27827.getClass(), "updatedAt", "qYtAeLzOhW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHtmlSummary", argTypes, term27827, args);
    }

};


