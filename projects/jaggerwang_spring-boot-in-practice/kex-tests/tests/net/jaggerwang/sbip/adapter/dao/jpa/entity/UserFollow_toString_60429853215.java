package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserFollow_toString_60429853215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11942;

    public UserFollow_toString_60429853215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11943 = new Long(3472971833455746664L);
        Long term11945 = new Long(3731931947533293029L);
        Long term11947 = new Long(9214973322210954344L);
        term11942 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11964 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11942, term11942.getClass(), "id", term11943);
        setField(term11942, term11942.getClass(), "followingId", term11945);
        setField(term11942, term11942.getClass(), "followerId", term11947);
        setIntField(term11950, term11950.getClass(), "year", 2014);
        setShortField(term11950, term11950.getClass(), "month", (short) 6);
        setShortField(term11950, term11950.getClass(), "day", (short) 28);
        setField(term11949, term11949.getClass(), "date", term11950);
        setByteField(term11954, term11954.getClass(), "hour", (byte) 7);
        setByteField(term11954, term11954.getClass(), "minute", (byte) 14);
        setByteField(term11954, term11954.getClass(), "second", (byte) 59);
        setIntField(term11954, term11954.getClass(), "nano", 314278386);
        setField(term11949, term11949.getClass(), "time", term11954);
        setField(term11942, term11942.getClass(), "createdAt", term11949);
        setIntField(term11960, term11960.getClass(), "year", 2015);
        setShortField(term11960, term11960.getClass(), "month", (short) 10);
        setShortField(term11960, term11960.getClass(), "day", (short) 8);
        setField(term11959, term11959.getClass(), "date", term11960);
        setByteField(term11964, term11964.getClass(), "hour", (byte) 22);
        setByteField(term11964, term11964.getClass(), "minute", (byte) 20);
        setByteField(term11964, term11964.getClass(), "second", (byte) 59);
        setIntField(term11964, term11964.getClass(), "nano", 350521903);
        setField(term11959, term11959.getClass(), "time", term11964);
        setField(term11942, term11942.getClass(), "updatedAt", term11959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11942, args);
    }

};


