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

public class UserFollow_UserFollowBuilder_build_2705830586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22745;

    public UserFollow_UserFollowBuilder_build_2705830586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22746 = new Long(-6656996002079682356L);
        Long term22748 = new Long(2166921473521388808L);
        Long term22750 = new Long(1964822153944985001L);
        term22745 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder"));
        Object term22752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22757 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22767 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22745, term22745.getClass(), "id", term22746);
        setField(term22745, term22745.getClass(), "followingId", term22748);
        setField(term22745, term22745.getClass(), "followerId", term22750);
        setIntField(term22753, term22753.getClass(), "year", 2023);
        setShortField(term22753, term22753.getClass(), "month", (short) 11);
        setShortField(term22753, term22753.getClass(), "day", (short) 8);
        setField(term22752, term22752.getClass(), "date", term22753);
        setByteField(term22757, term22757.getClass(), "hour", (byte) 21);
        setByteField(term22757, term22757.getClass(), "minute", (byte) 57);
        setByteField(term22757, term22757.getClass(), "second", (byte) 28);
        setIntField(term22757, term22757.getClass(), "nano", 426944685);
        setField(term22752, term22752.getClass(), "time", term22757);
        setField(term22745, term22745.getClass(), "createdAt", term22752);
        setIntField(term22763, term22763.getClass(), "year", 2020);
        setShortField(term22763, term22763.getClass(), "month", (short) 9);
        setShortField(term22763, term22763.getClass(), "day", (short) 2);
        setField(term22762, term22762.getClass(), "date", term22763);
        setByteField(term22767, term22767.getClass(), "hour", (byte) 17);
        setByteField(term22767, term22767.getClass(), "minute", (byte) 47);
        setByteField(term22767, term22767.getClass(), "second", (byte) 32);
        setIntField(term22767, term22767.getClass(), "nano", 161829485);
        setField(term22762, term22762.getClass(), "time", term22767);
        setField(term22745, term22745.getClass(), "updatedAt", term22762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow$UserFollowBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term22745, args);
    }

};


