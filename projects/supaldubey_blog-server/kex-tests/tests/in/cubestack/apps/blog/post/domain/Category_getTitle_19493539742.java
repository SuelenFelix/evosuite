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

public class Category_getTitle_19493539742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81895;

    public Category_getTitle_19493539742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81944 = new ArrayList();
        Long term81948 = new Long(8156554915757243776L);
        term81895 = newInstance(Class.forName("in.cubestack.apps.blog.post.domain.Category"));
        Object term81950 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81955 = newInstance(Class.forName("java.time.LocalTime"));
        Object term81960 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term81961 = newInstance(Class.forName("java.time.LocalDate"));
        Object term81965 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term81895, term81895.getClass(), "title", "IDibKvfdDt");
        setField(term81895, term81895.getClass(), "metaTitle", "sKLtBTAssF");
        setField(term81895, term81895.getClass(), "slug", "ROGqSdboUf");
        setField(term81895, term81895.getClass(), "content", "NfGNgrTcyY");
        setField(term81895, term81895.getClass(), "postCategories", term81944);
        setField(term81895, term81895.getClass(), "id", term81948);
        setIntField(term81951, term81951.getClass(), "year", 2015);
        setShortField(term81951, term81951.getClass(), "month", (short) 1);
        setShortField(term81951, term81951.getClass(), "day", (short) 25);
        setField(term81950, term81950.getClass(), "date", term81951);
        setByteField(term81955, term81955.getClass(), "hour", (byte) 18);
        setByteField(term81955, term81955.getClass(), "minute", (byte) 44);
        setByteField(term81955, term81955.getClass(), "second", (byte) 8);
        setIntField(term81955, term81955.getClass(), "nano", 166791078);
        setField(term81950, term81950.getClass(), "time", term81955);
        setField(term81895, term81895.getClass(), "createdAt", term81950);
        setIntField(term81961, term81961.getClass(), "year", 2012);
        setShortField(term81961, term81961.getClass(), "month", (short) 8);
        setShortField(term81961, term81961.getClass(), "day", (short) 14);
        setField(term81960, term81960.getClass(), "date", term81961);
        setByteField(term81965, term81965.getClass(), "hour", (byte) 23);
        setByteField(term81965, term81965.getClass(), "minute", (byte) 6);
        setByteField(term81965, term81965.getClass(), "second", (byte) 21);
        setIntField(term81965, term81965.getClass(), "nano", 990920610);
        setField(term81960, term81960.getClass(), "time", term81965);
        setField(term81895, term81895.getClass(), "updatedAt", term81960);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term81895, args);
    }

};


