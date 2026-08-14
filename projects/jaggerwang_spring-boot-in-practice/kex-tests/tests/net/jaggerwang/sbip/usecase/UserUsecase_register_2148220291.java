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

public class UserUsecase_register_2148220291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term46;

    public UserUsecase_register_2148220291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("net.jaggerwang.sbip.usecase.UserUsecase"));
        setField(term45, term45.getClass(), "userDAO", null);
        setField(term45, term45.getClass(), "roleDAO", null);
        Long term47 = new Long(2442117782898005296L);
        Long term97 = new Long(6375119433582206027L);
        term46 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term46, term46.getClass(), "id", term47);
        setField(term46, term46.getClass(), "username", "MuLcgQHgqz");
        setField(term46, term46.getClass(), "password", "xxtlPwDYFs");
        setField(term46, term46.getClass(), "mobile", "jJCZpVmanW");
        setField(term46, term46.getClass(), "email", "EGtDIRbSSb");
        setField(term46, term46.getClass(), "avatarId", term97);
        setField(term46, term46.getClass(), "intro", "SzjVpOQTyS");
        setIntField(term112, term112.getClass(), "year", 2012);
        setShortField(term112, term112.getClass(), "month", (short) 8);
        setShortField(term112, term112.getClass(), "day", (short) 25);
        setField(term111, term111.getClass(), "date", term112);
        setByteField(term116, term116.getClass(), "hour", (byte) 5);
        setByteField(term116, term116.getClass(), "minute", (byte) 20);
        setByteField(term116, term116.getClass(), "second", (byte) 50);
        setIntField(term116, term116.getClass(), "nano", 345595912);
        setField(term111, term111.getClass(), "time", term116);
        setField(term46, term46.getClass(), "createdAt", term111);
        setIntField(term122, term122.getClass(), "year", 2021);
        setShortField(term122, term122.getClass(), "month", (short) 1);
        setShortField(term122, term122.getClass(), "day", (short) 18);
        setField(term121, term121.getClass(), "date", term122);
        setByteField(term126, term126.getClass(), "hour", (byte) 13);
        setByteField(term126, term126.getClass(), "minute", (byte) 38);
        setByteField(term126, term126.getClass(), "second", (byte) 26);
        setIntField(term126, term126.getClass(), "nano", 544608644);
        setField(term121, term121.getClass(), "time", term126);
        setField(term46, term46.getClass(), "updatedAt", term121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.usecase.UserUsecase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Object[] args = new Object[1];
        args[0] = term46;
        callMethod(klass, "register", argTypes, term45, args);
    }

};


