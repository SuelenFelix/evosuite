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

public class PostCandidate_setHtmlContent_126465731631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25443;

    public PostCandidate_setHtmlContent_126465731631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25444 = new Long(-6645965768855543712L);
        Class<? extends Object> term25677 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term25676 = ((Class) term25677).getDeclaredField((String) "COURSE");
        ((Field) term25676).setAccessible(true);
        Object enum61 = ((Field) term25676).get((Object) null);
        Class<? extends Object> term25917 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term25916 = ((Class) term25917).getDeclaredField((String) "DRAFT");
        ((Field) term25916).setAccessible(true);
        Object enum62 = ((Field) term25916).get((Object) null);
        HashMap term25529 = new HashMap();
        Set<Object> term26173 =  ((Map) term25529).keySet();
        HashSet term25528 = new HashSet((Collection<? extends Object>) term26173);
        HashMap term25535 = new HashMap();
        Set<Object> term26174 =  ((Map) term25535).keySet();
        HashSet term25534 = new HashSet((Collection<? extends Object>) term26174);
        ArrayList term25614 = new ArrayList();
        ArrayList term25618 = new ArrayList();
        term25443 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term25589 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term25443, term25443.getClass(), "id", term25444);
        setField(term25443, term25443.getClass(), "title", "KSJeYkkvpk");
        setField(term25443, term25443.getClass(), "metaTitle", "qUtkFGMNUV");
        setField(term25443, term25443.getClass(), "summary", "mGRiYhnMcR");
        setField(term25443, term25443.getClass(), "postType", enum61);
        setField(term25443, term25443.getClass(), "status", enum62);
        setField(term25443, term25443.getClass(), "content", "NFlvfJCVPO");
        setField(term25443, term25443.getClass(), "categories", term25528);
        setField(term25443, term25443.getClass(), "tags", term25534);
        setField(term25443, term25443.getClass(), "slug", "KarbTXFmUU");
        setField(term25443, term25443.getClass(), "htmlContent", "jiUSjqwSIQ");
        setField(term25443, term25443.getClass(), "htmlSummary", "MgLCedQfoj");
        setField(term25443, term25443.getClass(), "postStatus", "zgKiINdgNu");
        setBooleanField(term25443, term25443.getClass(), "seriesOrGuide", true);
        setField(term25589, term25589.getClass(), "firstName", "zLMTXDQHYH");
        setField(term25589, term25589.getClass(), "lastName", "PqywFWJlpE");
        setField(term25443, term25443.getClass(), "person", term25589);
        setField(term25443, term25443.getClass(), "tagCandidates", term25614);
        setField(term25443, term25443.getClass(), "categoryCandidates", term25618);
        setField(term25443, term25443.getClass(), "updatedAt", "OzXRsFGTIp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TjWpyghUWN";
        callMethod(klass, "setHtmlContent", argTypes, term25443, args);
    }

};


