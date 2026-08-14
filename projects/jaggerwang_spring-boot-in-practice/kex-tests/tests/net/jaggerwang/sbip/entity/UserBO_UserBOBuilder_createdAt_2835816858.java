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

public class UserBO_UserBOBuilder_createdAt_2835816858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29234;
     Object term29319;

    public UserBO_UserBOBuilder_createdAt_2835816858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29235 = new Long(9056245012917372169L);
        Long term29285 = new Long(7848004402682338886L);
        term29234 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29314 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29234, term29234.getClass(), "id", term29235);
        setField(term29234, term29234.getClass(), "username", "FbSIUZyBXZ");
        setField(term29234, term29234.getClass(), "password", "mhQDwIyrRi");
        setField(term29234, term29234.getClass(), "mobile", "HpZXWDPhlg");
        setField(term29234, term29234.getClass(), "email", "lBOokzEPfe");
        setField(term29234, term29234.getClass(), "avatarId", term29285);
        setField(term29234, term29234.getClass(), "intro", "dtGZCsKXbW");
        setIntField(term29300, term29300.getClass(), "year", 2028);
        setShortField(term29300, term29300.getClass(), "month", (short) 6);
        setShortField(term29300, term29300.getClass(), "day", (short) 21);
        setField(term29299, term29299.getClass(), "date", term29300);
        setByteField(term29304, term29304.getClass(), "hour", (byte) 2);
        setByteField(term29304, term29304.getClass(), "minute", (byte) 38);
        setByteField(term29304, term29304.getClass(), "second", (byte) 11);
        setIntField(term29304, term29304.getClass(), "nano", 40256095);
        setField(term29299, term29299.getClass(), "time", term29304);
        setField(term29234, term29234.getClass(), "createdAt", term29299);
        setIntField(term29310, term29310.getClass(), "year", 2017);
        setShortField(term29310, term29310.getClass(), "month", (short) 5);
        setShortField(term29310, term29310.getClass(), "day", (short) 17);
        setField(term29309, term29309.getClass(), "date", term29310);
        setByteField(term29314, term29314.getClass(), "hour", (byte) 22);
        setByteField(term29314, term29314.getClass(), "minute", (byte) 56);
        setByteField(term29314, term29314.getClass(), "second", (byte) 28);
        setIntField(term29314, term29314.getClass(), "nano", 581659115);
        setField(term29309, term29309.getClass(), "time", term29314);
        setField(term29234, term29234.getClass(), "updatedAt", term29309);
        term29319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29324 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29320, term29320.getClass(), "year", 2015);
        setShortField(term29320, term29320.getClass(), "month", (short) 4);
        setShortField(term29320, term29320.getClass(), "day", (short) 14);
        setField(term29319, term29319.getClass(), "date", term29320);
        setByteField(term29324, term29324.getClass(), "hour", (byte) 23);
        setByteField(term29324, term29324.getClass(), "minute", (byte) 8);
        setByteField(term29324, term29324.getClass(), "second", (byte) 53);
        setIntField(term29324, term29324.getClass(), "nano", 375234559);
        setField(term29319, term29319.getClass(), "time", term29324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term29319;
        callMethod(klass, "createdAt", argTypes, term29234, args);
    }

};


