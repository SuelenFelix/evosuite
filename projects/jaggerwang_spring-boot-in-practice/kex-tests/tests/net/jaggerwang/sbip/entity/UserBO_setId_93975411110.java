package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_setId_93975411110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26127;
     Object term26212;

    public UserBO_setId_93975411110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26128 = new Long(-159468133651974975L);
        Long term26178 = new Long(9160882370265093763L);
        term26127 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26192 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26193 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26197 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26207 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26127, term26127.getClass(), "id", term26128);
        setField(term26127, term26127.getClass(), "username", "lCyLIcSuom");
        setField(term26127, term26127.getClass(), "password", "CGOpQSZZwI");
        setField(term26127, term26127.getClass(), "mobile", "ypEdrstygY");
        setField(term26127, term26127.getClass(), "email", "sNQFlATEeQ");
        setField(term26127, term26127.getClass(), "avatarId", term26178);
        setField(term26127, term26127.getClass(), "intro", "ZKMLioamsY");
        setIntField(term26193, term26193.getClass(), "year", 2015);
        setShortField(term26193, term26193.getClass(), "month", (short) 1);
        setShortField(term26193, term26193.getClass(), "day", (short) 7);
        setField(term26192, term26192.getClass(), "date", term26193);
        setByteField(term26197, term26197.getClass(), "hour", (byte) 10);
        setByteField(term26197, term26197.getClass(), "minute", (byte) 8);
        setByteField(term26197, term26197.getClass(), "second", (byte) 31);
        setIntField(term26197, term26197.getClass(), "nano", 617142943);
        setField(term26192, term26192.getClass(), "time", term26197);
        setField(term26127, term26127.getClass(), "createdAt", term26192);
        setIntField(term26203, term26203.getClass(), "year", 2024);
        setShortField(term26203, term26203.getClass(), "month", (short) 2);
        setShortField(term26203, term26203.getClass(), "day", (short) 2);
        setField(term26202, term26202.getClass(), "date", term26203);
        setByteField(term26207, term26207.getClass(), "hour", (byte) 5);
        setByteField(term26207, term26207.getClass(), "minute", (byte) 8);
        setByteField(term26207, term26207.getClass(), "second", (byte) 10);
        setIntField(term26207, term26207.getClass(), "nano", 897554578);
        setField(term26202, term26202.getClass(), "time", term26207);
        setField(term26127, term26127.getClass(), "updatedAt", term26202);
        term26212 = new Long(6848008460134431064L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term26212;
        callMethod(klass, "setId", argTypes, term26127, args);
    }

};


