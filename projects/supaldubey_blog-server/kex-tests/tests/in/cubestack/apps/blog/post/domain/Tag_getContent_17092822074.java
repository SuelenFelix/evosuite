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

public class Tag_getContent_17092822074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16493;

    public Tag_getContent_17092822074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16530 = new Long(3752337209837437327L);
        term16493 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16547 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16493, term16493.getClass(), "title", "mdxcgZwsaP");
        setField(term16493, term16493.getClass(), "slug", "XildIRoZHG");
        setField(term16493, term16493.getClass(), "content", "lEcrFlxJXH");
        setField(term16493, term16493.getClass(), "id", term16530);
        setIntField(term16533, term16533.getClass(), "year", 2012);
        setShortField(term16533, term16533.getClass(), "month", (short) 11);
        setShortField(term16533, term16533.getClass(), "day", (short) 23);
        setField(term16532, term16532.getClass(), "date", term16533);
        setByteField(term16537, term16537.getClass(), "hour", (byte) 21);
        setByteField(term16537, term16537.getClass(), "minute", (byte) 45);
        setByteField(term16537, term16537.getClass(), "second", (byte) 46);
        setIntField(term16537, term16537.getClass(), "nano", 484678696);
        setField(term16532, term16532.getClass(), "time", term16537);
        setField(term16493, term16493.getClass(), "createdAt", term16532);
        setIntField(term16543, term16543.getClass(), "year", 2027);
        setShortField(term16543, term16543.getClass(), "month", (short) 12);
        setShortField(term16543, term16543.getClass(), "day", (short) 25);
        setField(term16542, term16542.getClass(), "date", term16543);
        setByteField(term16547, term16547.getClass(), "hour", (byte) 8);
        setByteField(term16547, term16547.getClass(), "minute", (byte) 19);
        setByteField(term16547, term16547.getClass(), "second", (byte) 20);
        setIntField(term16547, term16547.getClass(), "nano", 127700185);
        setField(term16542, term16542.getClass(), "time", term16547);
        setField(term16493, term16493.getClass(), "updatedAt", term16542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term16493, args);
    }

};


