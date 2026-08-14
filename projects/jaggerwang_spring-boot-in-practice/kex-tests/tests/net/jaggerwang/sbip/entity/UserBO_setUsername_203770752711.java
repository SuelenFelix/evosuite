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

public class UserBO_setUsername_203770752711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26264;

    public UserBO_setUsername_203770752711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26265 = new Long(-5338413783740215067L);
        Long term26315 = new Long(-814922776357887557L);
        term26264 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26339 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26340 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26344 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26264, term26264.getClass(), "id", term26265);
        setField(term26264, term26264.getClass(), "username", "WVbxuoDBcn");
        setField(term26264, term26264.getClass(), "password", "pvDEABOxLt");
        setField(term26264, term26264.getClass(), "mobile", "beAMpkroCQ");
        setField(term26264, term26264.getClass(), "email", "uSUvKAyuvd");
        setField(term26264, term26264.getClass(), "avatarId", term26315);
        setField(term26264, term26264.getClass(), "intro", "onQLVONGuf");
        setIntField(term26330, term26330.getClass(), "year", 2016);
        setShortField(term26330, term26330.getClass(), "month", (short) 1);
        setShortField(term26330, term26330.getClass(), "day", (short) 24);
        setField(term26329, term26329.getClass(), "date", term26330);
        setByteField(term26334, term26334.getClass(), "hour", (byte) 23);
        setByteField(term26334, term26334.getClass(), "minute", (byte) 15);
        setByteField(term26334, term26334.getClass(), "second", (byte) 43);
        setIntField(term26334, term26334.getClass(), "nano", 860277753);
        setField(term26329, term26329.getClass(), "time", term26334);
        setField(term26264, term26264.getClass(), "createdAt", term26329);
        setIntField(term26340, term26340.getClass(), "year", 2016);
        setShortField(term26340, term26340.getClass(), "month", (short) 2);
        setShortField(term26340, term26340.getClass(), "day", (short) 2);
        setField(term26339, term26339.getClass(), "date", term26340);
        setByteField(term26344, term26344.getClass(), "hour", (byte) 16);
        setByteField(term26344, term26344.getClass(), "minute", (byte) 51);
        setByteField(term26344, term26344.getClass(), "second", (byte) 8);
        setIntField(term26344, term26344.getClass(), "nano", 991355221);
        setField(term26339, term26339.getClass(), "time", term26344);
        setField(term26264, term26264.getClass(), "updatedAt", term26339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SOrEHbcbmn";
        callMethod(klass, "setUsername", argTypes, term26264, args);
    }

};


