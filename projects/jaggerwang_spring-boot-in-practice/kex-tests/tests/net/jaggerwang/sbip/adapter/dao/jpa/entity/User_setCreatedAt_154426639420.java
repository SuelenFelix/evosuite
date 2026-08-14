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

public class User_setCreatedAt_154426639420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30150;
     Object term30235;

    public User_setCreatedAt_154426639420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30151 = new Long(7654605795400256601L);
        Long term30201 = new Long(3610800451815944213L);
        term30150 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30220 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30225 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30226 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30230 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30150, term30150.getClass(), "id", term30151);
        setField(term30150, term30150.getClass(), "username", "BDIRCxAWLA");
        setField(term30150, term30150.getClass(), "password", "eOJfbiZLnb");
        setField(term30150, term30150.getClass(), "mobile", "nKZKnxWYCK");
        setField(term30150, term30150.getClass(), "email", "JOqQxuzRuZ");
        setField(term30150, term30150.getClass(), "avatarId", term30201);
        setField(term30150, term30150.getClass(), "intro", "RSaoipUlsg");
        setIntField(term30216, term30216.getClass(), "year", 2019);
        setShortField(term30216, term30216.getClass(), "month", (short) 11);
        setShortField(term30216, term30216.getClass(), "day", (short) 1);
        setField(term30215, term30215.getClass(), "date", term30216);
        setByteField(term30220, term30220.getClass(), "hour", (byte) 23);
        setByteField(term30220, term30220.getClass(), "minute", (byte) 29);
        setByteField(term30220, term30220.getClass(), "second", (byte) 31);
        setIntField(term30220, term30220.getClass(), "nano", 58449597);
        setField(term30215, term30215.getClass(), "time", term30220);
        setField(term30150, term30150.getClass(), "createdAt", term30215);
        setIntField(term30226, term30226.getClass(), "year", 2025);
        setShortField(term30226, term30226.getClass(), "month", (short) 2);
        setShortField(term30226, term30226.getClass(), "day", (short) 4);
        setField(term30225, term30225.getClass(), "date", term30226);
        setByteField(term30230, term30230.getClass(), "hour", (byte) 1);
        setByteField(term30230, term30230.getClass(), "minute", (byte) 30);
        setByteField(term30230, term30230.getClass(), "second", (byte) 28);
        setIntField(term30230, term30230.getClass(), "nano", 555720830);
        setField(term30225, term30225.getClass(), "time", term30230);
        setField(term30150, term30150.getClass(), "updatedAt", term30225);
        term30235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30236 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30240 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30236, term30236.getClass(), "year", 2026);
        setShortField(term30236, term30236.getClass(), "month", (short) 8);
        setShortField(term30236, term30236.getClass(), "day", (short) 6);
        setField(term30235, term30235.getClass(), "date", term30236);
        setByteField(term30240, term30240.getClass(), "hour", (byte) 17);
        setByteField(term30240, term30240.getClass(), "minute", (byte) 50);
        setByteField(term30240, term30240.getClass(), "second", (byte) 27);
        setIntField(term30240, term30240.getClass(), "nano", 8961627);
        setField(term30235, term30235.getClass(), "time", term30240);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30235;
        callMethod(klass, "setCreatedAt", argTypes, term30150, args);
    }

};


