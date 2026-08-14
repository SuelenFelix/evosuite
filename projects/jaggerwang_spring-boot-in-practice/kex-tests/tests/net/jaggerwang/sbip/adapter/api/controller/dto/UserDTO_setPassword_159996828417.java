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
import java.lang.String;
import java.util.HashMap;
import java.lang.Boolean;

public class UserDTO_setPassword_159996828417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8374;

    public UserDTO_setPassword_159996828417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8375 = new Long(-8892586408602479513L);
        Long term8425 = new Long(4616440478358528406L);
        Long term8460 = new Long(3427570961451840069L);
        Long term8462 = new Long(4502292577098212311L);
        Class<? extends Object> term8662 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term8661 = ((Class) term8662).getDeclaredField((String) "LOCAL");
        ((Field) term8661).setAccessible(true);
        Object enum15 = ((Field) term8661).get((Object) null);
        Long term8510 = new Long(-3730936709704460408L);
        HashMap term8556 = new HashMap();
        Long term8565 = new Long(-8614778293741404325L);
        Long term8567 = new Long(-5447369594017685765L);
        Long term8569 = new Long(-5724112525188606013L);
        Long term8571 = new Long(-6100012593724108983L);
        Long term8573 = new Long(5465527210299101732L);
        Long term8575 = new Long(4699157009689333952L);
        Boolean term8597 = new Boolean(false);
        term8374 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term8439 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8440 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8444 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8449 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8450 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8454 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8459 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term8497 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term8524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8539 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8564 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term8577 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8578 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8582 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8587 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8588 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8592 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term8374, term8374.getClass(), "id", term8375);
        setField(term8374, term8374.getClass(), "username", "rLHAoqXgPh");
        setField(term8374, term8374.getClass(), "password", "zUlRdimJtU");
        setField(term8374, term8374.getClass(), "mobile", "vwbEQQNQrx");
        setField(term8374, term8374.getClass(), "email", "xtftXXMbem");
        setField(term8374, term8374.getClass(), "avatarId", term8425);
        setField(term8374, term8374.getClass(), "intro", "cudZvLMQon");
        setIntField(term8440, term8440.getClass(), "year", 2021);
        setShortField(term8440, term8440.getClass(), "month", (short) 4);
        setShortField(term8440, term8440.getClass(), "day", (short) 26);
        setField(term8439, term8439.getClass(), "date", term8440);
        setByteField(term8444, term8444.getClass(), "hour", (byte) 11);
        setByteField(term8444, term8444.getClass(), "minute", (byte) 34);
        setByteField(term8444, term8444.getClass(), "second", (byte) 15);
        setIntField(term8444, term8444.getClass(), "nano", 638206023);
        setField(term8439, term8439.getClass(), "time", term8444);
        setField(term8374, term8374.getClass(), "createdAt", term8439);
        setIntField(term8450, term8450.getClass(), "year", 2013);
        setShortField(term8450, term8450.getClass(), "month", (short) 9);
        setShortField(term8450, term8450.getClass(), "day", (short) 13);
        setField(term8449, term8449.getClass(), "date", term8450);
        setByteField(term8454, term8454.getClass(), "hour", (byte) 14);
        setByteField(term8454, term8454.getClass(), "minute", (byte) 36);
        setByteField(term8454, term8454.getClass(), "second", (byte) 59);
        setIntField(term8454, term8454.getClass(), "nano", 363124001);
        setField(term8449, term8449.getClass(), "time", term8454);
        setField(term8374, term8374.getClass(), "updatedAt", term8449);
        setField(term8459, term8459.getClass(), "id", term8460);
        setField(term8459, term8459.getClass(), "userId", term8462);
        setField(term8459, term8459.getClass(), "region", enum15);
        setField(term8459, term8459.getClass(), "bucket", "lihXWlGDxk");
        setField(term8459, term8459.getClass(), "path", "JmcmxoGhIK");
        setField(term8497, term8497.getClass(), "name", "jXzmYyrnnT");
        setField(term8497, term8497.getClass(), "size", term8510);
        setField(term8497, term8497.getClass(), "type", "igCAtimmYB");
        setField(term8459, term8459.getClass(), "meta", term8497);
        setIntField(term8525, term8525.getClass(), "year", 2020);
        setShortField(term8525, term8525.getClass(), "month", (short) 12);
        setShortField(term8525, term8525.getClass(), "day", (short) 21);
        setField(term8524, term8524.getClass(), "date", term8525);
        setByteField(term8529, term8529.getClass(), "hour", (byte) 20);
        setByteField(term8529, term8529.getClass(), "minute", (byte) 16);
        setByteField(term8529, term8529.getClass(), "second", (byte) 59);
        setIntField(term8529, term8529.getClass(), "nano", 976524801);
        setField(term8524, term8524.getClass(), "time", term8529);
        setField(term8459, term8459.getClass(), "createdAt", term8524);
        setIntField(term8535, term8535.getClass(), "year", 2028);
        setShortField(term8535, term8535.getClass(), "month", (short) 5);
        setShortField(term8535, term8535.getClass(), "day", (short) 15);
        setField(term8534, term8534.getClass(), "date", term8535);
        setByteField(term8539, term8539.getClass(), "hour", (byte) 20);
        setByteField(term8539, term8539.getClass(), "minute", (byte) 31);
        setByteField(term8539, term8539.getClass(), "second", (byte) 49);
        setIntField(term8539, term8539.getClass(), "nano", 945744862);
        setField(term8534, term8534.getClass(), "time", term8539);
        setField(term8459, term8459.getClass(), "updatedAt", term8534);
        setField(term8459, term8459.getClass(), "url", "DyiXbeYIaN");
        setField(term8459, term8459.getClass(), "thumbs", term8556);
        setField(term8374, term8374.getClass(), "avatar", term8459);
        setField(term8564, term8564.getClass(), "id", term8565);
        setField(term8564, term8564.getClass(), "userId", term8567);
        setField(term8564, term8564.getClass(), "postCount", term8569);
        setField(term8564, term8564.getClass(), "likeCount", term8571);
        setField(term8564, term8564.getClass(), "followingCount", term8573);
        setField(term8564, term8564.getClass(), "followerCount", term8575);
        setIntField(term8578, term8578.getClass(), "year", 2016);
        setShortField(term8578, term8578.getClass(), "month", (short) 6);
        setShortField(term8578, term8578.getClass(), "day", (short) 23);
        setField(term8577, term8577.getClass(), "date", term8578);
        setByteField(term8582, term8582.getClass(), "hour", (byte) 20);
        setByteField(term8582, term8582.getClass(), "minute", (byte) 51);
        setByteField(term8582, term8582.getClass(), "second", (byte) 43);
        setIntField(term8582, term8582.getClass(), "nano", 284389409);
        setField(term8577, term8577.getClass(), "time", term8582);
        setField(term8564, term8564.getClass(), "createdAt", term8577);
        setIntField(term8588, term8588.getClass(), "year", 2014);
        setShortField(term8588, term8588.getClass(), "month", (short) 10);
        setShortField(term8588, term8588.getClass(), "day", (short) 7);
        setField(term8587, term8587.getClass(), "date", term8588);
        setByteField(term8592, term8592.getClass(), "hour", (byte) 12);
        setByteField(term8592, term8592.getClass(), "minute", (byte) 59);
        setByteField(term8592, term8592.getClass(), "second", (byte) 39);
        setIntField(term8592, term8592.getClass(), "nano", 603709306);
        setField(term8587, term8587.getClass(), "time", term8592);
        setField(term8564, term8564.getClass(), "updatedAt", term8587);
        setField(term8374, term8374.getClass(), "stat", term8564);
        setField(term8374, term8374.getClass(), "following", term8597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kVEZMHmRtR";
        callMethod(klass, "setPassword", argTypes, term8374, args);
    }

};


