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

public class UserStatBO_getFollowingCount_2358166269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11767;

    public UserStatBO_getFollowingCount_2358166269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11768 = new Long(-1214968196781083707L);
        Long term11770 = new Long(-1804015692891701666L);
        Long term11772 = new Long(0L);
        Long term11774 = new Long(0L);
        Long term11776 = new Long(0L);
        Long term11778 = new Long(0L);
        term11767 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserStatBO"));
        Object term11780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11785 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11795 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11767, term11767.getClass(), "id", term11768);
        setField(term11767, term11767.getClass(), "userId", term11770);
        setField(term11767, term11767.getClass(), "postCount", term11772);
        setField(term11767, term11767.getClass(), "likeCount", term11774);
        setField(term11767, term11767.getClass(), "followingCount", term11776);
        setField(term11767, term11767.getClass(), "followerCount", term11778);
        setIntField(term11781, term11781.getClass(), "year", 2010);
        setShortField(term11781, term11781.getClass(), "month", (short) 2);
        setShortField(term11781, term11781.getClass(), "day", (short) 24);
        setField(term11780, term11780.getClass(), "date", term11781);
        setByteField(term11785, term11785.getClass(), "hour", (byte) 17);
        setByteField(term11785, term11785.getClass(), "minute", (byte) 58);
        setByteField(term11785, term11785.getClass(), "second", (byte) 56);
        setIntField(term11785, term11785.getClass(), "nano", 291725532);
        setField(term11780, term11780.getClass(), "time", term11785);
        setField(term11767, term11767.getClass(), "createdAt", term11780);
        setIntField(term11791, term11791.getClass(), "year", 2028);
        setShortField(term11791, term11791.getClass(), "month", (short) 7);
        setShortField(term11791, term11791.getClass(), "day", (short) 22);
        setField(term11790, term11790.getClass(), "date", term11791);
        setByteField(term11795, term11795.getClass(), "hour", (byte) 18);
        setByteField(term11795, term11795.getClass(), "minute", (byte) 33);
        setByteField(term11795, term11795.getClass(), "second", (byte) 7);
        setIntField(term11795, term11795.getClass(), "nano", 763613074);
        setField(term11790, term11790.getClass(), "time", term11795);
        setField(term11767, term11767.getClass(), "updatedAt", term11790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFollowingCount", argTypes, term11767, args);
    }

};


