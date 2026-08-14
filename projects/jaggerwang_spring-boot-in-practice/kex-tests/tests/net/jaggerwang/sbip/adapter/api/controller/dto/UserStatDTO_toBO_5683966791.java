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

public class UserStatDTO_toBO_5683966791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28163;

    public UserStatDTO_toBO_5683966791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28164 = new Long(-3565554762799701668L);
        Long term28166 = new Long(-6837989212848250735L);
        Long term28168 = new Long(-4231979631084175364L);
        Long term28170 = new Long(1634166935474035772L);
        Long term28172 = new Long(-2614906266506360948L);
        Long term28174 = new Long(1133267598258375793L);
        term28163 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28191 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28163, term28163.getClass(), "id", term28164);
        setField(term28163, term28163.getClass(), "userId", term28166);
        setField(term28163, term28163.getClass(), "postCount", term28168);
        setField(term28163, term28163.getClass(), "likeCount", term28170);
        setField(term28163, term28163.getClass(), "followingCount", term28172);
        setField(term28163, term28163.getClass(), "followerCount", term28174);
        setIntField(term28177, term28177.getClass(), "year", 2015);
        setShortField(term28177, term28177.getClass(), "month", (short) 1);
        setShortField(term28177, term28177.getClass(), "day", (short) 7);
        setField(term28176, term28176.getClass(), "date", term28177);
        setByteField(term28181, term28181.getClass(), "hour", (byte) 10);
        setByteField(term28181, term28181.getClass(), "minute", (byte) 8);
        setByteField(term28181, term28181.getClass(), "second", (byte) 31);
        setIntField(term28181, term28181.getClass(), "nano", 617142943);
        setField(term28176, term28176.getClass(), "time", term28181);
        setField(term28163, term28163.getClass(), "createdAt", term28176);
        setIntField(term28187, term28187.getClass(), "year", 2024);
        setShortField(term28187, term28187.getClass(), "month", (short) 2);
        setShortField(term28187, term28187.getClass(), "day", (short) 2);
        setField(term28186, term28186.getClass(), "date", term28187);
        setByteField(term28191, term28191.getClass(), "hour", (byte) 5);
        setByteField(term28191, term28191.getClass(), "minute", (byte) 8);
        setByteField(term28191, term28191.getClass(), "second", (byte) 10);
        setIntField(term28191, term28191.getClass(), "nano", 897554578);
        setField(term28186, term28186.getClass(), "time", term28191);
        setField(term28163, term28163.getClass(), "updatedAt", term28186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term28163, args);
    }

};


