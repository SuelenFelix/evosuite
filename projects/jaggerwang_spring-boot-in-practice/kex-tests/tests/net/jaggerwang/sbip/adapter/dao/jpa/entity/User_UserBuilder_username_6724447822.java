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

public class User_UserBuilder_username_6724447822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12148;

    public User_UserBuilder_username_6724447822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12149 = new Long(7950532649535587877L);
        Long term12199 = new Long(7799452759993694308L);
        term12148 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12228 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12148, term12148.getClass(), "id", term12149);
        setField(term12148, term12148.getClass(), "username", "HqBOwkVqjD");
        setField(term12148, term12148.getClass(), "password", "MAcUBcBckh");
        setField(term12148, term12148.getClass(), "mobile", "oVgzLbrsFr");
        setField(term12148, term12148.getClass(), "email", "vQVyKLdtaz");
        setField(term12148, term12148.getClass(), "avatarId", term12199);
        setField(term12148, term12148.getClass(), "intro", "OWKQODBLzb");
        setIntField(term12214, term12214.getClass(), "year", 2010);
        setShortField(term12214, term12214.getClass(), "month", (short) 2);
        setShortField(term12214, term12214.getClass(), "day", (short) 28);
        setField(term12213, term12213.getClass(), "date", term12214);
        setByteField(term12218, term12218.getClass(), "hour", (byte) 2);
        setByteField(term12218, term12218.getClass(), "minute", (byte) 54);
        setByteField(term12218, term12218.getClass(), "second", (byte) 48);
        setIntField(term12218, term12218.getClass(), "nano", 930628940);
        setField(term12213, term12213.getClass(), "time", term12218);
        setField(term12148, term12148.getClass(), "createdAt", term12213);
        setIntField(term12224, term12224.getClass(), "year", 2022);
        setShortField(term12224, term12224.getClass(), "month", (short) 3);
        setShortField(term12224, term12224.getClass(), "day", (short) 11);
        setField(term12223, term12223.getClass(), "date", term12224);
        setByteField(term12228, term12228.getClass(), "hour", (byte) 7);
        setByteField(term12228, term12228.getClass(), "minute", (byte) 12);
        setByteField(term12228, term12228.getClass(), "second", (byte) 56);
        setIntField(term12228, term12228.getClass(), "nano", 884158779);
        setField(term12223, term12223.getClass(), "time", term12228);
        setField(term12148, term12148.getClass(), "updatedAt", term12223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "username", argTypes, term12148, args);
    }

};


