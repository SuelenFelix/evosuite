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

public class User_setMobile_188697771116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29542;

    public User_setMobile_188697771116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29543 = new Long(3831842879355381917L);
        Long term29593 = new Long(-2196447813514870436L);
        term29542 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29607 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29608 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29612 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29617 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29618 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29622 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29542, term29542.getClass(), "id", term29543);
        setField(term29542, term29542.getClass(), "username", "RxbhrFBjkO");
        setField(term29542, term29542.getClass(), "password", "aanyiAOJCl");
        setField(term29542, term29542.getClass(), "mobile", "VDokbsCuqq");
        setField(term29542, term29542.getClass(), "email", "xClUIcPECX");
        setField(term29542, term29542.getClass(), "avatarId", term29593);
        setField(term29542, term29542.getClass(), "intro", "avhRaGZaBF");
        setIntField(term29608, term29608.getClass(), "year", 2021);
        setShortField(term29608, term29608.getClass(), "month", (short) 9);
        setShortField(term29608, term29608.getClass(), "day", (short) 7);
        setField(term29607, term29607.getClass(), "date", term29608);
        setByteField(term29612, term29612.getClass(), "hour", (byte) 16);
        setByteField(term29612, term29612.getClass(), "minute", (byte) 9);
        setByteField(term29612, term29612.getClass(), "second", (byte) 0);
        setIntField(term29612, term29612.getClass(), "nano", 530894568);
        setField(term29607, term29607.getClass(), "time", term29612);
        setField(term29542, term29542.getClass(), "createdAt", term29607);
        setIntField(term29618, term29618.getClass(), "year", 2016);
        setShortField(term29618, term29618.getClass(), "month", (short) 8);
        setShortField(term29618, term29618.getClass(), "day", (short) 27);
        setField(term29617, term29617.getClass(), "date", term29618);
        setByteField(term29622, term29622.getClass(), "hour", (byte) 3);
        setByteField(term29622, term29622.getClass(), "minute", (byte) 10);
        setByteField(term29622, term29622.getClass(), "second", (byte) 27);
        setIntField(term29622, term29622.getClass(), "nano", 429898470);
        setField(term29617, term29617.getClass(), "time", term29622);
        setField(term29542, term29542.getClass(), "updatedAt", term29617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JkgoRtImdE";
        callMethod(klass, "setMobile", argTypes, term29542, args);
    }

};


