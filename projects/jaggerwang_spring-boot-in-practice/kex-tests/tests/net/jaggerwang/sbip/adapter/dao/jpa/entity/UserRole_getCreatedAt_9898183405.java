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

public class UserRole_getCreatedAt_9898183405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13749;

    public UserRole_getCreatedAt_9898183405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13750 = new Long(-769824408235898287L);
        Long term13752 = new Long(-2828343143039517941L);
        Long term13754 = new Long(2809748481176687920L);
        term13749 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13761 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13771 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13749, term13749.getClass(), "id", term13750);
        setField(term13749, term13749.getClass(), "userId", term13752);
        setField(term13749, term13749.getClass(), "roleId", term13754);
        setIntField(term13757, term13757.getClass(), "year", 2029);
        setShortField(term13757, term13757.getClass(), "month", (short) 7);
        setShortField(term13757, term13757.getClass(), "day", (short) 19);
        setField(term13756, term13756.getClass(), "date", term13757);
        setByteField(term13761, term13761.getClass(), "hour", (byte) 4);
        setByteField(term13761, term13761.getClass(), "minute", (byte) 38);
        setByteField(term13761, term13761.getClass(), "second", (byte) 15);
        setIntField(term13761, term13761.getClass(), "nano", 260833456);
        setField(term13756, term13756.getClass(), "time", term13761);
        setField(term13749, term13749.getClass(), "createdAt", term13756);
        setIntField(term13767, term13767.getClass(), "year", 2019);
        setShortField(term13767, term13767.getClass(), "month", (short) 12);
        setShortField(term13767, term13767.getClass(), "day", (short) 13);
        setField(term13766, term13766.getClass(), "date", term13767);
        setByteField(term13771, term13771.getClass(), "hour", (byte) 17);
        setByteField(term13771, term13771.getClass(), "minute", (byte) 38);
        setByteField(term13771, term13771.getClass(), "second", (byte) 43);
        setIntField(term13771, term13771.getClass(), "nano", 435007801);
        setField(term13766, term13766.getClass(), "time", term13771);
        setField(term13749, term13749.getClass(), "updatedAt", term13766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term13749, args);
    }

};


