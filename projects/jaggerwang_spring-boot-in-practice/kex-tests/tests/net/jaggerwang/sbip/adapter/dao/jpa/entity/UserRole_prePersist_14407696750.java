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

public class UserRole_prePersist_14407696750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13641;

    public UserRole_prePersist_14407696750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13642 = new Long(2287785643837657068L);
        Long term13644 = new Long(-7283193381993602128L);
        Long term13646 = new Long(6351887424140565471L);
        term13641 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term13648 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13649 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13653 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13658 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13659 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13663 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13641, term13641.getClass(), "id", term13642);
        setField(term13641, term13641.getClass(), "userId", term13644);
        setField(term13641, term13641.getClass(), "roleId", term13646);
        setIntField(term13649, term13649.getClass(), "year", 2025);
        setShortField(term13649, term13649.getClass(), "month", (short) 11);
        setShortField(term13649, term13649.getClass(), "day", (short) 16);
        setField(term13648, term13648.getClass(), "date", term13649);
        setByteField(term13653, term13653.getClass(), "hour", (byte) 12);
        setByteField(term13653, term13653.getClass(), "minute", (byte) 27);
        setByteField(term13653, term13653.getClass(), "second", (byte) 36);
        setIntField(term13653, term13653.getClass(), "nano", 699989217);
        setField(term13648, term13648.getClass(), "time", term13653);
        setField(term13641, term13641.getClass(), "createdAt", term13648);
        setIntField(term13659, term13659.getClass(), "year", 2018);
        setShortField(term13659, term13659.getClass(), "month", (short) 10);
        setShortField(term13659, term13659.getClass(), "day", (short) 3);
        setField(term13658, term13658.getClass(), "date", term13659);
        setByteField(term13663, term13663.getClass(), "hour", (byte) 12);
        setByteField(term13663, term13663.getClass(), "minute", (byte) 49);
        setByteField(term13663, term13663.getClass(), "second", (byte) 38);
        setIntField(term13663, term13663.getClass(), "nano", 549840711);
        setField(term13658, term13658.getClass(), "time", term13663);
        setField(term13641, term13641.getClass(), "updatedAt", term13658);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prePersist", argTypes, term13641, args);
    }

};


