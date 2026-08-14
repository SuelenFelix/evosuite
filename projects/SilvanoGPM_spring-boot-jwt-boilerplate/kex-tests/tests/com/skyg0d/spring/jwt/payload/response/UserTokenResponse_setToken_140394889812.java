package com.skyg0d.spring.jwt.payload.response;

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
import static com.skyg0d.spring.jwt.payload.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UserTokenResponse_setToken_140394889812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7647;

    public UserTokenResponse_setToken_140394889812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7647 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7660 = newInstance(Class.forName("java.time.Instant"));
        Object term7711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7726 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7647, term7647.getClass(), "id", "NTWMiBEaDF");
        setLongField(term7660, term7660.getClass(), "seconds", 1744090065L);
        setIntField(term7660, term7660.getClass(), "nanos", 937000000);
        setField(term7647, term7647.getClass(), "expiryDate", term7660);
        setField(term7647, term7647.getClass(), "token", "SPBstwKFVr");
        setField(term7647, term7647.getClass(), "browser", "WxYUTuqmIq");
        setField(term7647, term7647.getClass(), "operatingSystem", "OeQLvhVERT");
        setField(term7647, term7647.getClass(), "ipAddress", "IlvgFINwIa");
        setIntField(term7712, term7712.getClass(), "year", 2027);
        setShortField(term7712, term7712.getClass(), "month", (short) 8);
        setShortField(term7712, term7712.getClass(), "day", (short) 23);
        setField(term7711, term7711.getClass(), "date", term7712);
        setByteField(term7716, term7716.getClass(), "hour", (byte) 15);
        setByteField(term7716, term7716.getClass(), "minute", (byte) 12);
        setByteField(term7716, term7716.getClass(), "second", (byte) 6);
        setIntField(term7716, term7716.getClass(), "nano", 541218258);
        setField(term7711, term7711.getClass(), "time", term7716);
        setField(term7647, term7647.getClass(), "createdAt", term7711);
        setIntField(term7722, term7722.getClass(), "year", 2013);
        setShortField(term7722, term7722.getClass(), "month", (short) 5);
        setShortField(term7722, term7722.getClass(), "day", (short) 26);
        setField(term7721, term7721.getClass(), "date", term7722);
        setByteField(term7726, term7726.getClass(), "hour", (byte) 4);
        setByteField(term7726, term7726.getClass(), "minute", (byte) 39);
        setByteField(term7726, term7726.getClass(), "second", (byte) 5);
        setIntField(term7726, term7726.getClass(), "nano", 392869354);
        setField(term7721, term7721.getClass(), "time", term7726);
        setField(term7647, term7647.getClass(), "updatedAt", term7721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GEJABPlHSI";
        callMethod(klass, "setToken", argTypes, term7647, args);
    }

};


