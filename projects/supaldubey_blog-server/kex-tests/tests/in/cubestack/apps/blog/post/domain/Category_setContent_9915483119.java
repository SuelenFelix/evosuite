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
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;

public class Category_setContent_9915483119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82766;

    public Category_setContent_9915483119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term82815 = new ArrayList();
        Long term82819 = new Long(1651638210050263261L);
        term82766 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term82821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term82831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term82836 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term82766, term82766.getClass(), "title", "jCSXDmxVEW");
        setField(term82766, term82766.getClass(), "metaTitle", "ucSaPNSgwx");
        setField(term82766, term82766.getClass(), "slug", "rsRvTIjmLJ");
        setField(term82766, term82766.getClass(), "content", "VOBEeWmzSF");
        setField(term82766, term82766.getClass(), "postCategories", term82815);
        setField(term82766, term82766.getClass(), "id", term82819);
        setIntField(term82822, term82822.getClass(), "year", 2019);
        setShortField(term82822, term82822.getClass(), "month", (short) 3);
        setShortField(term82822, term82822.getClass(), "day", (short) 23);
        setField(term82821, term82821.getClass(), "date", term82822);
        setByteField(term82826, term82826.getClass(), "hour", (byte) 23);
        setByteField(term82826, term82826.getClass(), "minute", (byte) 49);
        setByteField(term82826, term82826.getClass(), "second", (byte) 56);
        setIntField(term82826, term82826.getClass(), "nano", 82527744);
        setField(term82821, term82821.getClass(), "time", term82826);
        setField(term82766, term82766.getClass(), "createdAt", term82821);
        setIntField(term82832, term82832.getClass(), "year", 2013);
        setShortField(term82832, term82832.getClass(), "month", (short) 11);
        setShortField(term82832, term82832.getClass(), "day", (short) 16);
        setField(term82831, term82831.getClass(), "date", term82832);
        setByteField(term82836, term82836.getClass(), "hour", (byte) 9);
        setByteField(term82836, term82836.getClass(), "minute", (byte) 35);
        setByteField(term82836, term82836.getClass(), "second", (byte) 15);
        setIntField(term82836, term82836.getClass(), "nano", 916926372);
        setField(term82831, term82831.getClass(), "time", term82836);
        setField(term82766, term82766.getClass(), "updatedAt", term82831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cVeaNxcyvs";
        callMethod(klass, "setContent", argTypes, term82766, args);
    }

};


