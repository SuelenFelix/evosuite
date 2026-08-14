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

public class UserTokenResponse_UserTokenResponseBuilder_id_167774951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UserTokenResponse_UserTokenResponseBuilder_id_167774951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term14 = newInstance(Class.forName("java.time.Instant"));
        Object term65 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setLongField(term14, term14.getClass(), "seconds", 1345871412L);
        setIntField(term14, term14.getClass(), "nanos", 244000000);
        setField(term1, term1.getClass(), "expiryDate", term14);
        setField(term1, term1.getClass(), "token", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "browser", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "operatingSystem", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "ipAddress", "jJCZpVmanW");
        setIntField(term66, term66.getClass(), "year", 2012);
        setShortField(term66, term66.getClass(), "month", (short) 8);
        setShortField(term66, term66.getClass(), "day", (short) 25);
        setField(term65, term65.getClass(), "date", term66);
        setByteField(term70, term70.getClass(), "hour", (byte) 5);
        setByteField(term70, term70.getClass(), "minute", (byte) 20);
        setByteField(term70, term70.getClass(), "second", (byte) 50);
        setIntField(term70, term70.getClass(), "nano", 345595912);
        setField(term65, term65.getClass(), "time", term70);
        setField(term1, term1.getClass(), "createdAt", term65);
        setIntField(term76, term76.getClass(), "year", 2021);
        setShortField(term76, term76.getClass(), "month", (short) 1);
        setShortField(term76, term76.getClass(), "day", (short) 18);
        setField(term75, term75.getClass(), "date", term76);
        setByteField(term80, term80.getClass(), "hour", (byte) 13);
        setByteField(term80, term80.getClass(), "minute", (byte) 38);
        setByteField(term80, term80.getClass(), "second", (byte) 26);
        setIntField(term80, term80.getClass(), "nano", 544608644);
        setField(term75, term75.getClass(), "time", term80);
        setField(term1, term1.getClass(), "updatedAt", term75);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "id", argTypes, term1, args);
    }

};


