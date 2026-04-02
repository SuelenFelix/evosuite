package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Tag_setSlug_3476323418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16871;

    public Tag_setSlug_3476323418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16908 = new Long(5806367330808555223L);
        term16871 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16915 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16925 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16871, term16871.getClass(), "title", "aJQuCOCvZs");
        setField(term16871, term16871.getClass(), "slug", "lHYNCJRiOv");
        setField(term16871, term16871.getClass(), "content", "QVLresHoaP");
        setField(term16871, term16871.getClass(), "id", term16908);
        setIntField(term16911, term16911.getClass(), "year", 2013);
        setShortField(term16911, term16911.getClass(), "month", (short) 3);
        setShortField(term16911, term16911.getClass(), "day", (short) 3);
        setField(term16910, term16910.getClass(), "date", term16911);
        setByteField(term16915, term16915.getClass(), "hour", (byte) 22);
        setByteField(term16915, term16915.getClass(), "minute", (byte) 27);
        setByteField(term16915, term16915.getClass(), "second", (byte) 52);
        setIntField(term16915, term16915.getClass(), "nano", 968779154);
        setField(term16910, term16910.getClass(), "time", term16915);
        setField(term16871, term16871.getClass(), "createdAt", term16910);
        setIntField(term16921, term16921.getClass(), "year", 2019);
        setShortField(term16921, term16921.getClass(), "month", (short) 8);
        setShortField(term16921, term16921.getClass(), "day", (short) 31);
        setField(term16920, term16920.getClass(), "date", term16921);
        setByteField(term16925, term16925.getClass(), "hour", (byte) 22);
        setByteField(term16925, term16925.getClass(), "minute", (byte) 31);
        setByteField(term16925, term16925.getClass(), "second", (byte) 36);
        setIntField(term16925, term16925.getClass(), "nano", 403358328);
        setField(term16920, term16920.getClass(), "time", term16925);
        setField(term16871, term16871.getClass(), "updatedAt", term16920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IbxeAMwLVt";
        callMethod(klass, "setSlug", argTypes, term16871, args);
    }

};


