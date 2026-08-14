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

public class UserStatDTO_UserStatDTOBuilder_likeCount_12759650014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58027;
     Object term58060;

    public UserStatDTO_UserStatDTOBuilder_likeCount_12759650014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58028 = new Long(-7968999170526273722L);
        Long term58030 = new Long(-391398551284253915L);
        Long term58032 = new Long(-2791473406557466846L);
        Long term58034 = new Long(-3895780534600959979L);
        Long term58036 = new Long(789661870469773196L);
        Long term58038 = new Long(-3484599398786804700L);
        term58027 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58040 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58041 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58045 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58050 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58051 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58055 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58027, term58027.getClass(), "id", term58028);
        setField(term58027, term58027.getClass(), "userId", term58030);
        setField(term58027, term58027.getClass(), "postCount", term58032);
        setField(term58027, term58027.getClass(), "likeCount", term58034);
        setField(term58027, term58027.getClass(), "followingCount", term58036);
        setField(term58027, term58027.getClass(), "followerCount", term58038);
        setIntField(term58041, term58041.getClass(), "year", 2018);
        setShortField(term58041, term58041.getClass(), "month", (short) 10);
        setShortField(term58041, term58041.getClass(), "day", (short) 20);
        setField(term58040, term58040.getClass(), "date", term58041);
        setByteField(term58045, term58045.getClass(), "hour", (byte) 3);
        setByteField(term58045, term58045.getClass(), "minute", (byte) 46);
        setByteField(term58045, term58045.getClass(), "second", (byte) 11);
        setIntField(term58045, term58045.getClass(), "nano", 355046607);
        setField(term58040, term58040.getClass(), "time", term58045);
        setField(term58027, term58027.getClass(), "createdAt", term58040);
        setIntField(term58051, term58051.getClass(), "year", 2021);
        setShortField(term58051, term58051.getClass(), "month", (short) 6);
        setShortField(term58051, term58051.getClass(), "day", (short) 25);
        setField(term58050, term58050.getClass(), "date", term58051);
        setByteField(term58055, term58055.getClass(), "hour", (byte) 14);
        setByteField(term58055, term58055.getClass(), "minute", (byte) 46);
        setByteField(term58055, term58055.getClass(), "second", (byte) 35);
        setIntField(term58055, term58055.getClass(), "nano", 585866950);
        setField(term58050, term58050.getClass(), "time", term58055);
        setField(term58027, term58027.getClass(), "updatedAt", term58050);
        term58060 = new Long(-5259338558309636239L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term58060;
        callMethod(klass, "likeCount", argTypes, term58027, args);
    }

};


