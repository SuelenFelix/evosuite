package in.cubestack.apps.blog.post.service;

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
import static in.cubestack.apps.blog.post.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PostService_persistPost_13813432615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17135;
     Object term17262;

    public PostService_persistPost_13813432615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17136 = new Long(-7278883608542636188L);
        ArrayList term17150 = new ArrayList();
        ((ArrayList) term17150).add("nSzzeexTDI");
        ((ArrayList) term17150).add("WBrpvMhmsz");
        ((ArrayList) term17150).add("ZzqRHVEXcM");
        ((ArrayList) term17150).add("YYwIEARNxi");
        ((ArrayList) term17150).add("rblXBUdTFc");
        ((ArrayList) term17150).add("rbsXSOJFKW");
        ((ArrayList) term17150).add("sAgGDoUNlf");
        ((ArrayList) term17150).add("TSTZcXdFFi");
        ((ArrayList) term17150).add("RyaaOzWfYO");
        term17135 = newInstance(Class.forName("in.cubestack.apps.blog.core.service.User"));
        setField(term17135, term17135.getClass(), "personId", term17136);
        setField(term17135, term17135.getClass(), "userName", "NITCrIISoC");
        setField(term17135, term17135.getClass(), "roles", term17150);
        Long term17263 = new Long(-1539859611880912454L);
        Class<? extends Object> term17588 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term17587 = ((Class) term17588).getDeclaredField((String) "POST");
        ((Field) term17587).setAccessible(true);
        Object enum17 = ((Field) term17587).get((Object) null);
        Class<? extends Object> term17822 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term17821 = ((Class) term17822).getDeclaredField((String) "PUBLISHED");
        ((Field) term17821).setAccessible(true);
        Object enum18 = ((Field) term17821).get((Object) null);
        HashMap term17352 = new HashMap();
        Set<Object> term18090 =  ((Map) term17352).keySet();
        HashSet term17351 = new HashSet((Collection<? extends Object>) term18090);
        HashMap term17358 = new HashMap();
        Set<Object> term18091 =  ((Map) term17358).keySet();
        HashSet term17357 = new HashSet((Collection<? extends Object>) term18091);
        ArrayList term17437 = new ArrayList();
        ArrayList term17441 = new ArrayList();
        term17262 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term17412 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term17262, term17262.getClass(), "id", term17263);
        setField(term17262, term17262.getClass(), "title", "HAkxFBZZzz");
        setField(term17262, term17262.getClass(), "metaTitle", "yejonZnVuy");
        setField(term17262, term17262.getClass(), "summary", "ouesGIsvuG");
        setField(term17262, term17262.getClass(), "postType", enum17);
        setField(term17262, term17262.getClass(), "status", enum18);
        setField(term17262, term17262.getClass(), "content", "pHBHlmLIZQ");
        setField(term17262, term17262.getClass(), "categories", term17351);
        setField(term17262, term17262.getClass(), "tags", term17357);
        setField(term17262, term17262.getClass(), "slug", "ZWRAbOuktl");
        setField(term17262, term17262.getClass(), "htmlContent", "iqFRvFmVID");
        setField(term17262, term17262.getClass(), "htmlSummary", "pNAEtppZdv");
        setField(term17262, term17262.getClass(), "postStatus", "VsFWNMdyRt");
        setBooleanField(term17262, term17262.getClass(), "seriesOrGuide", false);
        setField(term17412, term17412.getClass(), "firstName", "QaoYFZhScg");
        setField(term17412, term17412.getClass(), "lastName", "UTvXIenLCR");
        setField(term17262, term17262.getClass(), "person", term17412);
        setField(term17262, term17262.getClass(), "tagCandidates", term17437);
        setField(term17262, term17262.getClass(), "categoryCandidates", term17441);
        setField(term17262, term17262.getClass(), "updatedAt", "PLeKpWaxhQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.service.PostService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.service.User");
        argTypes[1] = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Object[] args = new Object[2];
        args[0] = term17135;
        args[1] = term17262;
        callMethod(klass, "persistPost", argTypes, null, args);
    }

};


