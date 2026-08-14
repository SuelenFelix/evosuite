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

public class UserStatDTO_getUpdatedAt_31191767710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28427;

    public UserStatDTO_getUpdatedAt_31191767710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28428 = new Long(6269054578518955349L);
        Long term28430 = new Long(-143609946830350439L);
        Long term28432 = new Long(2018084438165711668L);
        Long term28434 = new Long(-8705953038984862378L);
        Long term28436 = new Long(-7589547201844161961L);
        Long term28438 = new Long(8847748922379375307L);
        term28427 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28455 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28427, term28427.getClass(), "id", term28428);
        setField(term28427, term28427.getClass(), "userId", term28430);
        setField(term28427, term28427.getClass(), "postCount", term28432);
        setField(term28427, term28427.getClass(), "likeCount", term28434);
        setField(term28427, term28427.getClass(), "followingCount", term28436);
        setField(term28427, term28427.getClass(), "followerCount", term28438);
        setIntField(term28441, term28441.getClass(), "year", 2022);
        setShortField(term28441, term28441.getClass(), "month", (short) 5);
        setShortField(term28441, term28441.getClass(), "day", (short) 28);
        setField(term28440, term28440.getClass(), "date", term28441);
        setByteField(term28445, term28445.getClass(), "hour", (byte) 20);
        setByteField(term28445, term28445.getClass(), "minute", (byte) 42);
        setByteField(term28445, term28445.getClass(), "second", (byte) 20);
        setIntField(term28445, term28445.getClass(), "nano", 528388661);
        setField(term28440, term28440.getClass(), "time", term28445);
        setField(term28427, term28427.getClass(), "createdAt", term28440);
        setIntField(term28451, term28451.getClass(), "year", 2029);
        setShortField(term28451, term28451.getClass(), "month", (short) 5);
        setShortField(term28451, term28451.getClass(), "day", (short) 12);
        setField(term28450, term28450.getClass(), "date", term28451);
        setByteField(term28455, term28455.getClass(), "hour", (byte) 23);
        setByteField(term28455, term28455.getClass(), "minute", (byte) 20);
        setByteField(term28455, term28455.getClass(), "second", (byte) 4);
        setIntField(term28455, term28455.getClass(), "nano", 378307890);
        setField(term28450, term28450.getClass(), "time", term28455);
        setField(term28427, term28427.getClass(), "updatedAt", term28450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term28427, args);
    }

};


