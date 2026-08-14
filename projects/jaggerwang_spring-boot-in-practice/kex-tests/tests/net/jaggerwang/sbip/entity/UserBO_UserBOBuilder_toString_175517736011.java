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

public class UserBO_UserBOBuilder_toString_175517736011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29659;

    public UserBO_UserBOBuilder_toString_175517736011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29660 = new Long(-5850316381591949820L);
        Long term29710 = new Long(5857854340777182167L);
        term29659 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29729 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29739 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29659, term29659.getClass(), "id", term29660);
        setField(term29659, term29659.getClass(), "username", "zgKiINdgNu");
        setField(term29659, term29659.getClass(), "password", "zLMTXDQHYH");
        setField(term29659, term29659.getClass(), "mobile", "PqywFWJlpE");
        setField(term29659, term29659.getClass(), "email", "OzXRsFGTIp");
        setField(term29659, term29659.getClass(), "avatarId", term29710);
        setField(term29659, term29659.getClass(), "intro", "TjWpyghUWN");
        setIntField(term29725, term29725.getClass(), "year", 2013);
        setShortField(term29725, term29725.getClass(), "month", (short) 6);
        setShortField(term29725, term29725.getClass(), "day", (short) 29);
        setField(term29724, term29724.getClass(), "date", term29725);
        setByteField(term29729, term29729.getClass(), "hour", (byte) 22);
        setByteField(term29729, term29729.getClass(), "minute", (byte) 31);
        setByteField(term29729, term29729.getClass(), "second", (byte) 28);
        setIntField(term29729, term29729.getClass(), "nano", 930397670);
        setField(term29724, term29724.getClass(), "time", term29729);
        setField(term29659, term29659.getClass(), "createdAt", term29724);
        setIntField(term29735, term29735.getClass(), "year", 2020);
        setShortField(term29735, term29735.getClass(), "month", (short) 5);
        setShortField(term29735, term29735.getClass(), "day", (short) 8);
        setField(term29734, term29734.getClass(), "date", term29735);
        setByteField(term29739, term29739.getClass(), "hour", (byte) 14);
        setByteField(term29739, term29739.getClass(), "minute", (byte) 28);
        setByteField(term29739, term29739.getClass(), "second", (byte) 38);
        setIntField(term29739, term29739.getClass(), "nano", 93855882);
        setField(term29734, term29734.getClass(), "time", term29739);
        setField(term29659, term29659.getClass(), "updatedAt", term29734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29659, args);
    }

};


