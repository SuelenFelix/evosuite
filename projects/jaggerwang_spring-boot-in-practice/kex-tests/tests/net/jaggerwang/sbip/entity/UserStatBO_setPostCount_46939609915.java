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

public class UserStatBO_setPostCount_46939609915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11969;
     Object term12002;

    public UserStatBO_setPostCount_46939609915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11970 = new Long(8034714140377562739L);
        Long term11972 = new Long(-2924531382671518368L);
        Long term11974 = new Long(0L);
        Long term11976 = new Long(0L);
        Long term11978 = new Long(0L);
        Long term11980 = new Long(0L);
        term11969 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11982 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11983 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11987 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11992 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11993 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11997 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11969, term11969.getClass(), "id", term11970);
        setField(term11969, term11969.getClass(), "userId", term11972);
        setField(term11969, term11969.getClass(), "postCount", term11974);
        setField(term11969, term11969.getClass(), "likeCount", term11976);
        setField(term11969, term11969.getClass(), "followingCount", term11978);
        setField(term11969, term11969.getClass(), "followerCount", term11980);
        setIntField(term11983, term11983.getClass(), "year", 2025);
        setShortField(term11983, term11983.getClass(), "month", (short) 12);
        setShortField(term11983, term11983.getClass(), "day", (short) 16);
        setField(term11982, term11982.getClass(), "date", term11983);
        setByteField(term11987, term11987.getClass(), "hour", (byte) 7);
        setByteField(term11987, term11987.getClass(), "minute", (byte) 53);
        setByteField(term11987, term11987.getClass(), "second", (byte) 23);
        setIntField(term11987, term11987.getClass(), "nano", 532991944);
        setField(term11982, term11982.getClass(), "time", term11987);
        setField(term11969, term11969.getClass(), "createdAt", term11982);
        setIntField(term11993, term11993.getClass(), "year", 2024);
        setShortField(term11993, term11993.getClass(), "month", (short) 2);
        setShortField(term11993, term11993.getClass(), "day", (short) 5);
        setField(term11992, term11992.getClass(), "date", term11993);
        setByteField(term11997, term11997.getClass(), "hour", (byte) 12);
        setByteField(term11997, term11997.getClass(), "minute", (byte) 28);
        setByteField(term11997, term11997.getClass(), "second", (byte) 37);
        setIntField(term11997, term11997.getClass(), "nano", 689695229);
        setField(term11992, term11992.getClass(), "time", term11997);
        setField(term11969, term11969.getClass(), "updatedAt", term11992);
        term12002 = new Long(-3948863953565024517L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12002;
        callMethod(klass, "setPostCount", argTypes, term11969, args);
    }

};


