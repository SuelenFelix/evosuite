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

public class UserFollow_setId_5984094587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11698;
     Object term11725;

    public UserFollow_setId_5984094587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11699 = new Long(4742108233936970770L);
        Long term11701 = new Long(2722004046017350471L);
        Long term11703 = new Long(6636235983121346803L);
        term11698 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow"));
        Object term11705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11715 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11716 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11720 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term11698, term11698.getClass(), "id", term11699);
        setField(term11698, term11698.getClass(), "followingId", term11701);
        setField(term11698, term11698.getClass(), "followerId", term11703);
        setIntField(term11706, term11706.getClass(), "year", 2023);
        setShortField(term11706, term11706.getClass(), "month", (short) 5);
        setShortField(term11706, term11706.getClass(), "day", (short) 31);
        setField(term11705, term11705.getClass(), "date", term11706);
        setByteField(term11710, term11710.getClass(), "hour", (byte) 13);
        setByteField(term11710, term11710.getClass(), "minute", (byte) 29);
        setByteField(term11710, term11710.getClass(), "second", (byte) 29);
        setIntField(term11710, term11710.getClass(), "nano", 621312201);
        setField(term11705, term11705.getClass(), "time", term11710);
        setField(term11698, term11698.getClass(), "createdAt", term11705);
        setIntField(term11716, term11716.getClass(), "year", 2020);
        setShortField(term11716, term11716.getClass(), "month", (short) 10);
        setShortField(term11716, term11716.getClass(), "day", (short) 26);
        setField(term11715, term11715.getClass(), "date", term11716);
        setByteField(term11720, term11720.getClass(), "hour", (byte) 10);
        setByteField(term11720, term11720.getClass(), "minute", (byte) 50);
        setByteField(term11720, term11720.getClass(), "second", (byte) 16);
        setIntField(term11720, term11720.getClass(), "nano", 613429);
        setField(term11715, term11715.getClass(), "time", term11720);
        setField(term11698, term11698.getClass(), "updatedAt", term11715);
        term11725 = new Long(146749226579788091L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserFollow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11725;
        callMethod(klass, "setId", argTypes, term11698, args);
    }

};


