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

public class User_setUpdatedAt_146439447721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30295;
     Object term30380;

    public User_setUpdatedAt_146439447721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30296 = new Long(-3548672426577893003L);
        Long term30346 = new Long(1592020674405941254L);
        term30295 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30375 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30295, term30295.getClass(), "id", term30296);
        setField(term30295, term30295.getClass(), "username", "cSHGbqKqlN");
        setField(term30295, term30295.getClass(), "password", "pFAfANnxup");
        setField(term30295, term30295.getClass(), "mobile", "FbSIUZyBXZ");
        setField(term30295, term30295.getClass(), "email", "mhQDwIyrRi");
        setField(term30295, term30295.getClass(), "avatarId", term30346);
        setField(term30295, term30295.getClass(), "intro", "HpZXWDPhlg");
        setIntField(term30361, term30361.getClass(), "year", 2018);
        setShortField(term30361, term30361.getClass(), "month", (short) 7);
        setShortField(term30361, term30361.getClass(), "day", (short) 30);
        setField(term30360, term30360.getClass(), "date", term30361);
        setByteField(term30365, term30365.getClass(), "hour", (byte) 22);
        setByteField(term30365, term30365.getClass(), "minute", (byte) 55);
        setByteField(term30365, term30365.getClass(), "second", (byte) 39);
        setIntField(term30365, term30365.getClass(), "nano", 564474532);
        setField(term30360, term30360.getClass(), "time", term30365);
        setField(term30295, term30295.getClass(), "createdAt", term30360);
        setIntField(term30371, term30371.getClass(), "year", 2027);
        setShortField(term30371, term30371.getClass(), "month", (short) 12);
        setShortField(term30371, term30371.getClass(), "day", (short) 25);
        setField(term30370, term30370.getClass(), "date", term30371);
        setByteField(term30375, term30375.getClass(), "hour", (byte) 7);
        setByteField(term30375, term30375.getClass(), "minute", (byte) 38);
        setByteField(term30375, term30375.getClass(), "second", (byte) 45);
        setIntField(term30375, term30375.getClass(), "nano", 660882666);
        setField(term30370, term30370.getClass(), "time", term30375);
        setField(term30295, term30295.getClass(), "updatedAt", term30370);
        term30380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30385 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30381, term30381.getClass(), "year", 2025);
        setShortField(term30381, term30381.getClass(), "month", (short) 9);
        setShortField(term30381, term30381.getClass(), "day", (short) 21);
        setField(term30380, term30380.getClass(), "date", term30381);
        setByteField(term30385, term30385.getClass(), "hour", (byte) 16);
        setByteField(term30385, term30385.getClass(), "minute", (byte) 28);
        setByteField(term30385, term30385.getClass(), "second", (byte) 17);
        setIntField(term30385, term30385.getClass(), "nano", 64339643);
        setField(term30380, term30380.getClass(), "time", term30385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term30380;
        callMethod(klass, "setUpdatedAt", argTypes, term30295, args);
    }

};


