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

public class UserDTO_setCreatedAt_137940734822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11199;
     Object term11424;

    public UserDTO_setCreatedAt_137940734822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11200 = new Long(-1592696983130738594L);
        Long term11250 = new Long(6902365338255307910L);
        Long term11285 = new Long(-8019730974733786399L);
        Long term11287 = new Long(394960377236392159L);
        Class<? extends Object> term11485 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term11484 = ((Class) term11485).getDeclaredField((String) "LOCAL");
        ((Field) term11484).setAccessible(true);
        Object enum20 = ((Field) term11484).get((Object) null);
        Long term11335 = new Long(-2955854401507097864L);
        HashMap term11381 = new HashMap();
        Long term11390 = new Long(329213208496958131L);
        Long term11392 = new Long(8107921244631636572L);
        Long term11394 = new Long(-7904053112604879960L);
        Long term11396 = new Long(-6602460430714339690L);
        Long term11398 = new Long(21047099434645581L);
        Long term11400 = new Long(-8862087040734407227L);
        Boolean term11422 = new Boolean(true);
        term11199 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term11264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11279 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11284 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term11322 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term11349 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11350 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11354 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11359 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11360 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11364 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11389 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term11402 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11403 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11407 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11417 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11199, term11199.getClass(), "id", term11200);
        setField(term11199, term11199.getClass(), "username", "aSkmSwTnEw");
        setField(term11199, term11199.getClass(), "password", "xvkbvaEGYd");
        setField(term11199, term11199.getClass(), "mobile", "HBGNxdNURv");
        setField(term11199, term11199.getClass(), "email", "mfCpTPPQQm");
        setField(term11199, term11199.getClass(), "avatarId", term11250);
        setField(term11199, term11199.getClass(), "intro", "OcJCIDNIXA");
        setIntField(term11265, term11265.getClass(), "year", 2014);
        setShortField(term11265, term11265.getClass(), "month", (short) 1);
        setShortField(term11265, term11265.getClass(), "day", (short) 26);
        setField(term11264, term11264.getClass(), "date", term11265);
        setByteField(term11269, term11269.getClass(), "hour", (byte) 3);
        setByteField(term11269, term11269.getClass(), "minute", (byte) 31);
        setByteField(term11269, term11269.getClass(), "second", (byte) 56);
        setIntField(term11269, term11269.getClass(), "nano", 100873602);
        setField(term11264, term11264.getClass(), "time", term11269);
        setField(term11199, term11199.getClass(), "createdAt", term11264);
        setIntField(term11275, term11275.getClass(), "year", 2021);
        setShortField(term11275, term11275.getClass(), "month", (short) 12);
        setShortField(term11275, term11275.getClass(), "day", (short) 1);
        setField(term11274, term11274.getClass(), "date", term11275);
        setByteField(term11279, term11279.getClass(), "hour", (byte) 15);
        setByteField(term11279, term11279.getClass(), "minute", (byte) 30);
        setByteField(term11279, term11279.getClass(), "second", (byte) 5);
        setIntField(term11279, term11279.getClass(), "nano", 996341606);
        setField(term11274, term11274.getClass(), "time", term11279);
        setField(term11199, term11199.getClass(), "updatedAt", term11274);
        setField(term11284, term11284.getClass(), "id", term11285);
        setField(term11284, term11284.getClass(), "userId", term11287);
        setField(term11284, term11284.getClass(), "region", enum20);
        setField(term11284, term11284.getClass(), "bucket", "XfRABIFVEp");
        setField(term11284, term11284.getClass(), "path", "MHGKyEnwKc");
        setField(term11322, term11322.getClass(), "name", "ShIELyuULw");
        setField(term11322, term11322.getClass(), "size", term11335);
        setField(term11322, term11322.getClass(), "type", "IpQuOGMgmj");
        setField(term11284, term11284.getClass(), "meta", term11322);
        setIntField(term11350, term11350.getClass(), "year", 2016);
        setShortField(term11350, term11350.getClass(), "month", (short) 4);
        setShortField(term11350, term11350.getClass(), "day", (short) 18);
        setField(term11349, term11349.getClass(), "date", term11350);
        setByteField(term11354, term11354.getClass(), "hour", (byte) 15);
        setByteField(term11354, term11354.getClass(), "minute", (byte) 56);
        setByteField(term11354, term11354.getClass(), "second", (byte) 45);
        setIntField(term11354, term11354.getClass(), "nano", 248103350);
        setField(term11349, term11349.getClass(), "time", term11354);
        setField(term11284, term11284.getClass(), "createdAt", term11349);
        setIntField(term11360, term11360.getClass(), "year", 2028);
        setShortField(term11360, term11360.getClass(), "month", (short) 3);
        setShortField(term11360, term11360.getClass(), "day", (short) 25);
        setField(term11359, term11359.getClass(), "date", term11360);
        setByteField(term11364, term11364.getClass(), "hour", (byte) 6);
        setByteField(term11364, term11364.getClass(), "minute", (byte) 9);
        setByteField(term11364, term11364.getClass(), "second", (byte) 35);
        setIntField(term11364, term11364.getClass(), "nano", 744453524);
        setField(term11359, term11359.getClass(), "time", term11364);
        setField(term11284, term11284.getClass(), "updatedAt", term11359);
        setField(term11284, term11284.getClass(), "url", "pJbnHTYrxn");
        setField(term11284, term11284.getClass(), "thumbs", term11381);
        setField(term11199, term11199.getClass(), "avatar", term11284);
        setField(term11389, term11389.getClass(), "id", term11390);
        setField(term11389, term11389.getClass(), "userId", term11392);
        setField(term11389, term11389.getClass(), "postCount", term11394);
        setField(term11389, term11389.getClass(), "likeCount", term11396);
        setField(term11389, term11389.getClass(), "followingCount", term11398);
        setField(term11389, term11389.getClass(), "followerCount", term11400);
        setIntField(term11403, term11403.getClass(), "year", 2017);
        setShortField(term11403, term11403.getClass(), "month", (short) 6);
        setShortField(term11403, term11403.getClass(), "day", (short) 28);
        setField(term11402, term11402.getClass(), "date", term11403);
        setByteField(term11407, term11407.getClass(), "hour", (byte) 8);
        setByteField(term11407, term11407.getClass(), "minute", (byte) 1);
        setByteField(term11407, term11407.getClass(), "second", (byte) 14);
        setIntField(term11407, term11407.getClass(), "nano", 501033715);
        setField(term11402, term11402.getClass(), "time", term11407);
        setField(term11389, term11389.getClass(), "createdAt", term11402);
        setIntField(term11413, term11413.getClass(), "year", 2016);
        setShortField(term11413, term11413.getClass(), "month", (short) 10);
        setShortField(term11413, term11413.getClass(), "day", (short) 10);
        setField(term11412, term11412.getClass(), "date", term11413);
        setByteField(term11417, term11417.getClass(), "hour", (byte) 16);
        setByteField(term11417, term11417.getClass(), "minute", (byte) 7);
        setByteField(term11417, term11417.getClass(), "second", (byte) 16);
        setIntField(term11417, term11417.getClass(), "nano", 995200309);
        setField(term11412, term11412.getClass(), "time", term11417);
        setField(term11389, term11389.getClass(), "updatedAt", term11412);
        setField(term11199, term11199.getClass(), "stat", term11389);
        setField(term11199, term11199.getClass(), "following", term11422);
        term11424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11429 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11425, term11425.getClass(), "year", 2014);
        setShortField(term11425, term11425.getClass(), "month", (short) 5);
        setShortField(term11425, term11425.getClass(), "day", (short) 31);
        setField(term11424, term11424.getClass(), "date", term11425);
        setByteField(term11429, term11429.getClass(), "hour", (byte) 16);
        setByteField(term11429, term11429.getClass(), "minute", (byte) 3);
        setByteField(term11429, term11429.getClass(), "second", (byte) 14);
        setIntField(term11429, term11429.getClass(), "nano", 281059649);
        setField(term11424, term11424.getClass(), "time", term11429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11424;
        callMethod(klass, "setCreatedAt", argTypes, term11199, args);
    }

};


