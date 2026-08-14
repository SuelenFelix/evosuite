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

public class User_setPassword_143510923815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29385;

    public User_setPassword_143510923815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29386 = new Long(7594342965038171122L);
        Long term29436 = new Long(-4475453924678388077L);
        term29385 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29450 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29451 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29455 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29465 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29385, term29385.getClass(), "id", term29386);
        setField(term29385, term29385.getClass(), "username", "GPSEWEDSTo");
        setField(term29385, term29385.getClass(), "password", "RCOqfVsRHt");
        setField(term29385, term29385.getClass(), "mobile", "TSyCeEZPaT");
        setField(term29385, term29385.getClass(), "email", "JeZFtaqkzW");
        setField(term29385, term29385.getClass(), "avatarId", term29436);
        setField(term29385, term29385.getClass(), "intro", "vOVuNSCCLe");
        setIntField(term29451, term29451.getClass(), "year", 2011);
        setShortField(term29451, term29451.getClass(), "month", (short) 1);
        setShortField(term29451, term29451.getClass(), "day", (short) 7);
        setField(term29450, term29450.getClass(), "date", term29451);
        setByteField(term29455, term29455.getClass(), "hour", (byte) 10);
        setByteField(term29455, term29455.getClass(), "minute", (byte) 6);
        setByteField(term29455, term29455.getClass(), "second", (byte) 28);
        setIntField(term29455, term29455.getClass(), "nano", 669533698);
        setField(term29450, term29450.getClass(), "time", term29455);
        setField(term29385, term29385.getClass(), "createdAt", term29450);
        setIntField(term29461, term29461.getClass(), "year", 2016);
        setShortField(term29461, term29461.getClass(), "month", (short) 11);
        setShortField(term29461, term29461.getClass(), "day", (short) 15);
        setField(term29460, term29460.getClass(), "date", term29461);
        setByteField(term29465, term29465.getClass(), "hour", (byte) 14);
        setByteField(term29465, term29465.getClass(), "minute", (byte) 34);
        setByteField(term29465, term29465.getClass(), "second", (byte) 23);
        setIntField(term29465, term29465.getClass(), "nano", 287070581);
        setField(term29460, term29460.getClass(), "time", term29465);
        setField(term29385, term29385.getClass(), "updatedAt", term29460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fzeqPnzpnt";
        callMethod(klass, "setPassword", argTypes, term29385, args);
    }

};


