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

public class UserDTO_getIntro_19872208499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3974;

    public UserDTO_getIntro_19872208499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3975 = new Long(50358265865610362L);
        Long term4025 = new Long(5510783420697225605L);
        Long term4060 = new Long(6005241913654469005L);
        Long term4062 = new Long(-1983291584002806658L);
        Class<? extends Object> term4250 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term4249 = ((Class) term4250).getDeclaredField((String) "LOCAL");
        ((Field) term4249).setAccessible(true);
        Object enum7 = ((Field) term4249).get((Object) null);
        Long term4110 = new Long(5946780097489996391L);
        HashMap term4156 = new HashMap();
        Long term4165 = new Long(-8652538484981166496L);
        Long term4167 = new Long(2701184207686293431L);
        Long term4169 = new Long(4474998035090263139L);
        Long term4171 = new Long(2848819812340321742L);
        Long term4173 = new Long(-8876856890348836498L);
        Long term4175 = new Long(846579494941632714L);
        Boolean term4197 = new Boolean(true);
        term3974 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        Object term4039 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4040 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4044 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4054 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4059 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term4097 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term4124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4164 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term4177 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4178 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4182 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4187 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4188 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4192 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3974, term3974.getClass(), "id", term3975);
        setField(term3974, term3974.getClass(), "username", "jUbSRrkrYZ");
        setField(term3974, term3974.getClass(), "password", "bWWfajKbEX");
        setField(term3974, term3974.getClass(), "mobile", "cAPeiZHKGJ");
        setField(term3974, term3974.getClass(), "email", "LvJFtLBaxj");
        setField(term3974, term3974.getClass(), "avatarId", term4025);
        setField(term3974, term3974.getClass(), "intro", "PHvxnGHptP");
        setIntField(term4040, term4040.getClass(), "year", 2020);
        setShortField(term4040, term4040.getClass(), "month", (short) 5);
        setShortField(term4040, term4040.getClass(), "day", (short) 18);
        setField(term4039, term4039.getClass(), "date", term4040);
        setByteField(term4044, term4044.getClass(), "hour", (byte) 5);
        setByteField(term4044, term4044.getClass(), "minute", (byte) 46);
        setByteField(term4044, term4044.getClass(), "second", (byte) 13);
        setIntField(term4044, term4044.getClass(), "nano", 45893173);
        setField(term4039, term4039.getClass(), "time", term4044);
        setField(term3974, term3974.getClass(), "createdAt", term4039);
        setIntField(term4050, term4050.getClass(), "year", 2017);
        setShortField(term4050, term4050.getClass(), "month", (short) 4);
        setShortField(term4050, term4050.getClass(), "day", (short) 3);
        setField(term4049, term4049.getClass(), "date", term4050);
        setByteField(term4054, term4054.getClass(), "hour", (byte) 6);
        setByteField(term4054, term4054.getClass(), "minute", (byte) 51);
        setByteField(term4054, term4054.getClass(), "second", (byte) 10);
        setIntField(term4054, term4054.getClass(), "nano", 316377166);
        setField(term4049, term4049.getClass(), "time", term4054);
        setField(term3974, term3974.getClass(), "updatedAt", term4049);
        setField(term4059, term4059.getClass(), "id", term4060);
        setField(term4059, term4059.getClass(), "userId", term4062);
        setField(term4059, term4059.getClass(), "region", enum7);
        setField(term4059, term4059.getClass(), "bucket", "TimdotUuNC");
        setField(term4059, term4059.getClass(), "path", "PkWMRdJcBb");
        setField(term4097, term4097.getClass(), "name", "jSpAteRute");
        setField(term4097, term4097.getClass(), "size", term4110);
        setField(term4097, term4097.getClass(), "type", "swZVeJAxjt");
        setField(term4059, term4059.getClass(), "meta", term4097);
        setIntField(term4125, term4125.getClass(), "year", 2027);
        setShortField(term4125, term4125.getClass(), "month", (short) 8);
        setShortField(term4125, term4125.getClass(), "day", (short) 23);
        setField(term4124, term4124.getClass(), "date", term4125);
        setByteField(term4129, term4129.getClass(), "hour", (byte) 15);
        setByteField(term4129, term4129.getClass(), "minute", (byte) 12);
        setByteField(term4129, term4129.getClass(), "second", (byte) 6);
        setIntField(term4129, term4129.getClass(), "nano", 541218258);
        setField(term4124, term4124.getClass(), "time", term4129);
        setField(term4059, term4059.getClass(), "createdAt", term4124);
        setIntField(term4135, term4135.getClass(), "year", 2013);
        setShortField(term4135, term4135.getClass(), "month", (short) 5);
        setShortField(term4135, term4135.getClass(), "day", (short) 26);
        setField(term4134, term4134.getClass(), "date", term4135);
        setByteField(term4139, term4139.getClass(), "hour", (byte) 4);
        setByteField(term4139, term4139.getClass(), "minute", (byte) 39);
        setByteField(term4139, term4139.getClass(), "second", (byte) 5);
        setIntField(term4139, term4139.getClass(), "nano", 392869354);
        setField(term4134, term4134.getClass(), "time", term4139);
        setField(term4059, term4059.getClass(), "updatedAt", term4134);
        setField(term4059, term4059.getClass(), "url", "xOcJIiQQDu");
        setField(term4059, term4059.getClass(), "thumbs", term4156);
        setField(term3974, term3974.getClass(), "avatar", term4059);
        setField(term4164, term4164.getClass(), "id", term4165);
        setField(term4164, term4164.getClass(), "userId", term4167);
        setField(term4164, term4164.getClass(), "postCount", term4169);
        setField(term4164, term4164.getClass(), "likeCount", term4171);
        setField(term4164, term4164.getClass(), "followingCount", term4173);
        setField(term4164, term4164.getClass(), "followerCount", term4175);
        setIntField(term4178, term4178.getClass(), "year", 2012);
        setShortField(term4178, term4178.getClass(), "month", (short) 4);
        setShortField(term4178, term4178.getClass(), "day", (short) 25);
        setField(term4177, term4177.getClass(), "date", term4178);
        setByteField(term4182, term4182.getClass(), "hour", (byte) 21);
        setByteField(term4182, term4182.getClass(), "minute", (byte) 14);
        setByteField(term4182, term4182.getClass(), "second", (byte) 15);
        setIntField(term4182, term4182.getClass(), "nano", 561700934);
        setField(term4177, term4177.getClass(), "time", term4182);
        setField(term4164, term4164.getClass(), "createdAt", term4177);
        setIntField(term4188, term4188.getClass(), "year", 2011);
        setShortField(term4188, term4188.getClass(), "month", (short) 10);
        setShortField(term4188, term4188.getClass(), "day", (short) 25);
        setField(term4187, term4187.getClass(), "date", term4188);
        setByteField(term4192, term4192.getClass(), "hour", (byte) 10);
        setByteField(term4192, term4192.getClass(), "minute", (byte) 33);
        setByteField(term4192, term4192.getClass(), "second", (byte) 8);
        setIntField(term4192, term4192.getClass(), "nano", 268304014);
        setField(term4187, term4187.getClass(), "time", term4192);
        setField(term4164, term4164.getClass(), "updatedAt", term4187);
        setField(term3974, term3974.getClass(), "stat", term4164);
        setField(term3974, term3974.getClass(), "following", term4197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntro", argTypes, term3974, args);
    }

};


