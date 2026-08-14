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

public class UserRole_setUserId_21055466448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13832;
     Object term13859;

    public UserRole_setUserId_21055466448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13833 = new Long(-6771377873268167033L);
        Long term13835 = new Long(1278107327214302894L);
        Long term13837 = new Long(3104349415269466587L);
        term13832 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13854 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13832, term13832.getClass(), "id", term13833);
        setField(term13832, term13832.getClass(), "userId", term13835);
        setField(term13832, term13832.getClass(), "roleId", term13837);
        setIntField(term13840, term13840.getClass(), "year", 2024);
        setShortField(term13840, term13840.getClass(), "month", (short) 7);
        setShortField(term13840, term13840.getClass(), "day", (short) 29);
        setField(term13839, term13839.getClass(), "date", term13840);
        setByteField(term13844, term13844.getClass(), "hour", (byte) 19);
        setByteField(term13844, term13844.getClass(), "minute", (byte) 15);
        setByteField(term13844, term13844.getClass(), "second", (byte) 16);
        setIntField(term13844, term13844.getClass(), "nano", 554834199);
        setField(term13839, term13839.getClass(), "time", term13844);
        setField(term13832, term13832.getClass(), "createdAt", term13839);
        setIntField(term13850, term13850.getClass(), "year", 2018);
        setShortField(term13850, term13850.getClass(), "month", (short) 2);
        setShortField(term13850, term13850.getClass(), "day", (short) 13);
        setField(term13849, term13849.getClass(), "date", term13850);
        setByteField(term13854, term13854.getClass(), "hour", (byte) 15);
        setByteField(term13854, term13854.getClass(), "minute", (byte) 1);
        setByteField(term13854, term13854.getClass(), "second", (byte) 45);
        setIntField(term13854, term13854.getClass(), "nano", 380020898);
        setField(term13849, term13849.getClass(), "time", term13854);
        setField(term13832, term13832.getClass(), "updatedAt", term13849);
        term13859 = new Long(-7423063312741500355L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term13859;
        callMethod(klass, "setUserId", argTypes, term13832, args);
    }

};


