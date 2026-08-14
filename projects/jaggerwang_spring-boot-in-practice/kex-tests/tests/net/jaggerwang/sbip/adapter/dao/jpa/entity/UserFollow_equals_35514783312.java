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

public class UserFollow_equals_35514783312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11859;
     Object term11886;

    public UserFollow_equals_35514783312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11860 = new Long(4458302820344896046L);
        Long term11862 = new Long(-432424084523104253L);
        Long term11864 = new Long(6150186973473930616L);
        term11859 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11866 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11871 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11881 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11859, term11859.getClass(), "id", term11860);
        setField(term11859, term11859.getClass(), "followingId", term11862);
        setField(term11859, term11859.getClass(), "followerId", term11864);
        setIntField(term11867, term11867.getClass(), "year", 2020);
        setShortField(term11867, term11867.getClass(), "month", (short) 5);
        setShortField(term11867, term11867.getClass(), "day", (short) 12);
        setField(term11866, term11866.getClass(), "date", term11867);
        setByteField(term11871, term11871.getClass(), "hour", (byte) 22);
        setByteField(term11871, term11871.getClass(), "minute", (byte) 7);
        setByteField(term11871, term11871.getClass(), "second", (byte) 49);
        setIntField(term11871, term11871.getClass(), "nano", 677355362);
        setField(term11866, term11866.getClass(), "time", term11871);
        setField(term11859, term11859.getClass(), "createdAt", term11866);
        setIntField(term11877, term11877.getClass(), "year", 2010);
        setShortField(term11877, term11877.getClass(), "month", (short) 11);
        setShortField(term11877, term11877.getClass(), "day", (short) 1);
        setField(term11876, term11876.getClass(), "date", term11877);
        setByteField(term11881, term11881.getClass(), "hour", (byte) 5);
        setByteField(term11881, term11881.getClass(), "minute", (byte) 32);
        setByteField(term11881, term11881.getClass(), "second", (byte) 8);
        setIntField(term11881, term11881.getClass(), "nano", 918832231);
        setField(term11876, term11876.getClass(), "time", term11881);
        setField(term11859, term11859.getClass(), "updatedAt", term11876);
        term11886 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11886;
        callMethod(klass, "equals", argTypes, term11859, args);
    }

};


