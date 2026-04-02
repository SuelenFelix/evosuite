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

public class PostCandidate_setTitle_6917293265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4041;

    public PostCandidate_setTitle_6917293265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4042 = new Long(5270370404989704783L);
        Class<? extends Object> term4271 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term4270 = ((Class) term4271).getDeclaredField((String) "POST");
        ((Field) term4270).setAccessible(true);
        Object enum8 = ((Field) term4270).get((Object) null);
        Class<? extends Object> term4505 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term4504 = ((Class) term4505).getDeclaredField((String) "DRAFT");
        ((Field) term4504).setAccessible(true);
        Object enum9 = ((Field) term4504).get((Object) null);
        HashMap term4123 = new HashMap();
        Set<Object> term4761 =  ((Map) term4123).keySet();
        HashSet term4122 = new HashSet((Collection<? extends Object>) term4761);
        HashMap term4129 = new HashMap();
        Set<Object> term4762 =  ((Map) term4129).keySet();
        HashSet term4128 = new HashSet((Collection<? extends Object>) term4762);
        ArrayList term4208 = new ArrayList();
        ArrayList term4212 = new ArrayList();
        term4041 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate"));
        Object term4183 = newInstance(Class.forName("in.cubestack.apps.blog.admin.resource.PersonCandidate"));
        setField(term4041, term4041.getClass(), "id", term4042);
        setField(term4041, term4041.getClass(), "title", "HqBOwkVqjD");
        setField(term4041, term4041.getClass(), "metaTitle", "MAcUBcBckh");
        setField(term4041, term4041.getClass(), "summary", "oVgzLbrsFr");
        setField(term4041, term4041.getClass(), "postType", enum8);
        setField(term4041, term4041.getClass(), "status", enum9);
        setField(term4041, term4041.getClass(), "content", "vQVyKLdtaz");
        setField(term4041, term4041.getClass(), "categories", term4122);
        setField(term4041, term4041.getClass(), "tags", term4128);
        setField(term4041, term4041.getClass(), "slug", "OWKQODBLzb");
        setField(term4041, term4041.getClass(), "htmlContent", "wGmYcqUkgE");
        setField(term4041, term4041.getClass(), "htmlSummary", "idgaQsnJpQ");
        setField(term4041, term4041.getClass(), "postStatus", "VgZnGoIFwQ");
        setBooleanField(term4041, term4041.getClass(), "seriesOrGuide", false);
        setField(term4183, term4183.getClass(), "firstName", "jUbSRrkrYZ");
        setField(term4183, term4183.getClass(), "lastName", "bWWfajKbEX");
        setField(term4041, term4041.getClass(), "person", term4183);
        setField(term4041, term4041.getClass(), "tagCandidates", term4208);
        setField(term4041, term4041.getClass(), "categoryCandidates", term4212);
        setField(term4041, term4041.getClass(), "updatedAt", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setTitle", argTypes, term4041, args);
    }

};


