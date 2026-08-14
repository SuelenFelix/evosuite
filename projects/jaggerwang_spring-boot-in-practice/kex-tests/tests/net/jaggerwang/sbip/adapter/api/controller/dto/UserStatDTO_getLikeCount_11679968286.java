package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDTO_getLikeCount_11679968286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28295;

    public UserStatDTO_getLikeCount_11679968286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28296 = new Long(370847120687610747L);
        Long term28298 = new Long(-6399462725251497844L);
        Long term28300 = new Long(-4855037955202452256L);
        Long term28302 = new Long(-5903549884298836343L);
        Long term28304 = new Long(-3058119213533262883L);
        Long term28306 = new Long(1950957495500453461L);
        term28295 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28313 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28323 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28295, term28295.getClass(), "id", term28296);
        setField(term28295, term28295.getClass(), "userId", term28298);
        setField(term28295, term28295.getClass(), "postCount", term28300);
        setField(term28295, term28295.getClass(), "likeCount", term28302);
        setField(term28295, term28295.getClass(), "followingCount", term28304);
        setField(term28295, term28295.getClass(), "followerCount", term28306);
        setIntField(term28309, term28309.getClass(), "year", 2023);
        setShortField(term28309, term28309.getClass(), "month", (short) 11);
        setShortField(term28309, term28309.getClass(), "day", (short) 8);
        setField(term28308, term28308.getClass(), "date", term28309);
        setByteField(term28313, term28313.getClass(), "hour", (byte) 21);
        setByteField(term28313, term28313.getClass(), "minute", (byte) 57);
        setByteField(term28313, term28313.getClass(), "second", (byte) 28);
        setIntField(term28313, term28313.getClass(), "nano", 426944685);
        setField(term28308, term28308.getClass(), "time", term28313);
        setField(term28295, term28295.getClass(), "createdAt", term28308);
        setIntField(term28319, term28319.getClass(), "year", 2020);
        setShortField(term28319, term28319.getClass(), "month", (short) 9);
        setShortField(term28319, term28319.getClass(), "day", (short) 2);
        setField(term28318, term28318.getClass(), "date", term28319);
        setByteField(term28323, term28323.getClass(), "hour", (byte) 17);
        setByteField(term28323, term28323.getClass(), "minute", (byte) 47);
        setByteField(term28323, term28323.getClass(), "second", (byte) 32);
        setIntField(term28323, term28323.getClass(), "nano", 161829485);
        setField(term28318, term28318.getClass(), "time", term28323);
        setField(term28295, term28295.getClass(), "updatedAt", term28318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term28295, args);
    }

};


