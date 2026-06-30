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

public class Tag_setContent_8978011833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16382;

    public Tag_setContent_8978011833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16419 = new Long(3108750145697087661L);
        term16382 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Tag"));
        Object term16421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16426 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16436 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16382, term16382.getClass(), "title", "SibzENsyyy");
        setField(term16382, term16382.getClass(), "slug", "mrqGHotaef");
        setField(term16382, term16382.getClass(), "content", "UbZGBpQZQW");
        setField(term16382, term16382.getClass(), "id", term16419);
        setIntField(term16422, term16422.getClass(), "year", 2013);
        setShortField(term16422, term16422.getClass(), "month", (short) 9);
        setShortField(term16422, term16422.getClass(), "day", (short) 12);
        setField(term16421, term16421.getClass(), "date", term16422);
        setByteField(term16426, term16426.getClass(), "hour", (byte) 14);
        setByteField(term16426, term16426.getClass(), "minute", (byte) 21);
        setByteField(term16426, term16426.getClass(), "second", (byte) 35);
        setIntField(term16426, term16426.getClass(), "nano", 520302725);
        setField(term16421, term16421.getClass(), "time", term16426);
        setField(term16382, term16382.getClass(), "createdAt", term16421);
        setIntField(term16432, term16432.getClass(), "year", 2016);
        setShortField(term16432, term16432.getClass(), "month", (short) 2);
        setShortField(term16432, term16432.getClass(), "day", (short) 15);
        setField(term16431, term16431.getClass(), "date", term16432);
        setByteField(term16436, term16436.getClass(), "hour", (byte) 7);
        setByteField(term16436, term16436.getClass(), "minute", (byte) 36);
        setByteField(term16436, term16436.getClass(), "second", (byte) 21);
        setIntField(term16436, term16436.getClass(), "nano", 74269011);
        setField(term16431, term16431.getClass(), "time", term16436);
        setField(term16382, term16382.getClass(), "updatedAt", term16431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SvGTualQPa";
        callMethod(klass, "setContent", argTypes, term16382, args);
    }

};


