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

public class UserBO_setPassword_98250126012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26421;

    public UserBO_setPassword_98250126012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26422 = new Long(800893933628130392L);
        Long term26472 = new Long(-6983938899150831997L);
        term26421 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26501 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26421, term26421.getClass(), "id", term26422);
        setField(term26421, term26421.getClass(), "username", "bnsyeQXFdu");
        setField(term26421, term26421.getClass(), "password", "BwtdjiefJn");
        setField(term26421, term26421.getClass(), "mobile", "jDmhBrIoDa");
        setField(term26421, term26421.getClass(), "email", "SPtPatHeOm");
        setField(term26421, term26421.getClass(), "avatarId", term26472);
        setField(term26421, term26421.getClass(), "intro", "ywmcuThdfL");
        setIntField(term26487, term26487.getClass(), "year", 2019);
        setShortField(term26487, term26487.getClass(), "month", (short) 12);
        setShortField(term26487, term26487.getClass(), "day", (short) 8);
        setField(term26486, term26486.getClass(), "date", term26487);
        setByteField(term26491, term26491.getClass(), "hour", (byte) 6);
        setByteField(term26491, term26491.getClass(), "minute", (byte) 0);
        setByteField(term26491, term26491.getClass(), "second", (byte) 32);
        setIntField(term26491, term26491.getClass(), "nano", 371231280);
        setField(term26486, term26486.getClass(), "time", term26491);
        setField(term26421, term26421.getClass(), "createdAt", term26486);
        setIntField(term26497, term26497.getClass(), "year", 2024);
        setShortField(term26497, term26497.getClass(), "month", (short) 3);
        setShortField(term26497, term26497.getClass(), "day", (short) 19);
        setField(term26496, term26496.getClass(), "date", term26497);
        setByteField(term26501, term26501.getClass(), "hour", (byte) 16);
        setByteField(term26501, term26501.getClass(), "minute", (byte) 8);
        setByteField(term26501, term26501.getClass(), "second", (byte) 55);
        setIntField(term26501, term26501.getClass(), "nano", 955822950);
        setField(term26496, term26496.getClass(), "time", term26501);
        setField(term26421, term26421.getClass(), "updatedAt", term26496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GBOEuByOfr";
        callMethod(klass, "setPassword", argTypes, term26421, args);
    }

};


