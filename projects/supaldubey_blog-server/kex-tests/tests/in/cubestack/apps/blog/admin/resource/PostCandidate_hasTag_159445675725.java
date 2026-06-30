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

public class PostCandidate_hasTag_159445675725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20583;
     Object term20770;

    public PostCandidate_hasTag_159445675725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20584 = new Long(1439298019805881866L);
        Class<? extends Object> term20827 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term20826 = ((Class) term20827).getDeclaredField((String) "POST");
        ((Field) term20826).setAccessible(true);
        Object enum49 = ((Field) term20826).get((Object) null);
        Class<? extends Object> term21061 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term21060 = ((Class) term21061).getDeclaredField((String) "DRAFT");
        ((Field) term21060).setAccessible(true);
        Object enum50 = ((Field) term21060).get((Object) null);
        HashMap term20665 = new HashMap();
        Set<Object> term21317 =  ((Map) term20665).keySet();
        HashSet term20664 = new HashSet((Collection<? extends Object>) term21317);
        HashMap term20671 = new HashMap();
        Set<Object> term21318 =  ((Map) term20671).keySet();
        HashSet term20670 = new HashSet((Collection<? extends Object>) term21318);
        ArrayList term20750 = new ArrayList();
        ArrayList term20754 = new ArrayList();
        term20583 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term20725 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term20583, term20583.getClass(), "id", term20584);
        setField(term20583, term20583.getClass(), "title", "SPBstwKFVr");
        setField(term20583, term20583.getClass(), "metaTitle", "WxYUTuqmIq");
        setField(term20583, term20583.getClass(), "summary", "OeQLvhVERT");
        setField(term20583, term20583.getClass(), "postType", enum49);
        setField(term20583, term20583.getClass(), "status", enum50);
        setField(term20583, term20583.getClass(), "content", "IlvgFINwIa");
        setField(term20583, term20583.getClass(), "categories", term20664);
        setField(term20583, term20583.getClass(), "tags", term20670);
        setField(term20583, term20583.getClass(), "slug", "GEJABPlHSI");
        setField(term20583, term20583.getClass(), "htmlContent", "aQFUvuaYxd");
        setField(term20583, term20583.getClass(), "htmlSummary", "zNFLXMifnS");
        setField(term20583, term20583.getClass(), "postStatus", "HHQcYMSBVc");
        setBooleanField(term20583, term20583.getClass(), "seriesOrGuide", true);
        setField(term20725, term20725.getClass(), "firstName", "wdoqITnaAP");
        setField(term20725, term20725.getClass(), "lastName", "rIPMBcrNqB");
        setField(term20583, term20583.getClass(), "person", term20725);
        setField(term20583, term20583.getClass(), "tagCandidates", term20750);
        setField(term20583, term20583.getClass(), "categoryCandidates", term20754);
        setField(term20583, term20583.getClass(), "updatedAt", "UDaboHZHhz");
        term20770 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate"));
        setLongField(term20770, term20770.getClass(), "tagId", -5476826692763582090L);
        setField(term20770, term20770.getClass(), "slug", "nRvKihUSPj");
        setField(term20770, term20770.getClass(), "tagName", "BbNeQJpYPr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate");
        Object[] args = new Object[1];
        args[0] = term20770;
        callMethod(klass, "hasTag", argTypes, term20583, args);
    }

};


