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

public class UserStatBO_setUserId_212278631214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11934;
     Object term11967;

    public UserStatBO_setUserId_212278631214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11935 = new Long(8802866251294305945L);
        Long term11937 = new Long(4513004407927379358L);
        Long term11939 = new Long(0L);
        Long term11941 = new Long(0L);
        Long term11943 = new Long(0L);
        Long term11945 = new Long(0L);
        term11934 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11952 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11962 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11934, term11934.getClass(), "id", term11935);
        setField(term11934, term11934.getClass(), "userId", term11937);
        setField(term11934, term11934.getClass(), "postCount", term11939);
        setField(term11934, term11934.getClass(), "likeCount", term11941);
        setField(term11934, term11934.getClass(), "followingCount", term11943);
        setField(term11934, term11934.getClass(), "followerCount", term11945);
        setIntField(term11948, term11948.getClass(), "year", 2020);
        setShortField(term11948, term11948.getClass(), "month", (short) 5);
        setShortField(term11948, term11948.getClass(), "day", (short) 12);
        setField(term11947, term11947.getClass(), "date", term11948);
        setByteField(term11952, term11952.getClass(), "hour", (byte) 0);
        setByteField(term11952, term11952.getClass(), "minute", (byte) 15);
        setByteField(term11952, term11952.getClass(), "second", (byte) 24);
        setIntField(term11952, term11952.getClass(), "nano", 250257744);
        setField(term11947, term11947.getClass(), "time", term11952);
        setField(term11934, term11934.getClass(), "createdAt", term11947);
        setIntField(term11958, term11958.getClass(), "year", 2013);
        setShortField(term11958, term11958.getClass(), "month", (short) 9);
        setShortField(term11958, term11958.getClass(), "day", (short) 19);
        setField(term11957, term11957.getClass(), "date", term11958);
        setByteField(term11962, term11962.getClass(), "hour", (byte) 12);
        setByteField(term11962, term11962.getClass(), "minute", (byte) 29);
        setByteField(term11962, term11962.getClass(), "second", (byte) 28);
        setIntField(term11962, term11962.getClass(), "nano", 244069764);
        setField(term11957, term11957.getClass(), "time", term11962);
        setField(term11934, term11934.getClass(), "updatedAt", term11957);
        term11967 = new Long(-7115418542247301000L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11967;
        callMethod(klass, "setUserId", argTypes, term11934, args);
    }

};


