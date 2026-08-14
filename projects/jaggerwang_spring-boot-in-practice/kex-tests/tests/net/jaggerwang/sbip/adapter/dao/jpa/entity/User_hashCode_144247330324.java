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

public class User_hashCode_144247330324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30712;

    public User_hashCode_144247330324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30713 = new Long(2201264121669950608L);
        Long term30763 = new Long(4911393165710268247L);
        term30712 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term30777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30792 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30712, term30712.getClass(), "id", term30713);
        setField(term30712, term30712.getClass(), "username", "jiUSjqwSIQ");
        setField(term30712, term30712.getClass(), "password", "MgLCedQfoj");
        setField(term30712, term30712.getClass(), "mobile", "zgKiINdgNu");
        setField(term30712, term30712.getClass(), "email", "zLMTXDQHYH");
        setField(term30712, term30712.getClass(), "avatarId", term30763);
        setField(term30712, term30712.getClass(), "intro", "PqywFWJlpE");
        setIntField(term30778, term30778.getClass(), "year", 2027);
        setShortField(term30778, term30778.getClass(), "month", (short) 9);
        setShortField(term30778, term30778.getClass(), "day", (short) 19);
        setField(term30777, term30777.getClass(), "date", term30778);
        setByteField(term30782, term30782.getClass(), "hour", (byte) 13);
        setByteField(term30782, term30782.getClass(), "minute", (byte) 17);
        setByteField(term30782, term30782.getClass(), "second", (byte) 43);
        setIntField(term30782, term30782.getClass(), "nano", 359493485);
        setField(term30777, term30777.getClass(), "time", term30782);
        setField(term30712, term30712.getClass(), "createdAt", term30777);
        setIntField(term30788, term30788.getClass(), "year", 2028);
        setShortField(term30788, term30788.getClass(), "month", (short) 2);
        setShortField(term30788, term30788.getClass(), "day", (short) 3);
        setField(term30787, term30787.getClass(), "date", term30788);
        setByteField(term30792, term30792.getClass(), "hour", (byte) 14);
        setByteField(term30792, term30792.getClass(), "minute", (byte) 31);
        setByteField(term30792, term30792.getClass(), "second", (byte) 5);
        setIntField(term30792, term30792.getClass(), "nano", 770924836);
        setField(term30787, term30787.getClass(), "time", term30792);
        setField(term30712, term30712.getClass(), "updatedAt", term30787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term30712, args);
    }

};


