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

public class UserBO_UserBOBuilder_avatarId_13954348436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28940;
     Object term29025;

    public UserBO_UserBOBuilder_avatarId_13954348436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28941 = new Long(6462632207326555041L);
        Long term28991 = new Long(-3188913050877092148L);
        term28940 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29005 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29006 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29010 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29015 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29016 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29020 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28940, term28940.getClass(), "id", term28941);
        setField(term28940, term28940.getClass(), "username", "AWYyZiNfsm");
        setField(term28940, term28940.getClass(), "password", "ITRRYiuDwH");
        setField(term28940, term28940.getClass(), "mobile", "llRfwANcVF");
        setField(term28940, term28940.getClass(), "email", "sUEeHQTWkA");
        setField(term28940, term28940.getClass(), "avatarId", term28991);
        setField(term28940, term28940.getClass(), "intro", "BDIRCxAWLA");
        setIntField(term29006, term29006.getClass(), "year", 2010);
        setShortField(term29006, term29006.getClass(), "month", (short) 5);
        setShortField(term29006, term29006.getClass(), "day", (short) 21);
        setField(term29005, term29005.getClass(), "date", term29006);
        setByteField(term29010, term29010.getClass(), "hour", (byte) 2);
        setByteField(term29010, term29010.getClass(), "minute", (byte) 7);
        setByteField(term29010, term29010.getClass(), "second", (byte) 22);
        setIntField(term29010, term29010.getClass(), "nano", 178273852);
        setField(term29005, term29005.getClass(), "time", term29010);
        setField(term28940, term28940.getClass(), "createdAt", term29005);
        setIntField(term29016, term29016.getClass(), "year", 2020);
        setShortField(term29016, term29016.getClass(), "month", (short) 7);
        setShortField(term29016, term29016.getClass(), "day", (short) 27);
        setField(term29015, term29015.getClass(), "date", term29016);
        setByteField(term29020, term29020.getClass(), "hour", (byte) 23);
        setByteField(term29020, term29020.getClass(), "minute", (byte) 41);
        setByteField(term29020, term29020.getClass(), "second", (byte) 32);
        setIntField(term29020, term29020.getClass(), "nano", 523353963);
        setField(term29015, term29015.getClass(), "time", term29020);
        setField(term28940, term28940.getClass(), "updatedAt", term29015);
        term29025 = new Long(-6759247883224780481L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term29025;
        callMethod(klass, "avatarId", argTypes, term28940, args);
    }

};


