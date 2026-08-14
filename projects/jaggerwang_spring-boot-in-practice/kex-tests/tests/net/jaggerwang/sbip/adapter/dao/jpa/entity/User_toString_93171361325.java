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

public class User_toString_93171361325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30847;

    public User_toString_93171361325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30848 = new Long(-836309941570511418L);
        Long term30898 = new Long(-4851193391918639512L);
        term30847 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30922 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30923 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30927 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30847, term30847.getClass(), "id", term30848);
        setField(term30847, term30847.getClass(), "username", "OzXRsFGTIp");
        setField(term30847, term30847.getClass(), "password", "TjWpyghUWN");
        setField(term30847, term30847.getClass(), "mobile", "dkZFDZxcde");
        setField(term30847, term30847.getClass(), "email", "WXcZEtUKlI");
        setField(term30847, term30847.getClass(), "avatarId", term30898);
        setField(term30847, term30847.getClass(), "intro", "IkpjUOuWQU");
        setIntField(term30913, term30913.getClass(), "year", 2014);
        setShortField(term30913, term30913.getClass(), "month", (short) 11);
        setShortField(term30913, term30913.getClass(), "day", (short) 17);
        setField(term30912, term30912.getClass(), "date", term30913);
        setByteField(term30917, term30917.getClass(), "hour", (byte) 16);
        setByteField(term30917, term30917.getClass(), "minute", (byte) 57);
        setByteField(term30917, term30917.getClass(), "second", (byte) 36);
        setIntField(term30917, term30917.getClass(), "nano", 336508243);
        setField(term30912, term30912.getClass(), "time", term30917);
        setField(term30847, term30847.getClass(), "createdAt", term30912);
        setIntField(term30923, term30923.getClass(), "year", 2020);
        setShortField(term30923, term30923.getClass(), "month", (short) 5);
        setShortField(term30923, term30923.getClass(), "day", (short) 21);
        setField(term30922, term30922.getClass(), "date", term30923);
        setByteField(term30927, term30927.getClass(), "hour", (byte) 1);
        setByteField(term30927, term30927.getClass(), "minute", (byte) 0);
        setByteField(term30927, term30927.getClass(), "second", (byte) 30);
        setIntField(term30927, term30927.getClass(), "nano", 495919259);
        setField(term30922, term30922.getClass(), "time", term30927);
        setField(term30847, term30847.getClass(), "updatedAt", term30922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30847, args);
    }

};


