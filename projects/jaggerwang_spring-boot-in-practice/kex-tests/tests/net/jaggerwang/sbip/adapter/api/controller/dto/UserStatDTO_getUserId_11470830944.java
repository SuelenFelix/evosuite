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

public class UserStatDTO_getUserId_11470830944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28229;

    public UserStatDTO_getUserId_11470830944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28230 = new Long(-599981502351912419L);
        Long term28232 = new Long(8171709541116491249L);
        Long term28234 = new Long(1867943942587005261L);
        Long term28236 = new Long(-9168517519350392654L);
        Long term28238 = new Long(4828755228445882127L);
        Long term28240 = new Long(970120292495348028L);
        term28229 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28257 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28229, term28229.getClass(), "id", term28230);
        setField(term28229, term28229.getClass(), "userId", term28232);
        setField(term28229, term28229.getClass(), "postCount", term28234);
        setField(term28229, term28229.getClass(), "likeCount", term28236);
        setField(term28229, term28229.getClass(), "followingCount", term28238);
        setField(term28229, term28229.getClass(), "followerCount", term28240);
        setIntField(term28243, term28243.getClass(), "year", 2019);
        setShortField(term28243, term28243.getClass(), "month", (short) 12);
        setShortField(term28243, term28243.getClass(), "day", (short) 8);
        setField(term28242, term28242.getClass(), "date", term28243);
        setByteField(term28247, term28247.getClass(), "hour", (byte) 6);
        setByteField(term28247, term28247.getClass(), "minute", (byte) 0);
        setByteField(term28247, term28247.getClass(), "second", (byte) 32);
        setIntField(term28247, term28247.getClass(), "nano", 371231280);
        setField(term28242, term28242.getClass(), "time", term28247);
        setField(term28229, term28229.getClass(), "createdAt", term28242);
        setIntField(term28253, term28253.getClass(), "year", 2024);
        setShortField(term28253, term28253.getClass(), "month", (short) 3);
        setShortField(term28253, term28253.getClass(), "day", (short) 19);
        setField(term28252, term28252.getClass(), "date", term28253);
        setByteField(term28257, term28257.getClass(), "hour", (byte) 16);
        setByteField(term28257, term28257.getClass(), "minute", (byte) 8);
        setByteField(term28257, term28257.getClass(), "second", (byte) 55);
        setIntField(term28257, term28257.getClass(), "nano", 955822950);
        setField(term28252, term28252.getClass(), "time", term28257);
        setField(term28229, term28229.getClass(), "updatedAt", term28252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term28229, args);
    }

};


