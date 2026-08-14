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

public class UserTokenResponse_getBrowser_9500306095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6684;

    public UserTokenResponse_getBrowser_9500306095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6684 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse"));
        Object term6697 = newInstance(Class.forName("java.time.Instant"));
        Object term6748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term6758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term6763 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6684, term6684.getClass(), "id", "GBOEuByOfr");
        setLongField(term6697, term6697.getClass(), "seconds", 1863631094L);
        setIntField(term6697, term6697.getClass(), "nanos", 992000000);
        setField(term6684, term6684.getClass(), "expiryDate", term6697);
        setField(term6684, term6684.getClass(), "token", "NHbOFFjyVK");
        setField(term6684, term6684.getClass(), "browser", "zaloBqlrSo");
        setField(term6684, term6684.getClass(), "operatingSystem", "vvoLrMGCoN");
        setField(term6684, term6684.getClass(), "ipAddress", "pXdglvyrQe");
        setIntField(term6749, term6749.getClass(), "year", 2012);
        setShortField(term6749, term6749.getClass(), "month", (short) 3);
        setShortField(term6749, term6749.getClass(), "day", (short) 27);
        setField(term6748, term6748.getClass(), "date", term6749);
        setByteField(term6753, term6753.getClass(), "hour", (byte) 17);
        setByteField(term6753, term6753.getClass(), "minute", (byte) 49);
        setByteField(term6753, term6753.getClass(), "second", (byte) 24);
        setIntField(term6753, term6753.getClass(), "nano", 530647398);
        setField(term6748, term6748.getClass(), "time", term6753);
        setField(term6684, term6684.getClass(), "createdAt", term6748);
        setIntField(term6759, term6759.getClass(), "year", 2010);
        setShortField(term6759, term6759.getClass(), "month", (short) 6);
        setShortField(term6759, term6759.getClass(), "day", (short) 14);
        setField(term6758, term6758.getClass(), "date", term6759);
        setByteField(term6763, term6763.getClass(), "hour", (byte) 6);
        setByteField(term6763, term6763.getClass(), "minute", (byte) 22);
        setByteField(term6763, term6763.getClass(), "second", (byte) 20);
        setIntField(term6763, term6763.getClass(), "nano", 25133051);
        setField(term6758, term6758.getClass(), "time", term6763);
        setField(term6684, term6684.getClass(), "updatedAt", term6758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.response.UserTokenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBrowser", argTypes, term6684, args);
    }

};


