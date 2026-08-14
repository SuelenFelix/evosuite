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

public class UserRole_getUserId_3893105143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13695;

    public UserRole_getUserId_3893105143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13696 = new Long(-421166328269063791L);
        Long term13698 = new Long(4811527754205378980L);
        Long term13700 = new Long(9174730812791817537L);
        term13695 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13702 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13703 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13707 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13712 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13713 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13717 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13695, term13695.getClass(), "id", term13696);
        setField(term13695, term13695.getClass(), "userId", term13698);
        setField(term13695, term13695.getClass(), "roleId", term13700);
        setIntField(term13703, term13703.getClass(), "year", 2021);
        setShortField(term13703, term13703.getClass(), "month", (short) 12);
        setShortField(term13703, term13703.getClass(), "day", (short) 23);
        setField(term13702, term13702.getClass(), "date", term13703);
        setByteField(term13707, term13707.getClass(), "hour", (byte) 18);
        setByteField(term13707, term13707.getClass(), "minute", (byte) 52);
        setByteField(term13707, term13707.getClass(), "second", (byte) 27);
        setIntField(term13707, term13707.getClass(), "nano", 512484524);
        setField(term13702, term13702.getClass(), "time", term13707);
        setField(term13695, term13695.getClass(), "createdAt", term13702);
        setIntField(term13713, term13713.getClass(), "year", 2012);
        setShortField(term13713, term13713.getClass(), "month", (short) 6);
        setShortField(term13713, term13713.getClass(), "day", (short) 25);
        setField(term13712, term13712.getClass(), "date", term13713);
        setByteField(term13717, term13717.getClass(), "hour", (byte) 2);
        setByteField(term13717, term13717.getClass(), "minute", (byte) 21);
        setByteField(term13717, term13717.getClass(), "second", (byte) 28);
        setIntField(term13717, term13717.getClass(), "nano", 605177282);
        setField(term13712, term13712.getClass(), "time", term13717);
        setField(term13695, term13695.getClass(), "updatedAt", term13712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term13695, args);
    }

};


