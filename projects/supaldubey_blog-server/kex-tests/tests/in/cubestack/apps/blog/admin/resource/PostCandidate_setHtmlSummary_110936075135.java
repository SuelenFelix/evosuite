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

public class PostCandidate_setHtmlSummary_110936075135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28607;

    public PostCandidate_setHtmlSummary_110936075135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28608 = new Long(4044358158040652353L);
        Class<? extends Object> term28849 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term28848 = ((Class) term28849).getDeclaredField((String) "COURSE");
        ((Field) term28848).setAccessible(true);
        Object enum69 = ((Field) term28848).get((Object) null);
        Class<? extends Object> term29089 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term29088 = ((Class) term29089).getDeclaredField((String) "PUBLISHED");
        ((Field) term29088).setAccessible(true);
        Object enum70 = ((Field) term29088).get((Object) null);
        HashMap term28701 = new HashMap();
        Set<Object> term29357 =  ((Map) term28701).keySet();
        HashSet term28700 = new HashSet((Collection<? extends Object>) term29357);
        HashMap term28707 = new HashMap();
        Set<Object> term29358 =  ((Map) term28707).keySet();
        HashSet term28706 = new HashSet((Collection<? extends Object>) term29358);
        ArrayList term28786 = new ArrayList();
        ArrayList term28790 = new ArrayList();
        term28607 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term28761 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term28607, term28607.getClass(), "id", term28608);
        setField(term28607, term28607.getClass(), "title", "tJzmOfcUnY");
        setField(term28607, term28607.getClass(), "metaTitle", "TKlccZUpjz");
        setField(term28607, term28607.getClass(), "summary", "GGzwMoHZXC");
        setField(term28607, term28607.getClass(), "postType", enum69);
        setField(term28607, term28607.getClass(), "status", enum70);
        setField(term28607, term28607.getClass(), "content", "IpmgwHTgnG");
        setField(term28607, term28607.getClass(), "categories", term28700);
        setField(term28607, term28607.getClass(), "tags", term28706);
        setField(term28607, term28607.getClass(), "slug", "tIpkeYIezR");
        setField(term28607, term28607.getClass(), "htmlContent", "YkZtEtthvz");
        setField(term28607, term28607.getClass(), "htmlSummary", "dwlZSxlXOo");
        setField(term28607, term28607.getClass(), "postStatus", "lKrEAkypza");
        setBooleanField(term28607, term28607.getClass(), "seriesOrGuide", false);
        setField(term28761, term28761.getClass(), "firstName", "KtuuNAqGCQ");
        setField(term28761, term28761.getClass(), "lastName", "OGQsfjmReM");
        setField(term28607, term28607.getClass(), "person", term28761);
        setField(term28607, term28607.getClass(), "tagCandidates", term28786);
        setField(term28607, term28607.getClass(), "categoryCandidates", term28790);
        setField(term28607, term28607.getClass(), "updatedAt", "YsUtbngnRO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JisaWUxcNb";
        callMethod(klass, "setHtmlSummary", argTypes, term28607, args);
    }

};


