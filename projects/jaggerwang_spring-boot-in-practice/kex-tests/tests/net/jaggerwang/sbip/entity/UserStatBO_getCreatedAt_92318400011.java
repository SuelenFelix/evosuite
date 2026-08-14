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

public class UserStatBO_getCreatedAt_92318400011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11833;

    public UserStatBO_getCreatedAt_92318400011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11834 = new Long(148047808219672941L);
        Long term11836 = new Long(7489064039921396098L);
        Long term11838 = new Long(0L);
        Long term11840 = new Long(0L);
        Long term11842 = new Long(0L);
        Long term11844 = new Long(0L);
        term11833 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11846 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11847 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11851 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11861 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11833, term11833.getClass(), "id", term11834);
        setField(term11833, term11833.getClass(), "userId", term11836);
        setField(term11833, term11833.getClass(), "postCount", term11838);
        setField(term11833, term11833.getClass(), "likeCount", term11840);
        setField(term11833, term11833.getClass(), "followingCount", term11842);
        setField(term11833, term11833.getClass(), "followerCount", term11844);
        setIntField(term11847, term11847.getClass(), "year", 2020);
        setShortField(term11847, term11847.getClass(), "month", (short) 8);
        setShortField(term11847, term11847.getClass(), "day", (short) 16);
        setField(term11846, term11846.getClass(), "date", term11847);
        setByteField(term11851, term11851.getClass(), "hour", (byte) 4);
        setByteField(term11851, term11851.getClass(), "minute", (byte) 37);
        setByteField(term11851, term11851.getClass(), "second", (byte) 19);
        setIntField(term11851, term11851.getClass(), "nano", 605410923);
        setField(term11846, term11846.getClass(), "time", term11851);
        setField(term11833, term11833.getClass(), "createdAt", term11846);
        setIntField(term11857, term11857.getClass(), "year", 2028);
        setShortField(term11857, term11857.getClass(), "month", (short) 5);
        setShortField(term11857, term11857.getClass(), "day", (short) 2);
        setField(term11856, term11856.getClass(), "date", term11857);
        setByteField(term11861, term11861.getClass(), "hour", (byte) 2);
        setByteField(term11861, term11861.getClass(), "minute", (byte) 59);
        setByteField(term11861, term11861.getClass(), "second", (byte) 30);
        setIntField(term11861, term11861.getClass(), "nano", 222274238);
        setField(term11856, term11856.getClass(), "time", term11861);
        setField(term11833, term11833.getClass(), "updatedAt", term11856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term11833, args);
    }

};


