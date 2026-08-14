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

public class UserRole_setId_19272729197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13803;
     Object term13830;

    public UserRole_setId_19272729197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13804 = new Long(-5004803270846838598L);
        Long term13806 = new Long(-8211859616692114655L);
        Long term13808 = new Long(7487838449539103993L);
        term13803 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13815 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13825 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13803, term13803.getClass(), "id", term13804);
        setField(term13803, term13803.getClass(), "userId", term13806);
        setField(term13803, term13803.getClass(), "roleId", term13808);
        setIntField(term13811, term13811.getClass(), "year", 2013);
        setShortField(term13811, term13811.getClass(), "month", (short) 1);
        setShortField(term13811, term13811.getClass(), "day", (short) 17);
        setField(term13810, term13810.getClass(), "date", term13811);
        setByteField(term13815, term13815.getClass(), "hour", (byte) 19);
        setByteField(term13815, term13815.getClass(), "minute", (byte) 49);
        setByteField(term13815, term13815.getClass(), "second", (byte) 53);
        setIntField(term13815, term13815.getClass(), "nano", 217542739);
        setField(term13810, term13810.getClass(), "time", term13815);
        setField(term13803, term13803.getClass(), "createdAt", term13810);
        setIntField(term13821, term13821.getClass(), "year", 2025);
        setShortField(term13821, term13821.getClass(), "month", (short) 8);
        setShortField(term13821, term13821.getClass(), "day", (short) 8);
        setField(term13820, term13820.getClass(), "date", term13821);
        setByteField(term13825, term13825.getClass(), "hour", (byte) 12);
        setByteField(term13825, term13825.getClass(), "minute", (byte) 29);
        setByteField(term13825, term13825.getClass(), "second", (byte) 36);
        setIntField(term13825, term13825.getClass(), "nano", 329488602);
        setField(term13820, term13820.getClass(), "time", term13825);
        setField(term13803, term13803.getClass(), "updatedAt", term13820);
        term13830 = new Long(7010148136855890340L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term13830;
        callMethod(klass, "setId", argTypes, term13803, args);
    }

};


