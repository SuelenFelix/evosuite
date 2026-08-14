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

public class User_equals_189115997822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30440;
     Object term30525;

    public User_equals_189115997822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30441 = new Long(4098407345651793258L);
        Long term30491 = new Long(3128610259359668233L);
        term30440 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30505 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30506 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30510 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30520 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30440, term30440.getClass(), "id", term30441);
        setField(term30440, term30440.getClass(), "username", "lBOokzEPfe");
        setField(term30440, term30440.getClass(), "password", "dtGZCsKXbW");
        setField(term30440, term30440.getClass(), "mobile", "bdyhHbDAmJ");
        setField(term30440, term30440.getClass(), "email", "BBXiTNHqGE");
        setField(term30440, term30440.getClass(), "avatarId", term30491);
        setField(term30440, term30440.getClass(), "intro", "IEYhJmgCVd");
        setIntField(term30506, term30506.getClass(), "year", 2011);
        setShortField(term30506, term30506.getClass(), "month", (short) 10);
        setShortField(term30506, term30506.getClass(), "day", (short) 20);
        setField(term30505, term30505.getClass(), "date", term30506);
        setByteField(term30510, term30510.getClass(), "hour", (byte) 2);
        setByteField(term30510, term30510.getClass(), "minute", (byte) 15);
        setByteField(term30510, term30510.getClass(), "second", (byte) 4);
        setIntField(term30510, term30510.getClass(), "nano", 46300192);
        setField(term30505, term30505.getClass(), "time", term30510);
        setField(term30440, term30440.getClass(), "createdAt", term30505);
        setIntField(term30516, term30516.getClass(), "year", 2023);
        setShortField(term30516, term30516.getClass(), "month", (short) 3);
        setShortField(term30516, term30516.getClass(), "day", (short) 26);
        setField(term30515, term30515.getClass(), "date", term30516);
        setByteField(term30520, term30520.getClass(), "hour", (byte) 2);
        setByteField(term30520, term30520.getClass(), "minute", (byte) 30);
        setByteField(term30520, term30520.getClass(), "second", (byte) 47);
        setIntField(term30520, term30520.getClass(), "nano", 494050019);
        setField(term30515, term30515.getClass(), "time", term30520);
        setField(term30440, term30440.getClass(), "updatedAt", term30515);
        term30525 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30525;
        callMethod(klass, "equals", argTypes, term30440, args);
    }

};


