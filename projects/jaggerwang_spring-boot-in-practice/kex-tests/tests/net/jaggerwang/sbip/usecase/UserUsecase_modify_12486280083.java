package net.jaggerwang.sbip.usecase;

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
import static net.jaggerwang.sbip.usecase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserUsecase_modify_12486280083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204;
     Object term205;
     Object term207;

    public UserUsecase_modify_12486280083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.UserUsecase"));
        setField(term204, term204.getClass(), "userDAO", null);
        setField(term204, term204.getClass(), "roleDAO", null);
        term205 = new Long(-8257434502486459194L);
        Long term208 = new Long(-8400487765614892086L);
        Long term258 = new Long(5270370404989704783L);
        term207 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term287 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term207, term207.getClass(), "id", term208);
        setField(term207, term207.getClass(), "username", "hRNSzYYIrc");
        setField(term207, term207.getClass(), "password", "RMFIsYGgne");
        setField(term207, term207.getClass(), "mobile", "NRdvgJlhkX");
        setField(term207, term207.getClass(), "email", "uuaPigETmJ");
        setField(term207, term207.getClass(), "avatarId", term258);
        setField(term207, term207.getClass(), "intro", "MxlszYVzRf");
        setIntField(term273, term273.getClass(), "year", 2015);
        setShortField(term273, term273.getClass(), "month", (short) 9);
        setShortField(term273, term273.getClass(), "day", (short) 19);
        setField(term272, term272.getClass(), "date", term273);
        setByteField(term277, term277.getClass(), "hour", (byte) 9);
        setByteField(term277, term277.getClass(), "minute", (byte) 4);
        setByteField(term277, term277.getClass(), "second", (byte) 10);
        setIntField(term277, term277.getClass(), "nano", 401765865);
        setField(term272, term272.getClass(), "time", term277);
        setField(term207, term207.getClass(), "createdAt", term272);
        setIntField(term283, term283.getClass(), "year", 2015);
        setShortField(term283, term283.getClass(), "month", (short) 4);
        setShortField(term283, term283.getClass(), "day", (short) 14);
        setField(term282, term282.getClass(), "date", term283);
        setByteField(term287, term287.getClass(), "hour", (byte) 18);
        setByteField(term287, term287.getClass(), "minute", (byte) 24);
        setByteField(term287, term287.getClass(), "second", (byte) 32);
        setIntField(term287, term287.getClass(), "nano", 369233818);
        setField(term282, term282.getClass(), "time", term287);
        setField(term207, term207.getClass(), "updatedAt", term282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.UserUsecase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Object[] args = new Object[2];
        args[0] = term205;
        args[1] = term207;
        callMethod(klass, "modify", argTypes, term204, args);
    }

};


