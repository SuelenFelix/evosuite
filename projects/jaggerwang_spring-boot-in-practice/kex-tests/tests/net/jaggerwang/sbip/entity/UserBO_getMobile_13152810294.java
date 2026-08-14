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

public class UserBO_getMobile_13152810294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25317;

    public UserBO_getMobile_13152810294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25318 = new Long(-8985577692063635272L);
        Long term25368 = new Long(6545086285386938562L);
        term25317 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term25382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25397 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25317, term25317.getClass(), "id", term25318);
        setField(term25317, term25317.getClass(), "username", "AHbZyFOmlo");
        setField(term25317, term25317.getClass(), "password", "TwfWVQGiIj");
        setField(term25317, term25317.getClass(), "mobile", "gUvcueTURF");
        setField(term25317, term25317.getClass(), "email", "EwQBhZjCIT");
        setField(term25317, term25317.getClass(), "avatarId", term25368);
        setField(term25317, term25317.getClass(), "intro", "aSkmSwTnEw");
        setIntField(term25383, term25383.getClass(), "year", 2010);
        setShortField(term25383, term25383.getClass(), "month", (short) 9);
        setShortField(term25383, term25383.getClass(), "day", (short) 26);
        setField(term25382, term25382.getClass(), "date", term25383);
        setByteField(term25387, term25387.getClass(), "hour", (byte) 17);
        setByteField(term25387, term25387.getClass(), "minute", (byte) 5);
        setByteField(term25387, term25387.getClass(), "second", (byte) 52);
        setIntField(term25387, term25387.getClass(), "nano", 138292575);
        setField(term25382, term25382.getClass(), "time", term25387);
        setField(term25317, term25317.getClass(), "createdAt", term25382);
        setIntField(term25393, term25393.getClass(), "year", 2022);
        setShortField(term25393, term25393.getClass(), "month", (short) 10);
        setShortField(term25393, term25393.getClass(), "day", (short) 14);
        setField(term25392, term25392.getClass(), "date", term25393);
        setByteField(term25397, term25397.getClass(), "hour", (byte) 10);
        setByteField(term25397, term25397.getClass(), "minute", (byte) 28);
        setByteField(term25397, term25397.getClass(), "second", (byte) 24);
        setIntField(term25397, term25397.getClass(), "nano", 117469048);
        setField(term25392, term25392.getClass(), "time", term25397);
        setField(term25317, term25317.getClass(), "updatedAt", term25392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMobile", argTypes, term25317, args);
    }

};


