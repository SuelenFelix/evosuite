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

public class UserBO_toString_94564318522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27883;

    public UserBO_toString_94564318522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27884 = new Long(-8699693633047465617L);
        Long term27934 = new Long(-590890905395927244L);
        term27883 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27948 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27949 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27953 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27958 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27959 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27963 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27883, term27883.getClass(), "id", term27884);
        setField(term27883, term27883.getClass(), "username", "BbNeQJpYPr");
        setField(term27883, term27883.getClass(), "password", "riMtzCoxNj");
        setField(term27883, term27883.getClass(), "mobile", "YAXkVjQZcV");
        setField(term27883, term27883.getClass(), "email", "pumvwBWvpy");
        setField(term27883, term27883.getClass(), "avatarId", term27934);
        setField(term27883, term27883.getClass(), "intro", "HwLHeGLyhe");
        setIntField(term27949, term27949.getClass(), "year", 2018);
        setShortField(term27949, term27949.getClass(), "month", (short) 7);
        setShortField(term27949, term27949.getClass(), "day", (short) 24);
        setField(term27948, term27948.getClass(), "date", term27949);
        setByteField(term27953, term27953.getClass(), "hour", (byte) 8);
        setByteField(term27953, term27953.getClass(), "minute", (byte) 32);
        setByteField(term27953, term27953.getClass(), "second", (byte) 43);
        setIntField(term27953, term27953.getClass(), "nano", 490940025);
        setField(term27948, term27948.getClass(), "time", term27953);
        setField(term27883, term27883.getClass(), "createdAt", term27948);
        setIntField(term27959, term27959.getClass(), "year", 2018);
        setShortField(term27959, term27959.getClass(), "month", (short) 7);
        setShortField(term27959, term27959.getClass(), "day", (short) 6);
        setField(term27958, term27958.getClass(), "date", term27959);
        setByteField(term27963, term27963.getClass(), "hour", (byte) 6);
        setByteField(term27963, term27963.getClass(), "minute", (byte) 33);
        setByteField(term27963, term27963.getClass(), "second", (byte) 21);
        setIntField(term27963, term27963.getClass(), "nano", 484192339);
        setField(term27958, term27958.getClass(), "time", term27963);
        setField(term27883, term27883.getClass(), "updatedAt", term27958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27883, args);
    }

};


