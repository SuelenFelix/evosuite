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

public class PostCandidate_getPerson_190201181937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30888;

    public PostCandidate_getPerson_190201181937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30889 = new Long(6682528376118987775L);
        Class<? extends Object> term31118 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term31117 = ((Class) term31118).getDeclaredField((String) "SERIES");
        ((Field) term31117).setAccessible(true);
        Object enum74 = ((Field) term31117).get((Object) null);
        Class<? extends Object> term31358 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term31357 = ((Class) term31358).getDeclaredField((String) "PUBLISHED");
        ((Field) term31357).setAccessible(true);
        Object enum75 = ((Field) term31357).get((Object) null);
        HashMap term30982 = new HashMap();
        Set<Object> term31626 =  ((Map) term30982).keySet();
        HashSet term30981 = new HashSet((Collection<? extends Object>) term31626);
        HashMap term30988 = new HashMap();
        Set<Object> term31627 =  ((Map) term30988).keySet();
        HashSet term30987 = new HashSet((Collection<? extends Object>) term31627);
        ArrayList term31067 = new ArrayList();
        ArrayList term31071 = new ArrayList();
        term30888 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term31042 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term30888, term30888.getClass(), "id", term30889);
        setField(term30888, term30888.getClass(), "title", "iiHBhsNFgk");
        setField(term30888, term30888.getClass(), "metaTitle", "HknsTajwxJ");
        setField(term30888, term30888.getClass(), "summary", "XtiurrVYKw");
        setField(term30888, term30888.getClass(), "postType", enum74);
        setField(term30888, term30888.getClass(), "status", enum75);
        setField(term30888, term30888.getClass(), "content", "rsumfoDNHa");
        setField(term30888, term30888.getClass(), "categories", term30981);
        setField(term30888, term30888.getClass(), "tags", term30987);
        setField(term30888, term30888.getClass(), "slug", "ceCWHUTQUM");
        setField(term30888, term30888.getClass(), "htmlContent", "LrqwfrKKtS");
        setField(term30888, term30888.getClass(), "htmlSummary", "ZUdnQXfzCI");
        setField(term30888, term30888.getClass(), "postStatus", "EULDrUNQvw");
        setBooleanField(term30888, term30888.getClass(), "seriesOrGuide", true);
        setField(term31042, term31042.getClass(), "firstName", "BtvAvsJSei");
        setField(term31042, term31042.getClass(), "lastName", "vqnBkkxoIa");
        setField(term30888, term30888.getClass(), "person", term31042);
        setField(term30888, term30888.getClass(), "tagCandidates", term31067);
        setField(term30888, term30888.getClass(), "categoryCandidates", term31071);
        setField(term30888, term30888.getClass(), "updatedAt", "bycpZjxXFn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerson", argTypes, term30888, args);
    }

};


