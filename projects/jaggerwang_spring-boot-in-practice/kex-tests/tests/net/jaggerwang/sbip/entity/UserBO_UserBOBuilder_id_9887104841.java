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

public class UserBO_UserBOBuilder_id_9887104841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28175;
     Object term28260;

    public UserBO_UserBOBuilder_id_9887104841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28176 = new Long(-5761087225966065493L);
        Long term28226 = new Long(493557348274366095L);
        term28175 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term28240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28241 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28245 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28250 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28251 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28255 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28175, term28175.getClass(), "id", term28176);
        setField(term28175, term28175.getClass(), "username", "jnwVnmKAFv");
        setField(term28175, term28175.getClass(), "password", "TXyHhqeCjR");
        setField(term28175, term28175.getClass(), "mobile", "lZIgPZPgTu");
        setField(term28175, term28175.getClass(), "email", "iuCxnHGMoW");
        setField(term28175, term28175.getClass(), "avatarId", term28226);
        setField(term28175, term28175.getClass(), "intro", "GPSEWEDSTo");
        setIntField(term28241, term28241.getClass(), "year", 2016);
        setShortField(term28241, term28241.getClass(), "month", (short) 5);
        setShortField(term28241, term28241.getClass(), "day", (short) 9);
        setField(term28240, term28240.getClass(), "date", term28241);
        setByteField(term28245, term28245.getClass(), "hour", (byte) 1);
        setByteField(term28245, term28245.getClass(), "minute", (byte) 20);
        setByteField(term28245, term28245.getClass(), "second", (byte) 56);
        setIntField(term28245, term28245.getClass(), "nano", 198437232);
        setField(term28240, term28240.getClass(), "time", term28245);
        setField(term28175, term28175.getClass(), "createdAt", term28240);
        setIntField(term28251, term28251.getClass(), "year", 2021);
        setShortField(term28251, term28251.getClass(), "month", (short) 2);
        setShortField(term28251, term28251.getClass(), "day", (short) 5);
        setField(term28250, term28250.getClass(), "date", term28251);
        setByteField(term28255, term28255.getClass(), "hour", (byte) 20);
        setByteField(term28255, term28255.getClass(), "minute", (byte) 43);
        setByteField(term28255, term28255.getClass(), "second", (byte) 37);
        setIntField(term28255, term28255.getClass(), "nano", 191661361);
        setField(term28250, term28250.getClass(), "time", term28255);
        setField(term28175, term28175.getClass(), "updatedAt", term28250);
        term28260 = new Long(8699742215739444902L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term28260;
        callMethod(klass, "id", argTypes, term28175, args);
    }

};


