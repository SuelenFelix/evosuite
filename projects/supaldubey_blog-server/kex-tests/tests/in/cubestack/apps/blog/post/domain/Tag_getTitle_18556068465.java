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

public class Tag_getTitle_18556068465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16582;

    public Tag_getTitle_18556068465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16619 = new Long(1860789353508856614L);
        term16582 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16636 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16582, term16582.getClass(), "title", "VNdDwXMYxR");
        setField(term16582, term16582.getClass(), "slug", "bVbexZPmwW");
        setField(term16582, term16582.getClass(), "content", "tvxYdqiyGc");
        setField(term16582, term16582.getClass(), "id", term16619);
        setIntField(term16622, term16622.getClass(), "year", 2018);
        setShortField(term16622, term16622.getClass(), "month", (short) 1);
        setShortField(term16622, term16622.getClass(), "day", (short) 7);
        setField(term16621, term16621.getClass(), "date", term16622);
        setByteField(term16626, term16626.getClass(), "hour", (byte) 5);
        setByteField(term16626, term16626.getClass(), "minute", (byte) 42);
        setByteField(term16626, term16626.getClass(), "second", (byte) 49);
        setIntField(term16626, term16626.getClass(), "nano", 291814792);
        setField(term16621, term16621.getClass(), "time", term16626);
        setField(term16582, term16582.getClass(), "createdAt", term16621);
        setIntField(term16632, term16632.getClass(), "year", 2022);
        setShortField(term16632, term16632.getClass(), "month", (short) 7);
        setShortField(term16632, term16632.getClass(), "day", (short) 9);
        setField(term16631, term16631.getClass(), "date", term16632);
        setByteField(term16636, term16636.getClass(), "hour", (byte) 21);
        setByteField(term16636, term16636.getClass(), "minute", (byte) 48);
        setByteField(term16636, term16636.getClass(), "second", (byte) 58);
        setIntField(term16636, term16636.getClass(), "nano", 579553780);
        setField(term16631, term16631.getClass(), "time", term16636);
        setField(term16582, term16582.getClass(), "updatedAt", term16631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term16582, args);
    }

};


