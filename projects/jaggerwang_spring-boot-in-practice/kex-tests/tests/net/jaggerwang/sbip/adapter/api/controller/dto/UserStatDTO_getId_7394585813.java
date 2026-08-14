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

public class UserStatDTO_getId_7394585813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28196;

    public UserStatDTO_getId_7394585813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28197 = new Long(2990264647913003810L);
        Long term28199 = new Long(-2195794659127490022L);
        Long term28201 = new Long(6142089107139955834L);
        Long term28203 = new Long(-7506365302323354325L);
        Long term28205 = new Long(-4693900822622913579L);
        Long term28207 = new Long(-997945615782059734L);
        term28196 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28224 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28196, term28196.getClass(), "id", term28197);
        setField(term28196, term28196.getClass(), "userId", term28199);
        setField(term28196, term28196.getClass(), "postCount", term28201);
        setField(term28196, term28196.getClass(), "likeCount", term28203);
        setField(term28196, term28196.getClass(), "followingCount", term28205);
        setField(term28196, term28196.getClass(), "followerCount", term28207);
        setIntField(term28210, term28210.getClass(), "year", 2016);
        setShortField(term28210, term28210.getClass(), "month", (short) 1);
        setShortField(term28210, term28210.getClass(), "day", (short) 24);
        setField(term28209, term28209.getClass(), "date", term28210);
        setByteField(term28214, term28214.getClass(), "hour", (byte) 23);
        setByteField(term28214, term28214.getClass(), "minute", (byte) 15);
        setByteField(term28214, term28214.getClass(), "second", (byte) 43);
        setIntField(term28214, term28214.getClass(), "nano", 860277753);
        setField(term28209, term28209.getClass(), "time", term28214);
        setField(term28196, term28196.getClass(), "createdAt", term28209);
        setIntField(term28220, term28220.getClass(), "year", 2016);
        setShortField(term28220, term28220.getClass(), "month", (short) 2);
        setShortField(term28220, term28220.getClass(), "day", (short) 2);
        setField(term28219, term28219.getClass(), "date", term28220);
        setByteField(term28224, term28224.getClass(), "hour", (byte) 16);
        setByteField(term28224, term28224.getClass(), "minute", (byte) 51);
        setByteField(term28224, term28224.getClass(), "second", (byte) 8);
        setIntField(term28224, term28224.getClass(), "nano", 991355221);
        setField(term28219, term28219.getClass(), "time", term28224);
        setField(term28196, term28196.getClass(), "updatedAt", term28219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term28196, args);
    }

};


