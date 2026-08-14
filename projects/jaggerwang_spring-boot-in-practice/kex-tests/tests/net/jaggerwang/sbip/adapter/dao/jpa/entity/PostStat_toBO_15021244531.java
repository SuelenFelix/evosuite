package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStat_toBO_15021244531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3632;

    public PostStat_toBO_15021244531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3633 = new Long(1233889271256172047L);
        Long term3635 = new Long(6617340557564669657L);
        Long term3637 = new Long(1439298019805881866L);
        term3632 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3654 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3632, term3632.getClass(), "id", term3633);
        setField(term3632, term3632.getClass(), "postId", term3635);
        setField(term3632, term3632.getClass(), "likeCount", term3637);
        setIntField(term3640, term3640.getClass(), "year", 2025);
        setShortField(term3640, term3640.getClass(), "month", (short) 3);
        setShortField(term3640, term3640.getClass(), "day", (short) 9);
        setField(term3639, term3639.getClass(), "date", term3640);
        setByteField(term3644, term3644.getClass(), "hour", (byte) 5);
        setByteField(term3644, term3644.getClass(), "minute", (byte) 49);
        setByteField(term3644, term3644.getClass(), "second", (byte) 12);
        setIntField(term3644, term3644.getClass(), "nano", 791695028);
        setField(term3639, term3639.getClass(), "time", term3644);
        setField(term3632, term3632.getClass(), "createdAt", term3639);
        setIntField(term3650, term3650.getClass(), "year", 2023);
        setShortField(term3650, term3650.getClass(), "month", (short) 9);
        setShortField(term3650, term3650.getClass(), "day", (short) 23);
        setField(term3649, term3649.getClass(), "date", term3650);
        setByteField(term3654, term3654.getClass(), "hour", (byte) 12);
        setByteField(term3654, term3654.getClass(), "minute", (byte) 55);
        setByteField(term3654, term3654.getClass(), "second", (byte) 58);
        setIntField(term3654, term3654.getClass(), "nano", 159178396);
        setField(term3649, term3649.getClass(), "time", term3654);
        setField(term3632, term3632.getClass(), "updatedAt", term3649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term3632, args);
    }

};


