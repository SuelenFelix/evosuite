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

public class UserFollow_UserFollowBuilder_updatedAt_3911994265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22708;
     Object term22735;

    public UserFollow_UserFollowBuilder_updatedAt_3911994265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22709 = new Long(-7705159544905337794L);
        Long term22711 = new Long(678465732474023847L);
        Long term22713 = new Long(2551047634163864862L);
        term22708 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22720 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22725 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22726 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22730 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22708, term22708.getClass(), "id", term22709);
        setField(term22708, term22708.getClass(), "followingId", term22711);
        setField(term22708, term22708.getClass(), "followerId", term22713);
        setIntField(term22716, term22716.getClass(), "year", 2024);
        setShortField(term22716, term22716.getClass(), "month", (short) 3);
        setShortField(term22716, term22716.getClass(), "day", (short) 19);
        setField(term22715, term22715.getClass(), "date", term22716);
        setByteField(term22720, term22720.getClass(), "hour", (byte) 16);
        setByteField(term22720, term22720.getClass(), "minute", (byte) 8);
        setByteField(term22720, term22720.getClass(), "second", (byte) 55);
        setIntField(term22720, term22720.getClass(), "nano", 955822950);
        setField(term22715, term22715.getClass(), "time", term22720);
        setField(term22708, term22708.getClass(), "createdAt", term22715);
        setIntField(term22726, term22726.getClass(), "year", 2010);
        setShortField(term22726, term22726.getClass(), "month", (short) 11);
        setShortField(term22726, term22726.getClass(), "day", (short) 14);
        setField(term22725, term22725.getClass(), "date", term22726);
        setByteField(term22730, term22730.getClass(), "hour", (byte) 4);
        setByteField(term22730, term22730.getClass(), "minute", (byte) 49);
        setByteField(term22730, term22730.getClass(), "second", (byte) 50);
        setIntField(term22730, term22730.getClass(), "nano", 621399921);
        setField(term22725, term22725.getClass(), "time", term22730);
        setField(term22708, term22708.getClass(), "updatedAt", term22725);
        term22735 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22736 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22740 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22736, term22736.getClass(), "year", 2027);
        setShortField(term22736, term22736.getClass(), "month", (short) 1);
        setShortField(term22736, term22736.getClass(), "day", (short) 20);
        setField(term22735, term22735.getClass(), "date", term22736);
        setByteField(term22740, term22740.getClass(), "hour", (byte) 8);
        setByteField(term22740, term22740.getClass(), "minute", (byte) 5);
        setByteField(term22740, term22740.getClass(), "second", (byte) 44);
        setIntField(term22740, term22740.getClass(), "nano", 960768267);
        setField(term22735, term22735.getClass(), "time", term22740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22735;
        callMethod(klass, "updatedAt", argTypes, term22708, args);
    }

};


