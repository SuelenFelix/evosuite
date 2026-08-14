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

public class UserFollow_setUpdatedAt_7161766811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11822;
     Object term11849;

    public UserFollow_setUpdatedAt_7161766811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11823 = new Long(-6490254947459640565L);
        Long term11825 = new Long(-7001094993638840490L);
        Long term11827 = new Long(3077284143733577490L);
        term11822 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11829 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11830 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11834 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11844 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11822, term11822.getClass(), "id", term11823);
        setField(term11822, term11822.getClass(), "followingId", term11825);
        setField(term11822, term11822.getClass(), "followerId", term11827);
        setIntField(term11830, term11830.getClass(), "year", 2024);
        setShortField(term11830, term11830.getClass(), "month", (short) 3);
        setShortField(term11830, term11830.getClass(), "day", (short) 17);
        setField(term11829, term11829.getClass(), "date", term11830);
        setByteField(term11834, term11834.getClass(), "hour", (byte) 5);
        setByteField(term11834, term11834.getClass(), "minute", (byte) 21);
        setByteField(term11834, term11834.getClass(), "second", (byte) 47);
        setIntField(term11834, term11834.getClass(), "nano", 798433252);
        setField(term11829, term11829.getClass(), "time", term11834);
        setField(term11822, term11822.getClass(), "createdAt", term11829);
        setIntField(term11840, term11840.getClass(), "year", 2023);
        setShortField(term11840, term11840.getClass(), "month", (short) 7);
        setShortField(term11840, term11840.getClass(), "day", (short) 27);
        setField(term11839, term11839.getClass(), "date", term11840);
        setByteField(term11844, term11844.getClass(), "hour", (byte) 4);
        setByteField(term11844, term11844.getClass(), "minute", (byte) 25);
        setByteField(term11844, term11844.getClass(), "second", (byte) 46);
        setIntField(term11844, term11844.getClass(), "nano", 646465452);
        setField(term11839, term11839.getClass(), "time", term11844);
        setField(term11822, term11822.getClass(), "updatedAt", term11839);
        term11849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11854 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11850, term11850.getClass(), "year", 2022);
        setShortField(term11850, term11850.getClass(), "month", (short) 11);
        setShortField(term11850, term11850.getClass(), "day", (short) 2);
        setField(term11849, term11849.getClass(), "date", term11850);
        setByteField(term11854, term11854.getClass(), "hour", (byte) 4);
        setByteField(term11854, term11854.getClass(), "minute", (byte) 14);
        setByteField(term11854, term11854.getClass(), "second", (byte) 5);
        setIntField(term11854, term11854.getClass(), "nano", 604465127);
        setField(term11849, term11849.getClass(), "time", term11854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term11849;
        callMethod(klass, "setUpdatedAt", argTypes, term11822, args);
    }

};


