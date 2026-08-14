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

public class Role_getCreatedAt_18721738636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23573;

    public Role_getCreatedAt_18721738636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23574 = new Long(4041117732464806744L);
        term23573 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23593 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23598 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23599 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23603 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23573, term23573.getClass(), "id", term23574);
        setField(term23573, term23573.getClass(), "name", "nghfqDXyCG");
        setIntField(term23589, term23589.getClass(), "year", 2013);
        setShortField(term23589, term23589.getClass(), "month", (short) 6);
        setShortField(term23589, term23589.getClass(), "day", (short) 29);
        setField(term23588, term23588.getClass(), "date", term23589);
        setByteField(term23593, term23593.getClass(), "hour", (byte) 22);
        setByteField(term23593, term23593.getClass(), "minute", (byte) 31);
        setByteField(term23593, term23593.getClass(), "second", (byte) 28);
        setIntField(term23593, term23593.getClass(), "nano", 930397670);
        setField(term23588, term23588.getClass(), "time", term23593);
        setField(term23573, term23573.getClass(), "createdAt", term23588);
        setIntField(term23599, term23599.getClass(), "year", 2020);
        setShortField(term23599, term23599.getClass(), "month", (short) 5);
        setShortField(term23599, term23599.getClass(), "day", (short) 8);
        setField(term23598, term23598.getClass(), "date", term23599);
        setByteField(term23603, term23603.getClass(), "hour", (byte) 14);
        setByteField(term23603, term23603.getClass(), "minute", (byte) 28);
        setByteField(term23603, term23603.getClass(), "second", (byte) 38);
        setIntField(term23603, term23603.getClass(), "nano", 93855882);
        setField(term23598, term23598.getClass(), "time", term23603);
        setField(term23573, term23573.getClass(), "updatedAt", term23598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term23573, args);
    }

};


