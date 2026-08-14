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

public class User_UserBuilder_mobile_6025101744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12462;

    public User_UserBuilder_mobile_6025101744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12463 = new Long(2274723545906746965L);
        Long term12513 = new Long(1353683663053784647L);
        term12462 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12542 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12462, term12462.getClass(), "id", term12463);
        setField(term12462, term12462.getClass(), "username", "PHvxnGHptP");
        setField(term12462, term12462.getClass(), "password", "TimdotUuNC");
        setField(term12462, term12462.getClass(), "mobile", "PkWMRdJcBb");
        setField(term12462, term12462.getClass(), "email", "jSpAteRute");
        setField(term12462, term12462.getClass(), "avatarId", term12513);
        setField(term12462, term12462.getClass(), "intro", "swZVeJAxjt");
        setIntField(term12528, term12528.getClass(), "year", 2026);
        setShortField(term12528, term12528.getClass(), "month", (short) 7);
        setShortField(term12528, term12528.getClass(), "day", (short) 4);
        setField(term12527, term12527.getClass(), "date", term12528);
        setByteField(term12532, term12532.getClass(), "hour", (byte) 8);
        setByteField(term12532, term12532.getClass(), "minute", (byte) 51);
        setByteField(term12532, term12532.getClass(), "second", (byte) 9);
        setIntField(term12532, term12532.getClass(), "nano", 936880887);
        setField(term12527, term12527.getClass(), "time", term12532);
        setField(term12462, term12462.getClass(), "createdAt", term12527);
        setIntField(term12538, term12538.getClass(), "year", 2022);
        setShortField(term12538, term12538.getClass(), "month", (short) 5);
        setShortField(term12538, term12538.getClass(), "day", (short) 26);
        setField(term12537, term12537.getClass(), "date", term12538);
        setByteField(term12542, term12542.getClass(), "hour", (byte) 6);
        setByteField(term12542, term12542.getClass(), "minute", (byte) 54);
        setByteField(term12542, term12542.getClass(), "second", (byte) 49);
        setIntField(term12542, term12542.getClass(), "nano", 822216068);
        setField(term12537, term12537.getClass(), "time", term12542);
        setField(term12462, term12462.getClass(), "updatedAt", term12537);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "mobile", argTypes, term12462, args);
    }

};


