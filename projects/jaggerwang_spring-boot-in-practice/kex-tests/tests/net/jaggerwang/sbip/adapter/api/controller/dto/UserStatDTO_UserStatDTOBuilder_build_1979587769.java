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

public class UserStatDTO_UserStatDTOBuilder_build_1979587769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58218;

    public UserStatDTO_UserStatDTOBuilder_build_1979587769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58219 = new Long(-6267867662540638557L);
        Long term58221 = new Long(7789239238809338335L);
        Long term58223 = new Long(7148416754314775058L);
        Long term58225 = new Long(-5511482978305240721L);
        Long term58227 = new Long(7004919285972689886L);
        Long term58229 = new Long(7099191052876902273L);
        term58218 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58246 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58218, term58218.getClass(), "id", term58219);
        setField(term58218, term58218.getClass(), "userId", term58221);
        setField(term58218, term58218.getClass(), "postCount", term58223);
        setField(term58218, term58218.getClass(), "likeCount", term58225);
        setField(term58218, term58218.getClass(), "followingCount", term58227);
        setField(term58218, term58218.getClass(), "followerCount", term58229);
        setIntField(term58232, term58232.getClass(), "year", 2014);
        setShortField(term58232, term58232.getClass(), "month", (short) 6);
        setShortField(term58232, term58232.getClass(), "day", (short) 27);
        setField(term58231, term58231.getClass(), "date", term58232);
        setByteField(term58236, term58236.getClass(), "hour", (byte) 12);
        setByteField(term58236, term58236.getClass(), "minute", (byte) 38);
        setByteField(term58236, term58236.getClass(), "second", (byte) 25);
        setIntField(term58236, term58236.getClass(), "nano", 969490220);
        setField(term58231, term58231.getClass(), "time", term58236);
        setField(term58218, term58218.getClass(), "createdAt", term58231);
        setIntField(term58242, term58242.getClass(), "year", 2011);
        setShortField(term58242, term58242.getClass(), "month", (short) 3);
        setShortField(term58242, term58242.getClass(), "day", (short) 10);
        setField(term58241, term58241.getClass(), "date", term58242);
        setByteField(term58246, term58246.getClass(), "hour", (byte) 17);
        setByteField(term58246, term58246.getClass(), "minute", (byte) 52);
        setByteField(term58246, term58246.getClass(), "second", (byte) 30);
        setIntField(term58246, term58246.getClass(), "nano", 491721919);
        setField(term58241, term58241.getClass(), "time", term58246);
        setField(term58218, term58218.getClass(), "updatedAt", term58241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term58218, args);
    }

};


