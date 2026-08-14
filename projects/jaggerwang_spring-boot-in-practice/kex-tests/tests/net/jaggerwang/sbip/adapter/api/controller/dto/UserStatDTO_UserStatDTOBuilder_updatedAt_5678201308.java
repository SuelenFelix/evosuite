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

public class UserStatDTO_UserStatDTOBuilder_updatedAt_5678201308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58175;
     Object term58208;

    public UserStatDTO_UserStatDTOBuilder_updatedAt_5678201308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58176 = new Long(3702843766990151556L);
        Long term58178 = new Long(8588047499427599529L);
        Long term58180 = new Long(6126964308136745488L);
        Long term58182 = new Long(-8307140005890062599L);
        Long term58184 = new Long(195324792518519601L);
        Long term58186 = new Long(8741861751389973987L);
        term58175 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder"));
        Object term58188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58193 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58203 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58175, term58175.getClass(), "id", term58176);
        setField(term58175, term58175.getClass(), "userId", term58178);
        setField(term58175, term58175.getClass(), "postCount", term58180);
        setField(term58175, term58175.getClass(), "likeCount", term58182);
        setField(term58175, term58175.getClass(), "followingCount", term58184);
        setField(term58175, term58175.getClass(), "followerCount", term58186);
        setIntField(term58189, term58189.getClass(), "year", 2029);
        setShortField(term58189, term58189.getClass(), "month", (short) 1);
        setShortField(term58189, term58189.getClass(), "day", (short) 20);
        setField(term58188, term58188.getClass(), "date", term58189);
        setByteField(term58193, term58193.getClass(), "hour", (byte) 0);
        setByteField(term58193, term58193.getClass(), "minute", (byte) 45);
        setByteField(term58193, term58193.getClass(), "second", (byte) 30);
        setIntField(term58193, term58193.getClass(), "nano", 207682029);
        setField(term58188, term58188.getClass(), "time", term58193);
        setField(term58175, term58175.getClass(), "createdAt", term58188);
        setIntField(term58199, term58199.getClass(), "year", 2029);
        setShortField(term58199, term58199.getClass(), "month", (short) 9);
        setShortField(term58199, term58199.getClass(), "day", (short) 28);
        setField(term58198, term58198.getClass(), "date", term58199);
        setByteField(term58203, term58203.getClass(), "hour", (byte) 23);
        setByteField(term58203, term58203.getClass(), "minute", (byte) 32);
        setByteField(term58203, term58203.getClass(), "second", (byte) 19);
        setIntField(term58203, term58203.getClass(), "nano", 974262271);
        setField(term58198, term58198.getClass(), "time", term58203);
        setField(term58175, term58175.getClass(), "updatedAt", term58198);
        term58208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58213 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term58209, term58209.getClass(), "year", 2022);
        setShortField(term58209, term58209.getClass(), "month", (short) 2);
        setShortField(term58209, term58209.getClass(), "day", (short) 27);
        setField(term58208, term58208.getClass(), "date", term58209);
        setByteField(term58213, term58213.getClass(), "hour", (byte) 8);
        setByteField(term58213, term58213.getClass(), "minute", (byte) 19);
        setByteField(term58213, term58213.getClass(), "second", (byte) 13);
        setIntField(term58213, term58213.getClass(), "nano", 625027479);
        setField(term58208, term58208.getClass(), "time", term58213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO$UserStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term58208;
        callMethod(klass, "updatedAt", argTypes, term58175, args);
    }

};


