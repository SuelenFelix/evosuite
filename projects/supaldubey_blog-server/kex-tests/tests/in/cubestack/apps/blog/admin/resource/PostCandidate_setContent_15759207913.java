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

public class PostCandidate_setContent_15759207913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10675;

    public PostCandidate_setContent_15759207913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10676 = new Long(-4325723315152823407L);
        Class<? extends Object> term10913 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term10912 = ((Class) term10913).getDeclaredField((String) "POST");
        ((Field) term10912).setAccessible(true);
        Object enum25 = ((Field) term10912).get((Object) null);
        Class<? extends Object> term11147 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term11146 = ((Class) term11147).getDeclaredField((String) "PUBLISHED");
        ((Field) term11146).setAccessible(true);
        Object enum26 = ((Field) term11146).get((Object) null);
        HashMap term10765 = new HashMap();
        Set<Object> term11415 =  ((Map) term10765).keySet();
        HashSet term10764 = new HashSet((Collection<? extends Object>) term11415);
        HashMap term10771 = new HashMap();
        Set<Object> term11416 =  ((Map) term10771).keySet();
        HashSet term10770 = new HashSet((Collection<? extends Object>) term11416);
        ArrayList term10850 = new ArrayList();
        ArrayList term10854 = new ArrayList();
        term10675 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term10825 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term10675, term10675.getClass(), "id", term10676);
        setField(term10675, term10675.getClass(), "title", "PapWxkhEWe");
        setField(term10675, term10675.getClass(), "metaTitle", "smnHEqRFRx");
        setField(term10675, term10675.getClass(), "summary", "XYtryyobou");
        setField(term10675, term10675.getClass(), "postType", enum25);
        setField(term10675, term10675.getClass(), "status", enum26);
        setField(term10675, term10675.getClass(), "content", "OYbzXylRWW");
        setField(term10675, term10675.getClass(), "categories", term10764);
        setField(term10675, term10675.getClass(), "tags", term10770);
        setField(term10675, term10675.getClass(), "slug", "DSNsTGYXDF");
        setField(term10675, term10675.getClass(), "htmlContent", "sQvGcVjdEx");
        setField(term10675, term10675.getClass(), "htmlSummary", "rLHAoqXgPh");
        setField(term10675, term10675.getClass(), "postStatus", "zUlRdimJtU");
        setBooleanField(term10675, term10675.getClass(), "seriesOrGuide", true);
        setField(term10825, term10825.getClass(), "firstName", "vwbEQQNQrx");
        setField(term10825, term10825.getClass(), "lastName", "xtftXXMbem");
        setField(term10675, term10675.getClass(), "person", term10825);
        setField(term10675, term10675.getClass(), "tagCandidates", term10850);
        setField(term10675, term10675.getClass(), "categoryCandidates", term10854);
        setField(term10675, term10675.getClass(), "updatedAt", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        callMethod(klass, "setContent", argTypes, term10675, args);
    }

};


