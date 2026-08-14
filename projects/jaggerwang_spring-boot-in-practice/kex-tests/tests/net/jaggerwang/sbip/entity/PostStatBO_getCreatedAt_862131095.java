package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_getCreatedAt_862131095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24545;

    public PostStatBO_getCreatedAt_862131095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24546 = new Long(-6503611645609982617L);
        Long term24548 = new Long(-7574091101944828886L);
        Long term24550 = new Long(0L);
        term24545 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24557 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24562 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24563 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24567 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24545, term24545.getClass(), "id", term24546);
        setField(term24545, term24545.getClass(), "postId", term24548);
        setField(term24545, term24545.getClass(), "likeCount", term24550);
        setIntField(term24553, term24553.getClass(), "year", 2016);
        setShortField(term24553, term24553.getClass(), "month", (short) 4);
        setShortField(term24553, term24553.getClass(), "day", (short) 23);
        setField(term24552, term24552.getClass(), "date", term24553);
        setByteField(term24557, term24557.getClass(), "hour", (byte) 13);
        setByteField(term24557, term24557.getClass(), "minute", (byte) 34);
        setByteField(term24557, term24557.getClass(), "second", (byte) 22);
        setIntField(term24557, term24557.getClass(), "nano", 20103660);
        setField(term24552, term24552.getClass(), "time", term24557);
        setField(term24545, term24545.getClass(), "createdAt", term24552);
        setIntField(term24563, term24563.getClass(), "year", 2023);
        setShortField(term24563, term24563.getClass(), "month", (short) 1);
        setShortField(term24563, term24563.getClass(), "day", (short) 24);
        setField(term24562, term24562.getClass(), "date", term24563);
        setByteField(term24567, term24567.getClass(), "hour", (byte) 10);
        setByteField(term24567, term24567.getClass(), "minute", (byte) 26);
        setByteField(term24567, term24567.getClass(), "second", (byte) 14);
        setIntField(term24567, term24567.getClass(), "nano", 736807866);
        setField(term24562, term24562.getClass(), "time", term24567);
        setField(term24545, term24545.getClass(), "updatedAt", term24562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term24545, args);
    }

};


