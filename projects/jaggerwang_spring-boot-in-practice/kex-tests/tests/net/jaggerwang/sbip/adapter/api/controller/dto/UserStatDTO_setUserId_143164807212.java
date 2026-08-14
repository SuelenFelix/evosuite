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

public class UserStatDTO_setUserId_143164807212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28495;
     Object term28528;

    public UserStatDTO_setUserId_143164807212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28496 = new Long(7450734758126089960L);
        Long term28498 = new Long(1377567570761089535L);
        Long term28500 = new Long(-8531377551015443915L);
        Long term28502 = new Long(-3048863932438585863L);
        Long term28504 = new Long(-7155106718297861156L);
        Long term28506 = new Long(-4191270658895729623L);
        term28495 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28513 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28518 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28519 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28523 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28495, term28495.getClass(), "id", term28496);
        setField(term28495, term28495.getClass(), "userId", term28498);
        setField(term28495, term28495.getClass(), "postCount", term28500);
        setField(term28495, term28495.getClass(), "likeCount", term28502);
        setField(term28495, term28495.getClass(), "followingCount", term28504);
        setField(term28495, term28495.getClass(), "followerCount", term28506);
        setIntField(term28509, term28509.getClass(), "year", 2018);
        setShortField(term28509, term28509.getClass(), "month", (short) 12);
        setShortField(term28509, term28509.getClass(), "day", (short) 17);
        setField(term28508, term28508.getClass(), "date", term28509);
        setByteField(term28513, term28513.getClass(), "hour", (byte) 2);
        setByteField(term28513, term28513.getClass(), "minute", (byte) 8);
        setByteField(term28513, term28513.getClass(), "second", (byte) 33);
        setIntField(term28513, term28513.getClass(), "nano", 799805513);
        setField(term28508, term28508.getClass(), "time", term28513);
        setField(term28495, term28495.getClass(), "createdAt", term28508);
        setIntField(term28519, term28519.getClass(), "year", 2015);
        setShortField(term28519, term28519.getClass(), "month", (short) 12);
        setShortField(term28519, term28519.getClass(), "day", (short) 18);
        setField(term28518, term28518.getClass(), "date", term28519);
        setByteField(term28523, term28523.getClass(), "hour", (byte) 21);
        setByteField(term28523, term28523.getClass(), "minute", (byte) 45);
        setByteField(term28523, term28523.getClass(), "second", (byte) 43);
        setIntField(term28523, term28523.getClass(), "nano", 629261984);
        setField(term28518, term28518.getClass(), "time", term28523);
        setField(term28495, term28495.getClass(), "updatedAt", term28518);
        term28528 = new Long(349726685019432833L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28528;
        callMethod(klass, "setUserId", argTypes, term28495, args);
    }

};


