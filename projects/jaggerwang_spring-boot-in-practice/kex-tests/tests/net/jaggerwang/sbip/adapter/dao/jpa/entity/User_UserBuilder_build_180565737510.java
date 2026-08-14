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

public class User_UserBuilder_build_180565737510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13360;

    public User_UserBuilder_build_180565737510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13361 = new Long(6895382576300001141L);
        Long term13411 = new Long(9062006526792682783L);
        term13360 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term13425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13430 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13440 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term13360, term13360.getClass(), "id", term13361);
        setField(term13360, term13360.getClass(), "username", "mXGCWJDOqA");
        setField(term13360, term13360.getClass(), "password", "dpNsDgfPso");
        setField(term13360, term13360.getClass(), "mobile", "hCWPJQKpdc");
        setField(term13360, term13360.getClass(), "email", "WzMEhMXkKx");
        setField(term13360, term13360.getClass(), "avatarId", term13411);
        setField(term13360, term13360.getClass(), "intro", "XOiDvlDhdc");
        setIntField(term13426, term13426.getClass(), "year", 2021);
        setShortField(term13426, term13426.getClass(), "month", (short) 5);
        setShortField(term13426, term13426.getClass(), "day", (short) 6);
        setField(term13425, term13425.getClass(), "date", term13426);
        setByteField(term13430, term13430.getClass(), "hour", (byte) 21);
        setByteField(term13430, term13430.getClass(), "minute", (byte) 10);
        setByteField(term13430, term13430.getClass(), "second", (byte) 43);
        setIntField(term13430, term13430.getClass(), "nano", 123313014);
        setField(term13425, term13425.getClass(), "time", term13430);
        setField(term13360, term13360.getClass(), "createdAt", term13425);
        setIntField(term13436, term13436.getClass(), "year", 2011);
        setShortField(term13436, term13436.getClass(), "month", (short) 6);
        setShortField(term13436, term13436.getClass(), "day", (short) 21);
        setField(term13435, term13435.getClass(), "date", term13436);
        setByteField(term13440, term13440.getClass(), "hour", (byte) 3);
        setByteField(term13440, term13440.getClass(), "minute", (byte) 19);
        setByteField(term13440, term13440.getClass(), "second", (byte) 41);
        setIntField(term13440, term13440.getClass(), "nano", 920537748);
        setField(term13435, term13435.getClass(), "time", term13440);
        setField(term13360, term13360.getClass(), "updatedAt", term13435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13360, args);
    }

};


