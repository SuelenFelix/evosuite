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

public class UserTokenResponse_setBrowser_13854958513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7803;

    public UserTokenResponse_setBrowser_13854958513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7803 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term7816 = newInstance(Class.forName("java.time.Instant"));
        Object term7867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7872 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7882 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7803, term7803.getClass(), "id", "aQFUvuaYxd");
        setLongField(term7816, term7816.getClass(), "seconds", 1347400561L);
        setIntField(term7816, term7816.getClass(), "nanos", 385000000);
        setField(term7803, term7803.getClass(), "expiryDate", term7816);
        setField(term7803, term7803.getClass(), "token", "zNFLXMifnS");
        setField(term7803, term7803.getClass(), "browser", "HHQcYMSBVc");
        setField(term7803, term7803.getClass(), "operatingSystem", "wdoqITnaAP");
        setField(term7803, term7803.getClass(), "ipAddress", "rIPMBcrNqB");
        setIntField(term7868, term7868.getClass(), "year", 2012);
        setShortField(term7868, term7868.getClass(), "month", (short) 4);
        setShortField(term7868, term7868.getClass(), "day", (short) 25);
        setField(term7867, term7867.getClass(), "date", term7868);
        setByteField(term7872, term7872.getClass(), "hour", (byte) 21);
        setByteField(term7872, term7872.getClass(), "minute", (byte) 14);
        setByteField(term7872, term7872.getClass(), "second", (byte) 15);
        setIntField(term7872, term7872.getClass(), "nano", 561700934);
        setField(term7867, term7867.getClass(), "time", term7872);
        setField(term7803, term7803.getClass(), "createdAt", term7867);
        setIntField(term7878, term7878.getClass(), "year", 2011);
        setShortField(term7878, term7878.getClass(), "month", (short) 10);
        setShortField(term7878, term7878.getClass(), "day", (short) 25);
        setField(term7877, term7877.getClass(), "date", term7878);
        setByteField(term7882, term7882.getClass(), "hour", (byte) 10);
        setByteField(term7882, term7882.getClass(), "minute", (byte) 33);
        setByteField(term7882, term7882.getClass(), "second", (byte) 8);
        setIntField(term7882, term7882.getClass(), "nano", 268304014);
        setField(term7877, term7877.getClass(), "time", term7882);
        setField(term7803, term7803.getClass(), "updatedAt", term7877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UDaboHZHhz";
        callMethod(klass, "setBrowser", argTypes, term7803, args);
    }

};


