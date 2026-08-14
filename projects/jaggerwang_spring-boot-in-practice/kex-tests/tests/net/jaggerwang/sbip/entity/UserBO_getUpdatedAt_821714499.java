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

public class UserBO_getUpdatedAt_821714499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25992;

    public UserBO_getUpdatedAt_821714499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25993 = new Long(-2577420466618938650L);
        Long term26043 = new Long(5614572229094721840L);
        term25992 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26072 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25992, term25992.getClass(), "id", term25993);
        setField(term25992, term25992.getClass(), "username", "bxrCBbrrct");
        setField(term25992, term25992.getClass(), "password", "CKWpJaaaxX");
        setField(term25992, term25992.getClass(), "mobile", "UBRmXJmfrt");
        setField(term25992, term25992.getClass(), "email", "WZzvmIHhzZ");
        setField(term25992, term25992.getClass(), "avatarId", term26043);
        setField(term25992, term25992.getClass(), "intro", "doQLHkjpNm");
        setIntField(term26058, term26058.getClass(), "year", 2017);
        setShortField(term26058, term26058.getClass(), "month", (short) 2);
        setShortField(term26058, term26058.getClass(), "day", (short) 5);
        setField(term26057, term26057.getClass(), "date", term26058);
        setByteField(term26062, term26062.getClass(), "hour", (byte) 5);
        setByteField(term26062, term26062.getClass(), "minute", (byte) 46);
        setByteField(term26062, term26062.getClass(), "second", (byte) 38);
        setIntField(term26062, term26062.getClass(), "nano", 214202896);
        setField(term26057, term26057.getClass(), "time", term26062);
        setField(term25992, term25992.getClass(), "createdAt", term26057);
        setIntField(term26068, term26068.getClass(), "year", 2025);
        setShortField(term26068, term26068.getClass(), "month", (short) 6);
        setShortField(term26068, term26068.getClass(), "day", (short) 18);
        setField(term26067, term26067.getClass(), "date", term26068);
        setByteField(term26072, term26072.getClass(), "hour", (byte) 14);
        setByteField(term26072, term26072.getClass(), "minute", (byte) 17);
        setByteField(term26072, term26072.getClass(), "second", (byte) 34);
        setIntField(term26072, term26072.getClass(), "nano", 564527758);
        setField(term26067, term26067.getClass(), "time", term26072);
        setField(term25992, term25992.getClass(), "updatedAt", term26067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term25992, args);
    }

};


