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

public class PostCandidate_addTagCandidate_150124166322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17951;
     Object term18138;

    public PostCandidate_addTagCandidate_150124166322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17952 = new Long(5262507301787091109L);
        Class<? extends Object> term18228 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term18227 = ((Class) term18228).getDeclaredField((String) "POST");
        ((Field) term18227).setAccessible(true);
        Object enum43 = ((Field) term18227).get((Object) null);
        Class<? extends Object> term18462 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term18461 = ((Class) term18462).getDeclaredField((String) "DRAFT");
        ((Field) term18461).setAccessible(true);
        Object enum44 = ((Field) term18461).get((Object) null);
        HashMap term18033 = new HashMap();
        Set<Object> term18718 =  ((Map) term18033).keySet();
        HashSet term18032 = new HashSet((Collection<? extends Object>) term18718);
        HashMap term18039 = new HashMap();
        Set<Object> term18719 =  ((Map) term18039).keySet();
        HashSet term18038 = new HashSet((Collection<? extends Object>) term18719);
        ArrayList term18118 = new ArrayList();
        ArrayList term18122 = new ArrayList();
        term17951 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term18093 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term17951, term17951.getClass(), "id", term17952);
        setField(term17951, term17951.getClass(), "title", "SOrEHbcbmn");
        setField(term17951, term17951.getClass(), "metaTitle", "bnsyeQXFdu");
        setField(term17951, term17951.getClass(), "summary", "BwtdjiefJn");
        setField(term17951, term17951.getClass(), "postType", enum43);
        setField(term17951, term17951.getClass(), "status", enum44);
        setField(term17951, term17951.getClass(), "content", "jDmhBrIoDa");
        setField(term17951, term17951.getClass(), "categories", term18032);
        setField(term17951, term17951.getClass(), "tags", term18038);
        setField(term17951, term17951.getClass(), "slug", "SPtPatHeOm");
        setField(term17951, term17951.getClass(), "htmlContent", "ywmcuThdfL");
        setField(term17951, term17951.getClass(), "htmlSummary", "GBOEuByOfr");
        setField(term17951, term17951.getClass(), "postStatus", "NHbOFFjyVK");
        setBooleanField(term17951, term17951.getClass(), "seriesOrGuide", true);
        setField(term18093, term18093.getClass(), "firstName", "zaloBqlrSo");
        setField(term18093, term18093.getClass(), "lastName", "vvoLrMGCoN");
        setField(term17951, term17951.getClass(), "person", term18093);
        setField(term17951, term17951.getClass(), "tagCandidates", term18118);
        setField(term17951, term17951.getClass(), "categoryCandidates", term18122);
        setField(term17951, term17951.getClass(), "updatedAt", "pXdglvyrQe");
        Long term18175 = new Long(-6823727938421990489L);
        term18138 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term18177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18192 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term18138, term18138.getClass(), "title", "OcfNzHYdki");
        setField(term18138, term18138.getClass(), "slug", "uPuCVuZYOI");
        setField(term18138, term18138.getClass(), "content", "TweMFhxNdj");
        setField(term18138, term18138.getClass(), "id", term18175);
        setIntField(term18178, term18178.getClass(), "year", 2015);
        setShortField(term18178, term18178.getClass(), "month", (short) 9);
        setShortField(term18178, term18178.getClass(), "day", (short) 19);
        setField(term18177, term18177.getClass(), "date", term18178);
        setByteField(term18182, term18182.getClass(), "hour", (byte) 9);
        setByteField(term18182, term18182.getClass(), "minute", (byte) 4);
        setByteField(term18182, term18182.getClass(), "second", (byte) 10);
        setIntField(term18182, term18182.getClass(), "nano", 401765865);
        setField(term18177, term18177.getClass(), "time", term18182);
        setField(term18138, term18138.getClass(), "createdAt", term18177);
        setIntField(term18188, term18188.getClass(), "year", 2015);
        setShortField(term18188, term18188.getClass(), "month", (short) 4);
        setShortField(term18188, term18188.getClass(), "day", (short) 14);
        setField(term18187, term18187.getClass(), "date", term18188);
        setByteField(term18192, term18192.getClass(), "hour", (byte) 18);
        setByteField(term18192, term18192.getClass(), "minute", (byte) 24);
        setByteField(term18192, term18192.getClass(), "second", (byte) 32);
        setIntField(term18192, term18192.getClass(), "nano", 369233818);
        setField(term18187, term18187.getClass(), "time", term18192);
        setField(term18138, term18138.getClass(), "updatedAt", term18187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Object[] args = new Object[1];
        args[0] = term18138;
        callMethod(klass, "addTagCandidate", argTypes, term17951, args);
    }

};


