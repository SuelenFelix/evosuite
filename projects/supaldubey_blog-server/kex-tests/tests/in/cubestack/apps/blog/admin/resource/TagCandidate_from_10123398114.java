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
import java.lang.Object;

public class TagCandidate_from_10123398114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34330;

    public TagCandidate_from_10123398114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34367 = new Long(9013624480170062917L);
        term34330 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term34369 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34370 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34374 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34384 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term34330, term34330.getClass(), "title", "CgleElJNje");
        setField(term34330, term34330.getClass(), "slug", "ZrchvNGMtd");
        setField(term34330, term34330.getClass(), "content", "WaEcyVlcIx");
        setField(term34330, term34330.getClass(), "id", term34367);
        setIntField(term34370, term34370.getClass(), "year", 2027);
        setShortField(term34370, term34370.getClass(), "month", (short) 11);
        setShortField(term34370, term34370.getClass(), "day", (short) 8);
        setField(term34369, term34369.getClass(), "date", term34370);
        setByteField(term34374, term34374.getClass(), "hour", (byte) 11);
        setByteField(term34374, term34374.getClass(), "minute", (byte) 59);
        setByteField(term34374, term34374.getClass(), "second", (byte) 14);
        setIntField(term34374, term34374.getClass(), "nano", 322375591);
        setField(term34369, term34369.getClass(), "time", term34374);
        setField(term34330, term34330.getClass(), "createdAt", term34369);
        setIntField(term34380, term34380.getClass(), "year", 2020);
        setShortField(term34380, term34380.getClass(), "month", (short) 8);
        setShortField(term34380, term34380.getClass(), "day", (short) 15);
        setField(term34379, term34379.getClass(), "date", term34380);
        setByteField(term34384, term34384.getClass(), "hour", (byte) 2);
        setByteField(term34384, term34384.getClass(), "minute", (byte) 0);
        setByteField(term34384, term34384.getClass(), "second", (byte) 38);
        setIntField(term34384, term34384.getClass(), "nano", 146431486);
        setField(term34379, term34379.getClass(), "time", term34384);
        setField(term34330, term34330.getClass(), "updatedAt", term34379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.admin.resource.TagCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Object[] args = new Object[1];
        args[0] = term34330;
        callMethod(klass, "from", argTypes, null, args);
    }

};


