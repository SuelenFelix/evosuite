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

public class UserStatDTO_setUpdatedAt_64270854918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28713;
     Object term28746;

    public UserStatDTO_setUpdatedAt_64270854918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28714 = new Long(-4994148485124075625L);
        Long term28716 = new Long(-8842842172497711872L);
        Long term28718 = new Long(-5367775625638780650L);
        Long term28720 = new Long(-7830820957252387854L);
        Long term28722 = new Long(-8985577692063635272L);
        Long term28724 = new Long(6545086285386938562L);
        term28713 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO"));
        Object term28726 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28727 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28731 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28736 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28737 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28741 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28713, term28713.getClass(), "id", term28714);
        setField(term28713, term28713.getClass(), "userId", term28716);
        setField(term28713, term28713.getClass(), "postCount", term28718);
        setField(term28713, term28713.getClass(), "likeCount", term28720);
        setField(term28713, term28713.getClass(), "followingCount", term28722);
        setField(term28713, term28713.getClass(), "followerCount", term28724);
        setIntField(term28727, term28727.getClass(), "year", 2023);
        setShortField(term28727, term28727.getClass(), "month", (short) 2);
        setShortField(term28727, term28727.getClass(), "day", (short) 27);
        setField(term28726, term28726.getClass(), "date", term28727);
        setByteField(term28731, term28731.getClass(), "hour", (byte) 5);
        setByteField(term28731, term28731.getClass(), "minute", (byte) 50);
        setByteField(term28731, term28731.getClass(), "second", (byte) 50);
        setIntField(term28731, term28731.getClass(), "nano", 528521692);
        setField(term28726, term28726.getClass(), "time", term28731);
        setField(term28713, term28713.getClass(), "createdAt", term28726);
        setIntField(term28737, term28737.getClass(), "year", 2017);
        setShortField(term28737, term28737.getClass(), "month", (short) 1);
        setShortField(term28737, term28737.getClass(), "day", (short) 4);
        setField(term28736, term28736.getClass(), "date", term28737);
        setByteField(term28741, term28741.getClass(), "hour", (byte) 17);
        setByteField(term28741, term28741.getClass(), "minute", (byte) 39);
        setByteField(term28741, term28741.getClass(), "second", (byte) 5);
        setIntField(term28741, term28741.getClass(), "nano", 712424493);
        setField(term28736, term28736.getClass(), "time", term28741);
        setField(term28713, term28713.getClass(), "updatedAt", term28736);
        term28746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28751 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28747, term28747.getClass(), "year", 2012);
        setShortField(term28747, term28747.getClass(), "month", (short) 1);
        setShortField(term28747, term28747.getClass(), "day", (short) 27);
        setField(term28746, term28746.getClass(), "date", term28747);
        setByteField(term28751, term28751.getClass(), "hour", (byte) 3);
        setByteField(term28751, term28751.getClass(), "minute", (byte) 30);
        setByteField(term28751, term28751.getClass(), "second", (byte) 25);
        setIntField(term28751, term28751.getClass(), "nano", 460782173);
        setField(term28746, term28746.getClass(), "time", term28751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term28746;
        callMethod(klass, "setUpdatedAt", argTypes, term28713, args);
    }

};


