package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserFollow_UserFollowBuilder_followerId_13998122983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22642;
     Object term22669;

    public UserFollow_UserFollowBuilder_followerId_13998122983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22643 = new Long(8640463098965331396L);
        Long term22645 = new Long(-4136906775323730350L);
        Long term22647 = new Long(6381166215871562039L);
        term22642 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22654 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22659 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22660 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22664 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22642, term22642.getClass(), "id", term22643);
        setField(term22642, term22642.getClass(), "followingId", term22645);
        setField(term22642, term22642.getClass(), "followerId", term22647);
        setIntField(term22650, term22650.getClass(), "year", 2015);
        setShortField(term22650, term22650.getClass(), "month", (short) 1);
        setShortField(term22650, term22650.getClass(), "day", (short) 7);
        setField(term22649, term22649.getClass(), "date", term22650);
        setByteField(term22654, term22654.getClass(), "hour", (byte) 10);
        setByteField(term22654, term22654.getClass(), "minute", (byte) 8);
        setByteField(term22654, term22654.getClass(), "second", (byte) 31);
        setIntField(term22654, term22654.getClass(), "nano", 617142943);
        setField(term22649, term22649.getClass(), "time", term22654);
        setField(term22642, term22642.getClass(), "createdAt", term22649);
        setIntField(term22660, term22660.getClass(), "year", 2024);
        setShortField(term22660, term22660.getClass(), "month", (short) 2);
        setShortField(term22660, term22660.getClass(), "day", (short) 2);
        setField(term22659, term22659.getClass(), "date", term22660);
        setByteField(term22664, term22664.getClass(), "hour", (byte) 5);
        setByteField(term22664, term22664.getClass(), "minute", (byte) 8);
        setByteField(term22664, term22664.getClass(), "second", (byte) 10);
        setIntField(term22664, term22664.getClass(), "nano", 897554578);
        setField(term22659, term22659.getClass(), "time", term22664);
        setField(term22642, term22642.getClass(), "updatedAt", term22659);
        term22669 = new Long(7656211287234019484L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term22669;
        callMethod(klass, "followerId", argTypes, term22642, args);
    }

};


