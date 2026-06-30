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

public class Tag_getSlug_13722442277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16782;

    public Tag_getSlug_13722442277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16819 = new Long(-67485388932970712L);
        term16782 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16826 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16836 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16782, term16782.getClass(), "title", "asMqnMNrZp");
        setField(term16782, term16782.getClass(), "slug", "pqFUMTCKJd");
        setField(term16782, term16782.getClass(), "content", "PTEndmPMzk");
        setField(term16782, term16782.getClass(), "id", term16819);
        setIntField(term16822, term16822.getClass(), "year", 2017);
        setShortField(term16822, term16822.getClass(), "month", (short) 11);
        setShortField(term16822, term16822.getClass(), "day", (short) 19);
        setField(term16821, term16821.getClass(), "date", term16822);
        setByteField(term16826, term16826.getClass(), "hour", (byte) 2);
        setByteField(term16826, term16826.getClass(), "minute", (byte) 52);
        setByteField(term16826, term16826.getClass(), "second", (byte) 15);
        setIntField(term16826, term16826.getClass(), "nano", 625778933);
        setField(term16821, term16821.getClass(), "time", term16826);
        setField(term16782, term16782.getClass(), "createdAt", term16821);
        setIntField(term16832, term16832.getClass(), "year", 2015);
        setShortField(term16832, term16832.getClass(), "month", (short) 10);
        setShortField(term16832, term16832.getClass(), "day", (short) 3);
        setField(term16831, term16831.getClass(), "date", term16832);
        setByteField(term16836, term16836.getClass(), "hour", (byte) 10);
        setByteField(term16836, term16836.getClass(), "minute", (byte) 45);
        setByteField(term16836, term16836.getClass(), "second", (byte) 18);
        setIntField(term16836, term16836.getClass(), "nano", 333457081);
        setField(term16831, term16831.getClass(), "time", term16836);
        setField(term16782, term16782.getClass(), "updatedAt", term16831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSlug", argTypes, term16782, args);
    }

};


