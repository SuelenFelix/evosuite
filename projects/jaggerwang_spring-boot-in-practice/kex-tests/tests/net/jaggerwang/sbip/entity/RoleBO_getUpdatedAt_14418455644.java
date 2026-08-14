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

public class RoleBO_getUpdatedAt_14418455644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29940;

    public RoleBO_getUpdatedAt_14418455644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29941 = new Long(4036794646678680547L);
        term29940 = newInstance(Class.forName("net.jaggerwang.sbip.entity.RoleBO"));
        Object term29955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29970 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29940, term29940.getClass(), "id", term29941);
        setField(term29940, term29940.getClass(), "name", "boSSpezHeU");
        setIntField(term29956, term29956.getClass(), "year", 2016);
        setShortField(term29956, term29956.getClass(), "month", (short) 2);
        setShortField(term29956, term29956.getClass(), "day", (short) 12);
        setField(term29955, term29955.getClass(), "date", term29956);
        setByteField(term29960, term29960.getClass(), "hour", (byte) 7);
        setByteField(term29960, term29960.getClass(), "minute", (byte) 16);
        setByteField(term29960, term29960.getClass(), "second", (byte) 55);
        setIntField(term29960, term29960.getClass(), "nano", 690063047);
        setField(term29955, term29955.getClass(), "time", term29960);
        setField(term29940, term29940.getClass(), "createdAt", term29955);
        setIntField(term29966, term29966.getClass(), "year", 2019);
        setShortField(term29966, term29966.getClass(), "month", (short) 3);
        setShortField(term29966, term29966.getClass(), "day", (short) 19);
        setField(term29965, term29965.getClass(), "date", term29966);
        setByteField(term29970, term29970.getClass(), "hour", (byte) 19);
        setByteField(term29970, term29970.getClass(), "minute", (byte) 24);
        setByteField(term29970, term29970.getClass(), "second", (byte) 21);
        setIntField(term29970, term29970.getClass(), "nano", 765889037);
        setField(term29965, term29965.getClass(), "time", term29970);
        setField(term29940, term29940.getClass(), "updatedAt", term29965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.RoleBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term29940, args);
    }

};


