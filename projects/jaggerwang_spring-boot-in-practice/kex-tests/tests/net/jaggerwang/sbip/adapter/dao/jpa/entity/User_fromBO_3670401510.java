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

public class User_fromBO_3670401510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27471;

    public User_fromBO_3670401510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27472 = new Long(-6900715686580158779L);
        Long term27522 = new Long(-7755863896540616668L);
        term27471 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27536 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27537 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27541 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27546 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27547 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27551 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27471, term27471.getClass(), "id", term27472);
        setField(term27471, term27471.getClass(), "username", "uSUvKAyuvd");
        setField(term27471, term27471.getClass(), "password", "onQLVONGuf");
        setField(term27471, term27471.getClass(), "mobile", "SOrEHbcbmn");
        setField(term27471, term27471.getClass(), "email", "bnsyeQXFdu");
        setField(term27471, term27471.getClass(), "avatarId", term27522);
        setField(term27471, term27471.getClass(), "intro", "BwtdjiefJn");
        setIntField(term27537, term27537.getClass(), "year", 2025);
        setShortField(term27537, term27537.getClass(), "month", (short) 9);
        setShortField(term27537, term27537.getClass(), "day", (short) 5);
        setField(term27536, term27536.getClass(), "date", term27537);
        setByteField(term27541, term27541.getClass(), "hour", (byte) 11);
        setByteField(term27541, term27541.getClass(), "minute", (byte) 59);
        setByteField(term27541, term27541.getClass(), "second", (byte) 37);
        setIntField(term27541, term27541.getClass(), "nano", 93740487);
        setField(term27536, term27536.getClass(), "time", term27541);
        setField(term27471, term27471.getClass(), "createdAt", term27536);
        setIntField(term27547, term27547.getClass(), "year", 2028);
        setShortField(term27547, term27547.getClass(), "month", (short) 12);
        setShortField(term27547, term27547.getClass(), "day", (short) 28);
        setField(term27546, term27546.getClass(), "date", term27547);
        setByteField(term27551, term27551.getClass(), "hour", (byte) 11);
        setByteField(term27551, term27551.getClass(), "minute", (byte) 37);
        setByteField(term27551, term27551.getClass(), "second", (byte) 0);
        setIntField(term27551, term27551.getClass(), "nano", 315383282);
        setField(term27546, term27546.getClass(), "time", term27551);
        setField(term27471, term27471.getClass(), "updatedAt", term27546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Object[] args = new Object[1];
        args[0] = term27471;
        callMethod(klass, "fromBO", argTypes, null, args);
    }

};


