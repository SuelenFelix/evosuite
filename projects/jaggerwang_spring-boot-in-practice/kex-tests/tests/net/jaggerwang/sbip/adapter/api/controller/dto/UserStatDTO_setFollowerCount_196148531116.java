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

public class UserStatDTO_setFollowerCount_196148531116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28635;
     Object term28668;

    public UserStatDTO_setFollowerCount_196148531116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28636 = new Long(-6656996002079682356L);
        Long term28638 = new Long(2166921473521388808L);
        Long term28640 = new Long(1964822153944985001L);
        Long term28642 = new Long(-955253666696787757L);
        Long term28644 = new Long(-99017747847004910L);
        Long term28646 = new Long(797798302378380033L);
        term28635 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28635, term28635.getClass(), "id", term28636);
        setField(term28635, term28635.getClass(), "userId", term28638);
        setField(term28635, term28635.getClass(), "postCount", term28640);
        setField(term28635, term28635.getClass(), "likeCount", term28642);
        setField(term28635, term28635.getClass(), "followingCount", term28644);
        setField(term28635, term28635.getClass(), "followerCount", term28646);
        setIntField(term28649, term28649.getClass(), "year", 2025);
        setShortField(term28649, term28649.getClass(), "month", (short) 4);
        setShortField(term28649, term28649.getClass(), "day", (short) 6);
        setField(term28648, term28648.getClass(), "date", term28649);
        setByteField(term28653, term28653.getClass(), "hour", (byte) 23);
        setByteField(term28653, term28653.getClass(), "minute", (byte) 17);
        setByteField(term28653, term28653.getClass(), "second", (byte) 11);
        setIntField(term28653, term28653.getClass(), "nano", 928165672);
        setField(term28648, term28648.getClass(), "time", term28653);
        setField(term28635, term28635.getClass(), "createdAt", term28648);
        setIntField(term28659, term28659.getClass(), "year", 2022);
        setShortField(term28659, term28659.getClass(), "month", (short) 3);
        setShortField(term28659, term28659.getClass(), "day", (short) 20);
        setField(term28658, term28658.getClass(), "date", term28659);
        setByteField(term28663, term28663.getClass(), "hour", (byte) 20);
        setByteField(term28663, term28663.getClass(), "minute", (byte) 31);
        setByteField(term28663, term28663.getClass(), "second", (byte) 56);
        setIntField(term28663, term28663.getClass(), "nano", 682853702);
        setField(term28658, term28658.getClass(), "time", term28663);
        setField(term28635, term28635.getClass(), "updatedAt", term28658);
        term28668 = new Long(4892304277320345810L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28668;
        callMethod(klass, "setFollowerCount", argTypes, term28635, args);
    }

};


