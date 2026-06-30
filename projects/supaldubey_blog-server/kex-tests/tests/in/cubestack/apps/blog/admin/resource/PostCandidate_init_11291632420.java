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

public class PostCandidate_init_11291632420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term888;
     Object enum0;
     Object enum1;

    public PostCandidate_init_11291632420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term888 = new Long(-8885298608300233488L);
        Class<? extends Object> term1061 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term1060 = ((Class) term1061).getDeclaredField((String) "COURSE");
        ((Field) term1060).setAccessible(true);
        enum0 = ((Field) term1060).get((Object) null);
        Class<? extends Object> term1351 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PostStatus");
        Field term1350 = ((Class) term1351).getDeclaredField((String) "PUBLISHED");
        ((Field) term1350).setAccessible(true);
        enum1 = ((Field) term1350).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.PostCandidate");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("in.cubestack.apps.blog.post.domain.PostType");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("in.cubestack.apps.blog.core.domain.PostStatus");
        Object[] args = new Object[7];
        args[0] = term888;
        args[1] = "IDCWpPLRkE";
        args[2] = "nyiiPDVjAc";
        args[3] = "aKnKipADSo";
        args[4] = enum0;
        args[5] = "wSQxaModmm";
        args[6] = enum1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


