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

public class UserTokenResponse_UserTokenResponseBuilder_operatingSystem_11864735885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606;

    public UserTokenResponse_UserTokenResponseBuilder_operatingSystem_11864735885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term606 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder"));
        Object term619 = newInstance(Class.forName("java.time.Instant"));
        Object term670 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term671 = newInstance(Class.forName("java.time.LocalDate"));
        Object term675 = newInstance(Class.forName("java.time.LocalTime"));
        Object term680 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term681 = newInstance(Class.forName("java.time.LocalDate"));
        Object term685 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term606, term606.getClass(), "id", "eZFUvlxvGV");
        setLongField(term619, term619.getClass(), "seconds", 1515890130L);
        setIntField(term619, term619.getClass(), "nanos", 18000000);
        setField(term606, term606.getClass(), "expiryDate", term619);
        setField(term606, term606.getClass(), "token", "BYqFIqCKAV");
        setField(term606, term606.getClass(), "browser", "vrQLuWIDJX");
        setField(term606, term606.getClass(), "operatingSystem", "flxyYxBRtu");
        setField(term606, term606.getClass(), "ipAddress", "OclPbYPkcH");
        setIntField(term671, term671.getClass(), "year", 2029);
        setShortField(term671, term671.getClass(), "month", (short) 8);
        setShortField(term671, term671.getClass(), "day", (short) 29);
        setField(term670, term670.getClass(), "date", term671);
        setByteField(term675, term675.getClass(), "hour", (byte) 15);
        setByteField(term675, term675.getClass(), "minute", (byte) 50);
        setByteField(term675, term675.getClass(), "second", (byte) 1);
        setIntField(term675, term675.getClass(), "nano", 277971904);
        setField(term670, term670.getClass(), "time", term675);
        setField(term606, term606.getClass(), "createdAt", term670);
        setIntField(term681, term681.getClass(), "year", 2022);
        setShortField(term681, term681.getClass(), "month", (short) 11);
        setShortField(term681, term681.getClass(), "day", (short) 16);
        setField(term680, term680.getClass(), "date", term681);
        setByteField(term685, term685.getClass(), "hour", (byte) 15);
        setByteField(term685, term685.getClass(), "minute", (byte) 54);
        setByteField(term685, term685.getClass(), "second", (byte) 2);
        setIntField(term685, term685.getClass(), "nano", 733274103);
        setField(term680, term680.getClass(), "time", term685);
        setField(term606, term606.getClass(), "updatedAt", term680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse$UserTokenResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "operatingSystem", argTypes, term606, args);
    }

};


