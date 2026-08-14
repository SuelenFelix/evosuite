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

public class UserFollow_getId_1683677002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11563;

    public UserFollow_getId_1683677002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11564 = new Long(-532956263280568707L);
        Long term11566 = new Long(6073193746616629086L);
        Long term11568 = new Long(-2463629530824341661L);
        term11563 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11570 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11571 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11575 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11580 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11581 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11585 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11563, term11563.getClass(), "id", term11564);
        setField(term11563, term11563.getClass(), "followingId", term11566);
        setField(term11563, term11563.getClass(), "followerId", term11568);
        setIntField(term11571, term11571.getClass(), "year", 2020);
        setShortField(term11571, term11571.getClass(), "month", (short) 10);
        setShortField(term11571, term11571.getClass(), "day", (short) 8);
        setField(term11570, term11570.getClass(), "date", term11571);
        setByteField(term11575, term11575.getClass(), "hour", (byte) 15);
        setByteField(term11575, term11575.getClass(), "minute", (byte) 57);
        setByteField(term11575, term11575.getClass(), "second", (byte) 17);
        setIntField(term11575, term11575.getClass(), "nano", 288139529);
        setField(term11570, term11570.getClass(), "time", term11575);
        setField(term11563, term11563.getClass(), "createdAt", term11570);
        setIntField(term11581, term11581.getClass(), "year", 2022);
        setShortField(term11581, term11581.getClass(), "month", (short) 6);
        setShortField(term11581, term11581.getClass(), "day", (short) 12);
        setField(term11580, term11580.getClass(), "date", term11581);
        setByteField(term11585, term11585.getClass(), "hour", (byte) 14);
        setByteField(term11585, term11585.getClass(), "minute", (byte) 3);
        setByteField(term11585, term11585.getClass(), "second", (byte) 7);
        setIntField(term11585, term11585.getClass(), "nano", 637592645);
        setField(term11580, term11580.getClass(), "time", term11585);
        setField(term11563, term11563.getClass(), "updatedAt", term11580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term11563, args);
    }

};


