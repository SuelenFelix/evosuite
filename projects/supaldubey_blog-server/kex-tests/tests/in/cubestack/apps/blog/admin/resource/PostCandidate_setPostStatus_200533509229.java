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

public class PostCandidate_setPostStatus_200533509229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23841;

    public PostCandidate_setPostStatus_200533509229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23842 = new Long(-2068172595987555756L);
        Class<? extends Object> term24075 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term24074 = ((Class) term24075).getDeclaredField((String) "SERIES");
        ((Field) term24074).setAccessible(true);
        Object enum57 = ((Field) term24074).get((Object) null);
        Class<? extends Object> term24315 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term24314 = ((Class) term24315).getDeclaredField((String) "DRAFT");
        ((Field) term24314).setAccessible(true);
        Object enum58 = ((Field) term24314).get((Object) null);
        HashMap term23927 = new HashMap();
        Set<Object> term24571 =  ((Map) term23927).keySet();
        HashSet term23926 = new HashSet((Collection<? extends Object>) term24571);
        HashMap term23933 = new HashMap();
        Set<Object> term24572 =  ((Map) term23933).keySet();
        HashSet term23932 = new HashSet((Collection<? extends Object>) term24572);
        ArrayList term24012 = new ArrayList();
        ArrayList term24016 = new ArrayList();
        term23841 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term23987 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term23841, term23841.getClass(), "id", term23842);
        setField(term23841, term23841.getClass(), "title", "PvmBHIXaMY");
        setField(term23841, term23841.getClass(), "metaTitle", "hulYxtowxw");
        setField(term23841, term23841.getClass(), "summary", "GNEmuHPNcU");
        setField(term23841, term23841.getClass(), "postType", enum57);
        setField(term23841, term23841.getClass(), "status", enum58);
        setField(term23841, term23841.getClass(), "content", "IoSfuKDFRe");
        setField(term23841, term23841.getClass(), "categories", term23926);
        setField(term23841, term23841.getClass(), "tags", term23932);
        setField(term23841, term23841.getClass(), "slug", "AWYyZiNfsm");
        setField(term23841, term23841.getClass(), "htmlContent", "ITRRYiuDwH");
        setField(term23841, term23841.getClass(), "htmlSummary", "llRfwANcVF");
        setField(term23841, term23841.getClass(), "postStatus", "sUEeHQTWkA");
        setBooleanField(term23841, term23841.getClass(), "seriesOrGuide", false);
        setField(term23987, term23987.getClass(), "firstName", "BDIRCxAWLA");
        setField(term23987, term23987.getClass(), "lastName", "eOJfbiZLnb");
        setField(term23841, term23841.getClass(), "person", term23987);
        setField(term23841, term23841.getClass(), "tagCandidates", term24012);
        setField(term23841, term23841.getClass(), "categoryCandidates", term24016);
        setField(term23841, term23841.getClass(), "updatedAt", "nKZKnxWYCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JOqQxuzRuZ";
        callMethod(klass, "setPostStatus", argTypes, term23841, args);
    }

};


