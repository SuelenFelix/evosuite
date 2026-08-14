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

public class Role_canEqual_160252809213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23933;
     Object term23968;

    public Role_canEqual_160252809213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23934 = new Long(204473662283899955L);
        term23933 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23953 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23963 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23933, term23933.getClass(), "id", term23934);
        setField(term23933, term23933.getClass(), "name", "SIODFGaQhr");
        setIntField(term23949, term23949.getClass(), "year", 2013);
        setShortField(term23949, term23949.getClass(), "month", (short) 9);
        setShortField(term23949, term23949.getClass(), "day", (short) 12);
        setField(term23948, term23948.getClass(), "date", term23949);
        setByteField(term23953, term23953.getClass(), "hour", (byte) 14);
        setByteField(term23953, term23953.getClass(), "minute", (byte) 21);
        setByteField(term23953, term23953.getClass(), "second", (byte) 35);
        setIntField(term23953, term23953.getClass(), "nano", 520302725);
        setField(term23948, term23948.getClass(), "time", term23953);
        setField(term23933, term23933.getClass(), "createdAt", term23948);
        setIntField(term23959, term23959.getClass(), "year", 2016);
        setShortField(term23959, term23959.getClass(), "month", (short) 2);
        setShortField(term23959, term23959.getClass(), "day", (short) 15);
        setField(term23958, term23958.getClass(), "date", term23959);
        setByteField(term23963, term23963.getClass(), "hour", (byte) 7);
        setByteField(term23963, term23963.getClass(), "minute", (byte) 36);
        setByteField(term23963, term23963.getClass(), "second", (byte) 21);
        setIntField(term23963, term23963.getClass(), "nano", 74269011);
        setField(term23958, term23958.getClass(), "time", term23963);
        setField(term23933, term23933.getClass(), "updatedAt", term23958);
        term23968 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23968;
        callMethod(klass, "canEqual", argTypes, term23933, args);
    }

};


